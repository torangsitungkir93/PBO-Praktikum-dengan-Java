/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class Swing extends JFrame{

    /**
     * @param args the command line arguments
     */
        JLabel label = new JLabel();
        JButton button = new JButton();
        JPanel panel = new JPanel();
        JLabel login = new JLabel (" L O G I N ");
        
        JButton jbLogin  = new JButton ("LOGIN");
        
        public Swing(){
            setTitle("Perpustakaan");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(null);
            setSize(800,600);
            
            panel.add(login);
            login.setBounds(300,400,300,20);
            
            panel.add(login);
            login.setBounds(500,400,100,20);
            
        }
    
}
