package Advanced_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class java_arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = scanner.nextInt();
        ArrayList<Integer>[] lines = new ArrayList[line];

        for (int i = 0; i < line; i++) {
            int elements = scanner.nextInt();
            lines[i] = new ArrayList<>();
            for (int j = 0; j < elements; j++) {
                int element = scanner.nextInt();
                lines[i].add(element);
            }
        }

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x > 0 && x <= lines.length && y > 0 && y <= lines[x - 1].size())
                System.out.println(lines[x - 1].get(y - 1));
            else
                System.out.println("Error");
        }
    }
}
