package com.rockref.rockstarreference;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


/**
 * @author Lori Minor
 * 
 *	This class allows the user to tune his/her guitar.
 */
public class GuitarTunerActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guitar_tuner);

		/**
		 * The following methods will play audio that corresponds with the buttons for each
		 * string of the guitar.
		 */

		/* tune low E string */

		//this will find the audio file for the note low E
		final MediaPlayer lowE = MediaPlayer.create(this, R.raw.tune_low_e);

		//initialize the "E" button that represents the low E string
		Button btnStringLowE = (Button) findViewById(R.id.btnStringLowE);

		btnStringLowE.setOnClickListener(new View.OnClickListener() {

			//this will play the low E pitch when user clicks the "E" button
			@Override
			public void onClick(View v) {

				//starts audio for pitch
				lowE.start();
			}			
		}); 

		/* tune A string */

		//this will find the audio file for the note A
		final MediaPlayer playA = MediaPlayer.create(this, R.raw.tune_a);

		//initialize the "A" button that represents the A string
		Button btnStringA = (Button) findViewById(R.id.btnStringA);

		btnStringA.setOnClickListener(new View.OnClickListener() {

			//this will play the A pitch when user clicks the "A" button
			@Override
			public void onClick(View v) {

				//starts audio for pitch
				playA.start();
			}			
		}); 

		/* tune D string */

		//this will find the audio file for the note D
		final MediaPlayer playD = MediaPlayer.create(this, R.raw.tune_d);

		//initialize the "D" button that represents the D string
		Button btnStringD = (Button) findViewById(R.id.btnStringD);

		btnStringD.setOnClickListener(new View.OnClickListener() {

			//this will play the D pitch when user clicks the "D" button
			@Override
			public void onClick(View v) {

				//starts audio for pitch
				playD.start();
			}			
		}); 

		/* tune G string */

		//this will find the audio file for the note G
		final MediaPlayer playG = MediaPlayer.create(this, R.raw.tune_g);

		//initialize the "G" button that represents the G string
		Button btnStringG = (Button) findViewById(R.id.btnStringG);

		btnStringG.setOnClickListener(new View.OnClickListener() {

			//this will play the G pitch when user clicks the "G" button
			@Override
			public void onClick(View v) {

				//starts audio for pitch
				playG.start();
			}			
		}); 

		/* tune B string */

		//this will find the audio file for the note B
		final MediaPlayer playB = MediaPlayer.create(this, R.raw.tune_b);

		//initialize the "B" button that represents the B string
		Button btnStringB = (Button) findViewById(R.id.btnStringB);

		btnStringB.setOnClickListener(new View.OnClickListener() {

			//this will play the B pitch when user clicks the "B" button
			@Override
			public void onClick(View v) {

				//starts audio for pitch
				playB.start();
			}			
		}); 

		/* tune high E string */

		//this will find the audio file for the note high E
		final MediaPlayer highE = MediaPlayer.create(this, R.raw.tune_high_e);

		//initialize the "e" button that represents the high E string
		Button btnStringHighE = (Button) findViewById(R.id.btnStringHighE);

		btnStringHighE.setOnClickListener(new View.OnClickListener() {

			//this will play the high E pitch when user clicks the "e" button
			@Override
			public void onClick(View v) {

				//starts audio for pitch
				highE.start();
			}			
		}); 

	}


	//this will allow the user to return to the home menu, the first activity
	public void onReturnHomeClick(View v){

		Intent returnHome = new Intent(this, HomeActivity.class);

		//will take user to the main activity 
		startActivity(returnHome);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.guitar_tuner, menu);
		return true;
	}
}


