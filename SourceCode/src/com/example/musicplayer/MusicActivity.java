package com.example.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MusicActivity extends Activity implements OnClickListener {
	public Button play,home;
	public Button pause;
	public Button stop;
	public Button next;
	public Button previous;
	MediaPlayer m,n;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.music);
	home = (Button)findViewById(R.id.button2);
	  home.setOnClickListener(this);
	   play = (Button) findViewById(R.id.btnShuffle1);
       pause = (Button) findViewById(R.id.button5);
       stop = (Button) findViewById(R.id.button3);
       previous = (Button) findViewById(R.id.button4);
       next = (Button) findViewById(R.id.button6);
       
   //    m = MediaPlayer.create(MusicActivity.this, R.raw.abc2);
     //  n = MediaPlayer.create(MusicActivity.this, R.raw.rabta);
	
       play.setOnClickListener(this);
   	pause.setOnClickListener(this);
   	stop.setOnClickListener(this);
   	next.setOnClickListener(this);
   	previous.setOnClickListener(this);
   	}    
	
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId()==R.id.button6)
		{	Intent i = new Intent (MusicActivity.this,MainActivity.class);
		startActivity(i);
		}	
if(v.getId()==R.id.btnShuffle1)
{

	m.start();
play.setVisibility(View.INVISIBLE);
pause.setVisibility(View.VISIBLE);
stop.setVisibility(View.VISIBLE);
next.setVisibility(View.VISIBLE);
previous.setVisibility(View.VISIBLE);

}
else if(v.getId()==R.id.button2)
{	 
		m.pause();n.pause();
		play.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		next.setVisibility(View.VISIBLE);
		previous.setVisibility(View.VISIBLE);
		
stop.setVisibility(View.INVISIBLE);
super.onPause();
	}
	else if(v.getId()==R.id.button3){
		m.stop();n.stop();
		play.setVisibility(View.VISIBLE);
		pause.setVisibility(View.VISIBLE);
		stop.setVisibility(View.INVISIBLE);
		next.setVisibility(View.VISIBLE);
		previous.setVisibility(View.VISIBLE);
		finish();

	}
	else if(v.getId()==R.id.button4){
		m.pause();	
		n.start();
			play.setVisibility(View.VISIBLE);
			pause.setVisibility(View.VISIBLE);
			stop.setVisibility(View.VISIBLE);
previous.setVisibility(View.VISIBLE);
super.onPause();
}
	else if(v.getId()==R.id.button5){
				m.start();
				n.pause();	
					play.setVisibility(View.VISIBLE);
					pause.setVisibility(View.VISIBLE);
					stop.setVisibility(View.VISIBLE);
					next.setVisibility(View.VISIBLE);
					previous.setVisibility(View.VISIBLE);

	}

	
	
}}