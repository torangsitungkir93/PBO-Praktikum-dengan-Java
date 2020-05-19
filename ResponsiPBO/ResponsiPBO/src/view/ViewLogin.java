package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class ViewLogin extends JFrame {

    JPanel pPanelBack = new JPanel();
    JPanel pPanelBox = new JPanel();

    JLabel lJudul, lUsername, lPassword;
    JTextField tfUsername;
    final JPasswordField tfPassword = new JPasswordField(20);

    JButton btnLogin, btnExit;

    GroupLayout gpPanelBack, gpPanelBox;

    public ViewLogin() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400, 500);
        setLocationRelativeTo(null);

        lJudul = new JLabel("LOGIN");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 30));
        lJudul.setForeground(Color.BLACK);
        lUsername = new JLabel("Username");
        lUsername.setFont(new Font("COURIER NEW", Font.PLAIN, 24));
        lPassword = new JLabel("Password");
        lPassword.setFont(new Font("COURIER NEW", Font.PLAIN, 24));

        tfUsername = new JTextField();

        ImageIcon loginIcon = new ImageIcon(getClass().getResource("/images/iconLogin1.png"));
        ImageIcon exitIcon = new ImageIcon(getClass().getResource("/images/iconCancel.png"));

        btnExit = new JButton("Exit", exitIcon);
        btnLogin = new JButton("Login", loginIcon);

        lPassword.setLabelFor(tfPassword);

        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelBox = new GroupLayout(pPanelBox);
        pPanelBox.setLayout(gpPanelBox);

        add(pPanelBack);
        pPanelBack.add(pPanelBox);

        pPanelBack.setBounds(0, 0, 400, 500);
        pPanelBack.setBackground(Color.BLUE);
        pPanelBox.setBounds(40, 40, 300, 370);
        pPanelBox.setBackground(Color.WHITE);

        pPanelBox.add(lJudul);
        pPanelBox.add(lUsername);
        pPanelBox.add(lPassword);
        pPanelBox.add(tfUsername);
        pPanelBox.add(tfPassword);
        pPanelBox.add(btnExit);
        pPanelBox.add(btnLogin);

        lJudul.setBounds(100, 10, 300, 40);

        lUsername.setBounds(90, 60, 200, 40);
        tfUsername.setBounds(26, 100, 250, 30);
        lPassword.setBounds(90, 140, 200, 40);
        tfPassword.setBounds(26, 180, 250, 30);

        btnExit.setBounds(26, 300, 250, 30);
        btnLogin.setBounds(26, 250, 250, 30);
    }

    public String getUsername() {
        return tfUsername.getText();
    }

    public String getPassword() {
        return new String(tfPassword.getPassword());
    }
    
    public static void main(String[] args) {
        new ViewLogin();
    }
}
