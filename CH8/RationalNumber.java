/*
*
*
*
* */
package CH8;

public class RationalNumber {
    int numerator;
    int denominator;
    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        if (denominator==0) {
            throw new IllegalArgumentException("0 in denominator");
        }
        this.denominator = denominator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public String toString(){
        if (this.denominator == 1){
            return this.numerator+"";
        }
        return (this.numerator+"/"+this.denominator);
    }

    public static void main(String[] args) {
        RationalNumber y = new RationalNumber(1,2);
        System.out.println(y.getDenominator());
        System.out.println(y.getNumerator());
        System.out.println(y.toString());
        RationalNumber x = new RationalNumber(1,0);
    }
}
