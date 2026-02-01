
class UserMainCode {
    public int nthPrime(int input1) {
        int count = 0;
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == input1) {
                    return number;
                }
            }
            number++;
        }
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
