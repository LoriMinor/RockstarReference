package com.rockref.rockstarreference;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

/**
 * @author Lori Minor
 * 
 * This activity contains chord charts for fourteen different chords.  The user may view each chord chart
 * by swiping to the left while touching each chord chart image.  Most of the code for this activity is contained in the 
 * layout xml file, as it uses mostly images in a horizontal scroll view to display each chord chart.
 *
 */
public class ChordChartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chord_chart);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chord_chart, menu);
		return true;
	}


	//onClick method to return to main menu
	public void onReturnHomeClick(View v){

		Intent returnHome = new Intent(this, HomeActivity.class);

		//will take user to the home menu
		startActivity(returnHome);
	}
}
