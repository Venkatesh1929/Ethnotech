import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        int[] ids = {10,20,10,30,40,50,100,20,30};

        Queue<Integer> l= new LinkedList<>();

        for (int i : ids) {
            if (!l.contains(i)) {
                l.add(i);
            }
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many students are joining now");
        int n= sc.nextInt();
        System.out.println("Enter the ids of "+n+"students");
        for(int i=0;i<n;i++){
           int m=sc.nextInt();
           if(!l.contains(m)){
               l.add(m);
           }

        }
        System.out.println(l);
        //System.out.println(l.remove());
        //System.out.println(l.poll());
        // System.out.println(l.peek());
        // System.out.println(l.size());
        
        

    }
}