package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.Activity;

public class AndVerActivity extends Activity implements OnClickListener{

	TextView tv6;
	public Button home;
	ImageButton back;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.andver);
	home = (Button)findViewById(R.id.btnShuffle1);
	  home.setOnClickListener(this);
	  tv6=(TextView)findViewById(R.id.textView22);
	  tv6.setText("Android "+android.os.Build.VERSION.RELEASE);
	  back=(ImageButton)findViewById(R.id.ImageButton01);
	 back.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(R.id.btnShuffle1==arg0.getId())
		{Intent i = new Intent (AndVerActivity.this,MainActivity.class);
		startActivity(i);}
		if(R.id.ImageButton01==arg0.getId())
		{Intent i = new Intent (AndVerActivity.this,PhoneActivity.class);
		startActivity(i);}
	}
}