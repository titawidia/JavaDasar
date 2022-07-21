package Bagian1;

public class KonversiTipeBukanNumber {
    public static void main(String[] args) {

        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
    }
}
