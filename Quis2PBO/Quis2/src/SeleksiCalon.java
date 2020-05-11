/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class SeleksiCalon {

    protected String nim, nama;
    protected float nilaiTulis, nilaiKoding, nilaiWawancara;

    public SeleksiCalon(String nim, String nama, float nilaiTulis, float nilaiCoding, float nilaiWawancara) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTulis = nilaiTulis;
        this.nilaiKoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;

    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public float getNilaiTulis() {
        return this.nilaiTulis;
    }
    
    public float getNilaiCoding() {
        return this.nilaiKoding;
    }
    
    public float getNilaiWawancara() {
        return this.nilaiWawancara;
    }

}
