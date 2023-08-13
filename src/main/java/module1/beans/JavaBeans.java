package module1.beans;

import java.io.Serializable;

class JavaBeansClass implements Serializable { // 3. Implement serializable
    private String text;
    private int number;

    // 1. public no argument constructor
    public JavaBeansClass ( ) {
    }

    // 2. implement getter and setter for all variable
    public String getText ( ) {
        return text;
    }

    public void setText ( String text ) {
        this.text = text;
    }

    public int getNumber ( ) {
        return number;
    }

    public void setNumber ( int number ) {
        this.number = number;
    }

    public String toString ( ) {
        return "POJO[" + "text='" + text + "' :  number=" + number + ']';
    }
}

public class JavaBeans {
    public static void main ( String[] args ) {
        JavaBeansClass obj = new JavaBeansClass ( );
        System.out.println ( obj );
    }
}

