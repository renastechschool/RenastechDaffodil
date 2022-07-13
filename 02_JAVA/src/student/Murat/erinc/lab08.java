package student.Murat.erinc;

import java.util.Arrays;

public class lab08 {

    public static void main(String[] args) {

        int[] numberList={2,1,65,32,123,64};
        System.out.println(Arrays.toString(nums(numberList)));

    }

    public static int [] nums(int[] nums){

        int result=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i]<nums[j]){
                    result=nums[i];
                    nums[i]=nums[j];
                    nums[j]=result;
                }

            }

        }
        return nums;
    }



}
