import java.util.Collection;

public class OverdueList<E> {
    private Collection <E> overduebooks;

    public OverdueList(Collection<E> overduebooks){
        this.overduebooks = overduebooks;
    }

    public Collection<E> getOverduebooks() {
        return overduebooks;
    }

    public void setOverduebooks(Collection<E> overduebooks) {
        this.overduebooks = overduebooks;
    }

}