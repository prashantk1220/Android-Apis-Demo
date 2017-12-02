package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class RadioActivity extends Activity implements OnClickListener, OnCheckedChangeListener 
{
	 private TextView tv;
	 private RadioGroup mRadioGroup;
	 private Button btn;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio);
		
		tv = (TextView) findViewById(R.id.textView1);
		mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		mRadioGroup.setOnCheckedChangeListener(this);	
		
		btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(this);
	
	}//end of onCreate()

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) 
	{
		String str=null;
		if(checkedId == View.NO_ID )
			str="You have selected : (none)";
		else
		{
			str="You have selected :";
			switch( checkedId )
			{
			case R.id.radioButton1 : str = str.concat( "Breakfast");
			                         break;
			case R.id.radioButton2 : str = str.concat( "Lunch");
                                      break;
			case R.id.radioButton3 : str = str.concat( "Dinner");
                                      break;      
			case R.id.radioButton4 : str = str.concat( "All");
                                      break;
			}//end of switch
			
		}//end of else block
		tv.setText(str);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mRadioGroup.clearCheck();			
		tv.setText("You have selected : (none)");
		
	}

	

}
