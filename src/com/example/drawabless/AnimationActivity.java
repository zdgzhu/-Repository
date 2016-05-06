package com.example.drawabless;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends Activity {

	private ImageView img;
	private Animation anim;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);
		img = (ImageView) findViewById(R.id.imag_animation);
		
		anim = AnimationUtils.loadAnimation(this,R.anim.my_anim);
		//设置动画结束后，保留动画结束后的状态
		anim.setFillAfter(true);//动画执行完之后，图片不复原
		
		findViewById(R.id.btn_animation).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				//启动动画
				img.startAnimation(anim);
				
				
			}
		});
		
		
		
	}

	

}
