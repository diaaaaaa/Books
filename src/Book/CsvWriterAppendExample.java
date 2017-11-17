package Book;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriterAppendExample {

    public static void main(String[] args) {
        Book book = new Book();


        String outputFile = "C:\\java/Book.csv";

        // before we open the file check to see if it already exists
        boolean alreadyExists = new File(outputFile).exists();

        try {
            // use FileWriter constructor that specifies open for appending
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');

            // if the file didn't already exist then we need to write out the header line
            if (!alreadyExists)
            {
                csvOutput.write("book_id");
                csvOutput.write("book_name");
                csvOutput.write("book_author_name");
                csvOutput.write("book_category");
                csvOutput.write("book_language");
                csvOutput.write("book_ISBN");
                csvOutput.write("book_price");
                csvOutput.write("number_of_books");
                csvOutput.write("book_description");
                csvOutput.endRecord();
            }
            // else assume that the file already has the correct header line

            // write out a few records
            if (isNotExist(book.book_id))
            {
                csvOutput.write(String.valueOf(book.book_id));
                csvOutput.write(book.book_name);
                csvOutput.write(book.book_author_name);
                csvOutput.write(book.book_category);
                csvOutput.write(book.book_language);
                csvOutput.write(String.valueOf(book.book_ISBN));
                csvOutput.write(String.valueOf(book.book_price));
                csvOutput.write(String.valueOf(book.number_of_books));
                csvOutput.write(book.book_description);
                csvOutput.endRecord();

                csvOutput.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static boolean isNotExist(String book_id) {
        CsvReader boook = new CsvReader("C:\\java/Book.csv");
        while (boook )
        {

        }
    }
}
