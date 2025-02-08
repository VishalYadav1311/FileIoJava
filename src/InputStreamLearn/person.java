package InputStreamLearn;

import java.io.Serializable;

public class person  implements Serializable {
    private static final long phone = 951885582 ;
    String name ;
    String lastname ;

    public person(String name , String lastname){
        this.name=name;
        this.lastname=lastname;
    }

    public String toString(){
        return "Person{name='" + name + "', lastname=" +  lastname + "}";
    }


}




