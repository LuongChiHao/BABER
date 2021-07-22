package com.example.create_app.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.create_app.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class Splash extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
//		Animation
		ShimmerFrameLayout container =
				(ShimmerFrameLayout) findViewById(R.id.iv_logo);
		container.startShimmer();
//		End Animation

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(Splash.this, Login.class);
				startActivity(intent);
				finish();
			}
		}, 3000);
	}
}