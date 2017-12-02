package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DealConfirmActivity extends Activity implements OnClickListener{
    TextView tv1;
    TextView tv2;
    Button b1;
    Button b2;
    String dealStatus="UnAnswered";
    
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_deal_confirm);
		Bundle bundle = getIntent().getExtras();
		
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv1.setText(bundle.getString("QUANTITY") );
		tv2.setText(bundle.getString("PRICE") );
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		
	}//end of onCreate()

	

	@Override
	public void onClick(View v) 
	{
		switch( v.getId() )
		{
		case R.id.button1 : dealStatus="Order Confirmed.";
			                break;
		case R.id.button2 : dealStatus="Order Rejected.";
		                    break;
		}
		
		finish();
	}//end of onClick()

	@Override
	public void finish() 
	{   Intent i = new Intent();
	    i.putExtra("msg", dealStatus);
	    setResult(300 , i);
		super.finish();	
	}

}//end of DealConfirmActivity
