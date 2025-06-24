import java.util.*;
public class sum_elements_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();

        int []array = new int[count];
        System.out.println("Enter the numbers: ");
        int sum =0;
        for(int i=0;i<count;i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("sum of the array is: "+sum);
    }

    }

