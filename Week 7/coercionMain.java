public class coercionMain{
    public static void main(String[] args) {
        int outputA = 'a';
        System.out.println(outputA);

        double x = 15.5;
        int outputX = (int)x;
        System.out.println(outputX);

        int y = 25;
        double outputY = (double)y;
        System.out.println(outputY);

        int z = 78;
        char outputZ = (char) z;
        System.out.println(outputZ);

        char a = 'a';
        double output = (double) a;
        System.out.println(output);
    }
}