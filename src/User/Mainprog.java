package User;

import java.util.Scanner;

public class Mainprog {


    public static void main (String[] args)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter User Name : ");
        String username1 = scanner.next();
        if (User.IsUserNameExsit(username1))
        {
            System.out.print("Enter User Password : ");
            String pass = scanner.next();
            if (User.checkUserPass( username1 , pass ) == true)
            {
                getMainMenu();
            }
            else
            {
                System.out.print("the Password is not Correct....!");
                System.exit(0);
            }

        }
        else
        {
            System.out.print("User not Exsist....?");
            System.exit(0);
        }



        getMainMenu();
    }

    public static void  getMainMenu()
    {

        Scanner scanner;
        int fun = 0;
        do {
            printMainMenu();
            scanner = new Scanner(System.in);
            fun = scanner.nextInt();
            if (fun == 3)
                searchMenu();
            if (fun == 9)
                System.exit(0);
            if (fun == 7) {
                User.adduser();
            }
            if (fun == 6) {
                printSubMenu();
            }
        }
        while  ((fun <= 0) || (fun>8)) ;
        scanner.close();

    }

    public static void  printMainMenu()
    {
        System.out.println("1.Add Book");
        System.out.println("2.Sells Book");
        System.out.println("3.Search Book");
        System.out.println("4.Delete Book");
        System.out.println("5.Update  Books Price");
        System.out.println("6.Reports");
        System.out.println("7.Add User");
        System.out.println("8.Give user Permission");
        System.out.println("9.Exit");
        System.out.println("Please enter the function number you want to execute ");
    }

    public static void  printSubMenu()
    {

        System.out.println("1.How many Books had sold in day");
        System.out.println("2.How much money had earned in day ");
        System.out.println("3.which the most of books sold");
        System.out.println("4.inventory");
        System.out.println("5.show book going to finish");
        System.out.println("6.exit");
    }

    public static void  searchMenu()
    {
        System.out.println("1.By Name");
        System.out.println("2.By Writer");
        System.out.println("3.By price");
        System.out.println("4.Language");
        System.out.println("5.By Gategory");
        System.out.println("6.exit");
    }


}
