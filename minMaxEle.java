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

// Approach 3: Using Linear Search
//Initialize min and max as the minimum and maximum of the first two elements respectively. Starting from 3rd element,
//keep on comparing each element with min and max, and change max and min accordingly(i.e., if the element is smaller than min, then change min.
//If the element is greater than max, than change max. Or else ignore the element.)
//TC: O(n) SC: O(1)

import java.io.*;
import java.util.*;

public class GFG{
  static class Pair{
    int min,max;
  }
  static Pair getMinMax(int arr[], int n){
    Pair minmax = new Pair();
    int i;

    //If there is only one element
    if(n == 1){
      minmax.min = arr[0];
      minmax.max = arr[0];
      return minmax;
    }

    //If there are more than 1 element then initialize min and max
    if(arr[0]> arr[1]){
      minmax.max = arr[0];
      minmax.min = arr[1];
    }else{
      minmax.max = arr[1];
      minmax.min = arr[0];
    }

    for(i = 2; i < n; i++){
      if(arr[i] > minmax.max){
        minmax.max = arr[i];
      }else if(arr[i] < minmax.min){
        minmax.min = arr[i];
      }
    }
    return minmax;
  }

  //Driver Code
  public static void main(String args[]){
    int arr[] = {1000, 11, 445,1, 330,3000};
    int arr_size = 6;
    Pair minmax = getMinMax(arr, arr_size);
    System.out.print("Minimum element is" + minmax.min);
    System.out.println("Maximum element is" + minmax.max);
  }
}

// Approach 4: Minimum and Maximum using Tournament Method
// The idea is to divide the array into two parts and compare the maximum and minimum
//of the two parts to get the minimum and maximum of the the whole array.
//TC: O(n)
//SC: O(log n)

public class GFG{
  static class Pair{
    int min;
    int max;
  }

  static Pair getMinMax(int arr[], int low, int high){
    Pair minmax = new Pair();
    Pair mml = new Pair();
    Pair mmr = new Pair();
    int mid;

    // If there is only 1 element
    if(low == high){
      minmax.min = arr[low];
      minmax.max = arr[low];
      return minmax;
    }

    //If there are 2 elements
    mid = (low + high)/2;
    mml = getMinMax(arr, low, mid);
    mmr = getMinMax(arr, mid+1, high);

    //Compair minimums of two parts
    if(mml.min < mmr.min){
      minmax.min = mml.min;
    }else{
      minmax.min = mmr.min;
    }

    //Compair maximum of two parts
    if(mml.max < mmr.max){
      minmax.max = mml.max;
    }else{
      minmax.max = mmr.max;
    }
    return minmax;
  }

  // Driver Code
  public static void main(String args[]){
    int arr[] = {1000, 11, 445, 1, 330, 3000};
    int n = arr.length;
    Pair minmax = getMinMax(arr, 0, n-1);
    System.out.print("Minimum number is" + minmax.min);
    System.out.println("Maximum number is" + minmax.max);
  }
}

// Approach 5: Maximum and Minimum of an array by compairing in pairs
// The ides is that when n is odd then initialize min and max as the first element.
// If n is even then initialize min and max as the minimum and maximum of the first two elements respectively.
// For the rest of the elements, pick them in pairs and compare their maximum and minimum with max and min respectively.
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.io.*;
import java.util.*;

public class GFG{
  static class Pair{
    int min;
    int max;
  }
  static Pair getMinMax(int arr[], int n){
    Pair minmax = new Pair();
    int i;

    if(n % 2 == 0){
      if(arr[0] > arr[1]){
        minmax.min = arr[1];
        minmax.max = arr[0];
      }else{
        minmax.min = arr[0];
        minmax.max = arr[1];
      }
      i = 2;
    }else{
      minmax.min = arr[0];
        minmax.max = arr[0];
       i = 1;
    }

    while(i < n-1){
      if(arr[i] > arr[i+1]){
        if(arr[i] > minmax.max){
          minmax.max = arr[i];
        }
         if(arr[i+1] > minmax.min){
          minmax.min = arr[i + 1];
        }
      }else{
        if(arr[i+1] > minmax.max){
          minmax.max = arr[i+1];
        }
         if(arr[i] > minmax.min){
          minmax.min = arr[i];
        }
      }
      i += 2;
    }
   return minmax;
  }

  // Driver Code
  public static void main(String args[]){
    int arr[] = {1000, 11, 445, 1, 330, 3000};
    int n = arr.length;
    Pair min = getMinMax(arr, n);
    System.out.print("Mininmum element is" + minmax.min);
    System.out.println("Maximum element is" + minmax.max);
  }
}

