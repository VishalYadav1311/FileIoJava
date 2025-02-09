import java.io.File;

public class FileFunctions {
    public static void main(String[] args) throws Exception {

        //creating a file
        File file = new File("C:/Users/vishal yadav/Desktop/vn/demoFile.txt");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());

        if (!file.exists()) {
            System.out.println("file does not exist");
            file.createNewFile();
        }
        System.out.println(file.getName());

// creating a directory (use mkdirs for creating multiple directories)
        File file2 = new File("C:/Users/vishal yadav/Desktop/vn/testDirectory");

        try {
            if (file2.mkdir()) {
                System.out.println(file.getAbsolutePath());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

       String parent = file.getParent();
        System.out.println(parent);
    }
}