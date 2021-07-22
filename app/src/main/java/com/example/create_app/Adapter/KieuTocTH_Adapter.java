package com.example.create_app.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.create_app.Model.KieuToc_Model;
import com.example.create_app.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class KieuTocTH_Adapter extends RecyclerView.Adapter<KieuTocTH_Adapter.ItemHolder>{
	Context context;
	ArrayList<KieuToc_Model> list;

	public KieuTocTH_Adapter(Context context, ArrayList<KieuToc_Model> list) {
		this.context = context;
		this.list = list;
	}

	@NonNull
	@Override
	public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(context).inflate(R.layout.items_kieutocth, parent, false);
		return new ItemHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
		KieuToc_Model item = list.get(position);
		holder.tv.setText(item.kieutoc);
		String url = item.getAnhtoc();
		Picasso.get()
				.load(url)
				.error(R.drawable.ic_baseline_error_24)
				.placeholder(R.drawable.ic_baseline_image_24)
				.into(holder.iv);
		Log.d(">>>>>>>>>>>>", item.getAnhtoc()+list.size());
	}

	@Override
	public int getItemCount() {
		return list.size();
	}

	public class ItemHolder extends RecyclerView.ViewHolder{
		public ImageView iv;
		public TextView tv;

		public ItemHolder(@NonNull View itemView) {
			super(itemView);
			iv = itemView.findViewById(R.id.iv_kieutocth);
			tv = itemView.findViewById(R.id.tv_tenkieutocth);
		}
	}
}
