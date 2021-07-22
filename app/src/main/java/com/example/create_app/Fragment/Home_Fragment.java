package com.example.create_app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.create_app.Adapter.KieuTocTH_Adapter;
import com.example.create_app.Model.KieuToc_Model;
import com.example.create_app.R;

import java.util.ArrayList;

public class Home_Fragment extends Fragment {
	ViewFlipper viewFlipper;
	ArrayList<Integer> listanh = new ArrayList<Integer>();
	ArrayList<KieuToc_Model> list;
	RecyclerView rcv;
	KieuToc_Model model;
	KieuTocTH_Adapter adapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_home_, container, false);
			AnhXa(view);
			SlideAnh();
			ThemDuLieuVaoListTH();
			DoDuLieuLenRCV();
		return view;
	}

	private void DoDuLieuLenRCV() {
//		Adapter
		adapter = new KieuTocTH_Adapter(getContext(), list);
//		RCV
		rcv.setHasFixedSize(true);
		rcv.setLayoutManager(new GridLayoutManager(getContext(), 2));
		rcv.setAdapter(adapter);
	}

	private void ThemDuLieuVaoListTH() {
		list = new ArrayList<>();
		list.add(new KieuToc_Model("MO01F", "Mohican nam", "https://i.pinimg.com/originals/65/31/b9/6531b9e4d1825a02db0f182bb42e9208.jpg", "Nam"));
		list.add(new KieuToc_Model("MO01F", "Mohican nam", "https://i.pinimg.com/originals/65/31/b9/6531b9e4d1825a02db0f182bb42e9208.jpg", "Nam"));
		list.add(new KieuToc_Model("MO01F", "Mohican nam", "https://i.ytimg.com/vi/PDEVqCGOh7Q/maxresdefault.jpg", "Nam"));
		list.add(new KieuToc_Model("MO01F", "Mohican nam", "https://i.pinimg.com/originals/65/31/b9/6531b9e4d1825a02db0f182bb42e9208.jpg", "Nam"));
		list.add(new KieuToc_Model("MO01F", "Mohican nam", "https://cdn.iconscout.com/icon/free/png-512/trending-9-433922.png", "Nam"));
		list.add(new KieuToc_Model("MO01F", "Mohican nam", "https://i.pinimg.com/originals/65/31/b9/6531b9e4d1825a02db0f182bb42e9208.jpg", "Nam"));
	}

	public void SlideAnh() {
		listanh.add(R.drawable.layer);
		listanh.add(R.drawable.layernungan);
		listanh.add(R.drawable.undercut);
		listanh.add(R.drawable.mohican);

		for(int i=0; i<listanh.size(); i++)
		{
			ImageView imageView = new ImageView(getContext());
			imageView.setImageResource(listanh.get(i));
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			viewFlipper.addView(imageView);
		}
		viewFlipper.setFlipInterval(3000);
		viewFlipper.setAutoStart(true);
		Animation animtoright = new AnimationUtils().loadAnimation(getContext(), R.anim.slide_to_right);
		Animation animtoleft = new AnimationUtils().loadAnimation(getContext(), R.anim.slide_to_left);
		viewFlipper.setInAnimation(animtoright);
		viewFlipper.setOutAnimation(animtoleft);
	}

	private void AnhXa(View view) {
		viewFlipper = view.findViewById(R.id.viewflipper);
		rcv = view.findViewById(R.id.rcv_home);
	}
}