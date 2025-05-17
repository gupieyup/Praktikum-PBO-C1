/**
 * File     : Person.java
 * Deskripsi: Person database model
 * Nama      : Gladys Paramadani Hersaputri
 * NIM       : 24060123140177
 * Lab       : PBO C1
 */
public class Person {
    private int id;
    private String name;
    
    public Person(String n) {
        name = n;
    }
    
    public Person(int i, String n) {
        id = i;
        name = n;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}