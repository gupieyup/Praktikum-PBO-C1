/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author Gladyss
 */
public class senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;
    
    public senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
}
