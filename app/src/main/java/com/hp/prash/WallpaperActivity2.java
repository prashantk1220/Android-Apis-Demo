package com.hp.prash;




import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class WallpaperActivity2 extends Activity  implements OnClickListener
{
	int mypic;
	 Button button;
	 ImageView imageView;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wallpaper2);
		
		button=(Button)findViewById(R.id.button1);
		ImageView iv1=(ImageView)findViewById(R.id.imageView1);
		ImageView iv2=(ImageView)findViewById(R.id.imageView2);
		ImageView iv3=(ImageView)findViewById(R.id.imageView3);
		ImageView iv4=(ImageView)findViewById(R.id.imageView3);
		
		imageView=(ImageView)findViewById(R.id.imageView4);
		
		mypic=R.drawable.amsterdam;
		
		iv1.setOnClickListener(this);
		iv2.setOnClickListener(this);
		iv3.setOnClickListener(this);
		iv4.setOnClickListener(this);
		button.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) 
	{
		Toast.makeText(this, v.getId(), Toast.LENGTH_SHORT).show();
		switch(v.getId())
		{
		case R.id.imageView1:
			imageView.setBackgroundResource(R.drawable.pic1);
			mypic=R.drawable.amsterdam;
			break;
		case R.id.imageView2:
			imageView.setBackgroundResource(R.drawable.pic2);
			mypic=R.drawable.lima;
			break;
		case R.id.imageView3:
			imageView.setBackgroundResource(R.drawable.pic3);
			mypic=R.drawable.pic1;
			break;
		case R.id.imageView4:
			imageView.setBackgroundResource(R.drawable.pic4);
			mypic=R.drawable.pic4;
			break;
		
	    default:
				Bitmap bitmap=BitmapFactory.decodeStream(getResources().openRawResource(mypic));
				try{
					
					getApplicationContext().setWallpaper(bitmap);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			
		}//end of switch block
		
	}

}
