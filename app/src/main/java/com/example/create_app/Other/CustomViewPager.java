package com.example.create_app.Other;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {
	private boolean enabled;


	public CustomViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.enabled = true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		if (this.enabled) return super.onTouchEvent(ev);
		return false;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		if (this.enabled) return super.onInterceptTouchEvent(ev);
		return false;
	}

	public void setPagingEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}
}
