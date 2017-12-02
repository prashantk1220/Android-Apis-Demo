package com.hp.prash;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.PhoneLookup;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.widget.TextView;
import android.widget.Toast;

public class ContactsProviderActivity extends Activity 
{
   TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts_provider);	
		tv = (TextView) findViewById(R.id.textView1);
		
		Uri uri = ContactsContract.Contacts.CONTENT_URI;		
		ContentResolver cr = getContentResolver();
		
		Cursor c = cr.query(uri, null, null, null, null);
		String names = "CONTACT NAME:\n------------------\n";
		while(c.moveToNext())
		{	int ni = c.getColumnIndex(PhoneLookup.DISPLAY_NAME);
			String name = c.getString(ni);
			names += name+"\n";			
		}
		tv.setText(names);
		Toast.makeText(this, names, Toast.LENGTH_LONG).show();
	}//end of onCraete() method


}
