package InputStreamLearn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamLearn {

    public static void deserialzeObject(){
        try(ObjectInputStream ois =new ObjectInputStream(new FileInputStream("demo1.dat"))) {
            person p1=  (person) ois.readObject();
            System.out.println(p1);
            System.out.println("Desrialized successfully");

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }

    public static void serialzeObject(){

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo1.dat"))){
            person p =new person("Vishal", "Yadav");
            oos.writeObject(p);
            System.out.println("serialized successfully");

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        ObjectInputStream in Java
//        ObjectInputStream is used to read objects from a file or stream. It is typically used in Java Serialization,
//        where objects are converted into a byte stream and later reconstructed.


        // its useful in serialization of objects for which class must have to implement serializable interface

        // code for serialization of object (writing object into file )
        ObjectStreamLearn.serialzeObject();

        // code for deserialization of object
        ObjectStreamLearn.deserialzeObject();


    }
}


