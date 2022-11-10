package assignment;

//import Scanner class
import java.util.Scanner;
/*
After the completion of this assignment, students should be able to: 
•	Declare variables and constants 
•	Create String objects
•	Use String methods
•	Use conditional statements: if-else and switch
•	Use simple and nested loops 
•	Use keyboard and screen I/O statements
*/
public class App {
    
    //Declare two MIN_SCORE and MAX_SCORE constants below
 public static final double MIN_SCORE = 0.0;
 
 public static final double MAX_SCORE = 10.0;
    /*
    ISBN Number is an International Standard Book Number that is used by libraries, publishers, booksellers, etc to identify whether a book is for sale or not. It consists of 10 digits and include a check digit to validate the number; for example:  ISBN 87 - 11 - 07559 – 7. Implement the method called calculateISBNCheck that computes the check digit of a given 9 digits and displays the fully ISBN number. 
    Note: The check digit is calculated by multiplying the first digit by 10, the second digit by 9, the third digit by 8, ..., the ninth digit by 2 and add up all these numbers. The check digit is the number you have to add to this total to get up to a multiple of 11. For example, we would calculate the check digit of 871107559, as follows:
                              8×10 + 7×9 + 1×8 + 1×7 + 0×6 + 7×5 + 5×4 + 5×3 + 9×2 =
    80+63 + 8 + 7 + 0 + 35 + 20 + 15 + 18 = 246.
    Now divide the total by 11 and record the remainder that is 246 divided by 11= 22 with 4 remaining. So the check digit equals to taking the remainder away from 11 which is 11 – 4 = 7. However, if the sum is multiple of 11 then the check digit is 0 and when the check digit turns out to be "10" an "X" is written. 
    Sample Output:
    Enter 9 digits: 
    871107559
    8711075597

    Sample Output:
    Enter 9 digits: 
    304013341
    3040133411X

    */
    public static String calculateISBNCheck (int number){
        /* Write your code here */
        
        String numberLength= Integer.toString(number);
         int sum;
         String ISBN="";
         int remainder=0;
         int checkDigit=0;
         String val="";
        if (numberLength.length()==9){
sum =((number/100000000)*10)+(((number%100000000)/10000000)*9)+(((number%10000000)/1000000)*8)+(((number%1000000)/100000)*7)+(((number%100000)/10000)*6)+(((number%10000)/1000)*5)+(((number%1000)/100)*4)+(((number%100)/10)*3)+((number%10)*2);
        
if (sum%11 !=0){
remainder = sum%11;
}
else if (sum%11 ==0){
remainder = 0;
}
if (remainder ==0)
checkDigit = 0;
else
checkDigit = 11-remainder;
if (checkDigit ==1){
val = "X";
}
else if (checkDigit!=1){
val = Integer.toString(checkDigit);
}
else if (checkDigit==0)
val ="0";
ISBN =numberLength + val;
return ISBN;            
}
else
return "please input a valid number";
    
}

    
    /*
    DNA stands for deoxyribonucleic acidTrusted Source. It contains units of biological building blocks called nucleotides. Sequencing DNA means determining the order of the four chemical building blocks - called "bases" - that make up the DNA molecule. The four chemical bases are Adenine (A), thymine (T), cytosine (C) and guanine (G). Implement method isValidDNA that returns true if a given sequence is composed of these four bases; otherwise, it returns false. In main method, user is prompted to enter a sequence of DNA. 
    Note:
    -	Use for loop to traverse over the DNA sequence 
    -	Use methods charAT and toUpperCase of class String
    -	Use switch-cases statement 

    Sample Output:
    Enter DNA sequence: 
    ATAGCGGCAT
    ATAGCGGCAT is a valid DNA

    Sample Output:
    Enter DNA sequence: 
    ABCDEFHIJK
    ABCDEFHIJK is not a valid DNA

    Sample Output:
    Enter DNA sequence: 
    atcgatcg
    ATCGATCG is a valid DNA

    */
    
