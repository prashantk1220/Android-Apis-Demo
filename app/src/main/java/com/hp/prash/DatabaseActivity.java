package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class DatabaseActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_database);
	    
      SQLiteDatabase db = openOrCreateDatabase("HPDemoDB",MODE_WORLD_WRITEABLE, null);
				
	db.execSQL("create  table if not exists HPTrainees(name varchar, phone varchar)");
	/*	
	    db.execSQL("insert into HPTrainees values('Katrina','9444422222')");
		db.execSQL("insert into HPTrainees values('Sania','7878787878')");
		db.execSQL("insert into HPTrainees values('Dhoni','6767867678')");
		db.execSQL("insert into HPTrainees values('Obama','4567456767')");
		Toast.makeText(this,"TABLE CREATED",3000).show();
		*/
		
     // db.execSQL("update HPTrainees set phone='1111122222' where name='Obama'");
      
      // String n = "Katrina";
      //db.execSQL("delete from HPTrainees where name='"+n+"'");
      
      
		TableLayout tl = (TableLayout)findViewById(R.id.tableLayout1);
	    TableRow tr;
		String q = "select * from HPTrainees";
		Cursor c =db.rawQuery(q, null);
		String name,phone;
		while(c.moveToNext())
		{		
			name = c.getString(0);
			phone = c.getString(1);
			tr = new TableRow(this);
			TextView td1 = new TextView(this);
			td1.setText(name);
			TextView td2 = new TextView(this);								
			td2.setText(phone);
			
			tr.addView(td1);
			tr.addView(td2);
						
			tl.addView(tr);
		}//end of while loop
		
		db.close();
		Toast.makeText(this, "Data loaded!!!", 3000).show();
       
						     
	}//end of onCreate()

	
}
