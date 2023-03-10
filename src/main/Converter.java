package main;
public class Converter {

    private static final int[] integers = new int[] {
            1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000
    };
    private static final String[] romans = new String[] {
            "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"
    };


    private Integer integerNumber = null;

    public void setIntegerNumber(int integerNumber)
    throws IllegalRangeException{
        if(integerNumber < 1 || integerNumber > 3999) {
            throw new IllegalRangeException();
        }
        this.integerNumber = integerNumber;
    }

    public Integer getIntegerNumber() {
        return this.integerNumber;
    }

    public String convertToRomans() {
        // guarding the converter
        checkTheNumber();

        // to store the result
        StringBuilder sb = new StringBuilder();

        // reading the integers backwards and divide the actual number with the current element
        for(int i = integers.length - 1; i >= 0; i--) {
            int currentInteger = integers[i];

            int t = doDivision(currentInteger);

            while(t > 0) {
                sb.append(romans[i]);
                t--;
            }

            // decrease the original number, e.g.: 2400 / 1000 => 400
            this.integerNumber %= currentInteger;
        }

        return sb.toString();
    }

    private int doDivision(int with) {
        // "with" won't ever be 0, no checks are necessary

        return this.integerNumber / with; // e.g. 2400 / 1000 = 2
    }

    private void checkTheNumber() {
        if(this.integerNumber == null)
            throw new IllegalArgumentException("Number must be set before calculating the romans!");
    }


}
