/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wboyer
 */
public class Ch2Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        short ageStudent1 = 22;
        short ageStudent2 = 19;
        short ageStudent3 = 34;
        double balance = 22345.23;
        double average;
        int score1 = 84;		
        int score2 = 98;
        int score3 = 72;		
        int score4 = 69;
        String withdrawal = "515.53";
//        //#1
//        System.out.println("Student is " + ageStudent1 + " years old.");
//        
//        //#2
//        score1 = score4 - score1 * ageStudent1;
//        System.out.println(score1);
//        
//        //3
//        score1 = score1 % ageStudent1;
//        System.out.println(score1);
//        
//        //#4
//        score1 = score1 / ageStudent1; //*Changed 'withdrawal' to 'score1'.
//        System.out.println(score1);
//        
//        //#5
//        score2 = score1++ + score2;
//        System.out.println(score1 + " " + score2);
//        
//        //#6
//        average = (double)(score1 + score2 + score3 + score4) / 4;
//        System.out.println(average);
//        
//        //#7
//        average = (double)(ageStudent1 + ageStudent2 + ageStudent3) / 3;
//        System.out.println(average);
//        
//        //#8
//        System.out.println("New balance is: " + (balance - Double.parseDouble(withdrawal)));
//        
//        //#9
//        System.out.println(ageStudent1++);
//        
//        //#10
//        System.out.println(balance + 5);
//        
//        //#11
//        System.out.println(score1 / 3);
//        
//        //#12
//        System.out.println((short)(score1 / 3));
//        
//        //#13
//        System.out.println(score1 % 3);
//        
//        //#14
//        System.out.println((byte)(score1 + 5));
        
        //#15
        boolean repeat = true;
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> scores =  new ArrayList<>();
        scores.add(84);
        scores.add(98);
        scores.add(72);
        scores.add(69);
        
        while (repeat == true){
            System.out.print("Enter another score: ");
            scores.add(Integer.parseInt(kb.nextLine()));
            
            System.out.print("\nDo you want to enter another score (y/n)? ");
            if (kb.nextLine().toLowerCase().equals("n")){
                repeat = false;
            }
        }
        int sum = 0;
        sum = scores.stream().map((score) -> score).reduce(sum, Integer::sum);
        System.out.println( (double)sum / scores.size() );
    }
    
}
