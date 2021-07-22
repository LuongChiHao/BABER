package com.example.create_app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.create_app.Adapter.HomeNav_ViewPager_Adapter;
import com.example.create_app.Other.CustomViewPager;
import com.example.create_app.R;
import com.google.android.material.tabs.TabLayout;

public class HomeNav_Fragment extends Fragment {
	TabLayout tabLayout;
	CustomViewPager viewPager;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view =inflater.inflate(R.layout.fragment_home_nav_, container, false);
		AnhXa(view);
		SetViewPager();
		tabLayout.setupWithViewPager(viewPager);
		return view;
	}

	private void SetViewPager() {
		HomeNav_ViewPager_Adapter adapter = new HomeNav_ViewPager_Adapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
		viewPager.setAdapter(adapter);
	}

	private void AnhXa(View view) {
		tabLayout = view.findViewById(R.id.tablayout_homenav);
		viewPager = view.findViewById(R.id.pager_homenav);
		viewPager.setPagingEnabled(false);
	}
}