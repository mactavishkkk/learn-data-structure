/*
        Type of Bits
            Double 64
            Float 32

            Long 64
            Int 32
            Short 16
            Byte 8

            Char 2
            String ?
            Boolean ?
*/
public class typeData {
    public static void main(String[] args) {
        // Decimais
        Double d = 10.0;
        Float f = 100.0f;

        // Inteiros
        Long l = 1234L;
        Integer i = 1000;
        Short s = 100;
        Byte b = 10;

        System.out.println("Double: Max " + Double.MAX_VALUE + " | Double: " + Double.MIN_VALUE);
        System.out.println("Float: Max " + Float.MAX_VALUE + " | Float: " + Float.MIN_VALUE);

        System.out.println("Long: Max " + Long.MAX_VALUE + " | Long: " + Long.MIN_VALUE);
        System.out.println("Integer: Max " + Integer.MAX_VALUE + " | Integer: " + Integer.MIN_VALUE);
        System.out.println("Short: Max " + Short.MAX_VALUE + " | Short: " + Short.MIN_VALUE);
        System.out.println("Byte: Max " + Byte.MAX_VALUE + " | Byte: " + Byte.MIN_VALUE);

        String str = "Lorem ipsum";
        Character c = 'c';
        Boolean bool = false;
    }
}
