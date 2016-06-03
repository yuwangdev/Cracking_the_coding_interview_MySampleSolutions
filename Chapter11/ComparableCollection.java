package Chapter11;

/**
 * Created by yuwang on 2016-06-02.
 */
public class ComparableCollection implements Comparable<String> {

    private String string;

    public ComparableCollection(String str) {
        this.string = str;

    }


    @Override
    public int compareTo(String o) {
        if (this.string.compareTo(o) > 0) return 100;
        if (this.string.compareTo(o) < 0) return -100;
        if (this.string.compareTo(o) == 0) return 1;

        return 0;
    }
}
