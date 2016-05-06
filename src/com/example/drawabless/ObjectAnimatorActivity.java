package com.example.drawabless;

import android.os.Bundle;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class ObjectAnimatorActivity extends Activity {

	private LinearLayout ln;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_object_animator);
		ln = (LinearLayout) findViewById(R.id.container);
		
		ln.addView(new MyAnimationView(this));
		
		
		
		
		
	}

	
	public class MyAnimationView extends View{

		private ObjectAnimator coloranimator;

		//加载动画资源
		public MyAnimationView(Context context) {
			super(context);
			
			coloranimator = (ObjectAnimator) AnimatorInflater.loadAnimator(ObjectAnimatorActivity.this,R.animator.my_animator);
			coloranimator.setEvaluator(new ArgbEvaluator());
			//对该view本身应用属性动画
			coloranimator.setTarget(this);
			coloranimator.start();
		}
		
		
	}
	

}
