public class Magazine extends Periodical{
    private int copiesSentPerM;
    public Magazine(String name, String deweynum, int copies, String fic, int edition,int copiesSentPerM){
        super(name, deweynum,copies, fic, edition);
        this.copiesSentPerM = copiesSentPerM;
    }

    public int getCopiesSentPerM() {
        return copiesSentPerM;
    }

    public void setCopiesSentPerM(int copiesSentPerM) {
        this.copiesSentPerM = copiesSentPerM;
    }
}