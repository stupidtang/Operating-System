package org.bank.util;

import org.bank.model.Myprocess;

/**
 * 操作类
 * @author 2012222010013
 */
public class OP {
    //将整形数组转化为以空格分开的字符串
    public static String toString(int[] a){
        String s = "";
        for(int i = 0;i < a.length;i++){
            s += a[i]+" ";
        }
        return s;
    }
    //将字符串转化为n个整形数字
    public static int[] toInt(String s , int n){
        int[] temp = new int[n];
        String[] ss = s.split(" ");
        cheak(ss);
        for(int i = 0;i < n;i++){
            temp[i] = java.lang.Integer.parseInt(ss[i]);
        }
        return temp;
    }
    //检查字符串是否符合以空格分开
    private static boolean cheak(String[] ss){
        boolean b = false;
        return b;
    }
    //得到进程p的各类需求资源，以整形数组返回
   public static int[] getNeed(Myprocess p){
       int[] need = new int[p.nr];
            for(int i = 0;i < p.nr;i++){
                need[i] = p.maxNeed[i] - p.allocation[i];
            }
            return need;
        } 
    //比较a1 是否每个数都对应小于 a2
    public static boolean compare(int[] a1 ,int[] a2){//设置用于检查资源是否合理
    	//a1中的每个数小于a2就返回true
    	for(int i = 0;i < a1.length;i++){    		
    		if( a1[i] <= a2[i] ){
    			continue;
    		}
    		else{
    			return false;
    		}
    	}
    	return true;
    }
}
