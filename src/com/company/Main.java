package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scan.nextInt();
        String  grade="F" ;//I'm not hopeful

        if (score > 89){
            if((score%10)==0||(score%10)==1||(score%10)==2)
            {
                grade = "A"+"-";
            }else if((score%10)==3||(score%10)==4||(score%10)==5||(score%10)==6)
            {
                grade="A";
            }else if((score%10)==7||(score%10)==8||(score%10)==9 ){
                grade="A"+"+";
            }
        }
        else if (score > 79)
            grade = "B";
        else if (score > 69)
            grade = "C";
        else if (score >60 )
            grade="D";
        else
            grade = "F";
        System.out.println("The Grade is "+grade);

        if (score > 69)

            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");
    }
}
