package User;

//package Caesar;

import com.csvreader.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class User {

    private Integer userid;
    private String username;
    private String name;
    private boolean isManger;
    private String pass;

    public User(Integer userid1, String username1, String name1 , boolean isManger1, String pass) {

        this.userid = userid1;
        this.username = username1;
        this.name = name1;
        this.isManger = isManger1;
        this.pass = pass;
    }

    public static void main (String[] args)
    {
        adduser();
    }


    public static String getStringFromUser(String printedtext)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print(printedtext);
        String username1 = scanner1.next();
        scanner1.close();
        return username1;
    }
    public static String adduser()
    {
        int userid1 = getMaxUserNo();
        System.out.println("User Id: "+userid1);


        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter User Name : ");
        String username1 = scanner.next();

        System.out.print("Enter Name : ");
        String name1 = scanner.next();

        System.out.print("If User Manger Press Y : ");
        String isManger1 = scanner.next();

        System.out.print("Enter the user Password : ");
        String pass = scanner.next();

        Caesar caesar = new Caesar();
        int caeserKey = userid1+5;

        String passSchfited = caesar.caesartext( pass , caeserKey);

        scanner.close();
        boolean n = true;
        if (IsUserNameExsit(username1) == true) {
            System.out.println("User Name already exsist");
            return null;
        }

        User user = new User(userid1 , username1 , name1 , n ,passSchfited);
        Addusertofile(user);
        return null;
    }

    public static boolean IsUserNameExsit(String checkuserName)
    {
        String currenname ;
        try {
            CsvReader  usrfile = new CsvReader("C:\\java/user.csv");
            usrfile.readHeaders();
            while (usrfile.readRecord())
            {
                currenname = usrfile.get("username");
                if (    currenname.equals(checkuserName) == true ) {
                    return true;
                }
            }
            usrfile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

            return false;
    }


    public static int getMaxUserNo()
    {
        int maxUserNo = 0;
        String current ="";
        try {
            CsvReader  usrfile = new CsvReader("C:\\java/user.csv");
            usrfile.readHeaders();
            while (usrfile.readRecord())
            {
                current = usrfile.get("userid");

                if (maxUserNo <   Integer.parseInt(current))
                    maxUserNo = Integer.parseInt(usrfile.get("userid"));
            }
            usrfile.close();

        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
        maxUserNo = maxUserNo + 1;
        return maxUserNo;
    }

    public String getUser() {
        return this.username;
    }


    public static void Addusertofile(User user)
    {
        String outputFile = "C:\\java/user.csv";
        boolean alreadyExists = new File(outputFile).exists();
       try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
        if (!alreadyExists)
        {
            csvOutput.write("userid");
            csvOutput.write("username");
            csvOutput.write("name");
            csvOutput.write("isManeger");
            csvOutput.write("pass");
            csvOutput.endRecord();
        }
        csvOutput.write(String.valueOf(user.userid));
        csvOutput.write(user.username);
        csvOutput.write(user.name);
        //if (user.isManeger == true)
        //    csvOutput.write("true");
        //else
        //    csvOutput.write("false");
        csvOutput.write("N");
        csvOutput.write(String.valueOf(user.pass));
        csvOutput.endRecord();

        csvOutput.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

     //ssh -keygen -t rsa -b 4069 -c "mhd.dahman@yahoo.com"
     //git remotr set -url origin
    }



    public static boolean checkUserPass(String userName,String Pass)
    {
        String tmpUser;
        String tmpPass;
        try {
            CsvReader  usrfile = new CsvReader("C:\\java/user.csv");
            usrfile.readHeaders();
            while (usrfile.readRecord())
            {
                tmpUser = usrfile.get("username");
                if (tmpUser.equals(userName) == true ) {
                    int userid1 = Integer.parseInt(usrfile.get("userid"));
                    tmpPass = usrfile.get("pass");
                    Caesar caesar = new Caesar();
                    int caeserKey = userid1+5;
                    String tmpPass1 = caesar.caesartext( Pass , caeserKey);
                    if (tmpPass1.equals(tmpPass) == true ) {
                        return true;
                    }
                }
            }
            usrfile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

