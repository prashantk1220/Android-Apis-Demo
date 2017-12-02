package com.hp.prash;


import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NotificationActivity extends Activity 
{ 
     Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		
		btn = (Button) findViewById(R.id.button1);
		
		btn.setOnClickListener(new MyClickHandler() );
	}//end of onCreate()

	
	 class MyClickHandler implements OnClickListener
	 {	@Override
		public void onClick(View v) 
		{
		    NotificationManager nm = (NotificationManager)
		    		getSystemService(NOTIFICATION_SERVICE);
		    
		    Notification n = new Notification(
		      android.R.drawable.stat_notify_more,"AlertMessage",
		      System.currentTimeMillis()
		      );
		    
			n.defaults=Notification.DEFAULT_ALL; // set light, sound and vibrate
			Intent intent= new Intent(NotificationActivity.this, NotificationActivity.class);
			PendingIntent pi = PendingIntent.getActivity(NotificationActivity.this, 0, intent, 0);
			CharSequence msg1="Big Boss wish";
			CharSequence msg2="Upgrade your Android Skill";
			n.setLatestEventInfo(NotificationActivity.this, msg1, msg2, pi);
			nm.notify(0,n); //post the notification in status bar
			nm.notify(1,n);
		}//end of onClick() method	
	 
	 }//end of MyClickHandler class
	

}//end of NotificationActivity class
