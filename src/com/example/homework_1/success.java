package com.example.homework_1;

import com.example.homework_1.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class success extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.success);
		Bundle mBundle = new Bundle();
		mBundle = this.getIntent().getExtras();
		TextView name=(TextView)findViewById(R.id.name);
		name.setText(mBundle.getString("name"));
		TextView key=(TextView)findViewById(R.id.key);
		key.setText(mBundle.getString("key"));
		TextView sex=(TextView)findViewById(R.id.sex);
		sex.setText(mBundle.getString("sex"));

}
}