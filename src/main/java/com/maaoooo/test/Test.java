package com.maaoooo.test;

/**
 * @author lzr
 * @date 2020 01 22:45
 * @description
 */
public class Test {
    public static void main(String[] args) {
       int n=4;
       int[] nums={9,3,2,4,8};
       int res=test(n,nums);
        System.out.println(res);

    }
    public static int test(int n,int nums[]){
        int length=nums.length;
        int temp=0;
        int cnt=0;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]<nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                cnt++;
            }
            if(cnt==n){
                return nums[i];
            }
        }
        return nums[length-1];
    }
}
