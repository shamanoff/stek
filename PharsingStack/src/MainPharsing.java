import java.util.Scanner;

public class MainPharsing {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

//        InvertPH invert = new InvertPH(scanner.nextLine());
//        System.out.println(invert.invertString());
        Pharser pharser = new Pharser(scanner.nextLine());
        System.out.println(pharser.PHString());


    }
}
