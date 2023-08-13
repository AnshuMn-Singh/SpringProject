package module1.beans;

class POJO{
    private String text;
    private int number;

    public String toString ( ) {
        return "POJO[" + "text='" + text + "' :  number=" + number +  ']';
    }
}

public class POJOBeans {
    public static void main ( String[] args ) {
        POJO obj = new POJO ();
        System.out.println (obj );
    }
}
