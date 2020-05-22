public class Generalbook extends Book {
    
    public Generalbook(String name,Author author, String deweynum, int copies, String fic){
        super(name, author, deweynum,copies, fic);
        
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


    int lateCharge(){
        return 3;
    }

}