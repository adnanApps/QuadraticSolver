package com.example.quadraticsolver;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void calc (View v){
		EditText et1A = (EditText) findViewById(R.id.editText1);
		EditText et1B = (EditText) findViewById(R.id.editText2);
		EditText et1C = (EditText) findViewById(R.id.editText3);
		double answer1; 
		double answer2;
		
try {
		double a = Double.parseDouble(et1A.getText().toString());
		double b = Double.parseDouble(et1B.getText().toString());
		double c = Double.parseDouble(et1C.getText().toString());
	
		answer1 = (-b+( Math.sqrt(Math.pow(b, 2)-(4*a*c))  ) )/ 2*a;  
		answer2 = (-b-( Math.sqrt(Math.pow(b, 2)-(4*a*c))  ) )/ 2*a;
		TextView tv = (TextView) findViewById(R.id.Solution);
		
		tv.setText("Answer 1 ="+answer1+" , "+"Answer2 = "+answer2);
} catch (Exception e) {
	// TODO: handle exception
	Toast.makeText(this, "Invalid Calculation", Toast.LENGTH_LONG).show();
}

	}
}
