package com.example.podhead;

import java.util.Locale;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivity extends FragmentActivity{

	MediaPlayer gsplashMusic;
	
	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());
		
		
		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		
//		gsplashMusic= MediaPlayer.create(this,R.raw.extemporaneously);
//		gsplashMusic.start();
//		
//		Thread splashTimer = new Thread(){
//			public void run(){
//				try{
//					sleep(6000);
//					gsplashMusic.stop();
//					gsplashMusic.release();
//					//Intent menuIntent = new Intent("com.example.podhead.Userpresets");
//					//startActivity(menuIntent);
//				}catch(InterruptedException e){
//					e.printStackTrace();
//				}
//				
//				finally{
//				}
//			}
//			
//		};
//		splashTimer.start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
	 	MenuInflater inflater = getMenuInflater();    
    	inflater.inflate(R.menu.podmenu, menu);   
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.about:
			//about
			mViewPager.setCurrentItem(0);
			break;
		case R.id.userpresets:
			//Userpresets
			mViewPager.setCurrentItem(1);
			break;
		case R.id.distortion:
			//Distortion
			mViewPager.setCurrentItem(2);
			break;
		case R.id.delay:
			//Delay
			mViewPager.setCurrentItem(3);
			break;
		case R.id.chorus:
			//Chorus
			mViewPager.setCurrentItem(4);
			break;
		case R.id.compressor:
			//Compressor
			mViewPager.setCurrentItem(5);
			break;
		case R.id.detune:
			//Detune
			mViewPager.setCurrentItem(6);
			break;
		case R.id.equalizer:
			//Equalizer
			mViewPager.setCurrentItem(7);
			break;	
		case R.id.flange:
			///Flange
			mViewPager.setCurrentItem(8);
			break;
		case R.id.noisegate:
			//Noisegate
			mViewPager.setCurrentItem(9);
			break;
		case R.id.reverb:
			//Reverb
			mViewPager.setCurrentItem(10);
			break;
		case R.id.rotary:
			//Rotary
			mViewPager.setCurrentItem(11);
			break;	
		case R.id.wah:
			//Wah
			mViewPager.setCurrentItem(12);
			break;
		case R.id.phaser:
			//Phaser
			mViewPager.setCurrentItem(13);
			break;
		case R.id.pitch:
			//Pitch
			mViewPager.setCurrentItem(14);
			break;
		case R.id.video:
			//Video
			mViewPager.setCurrentItem(15);
			break;			
		case R.id.utilities:
			//Utilities
			mViewPager.setCurrentItem(16);
			break;				
			
		}
		return super.onMenuItemSelected(featureId, item);
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		public Fragment getItem(int position) {
			//Bundle args = new Bundle();
			Fragment fragment=null;
			switch (position){
			case 0:
				fragment = new About(); 
				break;	
			case 1:
				fragment = new Userpresets(); 
				break;
			case 2:
				fragment = new Distortion(); 
				break;				
			case 3:
				fragment = new Delay(); 
				break;	
			case 4:
				fragment = new Chorus(); 
				break;
			case 5:	
				fragment = new Compressor();
				break;
			case 6:
				fragment = new Detune();
				break;
			case 7:
				fragment = new Equalizer();
				break;
			case 8:
				fragment = new Flange();
				break;
			case 9:
				fragment = new Noisegate();
				break;
			case 10:
				fragment = new Reverb();
				break;
			case 11:
				fragment = new Rotary();
				break;
			case 12:
				fragment = new Wah();
				break;
			case 13:
				fragment = new Phaser();
				break;
			case 14:
				fragment = new Pitch();
				break;				
//			case 15:
//				fragment = new Video();
//				break;
			case 15:
				fragment = new Utilities();
				break;
			};
			return fragment;
		}

		
		@Override
		public int getCount() {
			
			return 16;
		}

		
		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.title_about).toUpperCase(l);
			case 1:
				return getString(R.string.title_userpresets).toUpperCase(l);				
			case 2:
				return getString(R.string.title_distortion).toUpperCase(l);
			case 3:
				return getString(R.string.title_delay).toUpperCase(l);
			case 4:
				return getString(R.string.title_chorus).toUpperCase(l);
			case 5:
				return getString(R.string.title_compressor).toUpperCase(l);
			case 6:
				return getString(R.string.title_detune).toUpperCase(l);
			case 7:
				return getString(R.string.title_equalizer).toUpperCase(l);
			case 8:
				return getString(R.string.title_flange).toUpperCase(l);
			case 9:
				return getString(R.string.title_noisegate).toUpperCase(l);
			case 10:
				return getString(R.string.title_reverb).toUpperCase(l);
			case 11:
				return getString(R.string.title_rotary).toUpperCase(l);
			case 12:
				return getString(R.string.title_wah).toUpperCase(l);
			case 13:
				return getString(R.string.title_phaser).toUpperCase(l);
			case 14:
				return getString(R.string.title_pitch).toUpperCase(l);				
//			case 15:
//				return getString(R.string.title_video).toUpperCase(l);				
			case 15:
				return getString(R.string.title_utilities).toUpperCase(l);
			}
			return null;
		}

	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    case R.id.about:
//	        FragmentTransaction fragmentTransaction) {
//	            // When the given tab is selected, show the tab contents in the
//	            // container view.
//	            Fragment fragment = new DummySectionFragment();
//	            Bundle args = new Bundle();
//	            args.putInt(DummySectionFragment.ARG_SECTION_NUMBER,
//	                tab.getPosition() + 1);
//	            fragment.setArguments(args);
//	            getFragmentManager().beginTransaction()
//	                .replace(R.id.container, fragment).commit();

	    	//??startFragment(About);
	    	// getBaseContect()
	    	//parseInt()
	    	
	      break;
		case R.id.userpresets:
			
			break;
		case R.id.distortion:
			
			break;
		case R.id.delay:
			
			break;
		case R.id.chorus:
			
			break;
		case R.id.compressor:
			
			break;
		case R.id.detune:
			
			break;
		case R.id.equalizer:
			
			break;	
		case R.id.flange:
			
			break;
		case R.id.noisegate:
			
			break;
		case R.id.reverb:
			
			break;
		case R.id.rotary:
			
			break;	
		case R.id.wah:
			
			break;
		case R.id.phaser:
			
			break;
		case R.id.pitch:
			
			break;
		case R.id.video:
			
			break;			
		case R.id.utilities:
			
			break;	
	    default:
	      break;
	    }
		return super.onOptionsItemSelected(item);
	}	
		
/*
	@Override
	public void onClick(View v) {
		Toast.makeText(this, "Main Activity OnClick", Toast.LENGTH_SHORT).show();

	}
	*/
	
	
}
