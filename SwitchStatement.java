/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;

/**
 *
 * @author neph0
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char grade = args [0].charAt(0);
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent result!!");
                break;
            case 'B':
                System.out.println("Fair");
                break;
            case 'c':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Try again");
                break;
            default:
                System.out.println("You entered an invalid grade");

        }
        System.out.println("Your grade is " + grade);
    }

}
