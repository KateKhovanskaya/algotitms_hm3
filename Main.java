import java.util.Random;

public class Main {
    public static void main (String args[]){
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i<10; i++){
            list.add(new Random().nextInt(20));
        }

        list.print();
        list.revert();
        list.print();
    }
}
