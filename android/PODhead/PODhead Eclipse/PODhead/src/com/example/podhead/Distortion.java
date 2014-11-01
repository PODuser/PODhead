package com.example.podhead;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Distortion extends Fragment{

		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View distortionView = inflater.inflate(R.layout.distortion,
					container, false);

			return distortionView;
		}

	public Distortion(){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		switch (v.findFocus().getId()) {
//		case R.id.btn_presetbankup:
//			break;
//		case R.id.btn_presetup:
//			break;
//		case R.id.btn_presetdown:
//			break;
//		case R.id.btn_presetbankdown:
//			break;
//		case R.id.btn_savepresets:
//		// Writepresetexternal(gpresetfile);
//			break;
//		default:
//			break;
//		}	
//	}

}
