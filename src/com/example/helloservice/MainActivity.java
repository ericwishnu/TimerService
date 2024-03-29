package com.example.helloservice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//Method to start the service
	public void startService(View view){
		startService(new Intent(getBaseContext(), MyService.class));
		
	}
	
	//Method to stop the service
	public void stopService(View view){
		stopService(new Intent(getBaseContext(),MyService.class));
	}

}
