package login;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewLogin extends JFrame {
    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox = new JPanel();
    
    JLabel lJudul, lUsername, lPassword;
    JTextField tfUsername, tfPassword;
    JButton btnLogin, btnRegister, btnHome, btnAdmin;
    
    GroupLayout gpPanelBack, gpPanelBox;
    
    public ViewLogin() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400,500);
        setLocationRelativeTo(null);
        
        lJudul = new JLabel("LOGIN");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 30));
        lJudul.setForeground(Color.BLACK);
        lUsername = new JLabel("Username");
        lUsername.setFont(new Font("COURIER NEW", Font.PLAIN, 24));
        lPassword = new JLabel("Password");
        lPassword.setFont(new Font("COURIER NEW", Font.PLAIN, 24));
        
        tfUsername = new JTextField();
        tfPassword = new JTextField();
        
        ImageIcon registerIcon = new ImageIcon(getClass().getResource("/images/iconRegister1.png"));
        ImageIcon loginIcon = new ImageIcon(getClass().getResource("/images/iconLogin1.png"));
        ImageIcon adminIcon = new ImageIcon(getClass().getResource("/images/iconAdmin1.png"));
        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/iconHome1.png"));

        
        btnHome = new JButton("Home", homeIcon);
        btnLogin = new JButton("Login", loginIcon);
        btnRegister = new JButton("Register", registerIcon);
        btnAdmin = new JButton("Login Admin", adminIcon);
        
        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelBox = new GroupLayout(pPanelBox);
        pPanelBox.setLayout(gpPanelBox);
        
        add(pPanelBack);
        pPanelBack.add(pPanelBox);
        
        pPanelBack.setBounds(0, 0, 400, 500);
        pPanelBack.setBackground(Color.CYAN);
        pPanelBox.setBounds(40, 40, 300, 370);
        pPanelBox.setBackground(Color.WHITE);
        
        pPanelBox.add(lJudul);
        pPanelBox.add(lUsername);
        pPanelBox.add(lPassword);
        pPanelBox.add(tfUsername);
        pPanelBox.add(tfPassword);
        pPanelBox.add(btnHome);
        pPanelBox.add(btnLogin);
        pPanelBox.add(btnRegister);
        pPanelBox.add(btnAdmin);
        
        lJudul.setBounds(100, 10, 300, 40);
        
        lUsername.setBounds(90, 60, 200, 40);
        tfUsername.setBounds(26, 100, 250, 30);
        lPassword.setBounds(90, 140, 200, 40);
        tfPassword.setBounds(26, 180, 250, 30);
        
        btnHome.setBounds(26, 320, 100, 30);
        btnAdmin.setBounds(136, 320, 140, 30);
        btnLogin.setBounds(26, 240, 250, 30);
        btnRegister.setBounds(26, 280, 250, 30);
    }
    
    public String getUsername(){
        return tfUsername.getText();
    }
    
    public String getPassword(){
        return tfPassword.getText();
    }
}
