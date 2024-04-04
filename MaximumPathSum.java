import java.util.*;

class MaximumPathSum { 
    int max(int x, int y) { 
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    int solve(int ar1[], int ar2[], int m, int n) { 
        int i = 0, j = 0; 
        int ans = 0, sum1 = 0, sum2 = 0; 

        while (i < m && j < n) { 
            if (ar1[i] < ar2[j]) 
                sum1 += ar1[i++]; 
            else if (ar1[i] > ar2[j]) 
                sum2 += ar2[j++]; 
            else { 
                ans += max(sum1, sum2) + ar1[i]; 
                sum1 = 0; 
                sum2 = 0; 
                i++; 
                j++; 
            } 
        } 

        while (i < m) 
            sum1 += ar1[i++]; 

        while (j < n) 
            sum2 += ar2[j++]; 

        ans += max(sum1, sum2); 

        return ans; 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        MaximumPathSum sumpath = new MaximumPathSum(); 

        System.out.println("Enter the size of array 1:");
        int m = sc.nextInt();
        int ar1[] = new int[m];
        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < m; i++) 
            ar1[i] = sc.nextInt();

        System.out.println("Enter the size of array 2:");
        int n = sc.nextInt();
        int ar2[] = new int[n];
        System.out.println("Enter the elements of array 2:");
        for (int i = 0; i < n; i++) 
            ar2[i] = sc.nextInt();

        System.out.println("Maximum sum path is :" + sumpath.solve(ar1, ar2, m, n)); 
    } 
}
