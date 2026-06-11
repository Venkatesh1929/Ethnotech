import java.util.LinkedList;
class Ll{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(3,35);
        list.remove(2);
        list.getLast();
        list.addFirst(5);
        list.set(3, 90);
        list.size();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.peek());
        System.out.println(list.contains(35));
        System.out.println(list.indexOf(1));
        System.out.println(list.clone());

        System.out.println(list);
    }
}
