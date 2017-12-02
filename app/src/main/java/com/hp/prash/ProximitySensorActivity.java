package com.hp.prash;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

public class ProximitySensorActivity extends Activity implements SensorEventListener  
{
	SensorManager sm;
	ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proximity_sensor);
		
		iv = (ImageView)findViewById(R.id.imageView1);
		String ss = Context.SENSOR_SERVICE;
		sm = (SensorManager)getSystemService(ss);
		int type = Sensor.TYPE_PROXIMITY;
		Sensor s = sm.getDefaultSensor(type);
		
		sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
	}//end of onCreate() method

	
	

	@Override
	public void onSensorChanged(SensorEvent event) 
	{	
         float f = event.values[0];         
		if(f==0)
		{	iv.setImageResource(R.drawable.amsterdam);
		}
		else
		{   iv.setImageResource(R.drawable.ic_launcher);
		}
	}//end of onSensorChanged() method

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) 
	{	
		
	}  
	

	@Override
	protected void onStop() 
	{		super.onStop();
	        sm.unregisterListener(this);
	}


}
