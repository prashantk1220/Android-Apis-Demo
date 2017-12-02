package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends Activity 
{ 
   TextView tv;
   SeekBar sb;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seek_bar);
		tv = (TextView) findViewById(R.id.textView1);
		sb = (SeekBar) findViewById(R.id.seekBar1);
		
		sb.setOnSeekBarChangeListener(
		     new OnSeekBarChangeListener() 
		     {
		    	    @Override
					public void onStartTrackingTouch(SeekBar seekBar)
		    	    {
  		    	       Toast.makeText(SeekBarActivity.this,"Start" , Toast.LENGTH_LONG).show();						
					}
			       @Override
			       public void onStopTrackingTouch(SeekBar seekBar) 
			      {
			    	   Toast.makeText(SeekBarActivity.this,"Stop" , Toast.LENGTH_LONG).show();			   		
			      }	
			
			     @Override
			     public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) 
			     {
			    	 tv.setText(String.valueOf(progress));	
			     }
		      }//end of inner annonymous class
		     );  //end of statement
		
		
	}//end of onCreate() method

	

}
