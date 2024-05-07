// TC: O(n) SC: O(1)
// Approach 1: To solve Min and Max Elements with minimum number of comparisons
import java.util.Arrays;
public class minMaxFinder{
  //Find minimum
  public static int setMini(){
    int mini = Integer.MAX_VALUE;
    for(int i = 0 ; i < n; i++){
      if(mini > A[i]){
        mini = A[i];
      }
    }
    return mini;
  }

  //Find Max
  public static int setMax(){
    int max = Integer.MIN_VALUE;
    for(int j=0; j < n; j++){
      if(max < A[j]){
        max = A[i];
      }
    }
  }

  // Main function
  public static void main(String args[]){
    int[] A = [4, 7, 8, 1, 10, 56, 7, 9, 0];
    int n = A.length;
    System.out.print("Minimum element is:"+ setMini(A, n));
    System.out.println("Maximum element is:"+ setMax(A, n));
  }
}

// Approach 2 : Using Sorting
// TC: O(nlogn)  SC: O(1)
// Step-by-step approach:

// Initialize an array.
// Sort the array in ascending order.
// The first element of the array will be the minimum element.
// The last element of the array will be the maximum element.
// Print the minimum and maximum element.

import java.io.*;
import java.utiol.*;

class Pair{
  public int min;
  public int max;
}

class Main{
  static Pair getMinMax(int arr[], len){
    Pair minmax = new Pair();
    Arrays.sort(arr);
    minmax.min = arr[0];
    minmax.max = arr[n - 1];
    return minmax;
  }
  public static void main(String args){
    int[] arr = [100, 67, 58, 99, 42, 0, 1, 65, 32];
    int len = arr.length;
    Pair minmax = getMinMax(arr, len);
    System.out.print("Minimum number is:"+ minmax.min);
    System.out.println("Maximum number is:"+ minmax.max);
  }
}

