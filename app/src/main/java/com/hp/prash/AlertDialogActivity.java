package com.hp.prash;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class AlertDialogActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alert_dialog);
AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("Fire Missile");
final String colors[] = {"Red", "Blue" , "Green"};
		builder.setSingleChoiceItems(colors, -1, new DialogInterface.OnClickListener() 
						{ @Override
						  public void onClick(DialogInterface dialog, int which) 
						  {
							Toast.makeText(AlertDialogActivity.this, colors[which], Toast.LENGTH_LONG).show();
							dialog.dismiss();
						  }//end of onClick() method
						}//end of event handlar anonymous class
		);//end of setSingleChoiceItems() statement
		
		AlertDialog dialog = builder.create();
		dialog.show();	
	}//end of onCreate()

	
}//end of Activity class















/*
 
Q-  Which class is used to display Alert?
Q-: What is the name of inner class of AlertDialog to display Alerts?
Q-  Which method is used for displaying title of AlertDialog and message of Dialog?
Q-  How to add buttons in AlertDialog?
Q- What is the parent class of OnClickListener which is used in event handling of AlertDialog?
Q- What is the signature of onClick() method of DialogInterface.OnClickListener?
Q- Which method is used to create list in AlertDialog ?
Q- Which method is used to create RadioButtons in AlertDialog?
Q- How to design theam based Dialog? 

----------------------------------------------------------------------
CODING-1 (Creating AlertDialog Box  )
----------------------------------------------------------------------
        AlertDialog.Builder builder = new AlertDialog.Builder(this); //context of Activity on which dialog has to display
		builder.setTitle("Fire Missile").setMessage("Are you sure to fire the missile?");
		AlertDialog dialog = builder.create();
		dialog.show();
----------------------------------------------------------------------
CODING-2 (Adding Buttons in AlertDialog Box  )
----------------------------------------------------------------------
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Fire Missile").setMessage("Are you sure to fire the missile?");
		builder.setPositiveButton("Fire", null);
		builder.setNeutralButton("Cancel", null);
		builder.setNegativeButton("Stop", null);
		AlertDialog dialog = builder.create();
		dialog.show();
---------------------------------------------------------------------- 
CODING-3:(Adding functionality to buttons of AlertDialog)
----------------------------------------------------------------------   
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Fire Missile").setMessage("Are you sure to fire the missile?");
		builder.setPositiveButton("Fire", new DialogInterface.OnClickListener() 
		                                  { @Override
											public void onClick(DialogInterface dialog, int which) 
											 {	Toast.makeText(AlertDialogActivity.this, "Missile Fired.", Toast.LENGTH_LONG).show();				
											 }//end of onClick method
		                                  }//end of listener
		);
		builder.setNegativeButton("Stop", new DialogInterface.OnClickListener() 
										{ @Override
											public void onClick(DialogInterface dialog, int which) 
											{	Toast.makeText(AlertDialogActivity.this, "Missile Canceled.So Chill...", Toast.LENGTH_LONG).show();				
											}//end of onClick method
										}//end of listener
       );
		
		AlertDialog dialog = builder.create();
		dialog.show();
 
 --------------------------------------------------------------------
 CODING-4:(Adding List Items in AlertDialog)
 --------------------------------------------------------------------
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Fire Missile");
		String colors[] = {"Red", "Blue" , "Green"};
		builder.setItems(colors, null);
		
		AlertDialog dialog = builder.create();
		dialog.show();
      
--------------------------------------------------------------------
 CODING-5:(Adding fuctionality to List Items in AlertDialog) (auto dismiss on single selection)
--------------------------------------------------------------------
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Fire Missile");
		final String colors[] = {"Red", "Blue" , "Green"};
		builder.setItems(colors, new DialogInterface.OnClickListener() 
						{ @Override
						  public void onClick(DialogInterface dialog, int which) 
						  {
							Toast.makeText(AlertDialogActivity.this, colors[which], Toast.LENGTH_LONG).show();
							dialog.dismiss();
						  }//end of onClick() method
						}//end of event handlar anonymous class
		);//end of annonymous class statement
		
		AlertDialog dialog = builder.create();
		dialog.show();
		
--------------------------------------------------------------------
 CODING-6:(Adding RadioButtons for SingleSelection in AlertDialog)
--------------------------------------------------------------------			
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Fire Missile");
		final String colors[] = {"Red", "Blue" , "Green"};
		builder.setSingleChoiceItems(colors, 0, new DialogInterface.OnClickListener() 
						{ @Override
						  public void onClick(DialogInterface dialog, int which) 
						  {
							Toast.makeText(AlertDialogActivity.this, colors[which], Toast.LENGTH_LONG).show();
							dialog.dismiss();
						  }//end of onClick() method
						}//end of event handlar anonymous class
		);//end of setSingleChoiceItems() statement
		
		AlertDialog dialog = builder.create();
		dialog.show();		


*/
