package org.bank.model;
/*
 * 进程模型类
 * @auther Chen
 * */
public class Myprocess {
	public int nr;			//资源种类数目
	public int[] maxNeed;		//最大资源需求数
	public int[] allocation;		//已分配资源数
	public int[] need;			//尚需资源数
	
	public Myprocess() {	
	}
	
	public Myprocess(int nr,int[] maxNeed, int[] allocation) {
		this.nr = nr;
		this.maxNeed = maxNeed;
		this.allocation = allocation;
		for(int j = 0;j<nr;j++){
			this.need[j] = this.maxNeed[j] - this.allocation[j];
		}
		
	}
	public int[] getMaxNeed() {
		return maxNeed;
	}
	public void setMaxNeed(int[] maxNeed) {
		this.maxNeed = maxNeed;
	}
	public int[] getAllocation() {
		return allocation;
	}
	public void setAllocation(int[] allocation) {
		this.allocation = allocation;
	}
	public int[] getNeed() {
		return need;
	}
	public void setNeed(int[] need) {
		this.need = need;
	}
	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}
	
}
