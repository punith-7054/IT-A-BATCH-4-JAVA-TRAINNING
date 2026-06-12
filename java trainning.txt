//1. Adjacent stick problem
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i += 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += Math.min(a, b);
        }

        System.out.println(sum);
        sc.close();
    }
}

//2. Fuel Consumption problem
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the no of liters to fill the tank");
      double liters = sc.nextDouble();

      if (liters <= 0) {
          System.out.println((int)liters + " is an Invalid Input");
          return;
      }

      System.out.println("Enter the distance covered");
      double distance = sc.nextDouble();

      if (distance <= 0) {
          System.out.println((int)distance + " is an Invalid Input");
          return;
      }

      double litersPer100Km = (liters / distance) * 100;

      double miles = distance * 0.6214;
      double gallons = liters * 0.2642;
      double milesPerGallon = miles / gallons;

      System.out.printf("Liters/100KM\n%.2f\n", litersPer100Km);
      System.out.printf("Miles/gallons\n%.2f", milesPerGallon);

      sc.close();
  }
}
// 3.sandglass pattern
public class Main {
    public static void main(String[] args) {
        int n = 5; 

    
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//4.butterfly pattern 
public class Main {
    public static void main(String[] args) {
        int n = 4; 

        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) System.out.print("*");
            
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) System.out.print("*");
            
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
//5 problem 24
import java.util.Scanner;

public class Main {

    static void dfs(int[][] a, int i, int j, int m, int n) {

        if (i < 0 || j < 0 || i >= m || j >= n || a[i][j] == 0)
            return;

        a[i][j] = 0;

        dfs(a, i + 1, j, m, n);
        dfs(a, i - 1, j, m, n);
        dfs(a, i, j + 1, m, n);
        dfs(a, i, j - 1, m, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (a[i][j] == 1) {
                    count++;
                    dfs(a, i, j, m, n);
                }
            }
        }
        System.out.println(count);
    }
}
// 6.edcba pattern
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }

        sc.close();
    }
}
// 7. Empty subarray problem
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
            sum = sum + arr[j];
                if (sum == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
