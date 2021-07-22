package com.example.create_app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.create_app.Adapter.Product_Adapter;
import com.example.create_app.Model.Products_Model;
import com.example.create_app.R;

import java.util.ArrayList;

public class Product_Fragment extends Fragment {
	RecyclerView rcv;
	EditText edt_search;
	ArrayList<Products_Model> list;
	Product_Adapter adapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_product_, container, false);
		AnhXa(view);
		doDuLieuList();
		doDulieuRCV();
		return view;
	}

	public void doDuLieuList() {
		list = new ArrayList<>();
		list.add(new Products_Model(0, 250000,"Gel Vuốt Tóc Gatsby SH 200g", "https://cdn.chiaki.vn/unsafe/0x900/left/top/smart/filters:quality(90)/https://chiaki.vn/upload/product/2020/11/keo-vuot-toc-gatsby-sh-danh-cho-nam-200g-5fb349698496e-17112020105417.jpg", "Là dạng Gel vuốt tóc dành cho nam, giúp tạo kiểu chuyên nghiệp và giữ nếp tóc lâu, làm mềm tóc, vuốt tóc dễ dành và siêu cứng"));
		list.add(new Products_Model(0, 250000,"Gel Vuốt Tóc Gatsby SH 200g", "https://cdn.chiaki.vn/unsafe/0x900/left/top/smart/filters:quality(90)/https://chiaki.vn/upload/product/2020/11/keo-vuot-toc-gatsby-sh-danh-cho-nam-200g-5fb349698496e-17112020105417.jpg", "Là dạng Gel vuốt tóc dành cho nam, giúp tạo kiểu chuyên nghiệp và giữ nếp tóc lâu, làm mềm tóc, vuốt tóc dễ dành và siêu cứng"));
		list.add(new Products_Model(0, 250000,"Gel Vuốt Tóc Gatsby SH 200g", "https://cdn.chiaki.vn/unsafe/0x900/left/top/smart/filters:quality(90)/https://chiaki.vn/upload/product/2020/11/keo-vuot-toc-gatsby-sh-danh-cho-nam-200g-5fb349698496e-17112020105417.jpg", "Là dạng Gel vuốt tóc dành cho nam, giúp tạo kiểu chuyên nghiệp và giữ nếp tóc lâu, làm mềm tóc, vuốt tóc dễ dành và siêu cứng"));
		list.add(new Products_Model(0, 250000,"Gel Vuốt Tóc Gatsby SH 200g", "https://cdn.chiaki.vn/unsafe/0x900/left/top/smart/filters:quality(90)/https://chiaki.vn/upload/product/2020/11/keo-vuot-toc-gatsby-sh-danh-cho-nam-200g-5fb349698496e-17112020105417.jpg", "Là dạng Gel vuốt tóc dành cho nam, giúp tạo kiểu chuyên nghiệp và giữ nếp tóc lâu, làm mềm tóc, vuốt tóc dễ dành và siêu cứng"));
		list.add(new Products_Model(0, 250000,"Gel Vuốt Tóc Gatsby SH 200g", "https://cdn.chiaki.vn/unsafe/0x900/left/top/smart/filters:quality(90)/https://chiaki.vn/upload/product/2020/11/keo-vuot-toc-gatsby-sh-danh-cho-nam-200g-5fb349698496e-17112020105417.jpg", "Là dạng Gel vuốt tóc dành cho nam, giúp tạo kiểu chuyên nghiệp và giữ nếp tóc lâu, làm mềm tóc, vuốt tóc dễ dành và siêu cứng"));
		list.add(new Products_Model(0, 250000,"Gel Vuốt Tóc Gatsby SH 200g", "https://cdn.chiaki.vn/unsafe/0x900/left/top/smart/filters:quality(90)/https://chiaki.vn/upload/product/2020/11/keo-vuot-toc-gatsby-sh-danh-cho-nam-200g-5fb349698496e-17112020105417.jpg", "Là dạng Gel vuốt tóc dành cho nam, giúp tạo kiểu chuyên nghiệp và giữ nếp tóc lâu, làm mềm tóc, vuốt tóc dễ dành và siêu cứng"));
	}

	public void doDulieuRCV() {
		adapter = new Product_Adapter(getContext(), list);
		rcv.setLayoutManager(new LinearLayoutManager(getContext()));
		rcv.setAdapter(adapter);
		rcv.setHasFixedSize(true);
	}

	private void AnhXa(View v) {
		rcv = v.findViewById(R.id.rcv_sanpham);
		edt_search = v.findViewById(R.id.edtsearch_sanpham);
	}
}