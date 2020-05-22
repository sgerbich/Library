class LibraryItem {
    private String name, deweynum;
    private int copies;
    private Author author;
    public LibraryItem(String name,Author author, String deweynum, int copies){
        this.name = name;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    @Override
    public String toString(){
        return "The name of the book is " + getName() + "  by " + Author.class.getName() + " there are " + getCopies() + " copies in the library."; 
    }

}