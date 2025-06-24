import java.util.*;
public class even_odd_sum {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();

        int []array = new int[count];
        System.out.println("Enter the numbers: ");
        int even_sum =0;
         int odd_sum =0;

        for(int i=0;i<count;i++){
            array[i] = sc.nextInt();
            if(array[i]%2==0){
                even_sum+=array[i];
            }
            else{
                odd_sum+=array[i];
            }
        }
        System.out.println("even number sum is: "+even_sum);
        System.out.println("odd number sum is: "+odd_sum);
    }

    }



