/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author Torangto Situngkir
 */
public class Tabungan {
    int jumlahSaldo;
    String nama,PIN;
    
    //Constructor
    public Tabungan (String nama,String PIN){
        this.nama=nama;
        this.PIN=PIN;
    }

    public String getNama(){
        return this.nama;
    }
    
    public String getPIN(){
        return this.PIN;
    }
    
    public int getJumlahSaldo() {
        return jumlahSaldo;
    }

    public void setJumlahSaldo(int jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }
    
    int penarikanSaldo(int jumlah) {
        jumlahSaldo = jumlahSaldo - jumlah;
        return jumlahSaldo;
    }
    
    void setorSaldo(int jumlah) {
        jumlahSaldo = jumlahSaldo + jumlah;
    }
}
