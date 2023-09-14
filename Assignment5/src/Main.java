import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String names[] = new String[5];
        int stop= 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("enter the position of Student :");
            int i = in.nextInt();

           try{ System.out.println("Enter th ename of student :");
               in.nextLine();
               names[i] = in.nextLine();
           }
           catch (ArrayIndexOutOfBoundsException e){
               System.out.println("-----Array Index out of Bound \n " +
                       "your name isn't stored------");
           }

            System.out.println("to continue enter 0 otherwise press any key");
            stop = in.nextInt();
        }while(stop == 0);

        for (int i = 0; i < names.length; i++) {
            System.out.println(i+names[i]);
        }

    }
}