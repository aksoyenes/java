package Lablar;

public class Document {
    private String authors[];
    private String Date;

    public String[] getAuthors() {
        return authors;
    }
    public void addAuthor(String name){

    }

    public String getDate() {
        return Date;
    }
}
class Book extends Document{
    private String title;

    public String getTitle() {
        return title;
    }
}
class EMail extends Document{
    private String Subject;
    private String to [];

    public String getSubject() {
        return Subject;
    }

    public String[] getTo() {
        return to;
    }
}
