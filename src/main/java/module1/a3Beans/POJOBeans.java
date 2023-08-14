package module1.a3Beans;

class POJO{
    private String text;
    private int number;

    public String toString ( ) {
        return "text='" + text + "' :  number=" + number;
    }
}

public class POJOBeans {
    public static void main ( String[] args ) {
        POJO obj = new POJO ();
        System.out.println (obj );
    }
}
