package prombleSolvingPdf;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers or enter 0 to exit");
        int secondLargestNumber = 0;
        int largestNumber = 0;
        int number = scanner.nextInt();
        while (number != 0) {
            if (number > largestNumber && number > secondLargestNumber) {
                largestNumber = number;
                    secondLargestNumber = number;
                }
            }
            System.out.println(secondLargestNumber);



        }


    }
