package workcount;

public class Wordcount
{
    // fields
    private String words;

    // constructor
    public Words(String words)
    {
        this.words = words;
    }

    // getters and setters
    public String getWords()
    {
        return words;
    }

    public void setWords(String words)
    {
        this.words = words;
    }

    // override - toString
    @Override
    public String toString()
    {
        return "Words{" +
                "words='" + words + 
                '}';
    }
}