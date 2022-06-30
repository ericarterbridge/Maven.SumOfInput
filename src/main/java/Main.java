

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner getNum = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = getNum.nextInt();
        int sum = 0;
            for (int i = n; i >= 0; i--) {
                sum += i;
                //System.out.println("The sum is: "+sum);
            }
            System.out.println("The sum is: " + sum);

        }
    }

