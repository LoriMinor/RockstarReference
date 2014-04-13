package com.rockref.rockstarreference;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	//initialize and assign action for clicking on guitar tuner button
	public void onGuitarTunerClick(View v){

		Intent startTunerIntent = new Intent(this, GuitarTunerActivity.class);

		//will take user to the guitar tuner
		startActivity(startTunerIntent);

	}
	//launch the chord chart
	public void onChordChartClick(View v){

		Intent chordChartStart = new Intent(this, ChordChartActivity.class);

		//will take user to the chord chart
		startActivity(chordChartStart);

	}
	//launch metronome
	public void onMetronomeClick(View v){

		Intent metronomeStart = new Intent(this, MetronomeActivity.class);

		//will take user to the metronome activity
		startActivity(metronomeStart);
	}
	
	public void onExtrasClick(View v){
	
	Intent showExtras = new Intent(this, ExtrasActivity.class);

	
	startActivity(showExtras);
	}
}
