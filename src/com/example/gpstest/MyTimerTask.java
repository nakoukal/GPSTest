package com.example.gpstest;

import android.content.Context;
import android.widget.Toast;

public class MyTimerTask {
	private Context c;
	public MyTimerTask(Context c){
		this.c = c;
	}
	public void run() {
		Toast.makeText(this.c, "Timer Show", Toast.LENGTH_LONG).show();
	}
}
