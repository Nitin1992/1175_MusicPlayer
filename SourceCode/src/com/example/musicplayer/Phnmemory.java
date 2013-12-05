package com.example.musicplayer;
import java.io.File;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.Activity;

public class Phnmemory extends Activity implements OnClickListener {

	public Button home;
	ImageButton back;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.memory);
	TextView tv=(TextView)findViewById(R.id.textView22);
	tv.setText((CharSequence)Phnmemory.getAvailableInternalMemorySize());
	home = (Button)findViewById(R.id.btnShuffle1);
	  home.setOnClickListener(this);
	  back=(ImageButton)findViewById(R.id.ImageButton01);
		 back.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {

						//msg.setText("u_name & password are correct");
		if(home==arg0)
	{Intent i = new Intent (Phnmemory.this,MainActivity.class);
	startActivity(i);}
		if(R.id.ImageButton01==arg0.getId())
		{Intent i = new Intent (Phnmemory.this,PhoneActivity.class);
		startActivity(i);}
	
		
		// TODO Auto-generated method stub
		}
	public static boolean externalMemoryAvailable() {
        return android.os.Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED);
    }

    public static String getAvailableInternalMemorySize() {
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long availableBlocks = stat.getAvailableBlocks();
        return formatSize(availableBlocks * blockSize);
    }

    public static String getTotalInternalMemorySize() {
        File path = Environment.getDataDirectory();
        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long totalBlocks = stat.getBlockCount();
        return formatSize(totalBlocks * blockSize);
    }

    public static String getAvailableExternalMemorySize() {
    	String ERROR = null;
        if (externalMemoryAvailable()) {
            File path = Environment.getExternalStorageDirectory();
            StatFs stat = new StatFs(path.getPath());
            long blockSize = stat.getBlockSize();
            long availableBlocks = stat.getAvailableBlocks();
            return formatSize(availableBlocks * blockSize);
        } else {
            
			return ERROR;
        }
    }

    public static String getTotalExternalMemorySize() {
    	String ERROR = null;
        if (externalMemoryAvailable()) {
            File path = Environment.getExternalStorageDirectory();
            StatFs stat = new StatFs(path.getPath());
            long blockSize = stat.getBlockSize();
            long totalBlocks = stat.getBlockCount();
            return formatSize(totalBlocks * blockSize);
        } else {
            
			return ERROR;
        }
    }

    public static String formatSize(long size) {
        String suffix = null;

        if (size >= 1024) {
            suffix = "KB";
            size /= 1024;
            if (size >= 1024) {
                suffix = "MB";
                size /= 1024;
            }
        }

        StringBuilder resultBuffer = new StringBuilder(Long.toString(size));

        int commaOffset = resultBuffer.length() - 3;
        while (commaOffset > 0) {
            resultBuffer.insert(commaOffset, ',');
            commaOffset -= 3;
        }

        if (suffix != null) resultBuffer.append(suffix);
        return resultBuffer.toString();
    }	
}
