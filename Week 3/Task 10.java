import java.io.*;
import java.util.*;
class UserMainCode {
    public int addSub(int input1, int input2) {

        int N = input1;
        int opt = input2;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int value = N - i;

            if (opt == 1) {
                // - + - + ...
                if (i % 2 == 0)
                    result -= value;
                else
                    result += value;
            } else {
                // + + - + - ...
                if (i == 0 || i % 2 == 1)
                    result += value;
                else
                    result -= value;
            }
        }

        return result;
    }
}