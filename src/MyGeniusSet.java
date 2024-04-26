import java.util.ArrayList;



public class MyGeniusSet {

    private ArrayList<Integer> set = new ArrayList<>();

    public void add (Integer element){
        if (!set.contains(element)){
            set.add(element);
        }
    }

    public boolean contains(Object o){
        return indexOf(o) >= 0;

    }

    private int indexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyGeniusSet{" +
                "set=" + set +
                '}';
    }
}
