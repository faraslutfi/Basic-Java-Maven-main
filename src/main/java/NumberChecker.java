public class NumberChecker {
    public static String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public static String checkKPK(int number1, int number2) {
        int kpk = calculateKPK(number1, number2);
        return "KPK dari " + number1 + " dan " + number2 + " adalah " + kpk;
    }

    private static int calculateKPK(int number1, int number2) {
        int max = Math.max(number1, number2);
        int kpk = max;

        while (true) {
            if (kpk % number1 == 0 && kpk % number2 == 0) {
                return kpk;
            }
            kpk += max;
        }
    }
}
