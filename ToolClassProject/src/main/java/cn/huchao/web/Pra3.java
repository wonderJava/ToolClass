package cn.huchao.web;

import java.util.Scanner;

/**
 * @author huchao
 * @2017年7月14日
 * @description
 * 
 */
public class Pra3 {

	 public static void main(String[] args) {
	        int i,j;
	        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};
	        int[][] b = new int[3][3];
	        System.out.print("初始矩阵：\n");
	        for(i=0;i<3;i++) {
	            for(j=0;j<3;j++) {
	                System.out.print(a[i][j]+"  ");
	            }
	        System.out.print("\n");
	        }
	        System.out.print("转置矩阵：\n");
	        for(i=0;i<3;i++) {
	            for(j=0;j<3;j++) {
	                b[i][j] = a[j][i];
	                System.out.print(b[i][j]+"  ");
	            }
	        System.out.print("\n");
	        }
	    }
}
