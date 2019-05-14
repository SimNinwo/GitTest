
public class Book { //create class book
    
    private int noOfPages; // attribute number of pages
    private String author; // attribute author
    private String genre; // attribute genre of book
    private String coverType; // attribute type of bookcover

    public void setNoOfPages(int noOfPages) { // setter for attribute number of pages
        this.noOfPages = noOfPages;
    }
    public int getNoOfPages() { // getter for attribute number of pages
        return noOfPages;
    }
    public void setAuthor(String author) { // setter for attribute author
        this.author = author;
    }
    public String getAuthor() { // getter for attribute author
        return author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
} // end class Book