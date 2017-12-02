package com.hp.prash;

import java.util.Set;



import android.os.Bundle;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.widget.TextView;
import android.widget.Toast;

public class BluetootActivity extends Activity 
{   TextView tv;
     
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bluetoot);
		 tv = (TextView)findViewById(R.id.textView1);
			
			BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
			
			if(adapter != null)
			{   Toast.makeText(this, "Activity Created", Toast.LENGTH_LONG).show();  
				tv.append("Start Scanning Devices......");
			    adapter.startDiscovery();
			    tv.append("Scanning Devices Completed......");
			    
			Set<BluetoothDevice> devices = adapter.getBondedDevices();
			
			for(BluetoothDevice d:devices)
			{
				tv.append("Device : "+d);
				tv.append("\nDevice Name :"+d.getName() );
				tv.append("\nDevice Address:"+d.getAddress() );	
				
				tv.append("\n----------------------\n");
			}//end of for loop							    
		}//end of if block
			else
			{
				Toast.makeText(this, "In Else part", Toast.LENGTH_LONG).show();
			}	
	}//end of onCreate() method	

}
