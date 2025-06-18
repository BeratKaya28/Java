package com.zoo.model.AnimalController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String hayvanAdi;
	private int yas;
	private double boy;
	private double kilo;
	private double hız;
	private String renk;
	
	public String getHayvanAdi() {
		return hayvanAdi;
	}
	public void setHayvanAdi(String hayvanAdi) {
		this.hayvanAdi = hayvanAdi;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	public double getKilo() {
		return kilo;
	}
	public void setKilo(double kilo) {
		this.kilo = kilo;
	}
	public double getHız() {
		return hız;
	}
	public void setHız(double hız) {
		this.hız = hız;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	

}
