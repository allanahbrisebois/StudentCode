
package Class1;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a word:");
       String input = sc.nextLine();
       
       
       char[] reverse = new char[input.length()];
      
       for(int i= 0; i<input.length(); i++){
           reverse[i]=input.charAt(i);
       }
       
       
       System.out.println("Word: " + input);
       System.out.print("Reverse: ");
       
       for(int i=input.length()-1; i>=0; i--){
           System.out.print(reverse[i]);
       }
       
       System.out.println(" ");
   } 
}
