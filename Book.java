public class Book extends LibraryItem{
    private String fic;
    public Book(String name,Author author, String deweynum, int copies, String fic){
        super(name,author, deweynum,copies);
        this.fic = fic;
    }

    public String getFic() {
        return fic;
    }

    public void setFic(String fic) {
        this.fic = fic;
    }

}