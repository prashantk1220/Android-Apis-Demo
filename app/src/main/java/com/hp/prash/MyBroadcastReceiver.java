package com.hp.prash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver 
{
	public MyBroadcastReceiver() {
	}

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
		Toast.makeText(context, "Message from JEET :Samsung Galaxy Note II Startup Completed.", Toast.LENGTH_LONG).show();
	}
}
