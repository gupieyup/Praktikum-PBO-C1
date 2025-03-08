/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library java
 * Pembuat      : Gladys Paramadani Hersaputri / 24060123140177
 * Tanggal      : 07/03/2025
 */

public class ExceptionOnArray{
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
}