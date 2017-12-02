package com.hp.prash;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

public class OrientationSensorActivity extends Activity implements SensorEventListener 
{
	SensorManager sm;
	TextView tv2;
	TextView tv3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orientation_sensor);
		tv2 = (TextView)findViewById(R.id.textView2);
		tv3 = (TextView)findViewById(R.id.textView3);
		
		
		sm = (SensorManager)getSystemService( Context.SENSOR_SERVICE );
			
		Sensor s = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);
		
		sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
		
	}//end of onCreate() method

	

	@Override
	public void onSensorChanged(SensorEvent event) 
	{		int x = (int)event.values[0];
	        int y = (int)event.values[1];
	        int z = (int)event.values[2];
	 CharSequence status = "SENSOR STATUS :\nVALUE OF X = "+x+
			               "\nVALUES OF Y = "+y+
			               "\nVALUES OF Z = "+z;
	        tv2.setText(status);
	   tv3.setBackgroundColor(  Color.rgb( x,y,z )  );
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy)
	{		
	}



	@Override
	protected void onStop() 
	{		super.onStop();
	     sm.unregisterListener(this);
	}
	
	
}//end of Activity class
