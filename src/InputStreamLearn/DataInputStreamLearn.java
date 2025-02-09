package InputStreamLearn;

//NOTE : If you wrote two ints first, you must read them back in the same order.
//Total bytes written: 4 + 4 + 8 + 1 + (UTF length)
//When reading, you must read in the exact same order.
//The failure in reading is likely due to not maintaining the correct order of reading when retrieving data from the file.

import java.io.*;

public class DataInputStreamLearn {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeInt(42);
            dos.writeInt(423);
            dos.writeDouble(99.99);
            dos.writeBoolean(true);
            dos.writeUTF("Hello, World!");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            int num = dis.readInt();
            int num2 = dis.readInt();
            double price = dis.readDouble();
            boolean status = dis.readBoolean();
            String text = dis.readUTF();

            System.out.println("Integer: " + num);
            System.out.println("Integer: " + num2);
            System.out.println("Double: " + price);
            System.out.println("Boolean: " + status);
            System.out.println("String: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



