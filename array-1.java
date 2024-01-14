import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*
		Default values of any array element is 0.
		If you don't initialise or assign a value to A[i] it is going to be 0
		*/

        /*
		Q1: find the sum of all the array values
		*/
        int a;
        a = 100;

        int array[];

        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int sum = 0;
         for(int i=0; i<N; i++){
            sum += A[i];
         }
         System.out.println("Current sum is : " + sum);

         /*
		Q2: Given an array. Find the maximum values stored in it
		A : [3, 5, 1, 10, 9, 6, 8, 23, 12, 14, 45, 100, 12, 13, 14, 15, 116, 17, 18 ,19, 19, 29, 24, 25, 26, 65]
		Amax : 10
		*/
        System.out.println();

        int max = A[0];
        for(int i = 0; i < N; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.println("Maximum of the Array is "+max);

        /*
		Q3: Given an array. Print the minimum value in the array. 
		*/

        int min = A[0];
        for(int i = 0; i < N; i++){
            if(A[i] < min){
                min = A[i];
            }
        }
         System.out.println("Minimum of the Array is "+min);
    }
}