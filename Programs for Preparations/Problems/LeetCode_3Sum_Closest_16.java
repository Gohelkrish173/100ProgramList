
public class LeetCode_3Sum_Closest_16{

  public static int threeSumClosest(int[] nums,int target){
    int n = nums.length;

    for(int i = 0;i<n-1;i++){
      for(int j =i+1;i<n;j++){
        if(nums[i] > nums[i]){
          int temp = nums[j];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

    int closest = 0;

    for(int i = 0;i<n-2;i++){
      for(int j = i+1;j<n-1;j++){
        for(int k = j+1;k<n;k++){
          if(k == 2){
            closest = nums[i] + nums[j] + nums[k];
          }

          int sum = nums[i] + nums[j] + nums[k];

          if(Math.abs(target-sum) < Math.abs(target-closest)){
            closest = sum;
          }
        }
      }
    }

    return closest;
  }

  public static void main(String[] args) {
    int[] case1 = {-1,2,1,-4};
    int[] case2 = {0,0,0};
    int[] case3 = {0,1,2};
    int[] case4 = {2,64,1,-8,6,-15,-78,-5,100,-75,-85,51,49,25,42,-25,54};

    System.out.println("Result (Sum Of closest of the target) : ");
    System.out.println("Case 1 : " + threeSumClosest(case1, 1));
    System.out.println("Case 2 : " + threeSumClosest(case2, 0));
    System.out.println("Case 3 : " + threeSumClosest(case3, 3));
    // System.out.println("Case 4 : " + threeSumClosest(case4, 19));
  }

  
}