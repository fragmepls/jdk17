package assignment6;

public class CurrencyConversion {

    static final float USD_TO_EURO = 0.93f;
    static final float YEN_TO_EURO = 0.0064f;
    static final float POUND_TO_EURO = 1.17f;
    static final float CAD_TO_EURO = 0.68f;
    static final float AUD_TO_EURO = 0.61f;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Incorrect number of input parameters.");
            System.exit(1);
        }

        try {
            float amount = Float.parseFloat(args[0]);
            String currency1 = args[1];
            String currency2 = args[2];
            float euro = 0;

            switch (currency1) {
                case "USD" -> euro = amount * USD_TO_EURO;
                case "YEN" -> euro = amount * YEN_TO_EURO;
                case "POUND" -> euro = amount * POUND_TO_EURO;
                case "CAD" -> euro = amount * CAD_TO_EURO;
                case "AUD" -> euro = amount * AUD_TO_EURO;
                default -> {
                    System.out.println("Invalid currency1.");
                    System.exit(1);
                }
            }

            switch (currency2) {
                case "EURO" -> System.out.println(amount + " " + currency1 + " = " + euro + " " + currency2);
                case "USD" ->
                        System.out.println(amount + " " + currency1 + " = " + euro / USD_TO_EURO + " " + currency2);
                case "YEN" ->
                        System.out.println(amount + " " + currency1 + " = " + euro / YEN_TO_EURO + " " + currency2);
                case "POUND" ->
                        System.out.println(amount + " " + currency1 + " = " + euro / POUND_TO_EURO + " " + currency2);
                case "CAD" ->
                        System.out.println(amount + " " + currency1 + " = " + euro / CAD_TO_EURO + " " + currency2);
                case "AUD" ->
                        System.out.println(amount + " " + currency1 + " = " + euro / AUD_TO_EURO + " " + currency2);
                default -> {
                    System.out.println("Invalid currency2.");
                    System.exit(1);
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("The first argument must be a number.");
            System.exit(1);
        }
    }
}
