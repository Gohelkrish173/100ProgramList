import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_3Sum {
  public static void main(String[] args){
    int[] x = {-1,0,1,2,-1,-4};

    System.out.println("Without Optimum Solution"+threeSum_without_Optimum_Solution(x));
    System.out.println("With Optimum Solution"+threeSome_With_Optimum_Solution(x));
  }

  // for the Large Data this solution is not optimal b'coz time complexity is O((n^3)+n)

  public static List<List<Integer>> threeSum_without_Optimum_Solution(int[] nums){
    List<List<Integer>> L = new ArrayList<>();

    for(int i = 0;i<nums.length-1;i++){
      for(int j = i+1;j<nums.length;j++){
        if(nums[i] > nums[j]){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

    for(int i = 0;i<(nums.length-2);i++){
      for(int j = i+1;j<(nums.length-1);j++){
        for(int k = j+1;k<(nums.length);k++){
          if(nums[i] + nums[j] + nums[k] == 0){
            List<Integer> tempL = new ArrayList<>();
            tempL.add(nums[i]);
            System.out.println("nums["+i+"] = " + tempL);
            tempL.add(nums[j]);
            System.out.println("nums["+j+"] = " + tempL);
            tempL.add(nums[k]);
            System.out.println("nums["+i+"] = " + tempL);
            if(L.contains(tempL)){continue;}
            else{L.add(tempL);}
            System.out.println("List Of List = " + L);
          }
        }
      }
    }

    return L;
  }

  // below method is optimize method for threeSome And TimeComplexity = O(n^2)

  public static List<List<Integer>> threeSome_With_Optimum_Solution(int[] nums){
    List<List<Integer>> L = new ArrayList<>();
        
    Arrays.sort(nums);

    for(int i = 0;i<(nums.length - 2);i++){

      if(i>0 &&  nums[i] == nums[i-1]) continue;

      int left = i + 1;
      int right = nums.length - 1;

      while(left < right){
        int sum = nums[i] + nums[left] + nums[right];

        if(sum == 0){
          L.add(Arrays.asList(nums[i],nums[left],nums[right]));

          while(left < right && nums[left] == nums[left + 1]) left++;
          while(left < right && nums[right] == nums[right - 1]) right--;
          
          left++;
          right--;
        }
        else if(sum < 0){
          left++;
        }
        else{
          right--;
        }
      }
    }

    return L;    
  }
}