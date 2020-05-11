/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class AsistenLaboratorium extends SeleksiCalon implements SyaratUtama {

    String status;
    int nilaiAkhir,nilaiMicroteaching;

    public AsistenLaboratorium(String nim, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara,int nilaiMicroteaching) {
        super(nim, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
        this.nilaiMicroteaching=nilaiMicroteaching;
        nilaiAkhir();
        cekNilai();
    }

    @Override
    public void nilaiAkhir() {
        this.nilaiAkhir = (int) ((nilaiTulis + nilaiKoding + nilaiWawancara+nilaiMicroteaching) / 4);
    }

    public int getNilaiAkhir() {
        return this.nilaiAkhir;
    }

    private void cekNilai() {
        if (this.nilaiAkhir > 85) {
            this.status = "LOLOS";
        } else {
            this.status = "GAGAL";
        }
    }

    public void getKeputusan() {
        System.out.println("KETERANGAN : " + this.status);
        if ("LOLOS".equals(this.status)) {
            System.out.println("Selamat Kepada " + nim + " telah diterima sebagai Aslab");
        } else {
            System.out.println("Mohon Maaf kepada " + nim + " Telah Ditolak sebagai Aslab");
        }
    }

}