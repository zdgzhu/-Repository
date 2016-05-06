package com.example.drawabless;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn01).setOnClickListener(this);
        findViewById(R.id.btn02).setOnClickListener(this);
        findViewById(R.id.btn03).setOnClickListener(this);
        findViewById(R.id.btn04).setOnClickListener(this);
        findViewById(R.id.btn05).setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btn01:
			Intent it=new Intent(MainActivity.this,LayerDrawableActivity.class);
			startActivity(it);
			break;

		case R.id.btn02:
			Intent it2=new Intent(MainActivity.this,ShapeDrawableActivity.class);
			startActivity(it2);
			break;
			
			
		case R.id.btn03:
			Intent it3=new Intent(MainActivity.this,ClipDrawableActivity.class);
			startActivity(it3);
			break;
			
		case R.id.btn04:
			Intent it4=new Intent(MainActivity.this,AnimationActivity.class);
			startActivity(it4);
			break;
			
			
		case R.id.btn05:
			Intent it5=new Intent(MainActivity.this,ObjectAnimatorActivity.class);
			startActivity(it5);
			break;
			
			
			
		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}


   
    
}
