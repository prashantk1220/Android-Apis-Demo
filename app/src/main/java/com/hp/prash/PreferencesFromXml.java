package com.hp.prash;


import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PreferencesFromXml extends PreferenceActivity 
{

	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        
	        // Load the preferences from an XML resource
	        addPreferencesFromResource(R.xml.preferences);
	    }//end of onCreate()
}
