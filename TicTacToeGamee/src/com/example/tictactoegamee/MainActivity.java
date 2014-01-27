package com.example.tictactoegamee;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button exitButton = (Button) findViewById(R.id.exit);
		exitButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
				System.exit(0);
			}
		});
	}

	// Field ivan = new Field();
	// ivan.fillArray();
	// ivan.printArray();

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

	public void startSinglePlayer(View view) {
		Intent intent = new Intent(MainActivity.this, SinglePlayerActivity.class);
	    startActivity(intent);
	}
	
	public void startAI(View view) {
		Intent intent = new Intent(MainActivity.this,AIActivity.class);
	    startActivity(intent);
	}

}
