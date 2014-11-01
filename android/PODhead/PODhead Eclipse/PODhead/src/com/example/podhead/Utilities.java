package com.example.podhead;

import java.util.Set;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Utilities extends Fragment {
	private BluetoothAdapter btAdapter;
	View utilitiesView;
	
	public TextView statusUpdate;
	public Button connect;
	public Button disconnect;
	public ImageView logo;
	String toastText="";
	
	private BluetoothDevice remoteDevice;
	
	protected int DISCOVERY_REQUEST = 1;

	BroadcastReceiver bluetoothState = new BroadcastReceiver(){
	@Override
	public void onReceive(Context context, Intent intent){

	String prevStateExtra=BluetoothAdapter.EXTRA_PREVIOUS_STATE;
	String stateExtra=BluetoothAdapter.EXTRA_STATE;
	int state = intent.getIntExtra(stateExtra,-1);
	int previousState = intent.getIntExtra(prevStateExtra, -1);
	
	switch(state){

	case(BluetoothAdapter.STATE_TURNING_ON):
	{
	toastText="Bluetooth turning on";
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	break;
	}

	case(BluetoothAdapter.STATE_ON):
	{
	toastText="Bluetooth on";
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	setupUI();
	break;
	}

	case(BluetoothAdapter.STATE_TURNING_OFF):
	{
	toastText="Bluetooth turning off";
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	break;
	}
	case(BluetoothAdapter.STATE_OFF):
	{
	toastText="Bluetooth off";
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	setupUI();
	break;
	}

	}
    }
};
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		utilitiesView = inflater.inflate(R.layout.utilities,
				container, false);
		setupUI();
		return utilitiesView;
	}

	private void setupUI(){
		final TextView statusUpdate = (TextView) utilitiesView.findViewById(R.id.result);
		final Button connect = (Button) utilitiesView.findViewById(R.id.btn_connect);
		final Button disconnect = (Button) utilitiesView.findViewById(R.id.btn_disconnect);
		final ImageView logo = (ImageView) utilitiesView.findViewById(R.id.btlogo);
		
		disconnect.setVisibility(View.GONE);
		logo.setVisibility(View.GONE);
		btAdapter = BluetoothAdapter.getDefaultAdapter();
		
		if(btAdapter.isEnabled()){
			String address = btAdapter.getAddress();
			String name = btAdapter.getName();
			String statusText = name + " : " + address;
			statusUpdate.setText(statusText);
			disconnect.setVisibility(View.VISIBLE);
			logo.setVisibility(View.VISIBLE);
			connect.setVisibility(View.GONE);
			}
			else{
			connect.setVisibility(View.VISIBLE);
			statusUpdate.setText("Bluetooth is not on");
			}		
			
		connect.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*String actionStateChanged = BluetoothAdapter.ACTION_STATE_CHANGED;
				String actionRequestEnable = BluetoothAdapter.ACTION_REQUEST_ENABLE;
				IntentFilter filter = new IntentFilter(actionStateChanged);
				registerReceiver(bluetoothState, filter);
				startActivityForResult(new Intent(actionRequestEnable),0);
				*/
				String scanModeChanged = BluetoothAdapter.ACTION_SCAN_MODE_CHANGED;
				String beDiscoverable = BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE;
				IntentFilter filter = new IntentFilter(scanModeChanged);
				getActivity().registerReceiver(bluetoothState, filter);
				startActivityForResult(new Intent(beDiscoverable), DISCOVERY_REQUEST);
			}
		});
		
		
		disconnect.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
			btAdapter.disable();
			disconnect.setVisibility(View.GONE);
			logo.setVisibility(View.GONE);
			connect.setVisibility(View.VISIBLE);
			statusUpdate.setText("Bluetooth Off");
			}
			});		
		
	}
	
		
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(requestCode==DISCOVERY_REQUEST){
			Toast.makeText(getActivity(), "Discovery in Progress", Toast.LENGTH_SHORT).show();
			setupUI();
			findDevices();
		}
	}

	
	private void findDevices(){
	String lastUsedRemoteDevice = getLastUsedRemoteBTDevice();

	if(lastUsedRemoteDevice != null){
	toastText="Checking for know paired devices, namely: " + lastUsedRemoteDevice;
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	
	//see if this device is in a list of currently visible (?), paired devices
	Set<BluetoothDevice>pairedDevices = btAdapter.getBondedDevices();
	for(BluetoothDevice pairedDevice : pairedDevices){

	if(pairedDevice.getAddress().equals(lastUsedRemoteDevice)){
	toastText="Found device: " + pairedDevice.getName() + "*" + lastUsedRemoteDevice;
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	remoteDevice = pairedDevice;
        }
    }
}

	if(remoteDevice == null){
	toastText="Starting discovery for remote devices...";
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
	//start discovery
	if(btAdapter.startDiscovery()){
	toastText="Discovery thread started...Scanning for Devices";
	Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();

	getActivity().registerReceiver(discoveryResult, new IntentFilter(BluetoothDevice.ACTION_FOUND));
	}
   }
}
	
	//create a broadcast receiver to receiver device discovery
	BroadcastReceiver discoveryResult = new BroadcastReceiver(){
		@Override
		public void onReceive(Context context, Intent intent){
		String remoteDeviceName = intent.getStringExtra(BluetoothDevice.EXTRA_NAME);
		BluetoothDevice remoteDevice;
		remoteDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
		toastText = "Discovered: " + remoteDeviceName;
		Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT).show();
		}
	};	
	
	
	private String getLastUsedRemoteBTDevice(){
		String result = "debug";
//		SharedPreferences prefs = getPreferences(MODE_PRIVATE);
//		result = prefs.getString("LAST_REMOTE_DEVICE_ADDRESS", null);
		return result;
	}	
	
	
	public Utilities() {
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	
}