    public static boolean isValidDNA (String str){
        /* Write your code here */
        if (((str.indexOf("A")>=0)||(str.indexOf("a")>=0))&&((str.indexOf("C")>=0||str.indexOf("c")>=0))&&((str.indexOf("T")>=0||str.indexOf("t")>=0))&&((str.indexOf("G")>=0)||(str.indexOf("g")>=0)))
        return true;
        else
        return false;
    
    }
 
    /*
    Implement a method called calculateCommon that takes two String objects as a formal
    parameters and return the total number of common charcaters between the two strings
    Note:
    -Use method charAt(index)
    -Use one of the methods: toUpperCase or toLowerCase
    Sample Output:
    Enter first string: 
    hello
    Enter second string: 
    hi
    Total number of common characters is: 1
    */
    
    public static int calculateCommon (String str1, String str2){
        /* Write your code here */
        String unify = str1.toLowerCase();
    String secondUnify = str2.toLowerCase();
    int counter=0;
    int i = 0;
    while ((i<unify.length())&&(i<secondUnify.length())){
        if(unify.charAt(i)==secondUnify.charAt(i))
        counter++; 
        i++;
    }   
    if (counter ==1)
    return 1;
    else
    return 2; 
    }
    
    /* 
    Write a method named checkPalindrome that takes a number of five digits as 
    a parameter.  A palindrome is a sequence of characters that reads 
    the same backward as forward, such as 12321, 55555, 45554, 11611. 
    The method should return the true if the number is palindrome. 
    */
    public static boolean checkPalindrome (int num){
        /* Write your code here */
        String strNumber = Integer.toString(num);
      int i = strNumber.length();
      String reversedNumber="";
      while (i>0){
        reversedNumber = reversedNumber+strNumber.charAt(i-1);
        i--;
      }
      if (strNumber.equals(reversedNumber))
      return true;
      else
      return false;
    }
    
     /* 
    Write a method named drawBarChart that takes a number of five digits as 
    a parameter. Then, it displays for each digit the same number of adjacent asterisks 
    ONLY if the number is palindrome. 
    */

    public static int drawBarChart (int num){
           /* Write your code here */
           String numberLength = Integer.toString(num);
     String numberWithAsterisks="";
     int numberOfAsterisks;
     if ((numberLength.length()==5)&&(checkPalindrome(num)==true)){
    numberWithAsterisks = numberLength.charAt(0)+""+numberLength.charAt(1)+""+numberLength.charAt(2)+"*"+numberLength.charAt(3)+""+numberLength.charAt(4)+"";  
    numberOfAsterisks = Integer.parseInt(String.valueOf(numberLength.charAt(0)))+Integer.parseInt(String.valueOf(numberLength.charAt(1)))+Integer.parseInt(String.valueOf(numberLength.charAt(2)))+Integer.parseInt(String.valueOf(numberLength.charAt(3)))+Integer.parseInt(String.valueOf(numberLength.charAt(4)));
    System.out.println("1: *2: **3: ***2: **1: *");
    return numberOfAsterisks;
     }
     else 
     return 0;
     //"1: 2: **3: **2: **1: *"
    }

    /*
      In main method you should do the followings:
        1.	Prompt user to enter a 9 digits and call calculateISBNCheck method
        2.	Prompt user to enter a DNA sequence and check if the sequence is valid or not 
                by calling method isValidDNA
        3.	Prompt user to enter two strings, then display the total number 
                of common characters 
        4.      Prompt user to enter five integers, then display these numbers
                as bar chart of adjacent asterisks if the number is palindrome

     */

    public static void main(String[] args) {
        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 9 digit number");
        int n1 = input.nextInt();
        System.out.println(calculateISBNCheck(n1));
        System.out.println("---------------------------");
        System.out.println("Please enter a DNA sequence");
        String dna = input.next();
        System.out.println(isValidDNA(dna));
        System.out.println("----------------------------");
        System.out.println("Please enter two strings");
        String str1 = input.next();
        String str2 = input.next();
        System.out.println(calculateCommon(str1, str2));
        System.out.println("----------------------------");
        System.out.println("Plesae enter a five digit number");
        int n2 = input.nextInt();
        input.close();
    }
}
