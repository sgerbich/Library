class LibraryItem {
    private String name, deweynum;
    private int copies;

    public LibraryItem(String name, String deweynum, int copies){
        this.name = name;
        this.deweynum = deweynum;
        this.copies = copies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeweynum() {
        return deweynum;
    }

    public void setDeweynum(String deweynum) {
        this.deweynum = deweynum;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}