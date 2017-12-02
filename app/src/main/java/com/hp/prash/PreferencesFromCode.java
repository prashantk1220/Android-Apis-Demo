package com.hp.prash;



import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;

public class PreferencesFromCode extends PreferenceActivity 
{
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setPreferenceScreen(createPreferenceHierarchy());
    }

    private PreferenceScreen createPreferenceHierarchy() {
        // Root
        PreferenceScreen root = getPreferenceManager().createPreferenceScreen(this);
        
        // Inline preferences 
        PreferenceCategory inlinePrefCat = new PreferenceCategory(this);
        inlinePrefCat.setTitle("In-line preferences");
        root.addPreference(inlinePrefCat);
        
        // Toggle preference
        CheckBoxPreference togglePref = new CheckBoxPreference(this);
        togglePref.setKey("toggle_preference");
        togglePref.setTitle("Toggle preference");
        togglePref.setSummary("This is a toggle button");
        inlinePrefCat.addPreference(togglePref);
                
        // Dialog based preferences
        PreferenceCategory dialogBasedPrefCat = new PreferenceCategory(this);
        dialogBasedPrefCat.setTitle("Dialog-based preferences");
        root.addPreference(dialogBasedPrefCat);

        // Edit text preference
        EditTextPreference editTextPref = new EditTextPreference(this);
        editTextPref.setDialogTitle("Enter your favorite animal");
        editTextPref.setKey("t1");
        editTextPref.setTitle("Edit text preference");
        editTextPref.setSummary("An example that uses an edit text dialog");
        dialogBasedPrefCat.addPreference(editTextPref);
        
        // List preference
        ListPreference listPref = new ListPreference(this);
        listPref.setEntries(R.array.entries_list_preference);
        listPref.setEntryValues(R.array.entryvalues_list_preference);
        listPref.setDialogTitle("Choose one");
        listPref.setKey("list_preference");
        listPref.setTitle("List preference");
        listPref.setSummary("An example that uses a list dialog");
        dialogBasedPrefCat.addPreference(listPref);
        
        // Launch preferences
        PreferenceCategory launchPrefCat = new PreferenceCategory(this);
        launchPrefCat.setTitle("Launch preference");
        root.addPreference(launchPrefCat);

        /*
         * The Preferences screenPref serves as a screen break (similar to page
         * break in word processing). Like for other preference types, we assign
         * a key here so that it is able to save and restore its instance state.
         */
        
        // Screen preference
        PreferenceScreen screenPref = getPreferenceManager().createPreferenceScreen(this);
        screenPref.setKey("screen_preference");
        screenPref.setTitle("Screen preference");
        screenPref.setSummary("Shows another screen of preferences");
        launchPrefCat.addPreference(screenPref);
        
        /*
         * You can add more preferences to screenPref that will be shown on the
         * next screen.
         */
        
        // Example of next screen toggle preference
        CheckBoxPreference nextScreenCheckBoxPref = new CheckBoxPreference(this);
        nextScreenCheckBoxPref.setKey("next_screen_toggle_preference");
        nextScreenCheckBoxPref.setTitle("Toggle preference");
        nextScreenCheckBoxPref.setSummary("Preference that is on the next screen but same hierarchy");
        screenPref.addPreference(nextScreenCheckBoxPref);
        
        // Intent preference
        PreferenceScreen intentPref = getPreferenceManager().createPreferenceScreen(this);
        intentPref.setIntent(new Intent().setAction(Intent.ACTION_VIEW)
                .setData(Uri.parse("http://www.android.com")));
        intentPref.setTitle("Intent preference");
        intentPref.setSummary("Launches an Activity from an Intent");
        launchPrefCat.addPreference(intentPref);
        
        // Preference attributes
        PreferenceCategory prefAttrsCat = new PreferenceCategory(this);
        prefAttrsCat.setTitle("Preference attributes");
        root.addPreference(prefAttrsCat);
        
        // Visual parent toggle preference
        CheckBoxPreference parentCheckBoxPref = new CheckBoxPreference(this);
        parentCheckBoxPref.setTitle("Parent toggle");
        parentCheckBoxPref.setSummary("This is visually a parent");
        prefAttrsCat.addPreference(parentCheckBoxPref);
        
        // Visual child toggle preference
        // See res/values/attrs.xml for the <declare-styleable> that defines
        // TogglePrefAttrs.
        
        TypedArray a = obtainStyledAttributes(R.styleable.TogglePrefAttrs);
        CheckBoxPreference childCheckBoxPref = new CheckBoxPreference(this);
        childCheckBoxPref.setTitle("Child toggle");
        childCheckBoxPref.setSummary("This is visually a child");
        childCheckBoxPref.setLayoutResource(
                a.getResourceId(R.styleable.TogglePrefAttrs_android_preferenceLayoutChild,0)  );
        prefAttrsCat.addPreference(childCheckBoxPref);
        a.recycle();
        
        return root;
    }

}//end of PreferencesFromCode class
