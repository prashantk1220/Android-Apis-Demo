package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class OptionsMenuActivity extends Activity {
    TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options_menu);
		tv = (TextView)findViewById(R.id.textView1);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{	getMenuInflater().inflate(R.menu.activity_options_menu, menu);
		return true;
	}


	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item)
	{	
	    switch(item.getItemId())
	    {
	       case R.id.item1:  Toast.makeText(this, "Create Clicked", Toast.LENGTH_LONG).show(); 
	       					 break;
	       case R.id.item2: Toast.makeText(this, "Edit Clicked", Toast.LENGTH_LONG).show(); 
	       					break;
	       case R.id.item3: Toast.makeText(this, "View Clicked", Toast.LENGTH_LONG).show(); 
				            break;
	       case R.id.item4: Toast.makeText(this, "Delete Clicked", Toast.LENGTH_LONG).show(); 
           					break;
	       case R.id.item5: Toast.makeText(this, "Settings Clicked", Toast.LENGTH_LONG).show(); 
           					break;
	    }//end of switch block
	    return super.onMenuItemSelected(featureId, item);
	}//end of onMenuItemSelected
	
	

}//end of Activity
