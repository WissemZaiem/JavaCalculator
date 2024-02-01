import java.util.Scanner;
public class Example {
    public static void main(String[] args){
     Scanner myScanner = new Scanner (System.in);
     System.out.println("Enter the first number");
     int first_number = myScanner.nextInt();
     System.out.println("Enter the second number");
     int second_number = myScanner.nextInt();
     System.out.println("Enter the operation sign");
     char sign = myScanner.next().charAt(0);
     myScanner.close();
     String signString=Character.toString(sign);
     //Classic method
    /* if (signString.equals ("+")){
        System.out.println (first_number+signString+second_number+"="+(first_number+second_number));
    } else if (signString.equals ("*")) {
        System.out.println (first_number+signString+second_number+"="+(first_number*second_number));
    } else if (signString.equals ("-")) {
        System.out.println (first_number+signString+second_number+"="+(first_number-second_number));
    } else if (signString.equals ("/") && second_number==0) {
        System.out.println ("You can't divide on 0");
    } else if (signString.equals ("/") && second_number!=0) {
        System.out.println (first_number+signString+second_number+"="+(first_number/second_number));
    }*/
     //Switch case method
switch (signString){
    case ("+"):
        System.out.println (first_number+signString+second_number+"="+(first_number+second_number));
        break;
    case ("*"):
        System.out.println (first_number+signString+second_number+"="+(first_number*second_number));
        break;
    case ("-"):
        System.out.println (first_number+signString+second_number+"="+(first_number-second_number));
        break;
    case ("/"):
        if (second_number!=0) {
        System.out.println (first_number+signString+second_number+"="+(first_number/second_number));}
        else {
            System.out.println("You can't divide on 0");
        }
        break;
    default: System.out.println("Please enter a valid operation sign");
        break;
}
    }
}
