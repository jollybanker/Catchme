package com.example.catchme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class InputActivity extends Activity {

	
	

	public int wert = 0;
	public int zaehler = 0;
	
	public void button1_Click(View view) {
		
		if(zaehler < 2)
			wert = (wert*10) + 1;
		zaehler = zaehler + 1;
		TextView text = (TextView) findViewById(R.id.checkE);
		text.setText(""+wert);
		TextView falsch = (TextView) findViewById(R.id.fault);
        falsch.setText("");
	 }
	
     public void button2_Click(View view) {
		
		if(zaehler < 2)
			wert = (wert*10) + 2;
		zaehler = zaehler + 1;
		TextView text = (TextView) findViewById(R.id.checkE);
		text.setText(""+wert);
	    TextView falsch = (TextView) findViewById(R.id.fault);
        falsch.setText("");
	  }

     public void button3_Click(View view) {
  		
	     if(zaehler < 2)
		    wert = (wert*10) + 3;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
    
     public void button4_Click(View view) {
    		
	     if(zaehler < 2)
		    wert = (wert*10) + 4;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     public void button5_Click(View view) {
 		
	     if(zaehler < 2)
		    wert = (wert*10) + 5;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     public void button6_Click(View view) {
 		
	     if(zaehler < 2)
		    wert = (wert*10) + 6;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     public void button7_Click(View view) {
 		
	     if(zaehler < 2)
		    wert = (wert*10) + 7;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     public void button8_Click(View view) {
 		
	     if(zaehler < 2)
		    wert = (wert*10) + 8;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     public void button9_Click(View view) {
 		
	     if(zaehler < 2)
		    wert = (wert*10) + 9;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     
     
     
     public void button10_Click(View view) {
    		
	     if(zaehler < 2)
		    wert = (wert*10) ;
	     zaehler = zaehler + 1;
	     TextView text = (TextView) findViewById(R.id.checkE);
	     text.setText(""+wert);
	     TextView falsch = (TextView) findViewById(R.id.fault);
         falsch.setText("");
      }
     
     
     public void button11_Click(View view) {
    		
	     if((zaehler < 2)&&(wert==1)){
		         wert = 100;
	             zaehler = zaehler + 1;
	             TextView text = (TextView) findViewById(R.id.checkE);
	             text.setText(""+wert);
	        }
	     else {
	    	 TextView text = (TextView) findViewById(R.id.checkE);
             text.setText(""+wert);
             TextView falsch = (TextView) findViewById(R.id.fault);
             falsch.setText("Falsche Eingabe");
	     }
      }
     
     public void button12_Click(View view) {
    		
	     if(zaehler == 1){
		    wert = wert + 0;
	        zaehler = zaehler + 1;
	        TextView text = (TextView) findViewById(R.id.checkE);
	        text.setText(""+wert);
	        TextView falsch = (TextView) findViewById(R.id.fault);
            falsch.setText("");
	        }
	     else {
	    	   
	    	 TextView text = (TextView) findViewById(R.id.checkE);
		        text.setText("?");
		        TextView falsch = (TextView) findViewById(R.id.fault);
	            falsch.setText("Falsche Eingabe");
		       }
	    
	     
      }
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_input);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.input, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
