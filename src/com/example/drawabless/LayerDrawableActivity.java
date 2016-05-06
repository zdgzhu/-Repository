package com.example.drawabless;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LayerDrawableActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layer_drawable);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layer_drawable, menu);
		return true;
	}

}
