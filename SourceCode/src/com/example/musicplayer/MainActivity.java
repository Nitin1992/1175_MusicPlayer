package com.example.musicplayer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


import android.view.*;
public class MainActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	public Button musicplayer;
	public Button phoneinfo;
	public Button clock;
	public Button calender;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        musicplayer = (Button) findViewById(R.id.btnShuffle1);
        phoneinfo = (Button) findViewById(R.id.button2);
        clock= (Button) findViewById(R.id.button3);
        calender= (Button) findViewById(R.id.button4);
        musicplayer.setOnClickListener(this);
        phoneinfo.setOnClickListener(this);
        clock.setOnClickListener(this);
        calender.setOnClickListener(this);
    }
    
    public void onClick(View v) {
    		Toast.makeText(this, "click", Toast.LENGTH_LONG).show();
    		// TODO Auto-generated method stub
    if(v.getId()==R.id.btnShuffle1)
    {
    	Intent i = new Intent (MainActivity.this,MusicPlayerActivity.class);
		startActivity(i);
    }
    else if(v.getId()==R.id.button2)
    {	 Intent j = new Intent (MainActivity.this,LoginActivity.class);
	startActivity(j);
    	
    	}
  
    else if(v.getId()==R.id.button3)
    {	 Intent k = new Intent (MainActivity.this,ClockActivity.class);
	startActivity(k);
    	
    	}	
    else if(v.getId()==R.id.button4)
    {	Toast.makeText(this, "calendar", Toast.LENGTH_LONG).show(); 
    	Intent k = new Intent (MainActivity.this,SimpleCalendarViewActivity.class);
	startActivity(k);
	}
   }
        
}