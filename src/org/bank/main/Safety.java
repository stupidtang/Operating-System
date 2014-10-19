package org.bank.main;

import org.bank.model.*;
import org.bank.util.OP;
/*
 * 银行家算法类
 * @auther Chen
 * */
public class Safety {
	public static int np;				//进程数和资源数
	public static int nr;
        public int[] available;
        public String[][] table = new String[10][5];            //为界面表格准备
	public static Myprocess[] p = new Myprocess[np];	//进程
	public static Myresource[] r = new Myresource[nr];	//资源
        
	public Safety(int np, int nr, Myprocess[] p, Myresource[] r) {
		this.np = np;
		this.nr = nr;
		this.p = p;
		this.r = r;
	}
	
	/*安全性判断，成功返回安全性序列*/
	public int[] judge(){
		int[] order = new int[np];	//存放安全序列
		boolean[] finish = new boolean[np];//能否分配标志
		int[] work = new int[nr];	//工作向量
		work = this.getAvailable();	//工作向量开始等于available
		
		/*安全性检查核心*/
		int i=0,k=0,n=0;
		for( ;i < np; ){
			int count = 1;
			
			for(int j = 0;j < nr; j++){
				
				if( i<np && !finish[i]){//进程未分配才进行
					
					if( (this.p[i].maxNeed[j] - this.p[i].allocation[j]) <= work[j] ){
						count++;//必须每一个资源都检查,小于
						if(count == nr){		
                                                        table[n][0] = OP.toString(work);
							for(int m = 0;m < nr; m++){
								work[m] = work[m] + this.p[i].allocation[m];
                                                        }
							table[n][1] = OP.toString(p[i].getNeed());
                                                        table[n][2] = OP.toString(p[i].getAllocation());
                                                        table[n][3] = OP.toString( work);
                                                        table[n][4] = "True";
                                                        n++;
							finish[i] = true;
							order[k++] = i;                                                        
							i = 0;//从头开始检查
						}
					}
					else{
						//需求过大，检查下一个
						i++;
						continue;
					}

				}
				//该进程已经分配到资源，检查下一个
				else{
					i++;
					continue;
				}
			}
		}
		//检查所有finish
		for(i = 0;i < np; i++){
			if(!finish[i]){
                                
				return null;
			}
		}		
		return order;
		
	}
	//请求资源分配
	public int request(Myprocess p , int req[]){
            int r = 0;
            if( OP.compare( req ,p.getNeed() ) ){//请求小于等于需要
                if( OP.compare( req, this.getAvailable() ) ){
                    //可利用资源-请求资源
                    for(int i = 0;i < req.length; i++){//请求小于于可利用
                        this.available[i] -= req[i];
                        p.allocation[i] += req[i];
                        p.need[i] -= req[i];
                    }
                }else{
                    r = -2;//请求小于大于需要,不合理
                }
            }
            else{
                r =-1;//请求大于可利用,该进程等待
            }
            return r;
        }
	//得到当前各类可利用资源的总和                                                                                                                      
	public int[] getAvailable(){
		int[] available = new int[nr];
		int[] allocation = new int[nr];
		for(int i = 0;i < nr;i++){					//获得各进程分配同类资源的总和向量
			for(int j = 0;j < np;j++){
				allocation[i]=allocation[i]+p[j].allocation[i];
			}
		}
		for(int i = 0;i < nr;i++){					//计算剩余资源
			available[i] = r[i].available - allocation[i];
		}
		return available;
	}
	public void setAvailable(int[] available) {
		this.available = available;
	}
}
