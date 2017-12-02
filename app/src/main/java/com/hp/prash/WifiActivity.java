package com.hp.prash;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

public class WifiActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wifi);
        TextView tv = (TextView)findViewById(R.id.textView1);				
		WifiManager wm = (WifiManager)getSystemService(Context.WIFI_SERVICE);
		
		if(wm.isWifiEnabled())
		{
			tv.append("ONN");
			WifiInfo wi = wm.getConnectionInfo();
			if(wi.getBSSID()!=null)     //Basic Service Set Identifier
			{
				String name = wi.getSSID();
				tv.append("\nNAME : "+name);
				int i = wm.calculateSignalLevel(wi.getRssi(),10); //Received Signal Strength Indicator
				tv.append("\nSTRENGTH(10) :"+i);
			}
		}
		else
		{
			tv.append("OFF");
		}
	}//end of onCreate()


}
