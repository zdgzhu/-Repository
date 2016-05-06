package com.example.drawabless;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class ClipDrawableActivity extends Activity {

	private ImageView img;
    ClipDrawable clidraw;
    
    Handler handler=new Handler(new Handler.Callback() {
		
		@Override
		public boolean handleMessage(Message msg) {
			
			if(msg.what==0x12){
				clidraw.setLevel(clidraw.getLevel()+300);
			}
			
			return false;
		}
	});
    
    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clip_drawable);
		
		img = (ImageView) findViewById(R.id.clip_img);
		
		clidraw = (ClipDrawable) img.getDrawable();
		
		final Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
             Message msg=new Message();
             msg.what=0x12;
             handler.sendMessage(msg);
				if(clidraw.getLevel()>=10000){
					timer.cancel();
				}
				
			}
		}, 0,300);
		
		
		
		
		
		
		
		
		
	}

	

}
