package com.example.create_app.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.create_app.Fragment.Cart_Fragment;
import com.example.create_app.Fragment.Date_Fragment;
import com.example.create_app.Fragment.HomeNav_Fragment;
import com.example.create_app.Fragment.Home_Fragment;
import com.example.create_app.Fragment.User_Fragment;

public class ViewPager_Adapter extends FragmentStatePagerAdapter {

	public ViewPager_Adapter(@NonNull FragmentManager fm, int behavior) {
		super(fm, behavior);
	}

	@NonNull
	@Override
	public Fragment getItem(int position) {
		switch (position)
		{
			case 0:
				return new HomeNav_Fragment();

			case 1:
				return new Cart_Fragment();

			case 2:
				return new Date_Fragment();

			case 3:
				return new User_Fragment();

			default:
				return new Home_Fragment();
		}
	}

	@Override
	public int getCount() {
		return 4;
	}
}
