package org.bank.main;

import org.bank.model.*;

public class Main {

	public static void main(String[] args) {
//            int a[][] = {{1,2,3},{4,5,6}};
//            for(int i = 0;i <a.length;i++){
//                for(int j = 0;j < a[i].length;j++){
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println();
//            }
//            int[] b ={1,2,3}; 
//            System.out.println(org.bank.util.transform.toString(b));
		// TODO Auto-generated method stub
		//手动赋值- -
	/*	int np=5;//设置进程数量
		Myprocess[] p = new Myprocess[5];
		int nr=3;//设置资源数量
		Myresource r[] = new Myresource[3];
		
		int a[][]=new int[5][3];int b[][]=new int[5][3];
		
		a[0][0]=7;a[0][1]=5;a[0][2]=3;
		b[0][0]=0;b[0][1]=1;b[0][2]=0;
		p[0] = new Myprocess();
		p[0].setMaxNeed(a[0]);p[0].setAllocation(b[0]);p[0].setNr(nr);
		
		
		a[1][0]=3;a[1][1]=2;a[1][2]=2;
		b[1][0]=2;b[1][1]=0;b[1][2]=0;
		p[1] = new Myprocess();
		p[1].setMaxNeed(a[1]);p[1].setAllocation(b[1]);p[1].setNr(nr);

		a[2][0]=9;a[2][1]=0;a[2][2]=2;
		b[2][0]=3;b[2][1]=0;b[2][2]=2;
		p[2] = new Myprocess();
		p[2].setMaxNeed(a[2]);p[2].setAllocation(b[2]);p[2].setNr(nr);
	
		a[3][0]=2;a[3][1]=2;a[3][2]=2;
		b[3][0]=2;b[3][1]=1;b[3][2]=1;
		p[3] = new Myprocess();
		p[3].setMaxNeed(a[3]);p[3].setAllocation(b[3]);p[3].setNr(nr);

		
		a[4][0]=4;a[4][1]=3;a[4][2]=3;
		b[4][0]=0;b[4][1]=0;b[4][2]=2;
		p[4] = new Myprocess();
		p[4].setMaxNeed(a[4]);p[4].setAllocation(b[4]);p[4].setNr(nr);
		
		r[0] = new Myresource(10);
		r[1] = new Myresource(5);
		r[2] = new Myresource(7);
		
		//打印信息
		System.out.print("T0时刻资源分配表");
		System.out.println("\t\tmax\t\tallocation\t\tneed");
		
		System.out.print("\t\tr1  r2  r3\t");System.out.print("r1  r2  r3\t");System.out.print("\tr1  r2  r3\n");
		
		for(int i = 0;i<np;i++){
			
			System.out.print("p"+i+"\t\t");
			
			for(int j = 0;j<nr;j++){
				System.out.print(p[i].maxNeed[j]+"   ");
				}
			System.out.print("\t");
			
			for(int j = 0;j<nr;j++){
			System.out.print(p[i].allocation[j]+"   ");
			}
			System.out.print("\t");
			
			for(int j = 0;j<nr;j++){
				System.out.print("\t"+(p[i].maxNeed[j] - p[i].allocation[j])+"  ");
				}
			System.out.println();
		}
		
		System.out.println("\n"+"available:");
		
		
		//安全性检查
		Safety s = new Safety(5,3,p,r);
		int[] available = s.getAvailable();
		
		for(int i=0;i<3;i++)
			System.out.print("r"+i+"  ");
		System.out.println();
		for(int i=0;i<3;i++)
			System.out.print(available[i]+"  ");
		System.out.println();
		
		if(s.judge() != null){
                    System.out.print("suss");
                }
                */
		
	}	

}
