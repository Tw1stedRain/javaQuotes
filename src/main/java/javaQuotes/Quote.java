package javaQuotes;

public class Quote {
    public String[] tags;
    public String author;
    public String likes;
    public String text;

    @Override
    public String toString() {
        String output = "";
        output += author + ": ";
        output += text;
        output += likes;
        return output;
    }
}
