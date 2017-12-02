package com.hp.prash;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IntentDemoActivity extends ListActivity 
{  
	String scrArray[] = {"PHONE CALL","SMS","WEB","WEB SEARCH","PHONEBOOK","MyIntentData","Deal","EXIT"};
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	super.onCreate(savedInstanceState);
	    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , scrArray );
	    setListAdapter(adapter);	
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) 
	{	
		super.onListItemClick(l, v, position, id);
		if(scrArray[position].equals("EXIT") )
		{
			finish();
		}
		else if(scrArray[position].equals("PHONE CALL"))
		{
			Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9451914585"));
			startActivity(i);
		}
		else if(scrArray[position].equals("SMS"))
		{
			Intent i = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9451914585"));
			i.putExtra("sms_body", "Hello This is Test SMS Text.Developed By HP Team.");
			startActivity(i);
		}
		else if(scrArray[position].equals("WEB"))
		{
			Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
			startActivity(i);
		}
		else if(scrArray[position].equals("PHONEBOOK"))
		{
			Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
			startActivity(i);
		}
	}//end of onListItemClick()

	
}
