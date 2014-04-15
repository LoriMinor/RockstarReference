package com.rockref.rockstarreference;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

/**
 * @author Lori Minor
 * 
 * This activity is the first screen that the user will interact with, andn it serves as a main menu.  
 * From this activity, the user may select which function that he/she would like to use.
 *	
 */
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
	/**
	 * The following methods will launch the activity that the user selects by clicking on one of the 
	 * buttons on the main menu.
	 * 
	 * @param v the view for the activity
	 */

	//initialize and assign action for clicking on guitar tuner button
	public void onGuitarTunerClick(View v){

		Intent startTunerIntent = new Intent(this, GuitarTunerActivity.class);

		//will take user to the guitar tuner
		startActivity(startTunerIntent);

	}
	//launch the chord chart activity
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

	//launches the extras menu
	public void onExtrasClick(View v){

		Intent showExtras = new Intent(this, ExtrasActivity.class);

		//displays the extras activity 
		startActivity(showExtras);
	}
}
