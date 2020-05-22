public class Periodical  extends LibraryItem{
    private int edition;
    public Periodical(String name,Author author, String deweynum, int copies, String fic, int edition){
        super(name,author, deweynum,copies);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    boolean isReservable(){
        return true;
    }

    void loan(){
        if(this.isReservable()){
            setCopies(getCopies()-1);
        }else{
            System.out.print("cant loan this bro");
        }
    }

    void returnBook(){
        setCopies(getCopies()+1);
    }
}