class FizzBuzzSeq {

    public static int fizzBuzz(int n) {
        int res = 0;
        res = res + ((n % 3 == 0) ? 3 : 0);
        res = res + ((n % 5 == 0) ? 5 : 0);
        return res;
    }
}
