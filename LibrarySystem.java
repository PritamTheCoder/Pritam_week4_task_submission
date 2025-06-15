// Library Management System

class LibraryItem {
    public String title;
    public String author;
    protected int id;

    public LibraryItem(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public void getInfo(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ID : " + id);
    }
}

class Book extends LibraryItem{
    String genre;
    public Book(String title, String author, int id, String genre){
        super(title,author,id);
        this.genre = genre;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Type   : Book");
        System.out.println("Genre : " + genre);
    }
}

class Magazine extends LibraryItem{
    private String issueNumber;
    public Magazine(String title, String author, int id, String issueNumber){
        super(title,author,id);
        this.issueNumber = issueNumber;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Type    : Magazine");
        System.out.println("Issue Number : " + issueNumber);
    }
}

class Newspaper extends LibraryItem{
     private String publicationFrequency;

    public Newspaper(String title, String author, int id, String publicationFrequency) {
        super(title, author, id);
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Type    : Newspaper");
        System.out.println("Publication Frequency: " + publicationFrequency);
    }
}

public class LibrarySystem {
    public static void main(String[] args){
        LibraryItem[] catalog = new LibraryItem[3];

        catalog[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 101, "Novels");
        catalog[1] = new Magazine("National Geographic", "NatGeo Editors", 202, "Vol. 78, No. 5");
        catalog[2] = new Newspaper("The New York Times", "NYT Staff", 303, "Daily");

         System.out.println("=== Library Catalog ===\n");

        for (LibraryItem i : catalog) {
            i.getInfo();
            System.out.println("-----------------------");
    }
}
}