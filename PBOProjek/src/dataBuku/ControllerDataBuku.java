package dataBuku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import menuAdmin.MVCDashboardAdmin;

/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControllerDataBuku {

    String nomor;

    ModelDataBuku modelDataBuku;
    ViewDataBuku viewDataBuku;

    public ControllerDataBuku(ModelDataBuku ma, ViewDataBuku vBuku) {
        this.modelDataBuku = ma;
        this.viewDataBuku = vBuku;
        viewDataBuku.setVisible(true);

        if (ma.getBanyakData() != 0) {
            String dataNamaSuplier[][] = ma.readBuku();
            vBuku.tabel.setModel((new JTable(dataNamaSuplier, vBuku.kolom)).getModel());
            listenerViewData();
            listenerHome();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        // Tombol di Menu Home;
        viewDataBuku.btnReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataBuku.setVisible(false);
                new MVCDashboardAdmin();
            }
        });

        viewDataBuku.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(viewDataBuku.getId());
                String judul = viewDataBuku.getJudulB();
                String kategori = viewDataBuku.getKategori();
                String penerbit = viewDataBuku.getPenerbit();
                String isbn = viewDataBuku.getISBN();
                String suplier = viewDataBuku.getSuplier();
                String tahun = viewDataBuku.getTahun();
                String harga = viewDataBuku.getHarga();
                String stok = viewDataBuku.getStok();

                modelDataBuku.updateBuku(id, judul, kategori, penerbit, isbn, suplier, tahun, harga, stok);
                resetFormBuku();
                listenerViewData();
                listenerHome();
            }
        });

        viewDataBuku.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                int id = Integer.parseInt(viewDataBuku.getId());
                String judul = viewDataBuku.getJudulB();
                String kategori = viewDataBuku.getKategori();
                String penerbit = viewDataBuku.getPenerbit();
                String isbn = viewDataBuku.getISBN();
                String suplier = viewDataBuku.getSuplier();
                String tahun = viewDataBuku.getTahun();
                String harga = viewDataBuku.getHarga();
                String stok = viewDataBuku.getStok();

                modelDataBuku.insertDataBuku(judul, kategori, penerbit, isbn, suplier, tahun, harga, stok);
                resetFormBuku();
                listenerViewData();
                listenerHome();
            }
        });

        viewDataBuku.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resetFormBuku();
                listenerHome();
                listenerViewData();
            }
        });

        viewDataBuku.btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(viewDataBuku.getId());

                modelDataBuku.deleteBuku(id);
                listenerViewData();
                listenerHome();
            }
        });

        viewDataBuku.btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = viewDataBuku.getSearch();

                String dataNamaBuku[][] = modelDataBuku.searchBuku(cari);
                vBuku.tabel.setModel((new JTable(dataNamaBuku, vBuku.kolom)).getModel());
            }
        });
//
    }
//

    public void resetFormBuku() {
        viewDataBuku.tfId.setText("");
        viewDataBuku.tfId.setEditable(false);
        viewDataBuku.tfJudulB.setText("");
        viewDataBuku.tfKategori.setText("");
        viewDataBuku.tfPenerbit.setText("");
        viewDataBuku.tfISBN.setText("");
        viewDataBuku.tfSuplier.setText("");
        viewDataBuku.tfTahun.setText("");
        viewDataBuku.tfHarga.setText("");
        viewDataBuku.tfStok.setText("");
    }

    public void listenerHome() {
        String data[][] = modelDataBuku.readBuku();
        viewDataBuku.tabel.setModel(new JTable(data, viewDataBuku.kolom).getModel());
    }

    public void listenerViewData() {
        String data[][] = modelDataBuku.readBuku();
        viewDataBuku.btnCancel.setEnabled(false);
        viewDataBuku.btnDel.setEnabled(false);
        viewDataBuku.btnEdit.setEnabled(false);
        viewDataBuku.tfId.setEditable(false);

        viewDataBuku.tabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewDataBuku.tabel.getSelectedRow();
                int col = viewDataBuku.tabel.getSelectedColumn();

                nomor = data[row][1];

//                String data[][] = modelDataSuplier.readSatuSuplier(nomor);
                viewDataBuku.tfId.setText(data[row][0].toString());
                viewDataBuku.tfId.setForeground(Color.red);
                viewDataBuku.tfId.setEditable(false);
                viewDataBuku.tfJudulB.setText(data[row][1].toString());
                viewDataBuku.tfKategori.setText(data[row][2].toString());
                viewDataBuku.tfPenerbit.setText(data[row][3].toString());
                viewDataBuku.tfISBN.setText(data[row][4].toString());
                viewDataBuku.tfSuplier.setText(data[row][5].toString());
                viewDataBuku.tfTahun.setText(data[row][6].toString());
                viewDataBuku.tfHarga.setText(data[row][7].toString());
                viewDataBuku.tfStok.setText(data[row][8].toString());

                viewDataBuku.btnEdit.setEnabled(true);
                viewDataBuku.btnDel.setEnabled(true);
                viewDataBuku.btnCancel.setEnabled(true);

            }
        });

    }
}
