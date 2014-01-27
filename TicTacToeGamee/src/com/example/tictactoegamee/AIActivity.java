package com.example.tictactoegamee;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AIActivity extends Activity {

	Field field;
	int aiSign;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ai);
		field = new Field();
		field.fillArray();
	}

	
	private void moveAI() {
		// TO DO
		// 1. Ako imame 2 poredni aiSign i ako tretoto e svobodno, slagame 3-to
		// 2. Ako oponenta ima 2 poredni i tretoto e svobodno go zapushvame
		// 3. Ako ima svobodno do nashe, i tretoto e svobodno, slagame tam. Ako ima poveche ot edno podhodqshto, izbirame na random
		// 4. Random
		
		
		
	}
	
	private float checkTwoInLine(int sign) {
		// to do 3x8 
		if (field.array[0][0].getSign() == sign && field.array[0][1].getSign() == sign && field.array[0][2].getSign() == 0) {
			return 0.2f;
		}
		
		return 0;
	}
	
}
