package com.example.resume_55410559;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.TextView;

public class resume extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText etxt1, etxt2, etxt3, etxt4, etxt5, etxt6, etxt7;
	private String txt11, txt22, txt33, txt44, txt55, txt66 , txt77;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.resume);
		super.onCreate(savedInstanceState);
		ViewMatching();
	}
	private void ViewMatching() {
		btnsubmit = (Button) findViewById(R.id.button_save);
		btnsubmit.setOnClickListener(this); 
		etxt1 = (EditText) findViewById(R.id.editText1);
		etxt2 = (EditText) findViewById(R.id.editText2);
		etxt3 = (EditText) findViewById(R.id.editText3);
		etxt4 = (EditText) findViewById(R.id.editText4);
		etxt5 = (EditText) findViewById(R.id.editText5);
		etxt6 = (EditText) findViewById(R.id.editText6);
		etxt7 = (EditText) findViewById(R.id.editText7);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_save:
			txt11 = (etxt1.getText().toString());
			txt22 = (etxt2.getText().toString());
			txt33 = (etxt3.getText().toString());
			txt44 = (etxt4.getText().toString());
			txt55 = (etxt5.getText().toString());
			txt66 = (etxt6.getText().toString());
			txt77 = (etxt7.getText().toString());
	
			Intent R = new Intent(getApplicationContext(), MainActivity.class);
			R.putExtra("txt1", txt11);
			R.putExtra("txt2", txt22);
			R.putExtra("txt3", txt33);
			R.putExtra("txt4", txt44);
			R.putExtra("txt5", txt55);
			R.putExtra("txt6", txt66);
			R.putExtra("txt7", txt77);
			startActivity(R);
			break;
		default:
			break;
		}
	}
}
