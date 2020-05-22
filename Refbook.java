public class Refbook extends Book {
    // private boolean checkoutable;
    public Refbook(String name,Author author, String deweynum, int copies, String fic){
        super(name, author, deweynum,copies,fic);
        
    }
    boolean isReservable(){
        return false;
    }
    
}