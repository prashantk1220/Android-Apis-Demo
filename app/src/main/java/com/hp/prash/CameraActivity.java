package com.hp.prash;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends Activity 
{   
	ImageView imageView;
    Button cameraButton;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);
	
	
	imageView = (ImageView)findViewById(R.id.imageView1);
	cameraButton = (Button)findViewById(R.id.button1);
	
	cameraButton.setOnClickListener( new View.OnClickListener() 
			{	
		        @Override
				public void onClick(View v) 
				{   Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
					startActivityForResult(intent, 0);			
				}//end of onClick()
			});

	}//end of onCreate();
	
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent d)
	{		
		super.onActivityResult(requestCode, resultCode, d);
		//if(requestCode==0)
		//{
			Bitmap bitmap = (Bitmap)d.getExtras().get("data"); 
			imageView.setImageBitmap(bitmap);
		//}//end of if block
		
	}//end of onActivityResult() 

}//end of CameraActivtiy
