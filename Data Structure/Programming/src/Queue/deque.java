package Queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            set.add(num);
            if (i >= m) {
                int tmp = deque.pop();
                if (!deque.contains(tmp))
                    set.remove(tmp);
            }
            if (deque.size() == m) {
                result = Math.max(result, set.size());
            }
        }
        System.out.println(result);
    }
}
