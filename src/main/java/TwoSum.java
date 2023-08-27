import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int index=0;index<nums.length;index++){
            //int tgt = target-nums[index];
            for(int tgtIndex=index+1;tgtIndex<nums.length-index-1;tgtIndex++){
                if(target == (nums[index]+nums[tgtIndex])){
                    result[0]= index;
                    result[1]=tgtIndex;
                    break;
                }
            }
        }
        StringBuilder sb= new StringBuilder("sa");
        Integer.valueOf(sb.reverse().toString()).toString();
        return result;
    }



    public static void main(String[] args) {
        int[] inp =new int[]{3,2,4};
   Arrays.stream(twoSum(inp,6)).forEach(System.out::println);
    }
}
