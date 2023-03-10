import main.Converter;
import main.IllegalRangeException;

public class Main {
    public static void main(String[] args) throws IllegalRangeException {


        var converter = new Converter();
        converter.setIntegerNumber(1514);
        String result = converter.convertToRomans();

        System.out.println(result);


    }
}