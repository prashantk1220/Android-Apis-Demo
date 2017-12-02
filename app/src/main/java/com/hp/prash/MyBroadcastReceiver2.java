package com.hp.prash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyBroadcastReceiver2 extends BroadcastReceiver {
	public MyBroadcastReceiver2() {
	}

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		Bundle bundle = intent.getExtras();
		if(bundle!=null)
		{
			String state = bundle.getString(TelephonyManager.EXTRA_STATE);
			if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
			{
			 CharSequence str = "Please receive karooo....";
			 Toast.makeText(context,str,3000).show();
			 
			}
		}
	}//end of onReceive() method
}










// String no = TelephonyManager.EXTRA_INCOMING_NUMBER;