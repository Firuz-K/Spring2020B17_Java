package day00_Re_Studying.Ternary;

//import java.util.Scanner;

public class Ternary_Practice21 {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        //System.out.println("");
        char ch1 = 'A';
        String result = (ch1 == 'A') ? "A is selected" :
                        (ch1 == 'B') ? "B is selected" :
                        (ch1 == 'C') ? "C is selected" :
                        (ch1 == 'D') ? "D is selected" :
                        (ch1 == 'D') ? "D is selected" :
                        "Invalid character";
        System.out.println(ch1);
    }
}



        /*
        switch (ch1){
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                 System.out.println('B');
                 break;
            case 'C':
                System.out.println('C');
                break;
            default:
                System.out.println("Something wrong!");
        }
    }

}
/*
Create a new switch statement using char instead of int.
Create a new char variable
Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found and then break
Add a default which displays a message saying not found.
 */