package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
   EditText et1;
   EditText et2;
   Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		btn = (Button) findViewById(R.id.button1);
	    OnClickListener listener = new OnClickListener() 
	    {			
			@Override
			public void onClick(View v) 
			{				
				
Intent i = new Intent(LoginActivity.this , LoginResultActivity.class); 			     			     			   
			     i.putExtra("U", et1.getText().toString() );
			     i.putExtra("P", et2.getText().toString() );
			     startActivity(i);
			}
		};
		btn.setOnClickListener(listener);
	}//end of onCreate() method

	
	
}//end of LoginActivity class
