        import java.util.Scanner;

        public class PrimeNumber {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int sum=0;
                char ch;
                do{
                    System.out.println("Enter value of num1");
                          int num1 = sc.nextInt();
                    System.out.println("Enter value of num2");
                         int num2 = sc.nextInt();
                         sum= num2+num1;
                    System.out.println(sum);
                    System.out.println("Do u want to continue, press y");
                         ch = sc.next().charAt(0);
                }while(ch=='y' || ch =='Y');

                System.out.println("Thank you");


            }
        }