package com.example.create_app.Model;

public class Datings_Model {
	int id, id_hair, id_product, amount, money, status;
	String id_user, service;
	String beginDate, cutDate;

	public Datings_Model() {
	}

	public Datings_Model(int id, int id_hair, int id_product, int amount, int money, int status, String id_user, String service, String beginDate, String cutDate) {
		this.id = id;
		this.id_hair = id_hair;
		this.id_product = id_product;
		this.amount = amount;
		this.money = money;
		this.status = status;
		this.id_user = id_user;
		this.service = service;
		this.beginDate = beginDate;
		this.cutDate = cutDate;
	}

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

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getCutDate() {
		return cutDate;
	}

	public void setCutDate(String cutDate) {
		this.cutDate = cutDate;
	}
}
