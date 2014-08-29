package com.example.homework_1;

import com.example.homework_1.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends Activity {
	private Bundle mBundle;
	private Intent intent; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText username = (EditText)findViewById(R.id.username);		
		final EditText password = (EditText)findViewById(R.id.password);
		final RadioButton choose1 = (RadioButton)findViewById(R.id.choose1);
		final RadioButton choose2 = (RadioButton)findViewById(R.id.choose2);
		Button button=(Button)findViewById(R.id.button);
		intent = new Intent();
		mBundle = new Bundle();

		button.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				String key=password.getText().toString();
				String userName=username.getText().toString();
				mBundle.putString("name",userName);
				mBundle.putString("key", key);
				if(!userName.isEmpty()&&!key.isEmpty()){
					if (choose1.isChecked()) {  					  
					        mBundle.putString("sex", "ÄÐ");  				
					      } else if(choose2.isChecked()){  		  
					        mBundle.putString("sex", "Å®");  				  
					      }  else{
					    	mBundle.putString("sex", "");
					      }
					intent.putExtras(mBundle); 
					intent.setClass(MainActivity.this,success.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "×¢²á³É¹¦",Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(getApplicationContext(), "×¢²áÊ§°Ü",Toast.LENGTH_SHORT).show();
					}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
