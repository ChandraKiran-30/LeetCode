class Solution {

    public boolean isPrime(int x) {
        boolean flag = true;
        if (x <= 1) {
            flag = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    
    public int sumOfPrimesInRange(int n) {
        int rev = 0, temp = n;
        while (temp != 0) {
            int div = temp % 10;
            rev = rev * 10 + div;
            temp = temp / 10;
        }
        int sum = 0;
        int l = Math.min(rev, n), h = Math.max(rev, n);
        for (int i = l; i <= h; i++) {
            if (isPrime(i))
                sum += i;
        }
        return sum;
    }
}