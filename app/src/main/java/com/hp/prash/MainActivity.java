package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
   TextView tv;	
   Button b1;
   Button b2;
   int num=0;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast t = Toast.makeText(this, "Toast is tasty...", Toast.LENGTH_LONG);
		t.show();
		tv = (TextView)findViewById(R.id.textView1);
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
     
		
		
		b1.setOnClickListener( new OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{   num++;
				tv.setText( String.valueOf(num) );
			}
			
		} );
		
		b2.setOnClickListener(
		new OnClickListener()
		 {
			@Override
			public void onClick(View v) 
			{   num--;
				tv.setText( String.valueOf(num) );
			}
			
		}
		);
	}//end of onCreate()
	
	
	
}
