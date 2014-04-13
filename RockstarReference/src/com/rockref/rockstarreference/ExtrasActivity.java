package com.rockref.rockstarreference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;

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
	
	public void onRockNewsClick(View v){

		Intent showRockNews = new Intent(this, ViewRockNewsActivity.class);

	 
		startActivity(showRockNews);
	}
	
	public void onRecordClick(View v){
		
		Intent record = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
		
		startActivity(record);
	}
	//onClick method to return to main menu
	public void onReturnHomeClick(View v){

		Intent returnHome = new Intent(this, HomeActivity.class);

		//will take user to the home menu
		startActivity(returnHome);
	}
	
	public void onShopGuitarsClick(View v){
		
		Intent shopGuitars = new Intent(this, ShopGuitarsActivity.class);
		
		startActivity(shopGuitars);
	}


}
