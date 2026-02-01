import java.io.*;
import java.util.*;
class UserMainCode {
    public int seriesNth(String input1, String input2, String input3, String input4) {
        // Convert String inputs to integers
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);
        int c = Integer.parseInt(input3);
        int n = Integer.parseInt(input4);
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;
        int gap1 = b - a;
        int gap2 = c - b;
        int current = c;
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0)
                current = current + gap1;
            else
                current = current + gap2;
        }
        return current;
    }
}
