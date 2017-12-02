package com.hp.prash;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginResultActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{  super.onCreate(savedInstanceState);
	  
	   Bundle  b = getIntent().getExtras();
	   String u = b.getString("U");
	   String p = b.getString("P");
	   TextView tv = new TextView(this);
	   tv.setText("LoginId = "+u + "\nPassword = "+p);
	   if(u.equals(p) )
	   {  tv.append("\n\nLogin Success");
	   }
	   else
	   { tv.append("\n\nLogin Failed");		   
	   }
	   setContentView(tv);
	}

	

}
