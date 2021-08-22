package com.calc.sort;

public class Test {


    public static void main(String[] args) {
        int[]  qq={6,3,1,7,5,8,9,2,4,} ;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < qq.length; i++) {
            if (i%2!=0){
                sb.append(qq[i]);
            }
        }
        System.out.println("sb.toString() = " + sb.toString());
    }
}
