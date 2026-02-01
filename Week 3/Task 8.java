import java.io.*;
import java.util.*;

class UserMainCode {
    public int seriesNth(int input1, int input2, int input3, int input4) {
        if (input4 == 1) return input1;
        if (input4 == 2) return input2;
        if (input4 == 3) return input3;
        int gap1 = input2 - input1;
        int gap2 = input3 - input2;
        int current = input3;
        for (int i = 4; i <= input4; i++) {
            if (i % 2 == 0)
                current = current + gap1;
            else
                current = current + gap2;
        }
        return current;
    }
}
