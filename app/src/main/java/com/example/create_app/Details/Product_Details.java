package com.example.create_app.Details;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.create_app.R;
import com.squareup.picasso.Picasso;

public class Product_Details extends AppCompatActivity {
	TextView tv_name, tv_des, tv_price, tv_name_header;
	ImageView iv;
	int id, price;
	String name, des, img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product__details);
		AnhXa();
		NhanDuLieuTuIntent();
		DoDuLieuLenLV();
	}

	public void DoDuLieuLenLV() {
		tv_name.setText(name);
		tv_des.setText("Mô tả: "+des);
		if(price==0) tv_price.setText("");
		else
		{
			DecimalFormat formatter = new DecimalFormat("###,###,###");
			String money = formatter.format(price);
			tv_price.setText("Giá: "+money+" VNĐ");
		}
		tv_name_header.setText(name);
		String url = img;
		Picasso.get()
				.load(url)
				.error(R.drawable.ic_baseline_error_24)
				.placeholder(R.drawable.ic_baseline_image_24)
				.into(iv);
	}

	public void NhanDuLieuTuIntent() {
		Intent i = getIntent();
		id = i.getIntExtra("id", 0);
		price = i.getIntExtra("price", 0);
		name = i.getStringExtra("name");
		des = i.getStringExtra("des");
		img = i.getStringExtra("img");
	}

	private void AnhXa() {
		tv_name = findViewById(R.id.tv_name_products_details);
		tv_name_header = findViewById(R.id.tv_name_header_products_details);
		tv_des = findViewById(R.id.tv_des_products_details);
		tv_price = findViewById(R.id.tv_price_products_details);
		iv = findViewById(R.id.iv_products_details);
	}
}