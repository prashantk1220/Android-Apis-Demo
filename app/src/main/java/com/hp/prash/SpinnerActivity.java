package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class SpinnerActivity extends Activity
{
    
    void showToast(CharSequence msg) 
    {
      Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		 Spinner s1 = (Spinner) findViewById(R.id.spinner1);
ArrayAdapter adapter = ArrayAdapter.createFromResource(
	                   this, R.array.colors, 
	               android.R.layout.simple_spinner_item);


adapter.setDropDownViewResource(
		android.R.layout.simple_spinner_dropdown_item);

s1.setAdapter(adapter);

	        s1.setOnItemSelectedListener(
	                new OnItemSelectedListener() {
	                    public void onItemSelected( AdapterView parent, View view, int position, long id)
	                    {
	                        showToast("Spinner1: position=" + position + " id=" + id);
	                    }

	                    public void onNothingSelected(AdapterView parent) {
	                        showToast("Spinner1: unselected");
	                    }
	                });

	    Spinner s2 = (Spinner) findViewById(R.id.spinner2);
	       //adapter = ArrayAdapter.createFromResource(this, R.array.planets, android.R.layout.simple_spinner_item);
 String planets[] = {"Mercury" , "Venus" , "Earth" , "Mars" };
     adapter = new ArrayAdapter(this,  android.R.layout.simple_spinner_item, planets);

	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s2.setAdapter(adapter);
	        s2.setOnItemSelectedListener(
	                new OnItemSelectedListener() {
	                    public void onItemSelected(
	                            AdapterView parent, View view, int position, long id) {
	                        showToast("Spinner2: position=" + position + " id=" + id);
	                    }

	                    public void onNothingSelected(AdapterView parent) {
	                        showToast("Spinner2: unselected");
	                    }
	                });
		
		
		
	}

	
}
