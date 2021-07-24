package com.example.create_app.Fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.create_app.Activities.Login;
import com.example.create_app.R;
import com.github.whilu.library.CustomButton;
import com.makeramen.roundedimageview.RoundedImageView;

public class User_Fragment extends Fragment {
	RoundedImageView iv;
	TextView name, id, phone;
	CustomButton btnchange, btnlogout;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_user_, container, false);
		AnhXa(view);
		BTNChangeUser();
		BTNLogOut();
		return view;
	}

	public void BTNLogOut() {
		btnlogout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
				builder.setTitle("Xác nhận");
				builder.setMessage("Bạn có muốn đăng xuất không ???");
				builder.setPositiveButton("Xác nhận", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent i = new Intent(getContext(), Login.class);
						startActivity(i);
						Toast.makeText(getContext(), "Đã đăng xuất", Toast.LENGTH_SHORT).show();
					}
				});
				builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
				builder.create().show();
			}
		});
	}

	public void BTNChangeUser() {
		btnchange.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				openChangeUserDialog(Gravity.CENTER);

			}
		});
	}

	public void openChangeUserDialog(int gravity) {
		Dialog dialog = new Dialog(getContext());
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(R.layout.user_dialog_change);

		Window window = dialog.getWindow();
		if (window == null)
		{
			return;
		}

		window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
		window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

		WindowManager.LayoutParams windowAttributes = window.getAttributes();
		windowAttributes.gravity = gravity;
		window.setAttributes(windowAttributes);

		dialog.setCancelable(false);

//		AnhXa() trong dialog
		CustomButton btnko = dialog.findViewById(R.id.btn_changeuser_unsave);


//		btnKO
		btnko.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.dismiss();
			}
		});

		dialog.show();
	}


	private void AnhXa(View v) {
		iv = v.findViewById(R.id.iv_user_avatar);
		name = v.findViewById(R.id.tv_user_name);
		id = v.findViewById(R.id.tv_user_userID);
		phone = v.findViewById(R.id.tv_user_phone);
		btnchange = v.findViewById(R.id.btn_changeuser);
		btnlogout = v.findViewById(R.id.btn_logout);
	}
}