package day09_NestedIf_Ternary;

public class loan_NestedIf {
    public static void main(String[] args) {
        double salary = 12000;
        byte workHistory = 3;

        if (salary >= 30000) {//might be qualified
            if (workHistory >= 2) {
                System.out.println("You are qualified");
            }else {
                System.out.println("You must have been on job at least 2 years");
            }
        } else {
            System.out.println("You must earn at least $30000");
        }

        //int salary2 = 33000;
        //int workHistory2 = 3;

       // String =(salary2 >= 30000 && workHistory2 >= 2) {

        }
    }
