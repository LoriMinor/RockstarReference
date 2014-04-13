package com.rockref.rockstarreference;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MetronomeActivity extends Activity {

	int flag = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_metronome);


		/* BPM 70 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm70 = MediaPlayer.create(this, R.raw.bpm_70);

		//initialize the "BPM 70" button and listener that will play that tempo
		Button btn70Bpm = (Button) findViewById(R.id.btn70Bpm);

		btn70Bpm.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				//starts audio for tempo

				if (flag == 0){

					bpm70.start();

					flag++;

				} else {
					bpm70.stop();
					bpm70.release();
					flag = 0;
				}




			}			
		}); 

		/* BPM 90 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm90 = MediaPlayer.create(this, R.raw.bpm_90);

		//initialize the "BPM 90" button and listener that will play that tempo
		Button btnBpm90 = (Button) findViewById(R.id.btnBpm90);

		btnBpm90.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm90.start();

					flag++;

				} else {
					bpm90.stop();
					bpm90.release();
					flag = 0;
				}
			}			
		}); 

		/* BPM 120 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm120 = MediaPlayer.create(this, R.raw.bpm_120);

		//initialize the "BPM 120" button and listener that will play that tempo
		Button btnBpm120 = (Button) findViewById(R.id.btnBpm120);

		btnBpm120.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm120.start();

					flag++;

				} else {
					bpm120.stop();
					bpm120.release();
					flag = 0;
				}
			}			
		}); 

		/* BPM 130 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm130 = MediaPlayer.create(this, R.raw.bpm_130);

		//initialize the "BPM 130" button and listener that will play that tempo
		Button btnBpm130 = (Button) findViewById(R.id.btnBpm130);

		btnBpm130.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm130.start();

					flag++;

				} else {
					bpm130.stop();
					bpm130.release();
					flag = 0;
				}
			}			
		}); 

		/* BPM 140 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm140 = MediaPlayer.create(this, R.raw.bpm_140);

		//initialize the "BPM 140" button and listener that will play that tempo
		Button btnBpm140 = (Button) findViewById(R.id.btn140Bpm);

		btnBpm140.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm140.start();

					flag++;

				} else {
					bpm140.stop();
					bpm140.release();
					flag = 0;
				}
			}			
		}); 

		/* BPM 150 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm150 = MediaPlayer.create(this, R.raw.bpm_150);

		//initialize the "BPM 150" button and listener that will play that tempo
		Button btnBpm150 = (Button) findViewById(R.id.btnBpm150);

		btnBpm150.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm150.start();

					flag++;

				} else {
					bpm150.stop();
					bpm150.release();
					flag = 0;
				}
			}			
		}); 

		/* BPM 160 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm160 = MediaPlayer.create(this, R.raw.bpm_160);

		//initialize the "BPM 160" button and listener that will play that tempo
		Button btnBpm160 = (Button) findViewById(R.id.btnBpm160);

		btnBpm160.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm160.start();

					flag++;

				} else {
					bpm160.stop();
					bpm160.release();
					flag = 0;
				}
			}			
		}); 

		/* BPM 180 */
		//finds location of audio file for this bpm
		final MediaPlayer bpm180 = MediaPlayer.create(this, R.raw.bpm_180);

		//initialize the "BPM 180" button and listener that will play that tempo
		Button btnBpm180 = (Button) findViewById(R.id.btnBpm180);

		btnBpm180.setOnClickListener(new View.OnClickListener() {

			//this will play a metronome at the selected tempo when user hits button
			@Override
			public void onClick(View v) {

				if (flag == 0){

					bpm180.start();

					flag++;

				} else {
					bpm180.stop();
					bpm180.release();
					flag = 0;
				}
			}			
		}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.metronome, menu);
		return true;
	}



	//to get back to main menu
	public void onReturnHomeClick(View v){

		Intent returnHome = new Intent(this, HomeActivity.class);

		//will take user to the main menu
		startActivity(returnHome);
	}
}
