package com.rockref.rockstarreference;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class ViewRockNewsActivity extends Activity {

	private WebView rockNews;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_rock_news);
		
		rockNews = (WebView)findViewById(R.id.wvRockNews);
		rockNews.getSettings().setJavaScriptEnabled(true);
		rockNews.loadUrl("http://www.rockhall.com");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_rock_news, menu);
		return true;
	}
	
	public void onClickBackExtras(View v){

		Intent returnToExtras = new Intent(this, ExtrasActivity.class);

		//will take user to the main activity 
		startActivity(returnToExtras);
	}

}
