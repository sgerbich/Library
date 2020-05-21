public class Cardholder {
    private String name, checkedout, reserved;
    public Cardholder(String name, String checkedout, String reserved){
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

    public String getCheckedout() {
        return checkedout;
    }

    public void setCheckedout(String checkedout) {
        this.checkedout = checkedout;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }
}