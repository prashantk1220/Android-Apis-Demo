package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DealActivity extends Activity {
    EditText et1 ;
    EditText et2;
    Button btn;
    public static final int REQUEST_CODE=10;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deal);
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		btn =(Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() 
		{		
			@Override
			public void onClick(View v) 
			{
               Intent i = new Intent(DealActivity.this , DealConfirmActivity.class);
               i.putExtra("QUANTITY", et1.getText().toString() );
               i.putExtra("PRICE", et2.getText().toString() );               
               startActivityForResult(i, REQUEST_CODE);               
			}
		});
	}//end of onCreate() method
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
		//super.onActivityResult(requestCode, resultCode, data);
		if( requestCode == REQUEST_CODE)
		{
			String str = data.getExtras().getString("msg");
			Toast.makeText(this, str, 2000).show();
		}//end of if block
	}//end of method

	

}
