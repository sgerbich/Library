public class Newspaper extends Periodical{
    private String mainArticleAuthor;
    public Newspaper(String name,Author author, String deweynum, int copies, String fic, int edition, String mainArticleAuthor){
        super(name,author, deweynum,copies, fic, edition);
        this.mainArticleAuthor = mainArticleAuthor;
    }

    public String getMainArticleAuthor() {
        return mainArticleAuthor;
    }

    public void setMainArticleAuthor(String mainArticleAuthor) {
        this.mainArticleAuthor = mainArticleAuthor;
    }
}