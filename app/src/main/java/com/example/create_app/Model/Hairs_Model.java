package com.example.create_app.Model;

public class Hairs_Model {
	int id ;
	String name, img, des;

	public Hairs_Model() {
	}

	public Hairs_Model(int id, String name, String img, String des) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.des = des;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
}
