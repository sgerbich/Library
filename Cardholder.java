import java.util.ArrayList;

public class Cardholder {
    private String name;
    boolean checkedout, reserved;
    private ArrayList<Book> overduebooks;
    private ArrayList<Periodical> overdueper;
    public Cardholder(String name, boolean checkedout, boolean reserved){
        this.name = name;
        this.checkedout = checkedout;
        this.reserved = reserved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheckedout() {
        return checkedout;
    }

    public void setCheckedout(boolean checkedout) {
        this.checkedout = checkedout;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public ArrayList<Book> getOverduebooks() {
        return overduebooks;
    }

    public void setOverduebooks(ArrayList<Book> overduebooks) {
        this.overduebooks = overduebooks;
    }

    public ArrayList<Periodical> getOverdueper() {
        return overdueper;
    }

    public void setOverdueper(ArrayList<Periodical> overdueper) {
        this.overdueper = overdueper;
    }

}