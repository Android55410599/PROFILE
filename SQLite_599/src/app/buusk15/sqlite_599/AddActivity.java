package app.buusk15.sqlite_599;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends Activity{
	
	private EditText edit1, edit2;
	private Button btn1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.id.add);
		edit1 = (EditText) findViewById(R.id.edit_name);
		edit2 = (EditText) findViewById(R.id.edit_tel);
		btn1 = (Button) findViewById(R.id.btn_save);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v == btn1) {
					Save();
				}
			}
			public boolean Save() {
				edit1 = (EditText) findViewById(R.id.edit_name);
				edit2 = (EditText) findViewById(R.id.edit_tel);
			}
		});
		
	}
}
