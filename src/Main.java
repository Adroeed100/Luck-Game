import java.util.Random;
import java.util.Scanner;

class LuckGame {
    public static void main(String[] args) {

        char[] arr = {'#','$','*'};
        char[] arr1 = new char[3];

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter your bet : ");
        int betamount = s.nextInt();

        int i,value;
        for(i = 0 ; i < 3 ; i++){
            value = r.nextInt(3);
            System.out.print(arr[value] + "\t");
            arr1[i] = arr[value];
        }

        if(arr1[0] == arr1[1] && arr1[1] == arr1[2])
        {
            System.out.println("\nYou Won Triple");
            System.out.println("Current Amount : " + betamount * 3);
        }
        else if(arr1[0] == arr1[1] || arr1[1] == arr1[2] || arr1[0] == arr1[2])
        {
            System.out.println("\nYou Won Double");
            System.out.println("Current Amount : " + betamount * 2);
        }
        else
        {
            System.out.println("\nYou Lost");
            System.out.println("Current Amount : " + betamount * 0);
        }

        s.close();
    }
}