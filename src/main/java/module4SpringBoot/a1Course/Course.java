package module4SpringBoot.a1Course;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Course implements Serializable {
    private static final long serialVerUUID = 1L;
    private int id;
    private String topic;
    private String author;

    public Course ( int id, String topic, String author ) {
        this.id = id;
        this.topic = topic;
        this.author = author;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public void setTopic ( String topic ) {
        this.topic = topic;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    @Override
    public String toString ( ) {
        return "Course [ id=" + id + ", topic='" + topic + "', author='" + author + "' ]";
    }
}
