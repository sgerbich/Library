public class Periodical  extends LibraryItem{
    private int edition;
    public Periodical(String name, String deweynum, int copies, String fic, int edition){
        super(name, deweynum,copies);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}