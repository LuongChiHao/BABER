package com.example.create_app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.create_app.Details.Product_Details;
import com.example.create_app.Model.Products_Model;
import com.example.create_app.Other.ItemClickListener;
import com.example.create_app.R;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Product_Adapter extends RecyclerView.Adapter<Product_Adapter.viewHolder>{
	Context context;
	ArrayList<Products_Model> list;
	public Product_Adapter(Context context, ArrayList<Products_Model> list) {
		this.context = context;
		this.list = list;
	}

	@NonNull
	@Override
	public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(context).inflate(R.layout.items_products, parent, false);
		return new viewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull viewHolder holder, int position) {
		Products_Model model = list.get(position);

		try {
			holder.tv_name.setText(model.getName());
			DecimalFormat formatter = new DecimalFormat("###,###,###");
			String price = formatter.format(model.getPrice());
			holder.tv_price.setText("Giá: "+price+" VNĐ");
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
						i.putExtra("price", model.getPrice());
						i.putExtra("img", model.getImg());
						i.putExtra("des", model.getDes());
						context.startActivity(i);
					}
				}
			});
		} catch (Exception e) {
			Log.d("Lỗi adapter", e.toString());
		}

	}

	@Override
	public int getItemCount() {
		return list.size();
	}

	public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		public RoundedImageView iv;
		public TextView tv_price, tv_name;
		private ItemClickListener itemClickListener;
		public viewHolder(@NonNull View itemView) {
			super(itemView);
			iv = itemView.findViewById(R.id.iv_products);
			tv_price = itemView.findViewById(R.id.tv_product_price);
			tv_name = itemView.findViewById(R.id.tv_product_name);
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
