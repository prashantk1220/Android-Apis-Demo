package com.hp.prash;

import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class WallpaperActivity extends Activity {
  ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{   super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wallpaper);	
		iv = (ImageView) findViewById(R.id.imageView1);
	}
   public void setWall(View v)
   {
	   WallpaperManager wm = (WallpaperManager) getSystemService(WALLPAPER_SERVICE);
	   Drawable  d = iv.getDrawable();
	   BitmapDrawable bmd = (BitmapDrawable) d;
	   Bitmap b = bmd.getBitmap();
	   try 
	   {  wm.setBitmap(b);
	   } catch (IOException e) 
	   { Toast.makeText(this, "Wallpaper not set :"+e, Toast.LENGTH_SHORT);
	   }
   }//end of setWall()

}
