public class Author {
    private String authname;
    private Publisher publish;

    public Author(String authname, Publisher publish){
        
        this.authname = authname;
        this.publish = publish;
        
    }

    public String getName() {
        return authname;
    }

    public void setName(String authname) {
        this.authname = authname;
    }

    public Publisher getPublish() {
        return publish;
    }

    public void setPublish(Publisher publish) {
        this.publish = publish;
    }
}