import java.util.*;

public class PrintDuplicateCharacter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int []arr = new int[256];
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            arr[ch]++;
        }
        int m = arr.length;
        System.out.println("Duplicate characters in string are : ");
        for(int i = 0;i<m;i++){
            if(arr[i]>1){
                System.out.println((char)i + ": "+arr[i]);
            }
        }
    }
    
}
