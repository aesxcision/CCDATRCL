import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

       Queue<String> enrollment = new LinkedList<>();
       enrollment.add("Velle");
       enrollment.add("Bea");
       enrollment.add("Nhika");

        System.out.println("The queue is: " + enrollment);
        enrollment.remove();

        System.out.println("The queue is: " + enrollment);
        enrollment.remove();

        System.out.println("The queue is: " + enrollment);
        enrollment.remove();

        System.out.println("The queue is: " + enrollment);

    }
}
