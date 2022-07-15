package Buket;

import java.util.Scanner;

public class lab16 {

    //import java.util.Scanner;

// Lab 16 - (String) Password Validation Task
//1. Write a return method that can verify if a password is valid or not.

//Requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters (@,#,$)
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false




        public int passwordValidation (String s){

            if (s.matches(".*[0-9]+.*")
                    && s.matches(".*[a-zA-Z]+.*")
                    && s.matches(".*[@#$]+.*")
                    && s.length() >= 6) {
                return 1;
            } else {
                return 0;
            }
        }

        public void main (String[]args){

            Scanner sc = new Scanner(System.in);
            String s;

            System.out.println("Please enter string to find sum of digits: ");
            s = sc.nextLine();
            int result = passwordValidation(s);
            if (result == 1)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }



