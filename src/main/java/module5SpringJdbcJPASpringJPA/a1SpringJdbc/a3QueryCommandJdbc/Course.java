package module5SpringJdbcJPASpringJPA.a1SpringJdbc.a3QueryCommandJdbc;

//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
//public class Course implements Serializable {
//    private static final long serialVerUUID = 1L;


public class Course {
    private int id;
    private String name;
    private String author;

    public Course(){}

    public Course ( int id, String name, String author ) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setTopic ( String name ) {
        this.name = name;
    }

    public String getAuthor ( ) {
        return author;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    @Override
    public String toString ( ) {
        return "id=" + id + ", name='" + name + ", author='" + author;
    }
}
