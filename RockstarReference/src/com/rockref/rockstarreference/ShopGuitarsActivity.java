package com.rockref.rockstarreference;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class ShopGuitarsActivity extends Activity {

	private WebView shopGuitars; //web view to display content

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shop_guitars);

		//initialize web view for shop guitars
		shopGuitars = (WebView)findViewById(R.id.wvShopGuitars);

		//loads content from web source
		shopGuitars.loadUrl("http://www.guitarcenter.com");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shop_guitars, menu);
		return true;
	}

	//return home
	public void onBackToExtrasClick(View v){

		Intent backToExtras = new Intent(this, ExtrasActivity.class);

		//will take user to the extras activity 
		startActivity(backToExtras);
	}

}
