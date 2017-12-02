package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarActivity extends Activity 
{
    ProgressBar pb;
    Button btn;
    Thread t;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_bar);
		
		pb = (ProgressBar) findViewById(R.id.progressBar1);
		btn = (Button) findViewById(R.id.button1);
		
		t = new Thread()
		    { 
			     public void run()
			     {
			    	 for(int i=0;i<=20;i++)
						{
							pb.setProgress(i*5);
							try
							{ Thread.sleep(500);
							}
							catch(Exception e)
							{						
							}
						}//end of for loop
						
			     }//end of run()
		    } ; //end of annonymous Thread type class
		    
	     btn.setOnClickListener(new OnClickListener() 
	                             {
	    	                       @Override
			                       public void onClick(View v) 
	    	                       {
	    	                    	 t.start();
				                   }//end of onClick() method
		                         } );
		    
	}//end of onCreate()

	

}//end of ProgressBarActivity
