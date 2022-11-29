import java.util.Scanner;

public class TestNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the first name: ");
        Name name1 = new Name(scan.next(), scan.next(), scan.next());
        System.out.println("Please input the second name: ");
        Name name2 = new Name(scan.next(), scan.next(), scan.next());

        System.out.println(name1.getFirstMiddleLast());
        System.out.println(name1.getLastFirstMiddle());
        System.out.println(name1.getInitials());
        System.out.println(name1.getLength());
        System.out.println(name1.equals(name2));
        System.out.println(name1);

        System.out.println(name2.getFirstMiddleLast());
        System.out.println(name2.getLastFirstMiddle());
        System.out.println(name2.getInitials());
        System.out.println(name2.getLength());
        System.out.println(name2.equals(name1));
        System.out.println(name2);


        scan.close();
    }
}
