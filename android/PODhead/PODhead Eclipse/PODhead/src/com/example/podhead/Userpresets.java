package com.example.podhead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Userpresets extends Fragment implements OnClickListener {

	public static final String PREFS_FILE = "podprefs";
	EditText etpresetname;
	EditText etpresetnum;
	View userpresetView;
	String gpresetnum = "";
	String gpresetname = "";
	String gpresetfile = "";
	String gpresetdata = "";


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		userpresetView = inflater.inflate(R.layout.userpresets, container,
				false);

		etpresetnum = (EditText) userpresetView.findViewById(R.id.et_presetnum);
		etpresetnum.setText("");

		etpresetname = (EditText) userpresetView
				.findViewById(R.id.et_presetname);
		etpresetnum.setText("");

		Readpresetshared();

		Button savepresets = (Button) userpresetView
				.findViewById(R.id.btn_savepresets);
		savepresets.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Writepresetshared();
				Writepresetexternal();
				Readpresetexternal();
				//Readpresetshared();

			}
		});

		etpresetnum.setOnFocusChangeListener(new View.OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				gpresetnum = etpresetnum.getText().toString();

				if (gpresetnum != "") {
/*					Writepresetshared();
					Writepresetexternal();
					Readpresetexternal();
*/
				}
			}
		});

		Button bankup = (Button) userpresetView
				.findViewById(R.id.btn_presetbankup);
		bankup.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		Button presetup = (Button) userpresetView
				.findViewById(R.id.btn_presetup);
		presetup.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		Button presetdown = (Button) userpresetView
				.findViewById(R.id.btn_presetdown);
		presetdown.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		Button bankdown = (Button) userpresetView
				.findViewById(R.id.btn_presetbankdown);
		bankdown.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});

		return userpresetView;
	}

	@Override
	public void onPause() {
		Writepresetshared();
		super.onPause();
	}


	
	public void Readpresetshared() {
		// reads current preset number, name and presetfile

//		ReadpresetPM();
		String tpresetnum = "";
		String tpresetname = "";

		SharedPreferences podprefs = this.getActivity().getSharedPreferences(
				PREFS_FILE, 2);

		tpresetnum = podprefs.getString("presetnum", tpresetnum);
		if (tpresetnum == "") {
			tpresetnum = "0";
		};
		etpresetnum.setText(tpresetnum);

		tpresetname = podprefs.getString("presetname", tpresetname);
		if (tpresetname == "") {
			tpresetname = "default preset0";
		};
		etpresetname.setText(tpresetname);

		//podprefs.getString("presetfile", gpresetfile);
		//if (gpresetfile == "") {
		//	gpresetfile = "preset0";
		//} else {
		
		gpresetnum = tpresetnum;
		gpresetname = tpresetname;
		
			gpresetfile = "preset" + gpresetnum;
		//}
		//;

		Toast.makeText(getActivity(), "Getting Preset Data", Toast.LENGTH_SHORT)
				.show();

		Toast.makeText(getActivity(), "Preset file is " + gpresetfile, Toast.LENGTH_SHORT).show();

	}
	

	
	public Boolean Writepresetshared() {
		// Stores current preset number, name and filename
		
		String tpresetnum = etpresetnum.getText().toString();
		String tpresetname = etpresetname.getText().toString();
		
//		WritepresetPM();
		
			
		if (tpresetnum == "" || tpresetnum == null) {
			Toast.makeText(getActivity(), "Invalid preset number or name",
					Toast.LENGTH_SHORT).show();
			return false;
		};

		SharedPreferences podprefs = this.getActivity().getSharedPreferences(
				PREFS_FILE, 2 );

		SharedPreferences.Editor edit = podprefs.edit();

		edit.putString("presetnum", tpresetnum);
		edit.putString("presetname", tpresetname);
		edit.apply();

			
		Toast.makeText(getActivity(),
				"Writing preset" + gpresetnum + " :: " + gpresetname,
				Toast.LENGTH_SHORT).show();
				
		return true;
	}

		
	public void Readpresetexternal() {
		// reads current preset number, name and filename
		//String presetnum, String presetname, String presetfile
			

		etpresetnum.setText("");
		etpresetname.setText("");
		gpresetnum="";
		gpresetname="";
		
		if(gpresetfile == ""){
			Toast.makeText(getActivity(),
					"Readingpresetexternal Invalid file :: " + gpresetnum + " :: " + gpresetname,
					Toast.LENGTH_SHORT).show();
			return;
		}
		
				
		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
//					gpresetfile));
			ObjectInputStream ois = new ObjectInputStream(this.getActivity().openFileInput(gpresetfile));			
			
			try {
				
				Boolean objfound = false;
				
				while ( objfound == false) {
					//ois.readObject().equals(presetobject);
					Object nextobj = ois.readObject();
					if (nextobj instanceof Preset){
					objfound = true;
					Preset presetobject = (Preset) nextobj;
					
					gpresetnum = presetobject.getPnum();
					etpresetnum.setText(gpresetnum);
					
					gpresetname = presetobject.getPname();
					etpresetname.setText(gpresetname);
					
					System.out.println(presetobject);
					
					}else
						{
						//System.out.println("Readpresetexternal :: object not found");
						Toast.makeText(getActivity(), "Readpresetexternal :: object not Preset type",
								Toast.LENGTH_SHORT).show();	
						};
				} ;
				
				ois.close();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (StreamCorruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Toast.makeText(getActivity(), "Read External Complete :: " + gpresetfile,
				Toast.LENGTH_SHORT).show();		
		
	}	
	
	
	public Boolean Writepresetexternal() {
		// Stores current preset number, name and filename
		// String presetnum, String presetname, String presetfile

		if (gpresetfile.contentEquals("") || gpresetnum.contentEquals("") || gpresetname.contentEquals("")) {
			Toast.makeText(getActivity(),
					"Writepresetexternal :: Invalid preset number or name",
					Toast.LENGTH_SHORT).show();
			return false;
		}
		
		gpresetnum = etpresetnum.getText().toString();
		gpresetname = etpresetname.getText().toString();		
		
		gpresetfile = "preset" + gpresetnum;
		Preset gpreset = new Preset();
		
		try {
			
		gpreset.setPnum(gpresetnum);
		gpreset.setPname(gpresetname);


			ObjectOutputStream oos = new ObjectOutputStream(this.getActivity().openFileOutput(gpresetfile, 2));
			oos.writeObject(gpreset);
			oos.flush();
			oos.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		Toast.makeText(getActivity(), "Write external Complete :: " + gpresetfile,
				Toast.LENGTH_SHORT).show();

		return true;
	}
	
	
	@Override
	public void onClick(View v) {
		/*
		 * Toast.makeText(getActivity(), "On Click View Occurred",
		 * Toast.LENGTH_LONG).show();
		 * 
		 * try { // etpresetname.setText("preset saved"); switch
		 * (v.findFocus().getId()) { case R.id.btn_presetbankup: break; case
		 * R.id.btn_presetup: break; case R.id.btn_presetdown: break; case
		 * R.id.btn_presetbankdown: break; case R.id.btn_savepresets:
		 * Writepresetshared(); Readpresetshared(); Writepresetexternal();
		 * Readpresetexternal(); break; default: break; } } catch (Exception e)
		 * { e.printStackTrace(); }
		 */
	}

}

// FileInputStream fis;
// String value = "";
// try {
// fis = openFileInput(presetfile);
// byte[] input = null;
// try {
// input = new byte[fis.available()];
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// try {
// while(fis.read(input) != -1){
// value += new String(input);
// }
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// try {
// fis.close();
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// } catch (FileNotFoundException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }

// try {
// FileOutputStream fos = openFileOutput(gpresetfile,
// Context.MODE_WORLD_READABLE);
// fos.write(gpresetdata.getBytes());
// fos.close();
// } catch (FileNotFoundException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }

