import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите выражение: ");
            String inputExpression = scanner.nextLine();

            Parser parser = new Parser();
            Tree root = parser.parse(new ByteArrayInputStream(inputExpression.getBytes()));
            System.out.println(root);
            Visualizer treeTraversal = new Visualizer("output.dot");
            treeTraversal.traverseAndWrite(root);
            System.out.println(treeTraversal.concatLeaf(root));
            treeTraversal.closeWriter();
            System.out.println("DOT file generated successfully.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}