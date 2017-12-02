package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class SplashActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
	 
		 
		 
		
		new Thread()
		{
			public void run()
			{
			   try 
			   { Thread.sleep(3000);
			   Intent i = new Intent(SplashActivity.this , MenuActivity.class); 
			   startActivity(i);
			   }
			   catch (InterruptedException e) 
			   {				  
			   }
			}//end of run()
		}.start()//end of annonymous class
		;//end of Thread Statement
		
		 
		 
	}//end of onCreate()
 

}
