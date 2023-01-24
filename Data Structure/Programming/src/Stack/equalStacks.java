package Stack;

import java.io.*;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result_equalStacks {
    public static Stack<Integer> pushList(List<Integer> h) {
        int n = h.size();
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--)
            s.push(h.get(i));
        return (s);
    }

    public static int total(List<Integer> h) {
        int total = 0;
        for (int i = 0; i < h.size(); i++)
            total += h.get(i);
        return (total);
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int t1 = total(h1);
        int t2 = total(h2);
        int t3 = total(h3);
        Stack<Integer> s1 = pushList(h1);
        Stack<Integer> s2 = pushList(h2);
        Stack<Integer> s3 = pushList(h3);

        if (t1 == 0 || t2 == 0 || t3 == 0)
            return (0);
        while (t1 != t2 || t2 != t3 || t1 != t3) {
            if (t1 >= t2 && t1 >= t3)
                t1 = t1 - s1.pop();
            else if (t2 >= t1 && t2 >= t3)
                t2 = t2 - s2.pop();
            else if (t3 >= t1 && t3 >= t2)
                t3 = t3 - s3.pop();
        }
        return (t1);
    }
}
public class equalStacks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result_equalStacks.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
