import java.util.ArrayList;
import java.util.LinkedList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> mylist = new MyList();
        mylist.add(4,1);
        mylist.add(2,7);
        mylist.add(4,5);

        System.out.println(mylist);
    }
}
