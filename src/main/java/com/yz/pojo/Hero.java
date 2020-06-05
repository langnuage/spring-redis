package com.yz.pojo;

import java.io.Serializable;

public class Hero implements Serializable {
	
	//private static final long serialaVersionUID = 697740264388374753L;
	
	int id;
	String hname;
	int hp;
	int damage;
	
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getHname() {
        return hname;
    }
    public void setHname(String hname) {
        this.hname = hname;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public String toString() {
        return "Hero [id=" + id + ", hname=" + hname + "]";
    }
	

}
