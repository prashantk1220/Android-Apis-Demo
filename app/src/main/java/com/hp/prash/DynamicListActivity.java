package com.hp.prash;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class DynamicListActivity extends ListActivity {
	ArrayList screens;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		   
	   SQLiteDatabase db = openOrCreateDatabase
		("HPDemoDB",MODE_WORLD_WRITEABLE, null);
	                       
	   String q = "select * from HPTrainees";
		Cursor c =db.rawQuery(q, null);
		String name;
		screens = new ArrayList();
		while(c.moveToNext())
		{	name = c.getString(0);
		    screens.add(name);			
		}//end of while loop
		db.close();
		String str = (String)screens.get(0);
				Toast.makeText(this, str , 1000).show();
		 ArrayAdapter adapter = new ArrayAdapter(
		 this,android.R.layout.simple_list_item_1,screens);
		 
		 setListAdapter(adapter);
		
	}//end of onCreate()

	
}
