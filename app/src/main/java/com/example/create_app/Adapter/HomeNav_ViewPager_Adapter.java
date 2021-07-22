package com.example.create_app.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.create_app.Fragment.Home_Fragment;
import com.example.create_app.Fragment.Man_Fragment;
import com.example.create_app.Fragment.Product_Fragment;

public class HomeNav_ViewPager_Adapter extends FragmentStatePagerAdapter {
	public HomeNav_ViewPager_Adapter(@NonNull FragmentManager fm, int behavior) {
		super(fm, behavior);
	}

	@NonNull
	@Override
	public Fragment getItem(int position) {
		switch (position)
		{
			case 0:
				return new Home_Fragment();

			case 1:
				return new Man_Fragment();

			case 2:
				return new Product_Fragment();


			default:
				return new Home_Fragment();
		}
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		switch (position)
		{
			case 0:
				return "Thịnh hành";

			case 1:
				return "Kiểu tóc";

			case 2:
				return "Sản phẩm";


			default:
				return "Thịnh hành";
		}
	}
}
