package com.hp.prash;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.widget.RelativeLayout;

public class PreferenceUseActivity extends Activity 
{
   RelativeLayout rl;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preference_use);
		rl = (RelativeLayout) findViewById(R.id.relativeLayout1);
	}//end of onCreate()
	
	@Override
	protected void onResume() 
	{
		// TODO Auto-generated method stub
		super.onResume();
		SharedPreferences ps = null;
		ps=PreferenceManager.getDefaultSharedPreferences(this);
		String clr = ps.getString("list_preference", "red");
		if(clr.equals("red"))
		{
	 	 rl.setBackgroundColor(Color.RED);
		}
		else if(clr.equals("blue"))
		{
		 rl.setBackgroundColor(Color.BLUE);
		}
		else if(clr.equals("green"))
		{
		 rl.setBackgroundColor(Color.GREEN);
		}
		
	}//end of onResume()


	

}
