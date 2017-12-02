package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

public class ImageResourceActivity extends Activity {
  ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);
		iv=(ImageView)findViewById(R.id.imageView1);
		iv.setImageResource(R.drawable.amsterdam);
	}

	

}
