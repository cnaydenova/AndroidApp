package com.example.tictactoegamee;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class SinglePlayerActivity extends Activity {

	boolean isCurrPlayerO = false;
	Field field;
	ImageButton button;
	int moveCount = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_player);
		field = new Field();
		field.fillArray();
		
	}


	public void makeMove(View view) {

		if (view.getId() == R.id.button00) {
			if (isCurrPlayerO) {
				button = (ImageButton) findViewById(R.id.button00);
				button.setBackgroundResource(R.drawable.o);
				field.array[0][0].changeSign(2);
			} else {
				button = (ImageButton) findViewById(R.id.button00);
				button.setBackgroundResource(R.drawable.x);
				field.array[0][0].changeSign(1);
			}
			button.setEnabled(false);
		}

		if (view.getId() == R.id.button01) {
			if (isCurrPlayerO) {
				button = (ImageButton) findViewById(R.id.button01);
				button.setBackgroundResource(R.drawable.o);
				field.array[0][1].changeSign(2);
			} else {
				button = (ImageButton) findViewById(R.id.button01);
				button.setBackgroundResource(R.drawable.x);
				field.array[0][1].changeSign(1);
			}
			button.setEnabled(false);
		}

		if (view.getId() == R.id.button02) {
			if (isCurrPlayerO) {
				button = (ImageButton) findViewById(R.id.button02);
				button.setBackgroundResource(R.drawable.o);
				field.array[0][2].changeSign(2);
			} else {
				button = (ImageButton) findViewById(R.id.button02);
				button.setBackgroundResource(R.drawable.x);
				field.array[0][2].changeSign(1);
			}
			button.setEnabled(false);
		}

		if (view.getId() == R.id.button10) {
			if (isCurrPlayerO) {
				button = (ImageButton) findViewById(R.id.button10);
				button.setBackgroundResource(R.drawable.o);
				field.array[1][0].changeSign(2);
			} else {
				button = (ImageButton) findViewById(R.id.button10);
				button.setBackgroundResource(R.drawable.x);
				field.array[1][0].changeSign(1);
			}
			button.setEnabled(false);
		}

		if (view.getId() == R.id.button11) {
			if (isCurrPlayerO) {
				button = (ImageButton) findViewById(R.id.button11);
				button.setBackgroundResource(R.drawable.o);
				field.array[1][1].changeSign(2);
			} else {
				button = (ImageButton) findViewById(R.id.button11);
				button.setBackgroundResource(R.drawable.x);
				field.array[1][1].changeSign(1);
			}
			button.setEnabled(false);
		}
		
		
		if (view.getId() == R.id.button12) {
			if (isCurrPlayerO) {
				button = (ImageButton) findViewById(R.id.button12);
				button.setBackgroundResource(R.drawable.o);
				field.array[1][2].changeSign(2);
			} else {
				button = (ImageButton) findViewById(R.id.button12);
				button.setBackgroundResource(R.drawable.x);
				field.array[1][2].changeSign(1);
			}
			button.setEnabled(false);
		}
		
			if (view.getId() == R.id.button20) {
				if (isCurrPlayerO) {
					button = (ImageButton) findViewById(R.id.button20);
					button.setBackgroundResource(R.drawable.o);
					field.array[2][0].changeSign(2);
				} else {
					button = (ImageButton) findViewById(R.id.button20);
					button.setBackgroundResource(R.drawable.x);
					field.array[2][0].changeSign(1);
				}
				button.setEnabled(false);
			}
			
			if (view.getId() == R.id.button21) {
				if (isCurrPlayerO) {
					button = (ImageButton) findViewById(R.id.button21);
					button.setBackgroundResource(R.drawable.o);
					field.array[2][1].changeSign(2);
				} else {
					button = (ImageButton) findViewById(R.id.button21);
					button.setBackgroundResource(R.drawable.x);
					field.array[2][1].changeSign(1);
				}
				button.setEnabled(false);
			}

			if (view.getId() == R.id.button22) {
				if (isCurrPlayerO) {
					button = (ImageButton) findViewById(R.id.button22);
					button.setBackgroundResource(R.drawable.o);
					field.array[2][2].changeSign(2);
				} else {
					button = (ImageButton) findViewById(R.id.button22);
					button.setBackgroundResource(R.drawable.x);
					field.array[2][2].changeSign(1);
				}
				button.setEnabled(false);
			}

		moveCount++;
			
		isCurrPlayerO = !isCurrPlayerO;
		
		if(field.checkWin() == 0 && moveCount == 8) 
			//TO DO
			Log.w("Result", "Tie");
		else if(field.checkWin() == 1) 
			Log.w("Result", "X Wins");
		else if(field.checkWin() == 2) 
			Log.w("Result", "O Wins");
	}

}
