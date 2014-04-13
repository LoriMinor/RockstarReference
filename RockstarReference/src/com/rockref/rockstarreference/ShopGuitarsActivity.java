package com.rockref.rockstarreference;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class ShopGuitarsActivity extends Activity {
	
	private WebView shopGuitars;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shop_guitars);
		
		shopGuitars = (WebView)findViewById(R.id.wvShopGuitars);
		//shopGuitars.getSettings().setJavaScriptEnabled(true);
		shopGuitars.loadUrl("http://www.guitarcenter.com");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shop_guitars, menu);
		return true;
	}
	
	public void onBackToExtrasClick(View v){

		Intent backToExtras = new Intent(this, ExtrasActivity.class);

		//will take user to the extras activity 
		startActivity(backToExtras);
	}

}
