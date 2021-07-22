package com.example.create_app.Model;

public class Cart_Model {
	int id, id_hair, id_user, id_product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_hair() {
		return id_hair;
	}

	public void setId_hair(int id_hair) {
		this.id_hair = id_hair;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public Cart_Model() {
	}

	public Cart_Model(int id, int id_hair, int id_user, int id_product) {
		this.id = id;
		this.id_hair = id_hair;
		this.id_user = id_user;
		this.id_product = id_product;
	}
}
