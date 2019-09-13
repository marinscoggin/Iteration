//Iteration_Explore.java

/**
 * Lab that explores for loops.

 *
 * @author Roy Chancellor
 * @version 2/7/2019
 */
public class Iteration_Explore
{
    public static void main( String[] args) {
        int sumInt, square, factorial;
        
        System.out.println();  //blank line for separation in terminal
        System.out.println("i\tsumInt\tsquare i");  //table header
        
        sumInt = 0;
        for(int i = 100; i <= 1000; i = i + 25) {
            sumInt += i;
            square = i * i;
            System.out.println(i + "\t" + sumInt + "\t" + square);
        }  //end for
        
        //your for loop for the factorial will begin on the next line
        factorial = 1;
        for(int j = 1; j<= 10; j = j + 1) {
            factorial = factorial * j;
            System.out.println( j + "\t" +factorial );
        }
        
    } //end main
}   //end Iteration_Explore