import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class LogEntry implements Serializable {
    private String Message;
    private String Author;
    private Date Date;
    private ArrayList<LogEntry> History;

    public LogEntry(String message, String author) {
        this.Message = message;
        this.Author = author;
        Date = new Date();
    }

    public String getMessage() {
        return Message;
    }

    public String getAuthor() {
        return Author;
    }

    public java.util.Date getDate() {
        return Date;
    }


}
