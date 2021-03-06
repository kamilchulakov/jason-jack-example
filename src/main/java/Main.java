import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        printJSON();
        makeJSON();
        prettyPrint();
    }

    public static void printJSON() {
        try {
            // create book object
            Book book = new Book("Thinking in Java", "978-0131872486", 1998,
                    new String[]{"Bruce Eckel"});

            // convert book object to JSON
            String json = new ObjectMapper().writeValueAsString(book);

            // print JSON string
            System.out.println(json);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void makeJSON() {
        try {
            // create book object
            Book book = new Book("Thinking in Java", "978-0131872486", 1998,
                    new String[]{"Bruce Eckel"});

            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert book object to JSON file
            mapper.writeValue(Paths.get("book2.json").toFile(), book);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void prettyPrint() {
        try {
            // create book object
            Book book = new Book("Thinking in Java", "978-0131872486", 1998,
                    new String[]{"Bruce Eckel"});

            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // create an instance of DefaultPrettyPrinter
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

            // convert book object to JSON file
            writer.writeValue(Paths.get("book.json").toFile(), book);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void arrayToJSON() {

    }
    public static void jsonToArray() {

    }
}
