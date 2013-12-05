package com.example.musicplayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class KernelActivity extends Activity implements OnClickListener {
	TextView tv;
	public Button home;
	ImageButton back;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.kernel);
	home = (Button)findViewById(R.id.btnShuffle1);
	  home.setOnClickListener(this);
	  tv=(TextView)findViewById(R.id.textView22);
	  tv.setText(System.getProperty("os.version"));
	  back=(ImageButton)findViewById(R.id.ImageButton01);
	  back.setOnClickListener(this);
	}
	       
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(R.id.btnShuffle1==arg0.getId())
		{Intent i = new Intent (KernelActivity.this,MainActivity.class);
		startActivity(i);}	
		
		if(R.id.ImageButton01==arg0.getId())
		{Intent i = new Intent (KernelActivity.this,PhoneActivity.class);
		startActivity(i);}
	}
}
