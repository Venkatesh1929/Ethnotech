import java.util.*;

public class Hs {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);

        System.out.println(hs.contains(20));

        hs.remove(30);

        System.out.println(hs.size());
        NavigableSet<Integer> n=new TreeSet<>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println(n);

    }
}