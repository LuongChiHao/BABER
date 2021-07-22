package com.example.create_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.create_app.MainActivity;
import com.example.create_app.R;
import com.github.whilu.library.CustomButton;

public class Login extends AppCompatActivity {
	TextView tv_dk;
	CustomButton btn_log;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		AnhXa();
//		TextView DK
		tv_dk.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
				return false;
			}
		});
//		End TextView

//		Button
		btn_log.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
			}
		});
//		End Button
	}

	private void AnhXa() {
		tv_dk = findViewById(R.id.tv_dk);
		btn_log = findViewById(R.id.btn_login);
	}
}