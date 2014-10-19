package org.bank.model;
/*
 * 资源模型类
 * @auther:Chen
 * */
public class Myresource {
	public int available;		//可利用资源
	
        public Myresource() {
	}
	
	public Myresource(int available) {
		this.available = available;
	}
        public void print(){
            System.out.print(available);
        }

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		available = available;
	}
	
	
}
