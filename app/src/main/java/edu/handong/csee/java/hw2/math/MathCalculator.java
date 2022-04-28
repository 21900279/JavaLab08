package edu.handong.csee.java.hw2.math;

/** This is a class that have calculator functions */
public class MathCalculator {
    
    private String name;

    /** This method set calculator name */
    public void setName(String name) {
        this.name = name;
    }

    /** This method returns calculator name */
    public String getName() {
        return this.name;
    }

    /** This method returns bigger one */
    public int getMax(int a, int b) {
        if(a>=b) return a;
        else return b;
    }

    /** This method returns smaller one */
    public int getMin(int a, int b) {
        if(a<=b) return a;
        else return b;
    }

    /** This method returns absolute value */
    public int getAbs(int a) {
        if(a>=0) return a;
        else return -a;
    }

    /** This method returns sum of two */
    public int getSum(int a, int b) {
        return a+b;
    }

    /** This method returns difference of two */
    public int getDiff(int a, int b) {
        return a-b;
    }
    
    /** This method returns multiply of two */
    public int getProduct(int a, int b) {
        return a*b;
    }

    /** This method returns division */
    public int getQuotient(int a, int b) {
        return a/b;
    }

    /** This method returns remainder */
    public int getRemainder(int a, int b) {
        return a%b;
    }

    /** This method returns power */
    public int getPower(int a, int b) {
        int result = 1;
        for(int i=0; i<b; i++) {
            result *= a;
        }
        return result;
    }

    /** This method returns factorial */
    public int getFactorial(int a) {
        int result=1;
        for(int i=1; i<=a; i++) result = result * i;
        return result;
    }

    /** This method returns gcd */
    public int getGcd(int a, int b) {
        for(int i=a; i>=1; i--) {
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }

    /** This method returns lsm */
    public int getLcm(int a, int b) {
        for(int i=a; i<=a*b; i++) {
            if(i%a == 0 && i%b == 0) return i;
        }
        return 1;
    }

    /** This method returns square */
    public int getSquare(int a) {
        return a*a;
    }
}
