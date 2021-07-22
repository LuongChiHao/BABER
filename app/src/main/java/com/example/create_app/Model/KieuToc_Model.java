package com.example.create_app.Model;

public class KieuToc_Model {

	public String kieutoc, anhtoc, gioitinh, idtoc;

	public String getIdtoc() {
		return idtoc;
	}

	public void setIdtoc(String  idtoc) {
		this.idtoc = idtoc;
	}

	public String getKieutoc() {
		return kieutoc;
	}

	public void setKieutoc(String kieutoc) {
		this.kieutoc = kieutoc;
	}

	public String getAnhtoc() {
		return anhtoc;
	}

	public KieuToc_Model() {
	}

	public KieuToc_Model(String idtoc, String kieutoc, String anhtoc, String gioitinh) {
		this.idtoc = idtoc;
		this.kieutoc = kieutoc;
		this.anhtoc = anhtoc;
		this.gioitinh = gioitinh;
	}

	public void setAnhtoc(String anhtoc) {
		this.anhtoc = anhtoc;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
}
