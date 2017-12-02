package com.hp.prash;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity
{
    String screens[] = {"MainActivity" , "LCDActivity" , "LoginActivity" , "MenuActivity", 
    		            "IntentDemoActivity", "SpinnerActivity", "RadioActivity", "DealActivity", 
    		            "CameraActivity", "DialogActivity","AlertDialogActivity", "ImageResourceActivity", 
    		            "WallpaperActivity","WallpaperActivity2","NotificationActivity","OptionsMenuActivity",
    		            "PreferencesFromCode" ,"PreferencesFromXml","PreferenceUseActivity", "SeekBarActivity",
    		            "ProgressBarActivity","DynamicListActivity","CustomListActivity","SDCardActivity","DatabaseActivity", "BluetootActivity", "WifiActivity",
    		            "ProximitySensorActivity", "OrientationSensorActivity","MyBroadcastReceiver" ,"ContactsProviderActivity", "EXIT"};
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{   super.onCreate(savedInstanceState);
	    ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,screens);
	    setListAdapter(adapter);	
	    registerForContextMenu(getListView());
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{	super.onListItemClick(l, v, position, id);
	      if( screens[position].equals("EXIT") )
	      {
	    	  finish();
	      }//end of if block
	      else
	      {
            Toast.makeText(this, "Clicked on : "+ screens[position], Toast.LENGTH_SHORT).show();
	    	  String str = "com.hp.noida."+screens[position];
	    	  try{
	    	      Class c = Class.forName(str);
	    	     Intent i = new Intent(this, c);
	    	      startActivity(i);
	    	  }
	    	  catch(Exception e)
	    	  {	   Toast.makeText(this, "Screen not yet designed.", Toast.LENGTH_SHORT).show(); 		  
	    	  }
	      }//end of else block
	}//	end of onCreate()

	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,	ContextMenuInfo menuInfo) 
	{	
		super.onCreateContextMenu(menu, v, menuInfo);
		 menu.setHeaderTitle("Context Menu");
	     menu.add(0, v.getId(), 0, "Action 1");
	     menu.add(0, v.getId(), 0, "Action 2");
	     menu.add(0, v.getId(), 0, "Action 3");

	}

	@Override
	public boolean onContextItemSelected(MenuItem item) 
	{			
		AdapterContextMenuInfo info = (AdapterContextMenuInfo)
				item.getMenuInfo();
		
		Toast.makeText(this , screens[ (int)info.id ] , 2000).show(); 
		 if (item.getTitle() == "Action 1") 
		   {     Toast.makeText(this, "Action 1 invoked" , Toast.LENGTH_SHORT).show();
		   }
		   else if (item.getTitle() == "Action 2") 
		   {  Toast.makeText(this, "Action 2 invoked", Toast.LENGTH_SHORT).show();
		   }
		   else if (item.getTitle() == "Action 3")
		   {  Toast.makeText(this, "Action 3 invoked", Toast.LENGTH_SHORT).show();
		   } 

		
		return super.onContextItemSelected(item);
	}

	
	
	
}
