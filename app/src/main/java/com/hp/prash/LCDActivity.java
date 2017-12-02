package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View;
import android.widget.Toast;

public class LCDActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lcd);
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
		onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
	}
	
	public void go(View v)
	{   Intent i = new Intent(this , MainActivity.class);
		startActivity(i);
	}
}
