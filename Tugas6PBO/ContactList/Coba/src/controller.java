
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class controller {
    String nama,no_hp,umur,email;
    
    public controller (model model, viewMain viewmain, viewBuatKontak viewbuat, viewLihatKontak viewlihat, viewUpdateKontak viewupdate) {
        
          //ngisi data
         if (model.getContact()!= 0) {
             // menampilkan tabel di awal
            String datakontak[][] = model.readContact();
            viewlihat.tabel.setModel((new JTable(datakontak, viewlihat.namaKolom)).getModel());
            viewlihat.tabel.getColumnModel().getColumn(4).setMinWidth(0);
            viewlihat.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
            
         }
        else {
            int input =JOptionPane.showConfirmDialog(null, "Kontak belum ada, apakah anda ingin membuat kontak baru ? ","Pilih opsi" , JOptionPane.YES_NO_OPTION);
            
            if (input == 0) { 
                viewmain.dispose();;
                viewbuat.setVisible(true);
            }
            else { 
                JOptionPane.showMessageDialog(null, "Tidak jadi buat kontak");
            }
        }
        
        viewmain.btnbuatKontak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewbuat.setVisible(true);
                viewmain.setVisible(false);
            }
        });
        
        viewbuat.btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewbuat.tfnama.getText();
                String no_hp = viewbuat.tfnomor_hp.getText();
                String umur = viewbuat.tfumur.getText();
                String email = viewbuat.tfemail.getText();
                model.insertContact(nama, no_hp, umur, email);
                
                String contact[][] = model.readContact();
                viewlihat.tabel.setModel(new JTable(contact,viewlihat.namaKolom).getModel());
                viewlihat.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                viewlihat.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                viewbuat.setVisible(false);
                viewlihat.setVisible(true);
                viewbuat.tfemail.setText(null);
                viewbuat.tfnama.setText(null);
                viewbuat.tfnomor_hp.setText(null);
                viewbuat.tfumur.setText(null);
            }
        });
        
        viewbuat.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewbuat.setVisible(false);
                viewmain.setVisible(true);
            }
        });
        
        viewmain.btnlihatKontak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmain.setVisible(false);
                viewlihat.setVisible(true);
            }
        });
        
        viewlihat.btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewlihat.setVisible(false);
                viewbuat.setVisible(true);
            }
        });
        
        viewlihat.btnkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewlihat.setVisible(false);
                viewmain.setVisible(true);
            }
        });
        
        viewlihat.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewlihat.tabel.getSelectedRow();
                int kolom = viewlihat.tabel.getSelectedColumn();

                String dataterpilih = viewlihat.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                viewlihat.lnamaisi.setText(viewlihat.tabel.getValueAt(baris, 0).toString());
                viewlihat.lno_hpisi.setText(viewlihat.tabel.getValueAt(baris, 1).toString());
                viewlihat.lumurisi.setText(viewlihat.tabel.getValueAt(baris, 2).toString());
                viewlihat.lemailisi.setText(viewlihat.tabel.getValueAt(baris, 3).toString());
                viewlihat.lid.setText(viewlihat.tabel.getValueAt(baris, 4).toString());
                
                nama = viewlihat.lnamaisi.getText();
                no_hp = viewlihat.lno_hpisi.getText();
                umur = viewlihat.lumurisi.getText();
                email = viewlihat.lemailisi.getText();
                
                viewlihat.btnupdate.setEnabled(true);
                viewlihat.btnhapus.setEnabled(true);
  
            }
        }
        );
        
        viewlihat.btnsearch.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    String cari = viewlihat.tfsearch.getText();
                    String data[][] = model.getContactSearch(cari);
                    viewlihat.tabel.setModel(new JTable(data, viewlihat.namaKolom).getModel());
                    viewlihat.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                    viewlihat.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                    
             }
         });
        
         viewlihat.btnhapus.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                                 String id = viewlihat.lid.getText();
                                 model.hapusKontak(id);
                                 String datakontak[][] = model.readContact();
                                 viewlihat.tabel.setModel((new JTable(datakontak, viewlihat.namaKolom)).getModel());
                                 viewlihat.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                                 viewlihat.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                                 viewlihat.lnamaisi.setText(null);
                                 viewlihat.lemailisi.setText(null);
                                 viewlihat.lumurisi.setText(null);
                                 viewlihat.lno_hpisi.setText(null);
                                 viewlihat.tfsearch.setText(null);

                    }
                });
        
        viewlihat.btnupdate.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        viewupdate.setVisible(true);
                        viewlihat.setVisible(false);
                        viewupdate.tfnama.setText(nama);
                        viewupdate.tfnomor_hp.setText(no_hp);
                        viewupdate.tfumur.setText(umur);
                        viewupdate.tfemail.setText(email);
                    }
                });
        
        viewlihat.btnrefresh.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String contact[][] = model.readContact();
                
                 viewlihat.tabel.setModel(new JTable(contact,viewlihat.namaKolom).getModel());
                 viewlihat.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                 viewlihat.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                 viewlihat.lnamaisi.setText(null);
                 viewlihat.lno_hpisi.setText(null);
                 viewlihat.lemailisi.setText(null);
                 viewlihat.lumurisi.setText(null);
                 viewlihat.btnupdate.setEnabled(false);
                 viewlihat.btnhapus.setEnabled(false);
                 viewlihat.tfsearch.setText(null);
                 
             }
         });
        
        viewmain.btnexit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "Shutting Down...");
                viewmain.dispose();
                viewbuat.dispose();
                viewlihat.dispose();
                viewupdate.dispose();
                
             }
         });
        
        viewupdate.btnkembali.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 viewupdate.setVisible(false);
                 viewlihat.setVisible(true);
             }
         });
        
        viewupdate.btnedit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String nama = viewupdate.tfnama.getText();
                 String no_hp = viewupdate.tfnomor_hp.getText();
                 String umur = viewupdate.tfumur.getText();
                 String email = viewupdate.tfemail.getText();
                 String id = viewlihat.lid.getText();
                 
                 model.updateKontak(id,nama, no_hp, umur, email);
                 String contact[][] = model.readContact();
                 viewlihat.tabel.setModel(new JTable(contact,viewlihat.namaKolom).getModel());
                 viewlihat.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                 viewlihat.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                 viewlihat.lnamaisi.setText(nama);
                 viewlihat.lno_hpisi.setText(no_hp);
                 viewlihat.lumurisi.setText(umur);
                 viewlihat.lemailisi.setText(email);
                 viewupdate.setVisible(false);
                 viewlihat.setVisible(true);
             }
         });
    }    
    
}
