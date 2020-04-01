package com.Array.T62_JosephRing;

import java.util.ArrayList;

class Solution {
    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int idx=0;
        while(n>1){
            idx=(idx+m-1)%n;//重点
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

}
