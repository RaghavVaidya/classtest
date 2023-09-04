import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String username="meronaam";
        String password="meropw";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username");
        String your_username=sc.next();
        System.out.println("Enter your password");
        String your_password=sc.next();
        if(your_username.equals(username) && your_password.equals(password)){
            System.out.println("Choose what you wanna do:");
            System.out.println("1.Greatest number amongst 3 numbers");
            System.out.println("2.Calculator");
            System.out.println("3.Result calculator with 3 grades");
            System.out.println("4.Guessing game");
            int choose=sc.nextInt();
            if(choose>=1 && choose<=4){
                if(choose==1){
                    System.out.println("Welcome, we will find the greatest amongst three different numbers");
                    System.out.println("Enter the first number");
                    int a=sc.nextInt();
                    System.out.println("Enter the second number");
                    int b=sc.nextInt();
                    System.out.println("Enter the third number");
                    int c=sc.nextInt();
                    if (a != b && b != c && c != a) {

                        if (a > b && a > c) {
                            System.out.println(a + " is the greatest");
                        } else if (b > a && b > c) {
                            System.out.println(b + " is the greatest");
                        } else if (c > a && c > b) {
                            System.out.println(c + " is the greatest");
                        }
                    } else if (a == b && b == c) {
                        System.out.println("every number is equal");
                    } else if (a == b && c > a) {
                        System.out.println(c + " is greater while" + a + " and " + b + " are equal");
                    } else if (c == b && a > b) {
                        System.out.println(a + " is greater while" + b + " and " + c + " are equal");
                    } else if (a == c && b > a) {
                        System.out.println(b + " is greater while" + a + " and " + c + " are equal");
                    }

                } else if (choose==2) {
                    System.out.println("Welcome, use the calculator.");
                    System.out.println("Enter the first number");
                    double first_no=sc.nextDouble();
                    System.out.println("Enter the operator");
                    String operator=sc.next();
                    System.out.println("Enter the second number");
                    double sec_no=sc.nextDouble();
                    switch (operator){
                        case "+":
                            System.out.println(first_no+"+"+sec_no);
                            System.out.println(first_no+sec_no);
                            break;
                        case "-":
                            System.out.println(first_no+"-"+sec_no);
                            System.out.println(first_no-sec_no);
                            break;
                        case "*":
                            System.out.println(first_no+"*"+sec_no);
                            System.out.println(first_no*sec_no);
                            break;
                        case "/":
                            System.out.println(first_no+"/"+sec_no);
                            System.out.println(first_no/sec_no);
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }

                } else if (choose==3) {

                    System.out.println("Welcome to result calculator");
                    System.out.println("Enter the marks of physics");
                    double phy=sc.nextDouble();
                    System.out.println("Enter the marks of chemistry");
                    double che=sc.nextDouble();
                    System.out.println("Enter the marks of maths");
                    double math=sc.nextDouble();
                    if(phy>=0 && phy<=100 && che>=0 && che<=100 && math>=0 && math<=100){
                        double avg=(phy+che+math)/3;
                        if(avg>=90 && avg<=100){
                            System.out.println("A+");
                        } else if (avg>=80 && avg<90) {
                            System.out.println("A");
                        } else if (avg>=70 && avg<80) {
                            System.out.println("B+");
                        } else if (avg>=60 && avg<70) {
                            System.out.println("B");
                        } else if (avg>=50 && avg<60) {
                            System.out.println("C+");
                        } else if (avg>=40 && avg<50) {
                            System.out.println("C");
                        } else if (avg>=35 && avg<40) {
                            System.out.println("D");
                        } else if (avg>=0 && avg<35) {
                            System.out.println("NG");
                        }
                    }else{
                        System.out.println("Invalid input");
                    }

                } else if (choose==4) {
                    System.out.println("Welcome to guessing game");
                    Random random=new Random();
                    int lowerBound = 1;
                    int upperBound = 100;
                    int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                    System.out.println("Choose a number between 1 and 100");
                    int num=sc.nextInt();
                    if(num>=1 && num<=100){
                        if(num>secretNumber){
                            System.out.println("Your guess was high");
                        } else if (num==secretNumber) {
                            System.out.println("Congrats! You guessed it.");
                        } else if (num<secretNumber) {
                            System.out.println("Your guess was low");
                        }
                    }
                    else{
                        System.out.println("Invalid input");
                    }

                }
            }else{
                System.out.println("Invalid input");
            }

        }else{
            System.out.println("Invalid input");
        }
    }
}
