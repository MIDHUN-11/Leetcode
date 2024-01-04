/*Question
2870. Minimum Number of Operations to Make Array Empty
You are given a 0-indexed array nums consisting of positive integers.

There are two types of operations that you can apply on the array any number of times:

Choose two elements with equal values and delete them from the array.
Choose three elements with equal values and delete them from the array.
Return the minimum number of operations required to make the array empty, or -1 if it is not possible.

 
*/
class Solution {
    public int minOperations(int[] nums) {
        // HashMap<Integer,Integer> hm = new HashMap<> ();
        // Set<Integer> MySet =new HashSet<Integer> ();
        // for(int i=0;i<nums.length;i++)
        // {
        //     MySet.add(nums[i]);
        //     if(hm.containsKey(nums[i])){
        //         hm.put(nums[i],hm.get(nums[i])+1);
        //     }
        //     else{
        //         hm.put(nums[i],1);
        //     }
        // }
        // int twoCount=0,threeCount=0;
        // Iterator<Integer> itr=MySet.iterator();
        // while(itr.hasNext()){
        //     int val=itr.next();
        //     if(hm.get(val)%2==0){
        //         twoCount++;
        //     }
        //     else if(hm.get(val)%3==0){
        //         threeCount++;
        //     }
        //     else{
        //         return -1;
        //     }
        // }
        // return 0;
        int twoCount=0,threeCount=0;
        for(int i=0;i<nums.length;i++){
           
             if(nums[i]>2){
                nums[i]=nums[i]%3;
                threeCount++;
            }
         
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 &&nums[i]%2==0){
                nums[i]=nums[i]%2;
                twoCount++;
            }}
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count++;
            } 
        }
        if(count%3!=0 || count%2!=0){
            return -1;
        }
        else if(count%3==0){
            threeCount++;
        }
        else if(count%2==0){
            twoCount++;
        }
        // if(twoCount>threeCount){
        //     return twoCount;
        // }
        // else
         return twoCount+threeCount;
    }
}
/*
dry run
[2,3,3,2,2,4,2,3,4]
2=>4=>2
3=>3=>1
4=>2=>1
[2,0,0,2,2,1,2,0,1]
threeC=5
[0,0,0,0,0,1,0,0,1]
twoc=4
*/