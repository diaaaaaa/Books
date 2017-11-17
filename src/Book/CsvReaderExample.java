package Book;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CsvReaderExample {

    public static void main(String[] args) {
        try {

            CsvReader boook = new CsvReader("C:\\java/Book.csv");
            
            boook.readHeaders();

            while (boook.readRecord())
            {
                String productID = boook.get("book_id");
                String productName = boook.get("book_name");
                String supplierID = boook.get("book_author_name");
                String categoryID = boook.get("book_category");
                String quantityPerUnit = boook.get("book_language");
                String unitPrice = boook.get("book_ISBN");
                String unitsInStock = boook.get("book_price");
                String unitsOnOrder = boook.get("number_of_books");
                String reorderLevel = boook.get("book_description");


                // perform program logic here
                System.out.println(productID + ":" + productName +":" + supplierID +":" + categoryID +":" + quantityPerUnit +":"
                                + unitPrice +":" + unitsInStock +":" + unitsOnOrder +":" + reorderLevel );
            }

            boook.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}