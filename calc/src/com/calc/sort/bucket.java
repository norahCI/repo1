package com.calc.sort;

/**
 * 经典桶排序
 *  排列数据
 *  数据长度5
 *  1-10数据倒叙排列
 */

public class bucket {
    public static int[] bucket(int[] numbs){
        //1.把0-10每个数据定义为一个桶,并初始化为0
        int[] buckets = new int[11];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i]=0;
        }
        //2. 将numbs的数据 将"小红旗"放到对应下标的桶中
        for (int i = 0; i < numbs.length; i++) {
            int s =numbs[i];//获取数组中的数值
            buckets[s]+=1;//将桶里数据+1
        }
        //3.按照桶的编号, 倒叙取出,每个桶中的"小红旗子"
        int c=0;
        for (int i = buckets.length - 1; i >= 0; i--) {
            int n=buckets[i]; //获取出现的次数
            if (n==0) continue;
            for (int s = 0; s < n; s++) {
                numbs[c] = i;
                c++;
            }
        }
        return numbs;
    }

    public static void main(String[] args) {
        bucket(new int[]{1,2,2,3,4});
    }
}
