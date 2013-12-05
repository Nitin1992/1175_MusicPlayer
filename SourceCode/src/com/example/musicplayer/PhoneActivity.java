package com.example.musicplayer;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.content.Intent;
public class PhoneActivity extends Activity implements OnClickListener{
	public Button modelno;
	public Button andver;
	public Button kernel;
	public Button phnmemory;
	Button home;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.phone);
	home = (Button)findViewById(R.id.button1);
	  home.setOnClickListener(this);
	modelno =(Button)findViewById(R.id.btnShuffle1);
	andver =(Button)findViewById(R.id.button2);
	kernel =(Button)findViewById(R.id.button3);
	phnmemory =(Button)findViewById(R.id.button4);
	modelno.setOnClickListener(this);
	andver.setOnClickListener(this);
	kernel.setOnClickListener(this);
	phnmemory.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	if(v.getId()==R.id.btnShuffle1){
		Intent i=new Intent(PhoneActivity.this,ModelnoActivity.class);
		startActivity(i);
	}
	else if(v.getId()==R.id.button2){
		Intent j=new Intent(PhoneActivity.this,AndVerActivity.class);
		startActivity(j);
	}
	else if(v.getId()==R.id.button3){
		Intent k= new Intent(PhoneActivity.this,KernelActivity.class);
		startActivity(k);
		}
	else if(v.getId()==R.id.button4){
		Intent l=new Intent(PhoneActivity.this,MemoryActivity.class);
		startActivity(l);
	}
	
	else if(R.id.button1==v.getId())
	{Intent i = new Intent (PhoneActivity.this,MainActivity.class);
	startActivity(i);}
	}
}
