package com.example.musicplayer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.Intent;
public class LoginActivity extends Activity implements OnClickListener{
	public Button login,home;
	public EditText u_name,password;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.diarylogin);
		setContentView(R.layout.login);
	login = (Button)findViewById(R.id.btnShuffle1);
	u_name =(EditText)findViewById(R.id.editText1);
	password = (EditText)findViewById(R.id.editText2);
	home = (Button)findViewById(R.id.button2);
	  home.setOnClickListener(this);
	login.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	if(arg0.getId()==R.id.btnShuffle1)
		if(u_name.getText().toString().trim().equals("google")&&password.getText().toString().trim().equals("android"))
		{
			Intent i=new Intent(LoginActivity.this,PhoneActivity.class);
			startActivity(i);
	}
	if(arg0.getId()==R.id.button2)
	{	Intent i = new Intent (LoginActivity.this,MainActivity.class);
	startActivity(i);
	}	
	}
	
	
}