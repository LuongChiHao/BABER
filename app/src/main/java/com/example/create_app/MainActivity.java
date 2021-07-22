package com.example.create_app;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.create_app.Adapter.ViewPager_Adapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
	ViewPager pager;
	BottomNavigationView botnav;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AnhXa();
		SetViewPager();
		SetBotNav();
	}

	private void SetBotNav() {
		botnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				switch (item.getItemId())
				{
					case R.id.menu_home:
						pager.setCurrentItem(0);
						break;
					case R.id.menu_cart:
						pager.setCurrentItem(1);
						break;
					case R.id.menu_date:
						pager.setCurrentItem(2);
						break;
					case R.id.menu_user:
						pager.setCurrentItem(3);
						break;

				}
				return true;
			}
		});
	}

	private void SetViewPager() {
		ViewPager_Adapter adapter = new ViewPager_Adapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
		pager.setAdapter(adapter);
		pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {
				switch (position)
				{
					case 0:
						botnav.getMenu().findItem(R.id.menu_home).setChecked(true);
						break;

					case 1:
						botnav.getMenu().findItem(R.id.menu_cart).setChecked(true);
						break;

					case 2:
						botnav.getMenu().findItem(R.id.menu_date).setChecked(true);
						break;

					case 3:
						botnav.getMenu().findItem(R.id.menu_user).setChecked(true);
						break;
				}
			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});
	}

	private void AnhXa() {
		pager = findViewById(R.id.pager_home);
		botnav = findViewById(R.id.bottom_nav_home);
	}

}