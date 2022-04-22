package com.goit.hw4;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        super.calc(n);
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}


class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        super.calc(n);
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= i+1;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        super.calc(n);
        int result = 1;
        for (int i = 1; i <= n; i+=2) {
            result *= i;

        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        super.calc(n);
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) ^ ( i % 5 == 0)) {
                result += i;
            }
        }
        return result;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        super.calc(n);
        int result = 0;

        for (int i = 2; i <= n; i+=2) {
            result += i;
        }
        return result / 2;
    }
}