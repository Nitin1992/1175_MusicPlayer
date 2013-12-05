package com.example.musicplayer;
import android.os.Bundle;
import android.content.Intent;


import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.app.Activity;
public class ClockActivity extends Activity implements OnClickListener{
public Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clock);
        home = (Button)findViewById(R.id.btnShuffle1);
        home.setOnClickListener(new View.OnClickListener() {
        	
        public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			{				//msg.setText("u_name & password are correct");
		Intent i = new Intent (ClockActivity.this,MainActivity.class);
		startActivity(i);
		
			}
        };
    });
        }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}} 