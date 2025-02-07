import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
    File file;
    File file2;
    private void createFiles() throws IOException {
          file = new File("source.txt");
        file.createNewFile();
          file2 = new File("target.txt");
        file2.createNewFile();
    }
    private void readSingleByteData(FileInputStream fis)throws  IOException{

        int data = fis.read(); // data contains the BYTE read
        System.out.println((char) data);
    }

    private void readDataChunks(FileInputStream fis)throws  IOException{

        long filesize = file.length();
//        Path path = Paths.get("source.txt");    //nio method of getting size of files used for often large files.
//        Long size = Files.size(path);
        byte[] buffer = new byte[(int) filesize];

        fis.read(buffer);
        for (byte content : buffer ){
            System.out.print((char)content); // printing the read data on console
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            // creating files source and target
            FileCopy instance = new FileCopy();
            instance.createFiles();


            //setting up input and output streams for files read and write operation
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("target.txt", true); // on true it appends data to existing otherwise already written data will be erased

            //reading data from source file
            instance.readSingleByteData(fis);
            instance.readDataChunks(fis);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
//git remote set-url origin https://github.com/your-username/your-repo.git
