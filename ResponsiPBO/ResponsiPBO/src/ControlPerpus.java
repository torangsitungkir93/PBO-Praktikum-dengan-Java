
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Torangto Situngkir < torangsitungkir93@gmail.com >
 */
public class ControlPerpus {

    ModelPerpus model;
    ViewLogin login;
    ViewPinjam viewPinjam;
    ViewMenu viewMenu;
    ViewAbout viewAbout;
    ViewTampil viewTampil;

    String id_anggota;

    public ControlPerpus(ModelPerpus model, ViewLogin login,
            ViewPinjam viewPinjam, ViewMenu viewMenu, ViewAbout viewAbout,
            ViewTampil viewTampil) {

        this.model = model;
        this.login = login;
        this.viewAbout = viewAbout;
        this.viewMenu = viewMenu;
        this.viewPinjam = viewPinjam;
        this.viewTampil = viewTampil;

        if (model.getPeminjaman() != 0) {
            // menampilkan tabel di awal
            String datapinjam[][] = model.readPeminjaman();
            viewTampil.tabel.setModel((new JTable(datapinjam, viewTampil.kolom)).getModel());
            listenerViewData();
        }

        //LOGIN USER
        login.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cek login 
                String username = login.tfUsername.getText();
                String password = login.getPassword();
                if (login.tfUsername.getText().length() > 0 && login.getPassword().length() > 0 && model.checkLogin(username, password) == 1) {
                    login.setVisible(false);
                    viewMenu.setVisible(true);
                    login.tfUsername.setText(null);
                    login.tfPassword.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                }
            }
        });

        login.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        viewTampil.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTampil.setVisible(false);
            }
        });
        viewMenu.btnPinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewMenu.setVisible(false);
                viewPinjam.setVisible(true);
            }
        });
        viewMenu.btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewMenu.setVisible(false);
                viewTampil.setVisible(true);
            }
        });
        viewMenu.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTampil.setVisible(false);
                viewAbout.setVisible(true);
            }
        });
        viewMenu.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Berhasil Logout");
                viewMenu.setVisible(false);
                login.setVisible(true);
            }
        });

        //-----------------------------------
        // Untuk Pinjam                     |
        //-----------------------------------
        viewPinjam.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewMenu.setVisible(true);
                viewPinjam.setVisible(false);
            }
        });

        viewPinjam.btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewPinjam.setVisible(false);
                viewTampil.setVisible(true);
            }
        });

        viewPinjam.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idanggota = viewPinjam.tfIdAngg.getText();
                String idbuku = viewPinjam.tfIdBuku.getText();
                model.tambahPeminjaman(idanggota, idbuku);
                listenerResetPinjam();
            }
        });

        viewPinjam.tfNamaAngg.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("COBABAB");
                String id;
                if (viewPinjam.tfIdAngg.equals("")) {
                    id = "";
                } else {
                    id = viewPinjam.tfIdAngg.getText();
                }
                String dataAnggota[][] = model.readAnggota(id);
                System.out.println(dataAnggota[0][0]);
                viewPinjam.tfNamaAngg.setText(dataAnggota[0][0]);
            }
        });

        viewPinjam.tfJudulBuku.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                String id;
                if (viewPinjam.tfIdBuku.equals("")) {
                    id = "";
                } else {
                    id = viewPinjam.tfIdBuku.getText();
                }
                String dataBuku[][] = model.readBuku(id);
                String buku = dataBuku[0][0];
                viewPinjam.tfJudulBuku.setText(buku);
            }
        });

        viewPinjam.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listenerResetPinjam();
            }
        });

        //-----------------------------------
        // Untuk Tampil                     |
        //-----------------------------------
        viewTampil.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewMenu.setVisible(true);
                viewTampil.setVisible(false);
            }
        });

        viewTampil.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idAnggota = viewTampil.tfIdAngg.getText();
                String idBuku = viewTampil.tfIdBuku.getText();
                String judulBuku = viewTampil.tfJudulBuku.getText();
                String namaAnggota = viewTampil.tfNamaAngg.getText();

                model.updateAnggota(idAnggota, namaAnggota);
                model.updateBuku(idBuku, judulBuku);
                listenerTampil();
                listenerResetTampil();
            }
        });

        viewTampil.btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idPeminjam = viewTampil.tfIdPeminjam.getText();
                model.hapusPeminjaman(idPeminjam);
                listenerTampil();
                listenerResetTampil();
            }
        });

        viewTampil.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listenerTampil();
                listenerResetTampil();

            }
        });

        //-----------------------------------
        // Untuk About                       |
        //------------------------------------
        viewAbout.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewMenu.setVisible(true);
                viewAbout.setVisible(false);
            }
        });
    }

    public void listenerResetPinjam() {
        viewPinjam.tfIdAngg.setText(null);
        viewPinjam.tfNamaAngg.setText(null);
        viewPinjam.tfIdBuku.setText(null);
        viewPinjam.tfJudulBuku.setText(null);
    }

    public void listenerTampil() {

        String datapinjam[][] = model.readPeminjaman();
        viewTampil.tabel.setModel((new JTable(datapinjam, viewTampil.kolom)).getModel());
    }

    public void listenerResetTampil() {
        viewTampil.tfIdPeminjam.setText(null);
        viewTampil.tfIdAngg.setText(null);
        viewTampil.tfNamaAngg.setText(null);
        viewTampil.tfIdBuku.setText(null);
        viewTampil.tfJudulBuku.setText(null);
        viewTampil.btnCancel.setEnabled(false);
        viewTampil.btnDel.setEnabled(false);
        viewTampil.btnEdit.setEnabled(false);
    }

    public void listenerViewData() {
        String data[][] = model.readPeminjaman();
        viewTampil.btnCancel.setEnabled(false);
        viewTampil.btnDel.setEnabled(false);
        viewTampil.btnEdit.setEnabled(false);
//        viewTampil.tfId.setEditable(false);

        viewTampil.tabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewTampil.tabel.getSelectedRow();
                int col = viewTampil.tabel.getSelectedColumn();

                id_anggota = data[row][1];

                viewTampil.tfIdPeminjam.setText(data[row][0].toString());
                viewTampil.tfIdPeminjam.setForeground(Color.red);
                viewTampil.tfIdAngg.setText(data[row][1].toString());
                viewTampil.tfIdAngg.setForeground(Color.red);
                viewTampil.tfIdAngg.setEditable(false);
                viewTampil.tfNamaAngg.setText(data[row][2].toString());
                viewTampil.tfIdBuku.setText(data[row][3].toString());
                viewTampil.tfIdBuku.setForeground(Color.red);
                viewTampil.tfIdBuku.setEditable(false);
                viewTampil.tfJudulBuku.setText(data[row][4].toString());

                viewTampil.btnEdit.setEnabled(true);
                viewTampil.btnDel.setEnabled(true);
                viewTampil.btnCancel.setEnabled(true);

            }
        });

    }
}
