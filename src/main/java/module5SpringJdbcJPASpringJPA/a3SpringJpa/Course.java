package module5SpringJdbcJPASpringJPA.a3SpringJpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "course1")
public class Course {
    @Id
    private int id;

    @Column(name = "name") // if name does not match then we need to do rename usnig Column.
    private String fullName;
    private String author;

    public Course (){}

    public Course ( int id, String fullName, String author ) {
        this.id = id;
        this.fullName = fullName;
        this.author = author;
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getFullName ( ) {
        return fullName;
    }

    public void setFullName ( String fullName ) {
        this.fullName = fullName;
    }

    public String getAuthor ( ) {
        return author;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    @Override
    public String toString ( ) {
        return "Course [ id=" + id + ", fullName='" + fullName + "', author='" + author + "' ]";
    }
}
