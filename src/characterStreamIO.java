import java.io.IOException;
import java.io.PipedReader;
import java.io.Reader;

public class characterStreamIO {
    public static void main(String[] args) {

        // primary classes of character streams are Reader and Writer
        // Reader is abstract class and subclasses are FileReader and BufferedReader and StringReader
        // Writer is abstract class and subclasses are FileWriter and BufferedWriter and StringWriter
        // these classes are used to read/write characters and array of characters

        Reader reader = new PipedReader();


    }
}



// this below code is demonstration of how to create anonymous class for Reader as Reader is abstract class
// we need to provide implementation of read() and close() methods

//Reader read = new Reader() {
//    @Override
//    public int read(char[] cbuf, int off, int len) throws IOException {
//        return 0;
//    }
//
//    @Override
//    public void close() throws IOException {
//
//    }
//}
