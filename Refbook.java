public class Refbook extends Book {
    private boolean checkoutable;
    public Refbook(String name, String deweynum, int copies, String fic, Boolean checkoutable){
        super(name, deweynum,copies,fic);
        this.checkoutable =  checkoutable;
    }

    public boolean isCheckoutable() {
        return checkoutable;
    }

    public void setCheckoutable(boolean checkoutable) {
        this.checkoutable = checkoutable;
    }
}