package com.Array.T912_sort;

class Solution {
    //选择排序
    public int[] sortArray(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int flag=i;
            int min=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<min){
                    flag=j;
                    min=nums[j];
                }
            }
            int temp=nums[i];
            nums[i]=nums[flag];
            nums[flag]=temp;
        }
        return nums;
    }

    //冒泡排序
    public int[] BubbleSort(int nums[]){
        int end=nums.length;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<end-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                return nums;
            end--;
        }
        return nums;
    }

    //快排

    public void QS(int nums[],int start,int end){
        //递归出口
        if(start>=end){
            return ;
        }
        int i=start;
        int j=end;
        int p=nums[start];

        while(i<j){

            while(i<j&&p<=nums[j])//这里的=至关重要
                j--;
            nums[i]=nums[j];

            while(i<j&&nums[i]<=p)
                i++;
            nums[j]=nums[i];
        }
        nums[i]=p;//很重要
        QS(nums,start,i-1);
        QS(nums,i+1,end);
    }
    //归并算法

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={5,6,3,2,1,8,9,7,4,2,0};
        //s.BubbleSort(nums);
        s.QS(nums,0,10);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}