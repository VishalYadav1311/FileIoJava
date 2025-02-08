package InputStreamLearn;

import java.io.ByteArrayInputStream;

//ByteArrayInputStream is a subclass of InputStream that allows reading data from a byte array as an input stream.
// It is useful when you want to read data from memory instead of a file or network stream.
//
//        Method	                Description
//        int read()	            Reads a single byte and returns it.
//        int read(byte[] b)	    Reads multiple bytes into an array.
//        void mark(int readlimit)	Marks the current position.
//        void reset()	            Resets to the last marked position.
//        int available()	        Returns the number of bytes left to read.
//        void close()	            Has no effect (stream is memory-based).


public class ByteArrayInputStreamLearn {
    public static void main(String[] args) {

        byte[] data = "Hello, how's you doing ?!".getBytes();
        ByteArrayInputStream st = new ByteArrayInputStream(data);
        int content;
        if((content = st.read()) != -1){
            System.out.println((char) content);
        }
        for(byte d : data){
            System.out.print((char)d);
        }


    }
}
