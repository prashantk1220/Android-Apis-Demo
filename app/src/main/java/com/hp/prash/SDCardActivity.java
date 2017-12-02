package com.hp.prash;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SDCardActivity extends Activity 
{
    EditText et1;
    EditText et2;
    Button btn1;
    Button btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sdcard);
		
		et1 =  (EditText) findViewById(R.id.editText1);
		et2 =  (EditText) findViewById(R.id.editText2);
		
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		
		btn1.setOnClickListener(new WriteSDCard());
		btn2.setOnClickListener(new ReadSDCard() );
	}//end of onCreate()
	
	
	class WriteSDCard implements OnClickListener
	{
		@Override
		public void onClick(View v) 
		{
			File rootPath = Environment.getExternalStorageDirectory();
			File f = new File(rootPath,"ContactsData.txt");
			if( f.exists() == false)
			{
				try
				{	f.createNewFile();
				    Toast.makeText(SDCardActivity.this,"FILE CREATED!!!",2000).show();
				}
				catch(Exception e)
				{}
				
			}//end of if block
			try 
			{
				String dts = et1.getText().toString()+":"+et2.getText().toString();
				
			    FileOutputStream fos = new FileOutputStream(f,true);					
			    fos.write(dts.getBytes());				
		        Toast.makeText(SDCardActivity.this,"DATA SAVED!!!",3000).show();
			} 
			catch (Exception e) 
			{					
				e.printStackTrace();
			}
							
		}//end of onClick()
		
	}//end of WriteSDCard class
	
	class ReadSDCard implements OnClickListener
	{
		@Override
		public void onClick(View v) 
		{
			File rootPath = Environment.getExternalStorageDirectory();
			File f = new File(rootPath,"ContactsData.txt");
			if(f.exists())
			{
				try 
				{
					FileInputStream fis = new FileInputStream(f);
					String fd = "";
					while(true)
					{
						int a = fis.read();
						if(a==-1)
						{
							break;
						}
						fd = fd+(char)a;
					}//end of while
		        Toast.makeText(SDCardActivity.this,fd,3000).show();
				}
				catch (Exception e) 
				{	e.printStackTrace();
				}
				
			}//end of if block
			else
			{	Toast.makeText(SDCardActivity.this,"NO DATA",2000).show();
			}

			
		}//end of onClick()
		
	}//end of WriteSDCard class
	

	

}//end of SDCardActivtiy
