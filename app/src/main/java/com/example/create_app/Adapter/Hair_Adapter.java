package com.example.create_app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.create_app.Details.Product_Details;
import com.example.create_app.Model.Hairs_Model;
import com.example.create_app.Other.ItemClickListener;
import com.example.create_app.R;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Hair_Adapter extends RecyclerView.Adapter<Hair_Adapter.ItemHolder>{
	Context context;
	ArrayList<Hairs_Model> list;

	public Hair_Adapter(Context context, ArrayList<Hairs_Model> list) {
		this.context = context;
		this.list = list;
	}

	@NonNull
	@Override
	public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(context).inflate(R.layout.items_hairs, parent, false);
		return new ItemHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
		Hairs_Model model = list.get(position);
		holder.tv.setText(model.getName());
		String url = model.getImg();
		Picasso.get()
				.load(url)
				.error(R.drawable.ic_baseline_error_24)
				.placeholder(R.drawable.ic_baseline_image_24)
				.into(holder.iv);
		holder.setItemClickListener(new ItemClickListener(){

			@Override
			public void onClick(View view, int position, boolean isLongClick) {
				if (!isLongClick)
				{

					Intent i = new Intent(context, Product_Details.class);
					i.putExtra("id", model.getId());
					i.putExtra("name", model.getName());
					i.putExtra("img", model.getImg());
					i.putExtra("des", model.getDes());
					context.startActivity(i);
				}
			}
		});
	}

	@Override
	public int getItemCount() {
		return list.size();
	}

	public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		public RoundedImageView iv;
		public TextView tv;
		private ItemClickListener itemClickListener;

		public ItemHolder(@NonNull View itemView) {
			super(itemView);
			iv = itemView.findViewById(R.id.iv_hairs);
			tv = itemView.findViewById(R.id.tv_hairsname);
			itemView.setOnClickListener(this);
		}

		public void setItemClickListener(ItemClickListener itemClickListener)
		{
			this.itemClickListener = itemClickListener;
		}

		@Override
		public void onClick(View v) {
			itemClickListener.onClick(v, getAdapterPosition(), false);
		}
	}
}
