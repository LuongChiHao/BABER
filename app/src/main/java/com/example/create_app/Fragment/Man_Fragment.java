package com.example.create_app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.create_app.Adapter.Hair_Adapter;
import com.example.create_app.Model.Hairs_Model;
import com.example.create_app.R;

import java.util.ArrayList;

public class Man_Fragment extends Fragment {
	RecyclerView rcv ;
	EditText edt;
	ArrayList<Hairs_Model> list;
	Hair_Adapter adapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_man_, container, false);
		AnhXa(view);
		DayDuLieuList();
		DayDuLieuRCV();
		return view;
	}

	private void DayDuLieuList() {
		list = new ArrayList<>();
		list.add(new Hairs_Model(3, "Tóc uốn phồng 3/7", "https://cdn.tgdd.vn/Files/2021/01/22/1322016/12-kieu-toc-nam-side-part-3-7-hot-trend-duoc-ua-chuong-nhat-hien-nay-202101221438432065.jpg", "Phần tóc chia 3/7, sau đó uốn phồng lên khiến gương mặt trông bớt góc cạnh, đầy đặn và mang lại vẻ lịch lãm, cổ điển cho các bạn nam."));
		list.add(new Hairs_Model(0, "Mohawk", "https://i0.wp.com/danongonline.com.vn/wp-content/uploads/2017/12/kieu-toc-nam-mohawk-327321.jpg?resize=624%2C446&ssl=1", "Kiểu tóc nam Mohican cổ điển có phong cách tạo hình hết sức nổi bật và độc đáo, phần tóc hai bên được cạo sạch. Trong khi đó, phần tóc mái thì được tạo hình thành một dải ở giữa, kéo dài từ đỉnh trán đến phía sau gáy."));
		list.add(new Hairs_Model(1, "Mohican fade", "https://tinphongcach.vn/wp-content/uploads/2020/02/mohican-mo%CC%89ng-k%C3%AA%CC%81t-h%C6%A1%CC%A3p-Fade.jpg", "Để khắc phục vấn đề tóc mỏng, tạo cảm giác bồng bềnh hơn cho mái tóc, nhà tạo mẫu sẽ kết hợp cắt Fade Mohawk cho bạn. Vì vậy, phần tóc mái trên đỉnh đầu trở nên dễ dàng tạo kiểu với nhiều hình dạng và phong cách táo bạo phù hợp với chủ nhân."));
		list.add(new Hairs_Model(2, "Undercut ngắn vuốt thẳng", "https://tinphongcach.vn/wp-content/uploads/2019/02/undercut-ng%E1%BA%AFn-vu%E1%BB%91t-th%E1%BA%B3ng-1.jpg", "Kiểu vuốt thẳng này rất thích hợp với các bạn nam có khuôn mặt vuông – góc cạnh. Tuy nhiên, để tạo kiểu tóc này được đẹp nhất sẽ phải tốn chút thời gian bởi nó yêu cầu phải vuốt dựng thật thẳng mới đẹp. Sẽ dễ dàng hơn nếu bạn sỡ hữu phần chân tóc cứng"));
	}

	private void DayDuLieuRCV() {
			adapter = new Hair_Adapter(getContext(), list);
			rcv.setLayoutManager(new GridLayoutManager(getContext(), 2));
			rcv.setAdapter(adapter);
			rcv.setHasFixedSize(true);
	}

	private void AnhXa(View view) {
		rcv = view.findViewById(R.id.rcv_kieutoc);
		edt = view.findViewById(R.id.edtsearch_kieutoc);
	}
}