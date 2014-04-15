package com.rockref.rockstarreference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;

/**
 * @author Lori Minor
 * 
 * This activity provides "extras" that a musician may want to utilize while using this application.
 * It includes the ability to record sound, music news, and a web referral to purchase new
 * guitars and other musical equipment.
 *
 */
public class ExtrasActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_extras);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.extras, menu);
		return true;
	}

	//onClick method for the "Rock News" button
	public void onRockNewsClick(View v){

		Intent showRockNews = new Intent(this, ViewRockNewsActivity.class);

		//starts a WebView containing news from the rock and roll hall of fame
		startActivity(showRockNews);
	}

	//onClick method for the "Record" button
	public void onRecordClick(View v){

		//implicit intent to launch the audio recorder on device
		Intent record = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);

		//audio recorder will be accessible to user to make recordings
		startActivity(record);
	}

	//onClick method to return to main menu
	public void onReturnHomeClick(View v){

		Intent returnHome = new Intent(this, HomeActivity.class);

		//will take user to the home menu
		startActivity(returnHome);
	}

	//onClick method to allow users to shop for guitars 
	public void onShopGuitarsClick(View v){

		Intent shopGuitars = new Intent(this, ShopGuitarsActivity.class);

		//user will be enabled to use guitar center in order to purchase guitars and equipment
		startActivity(shopGuitars);
	}
}
