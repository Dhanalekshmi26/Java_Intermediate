import java.util.*;
public class maximum_element_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();

        int []array = new int[count];
        System.out.println("Enter the numbers: ");
        int max = array[0];
        for(int i =0;i<count;i++){
            array[i] = sc.nextInt();
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Maximum number in the array: "+max);

    }
}
