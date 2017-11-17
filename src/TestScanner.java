import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TestScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\java/Book.csv"));
        scanner.useDelimiter(",");
        System.out.println("-----------------------------------------------");
        System.out.println("ID ----- Name ----- ISBN ----- AUTH ----- PRICE");
        while(scanner.hasNext()){

            System.out.print(scanner.next()+" ----- ");

        }
        System.out.println("------------------------------------------------");
        scanner.close();
    }


}