import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        int num;
        int [] numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));
        Scanner object= new Scanner(System.in);
        num=object.nextInt();

        //how to convert a string to int.
        for (int i =0; i < Arrays.toString(numbers);i++){
            if (num =!Arrays.toString(numbers)){
                System.out.println("out of bounds");

            }
            else{
                System.out.println("You number is corect");
            }
        }
    }
}