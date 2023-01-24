package Stack;

import java.io.*;
import java.util.Stack;

class Result {
    public static String isBalanced(String s) {
        if (s == null)
            return ("NO");
        int i;
        char[] array = s.toCharArray();
        Stack<Character> bracketStack = new Stack<>();
        for (i = 0; i < s.length(); i++) {
            if (array[i] == '[' || array[i] == '{' || array[i] == '(') {
                bracketStack.push(array[i]);
                continue;
            }
            else if (bracketStack.isEmpty())
                return ("NO");
            else if (array[i] == ']' && bracketStack.peek() != '[')
                return ("NO");
            else if (array[i] == '}' && bracketStack.peek() != '{')
                return ("NO");
            else if (array[i] == ')' && bracketStack.peek() != '(')
                return ("NO");
            bracketStack.pop();
        }
        if (bracketStack.isEmpty())
            return ("YES");
        return ("NO");
    }
}
public class isBalanced {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            String result = Result.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
