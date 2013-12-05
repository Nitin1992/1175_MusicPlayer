package com.example.musicplayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;


public class ModelnoActivity extends Activity implements OnClickListener{
	
		public Button home;
		ImageButton back;
		TextView tv5;
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
		setContentView(R.layout.modelno);
		home = (Button)findViewById(R.id.btnShuffle1);
		  home.setOnClickListener(this);
		  tv5=(TextView)findViewById(R.id.textView22);
			  tv5.setText(getDeviceName());
			  back=(ImageButton)findViewById(R.id.ImageButton01);
				 back.setOnClickListener(this);
		       
		}
		
		

		public String getDeviceName() {
			  String manufacturer = Build.MANUFACTURER;
			  String model = Build.MODEL;
			  if (model.startsWith(manufacturer)) {
			    return capitalize(model);
			  } else {
			    return capitalize(manufacturer) + " " + model;
			  }
			}


			private String capitalize(String s) {
			  if (s == null || s.length() == 0) {
			    return "";
			  }
			  char first = s.charAt(0);
			  if (Character.isUpperCase(first)) {
			    return s;
			  } else {
			    return Character.toUpperCase(first) + s.substring(1);
			  }
			} 

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(arg0==home)
			{Intent i = new Intent (ModelnoActivity.this,MainActivity.class);
			startActivity(i);
			}
			if(R.id.ImageButton01==arg0.getId())
			{Intent i = new Intent (ModelnoActivity.this,PhoneActivity.class);
			startActivity(i);}
		}
	}