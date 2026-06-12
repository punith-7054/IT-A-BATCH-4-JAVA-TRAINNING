import java.util.Scanner;
public class minimumelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minimum=arr[0];
        
        for (int i = 0; i < n; i++) {
            if(minimum > arr[i]){
                minimum=arr[i];
            }
            
        }

        System.out.println("Minimum element in array:"+minimum);
    }
    
}
