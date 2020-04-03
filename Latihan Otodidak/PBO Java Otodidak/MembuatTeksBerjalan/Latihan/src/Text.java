/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Text extends JPanel {
    
    int x=0,y=100;
  
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D)g;
        Font font = new Font("Tahoma",Font.BOLD+Font.PLAIN,100);
        g2.setFont(font);
        g2.setColor(Color.red);
        g2.drawString("Program Berjalan ku",x,y);
        
        try{Thread.sleep(10 );}catch(Exception ex){}
        x+=10;
        if(x>this.getWidth())
        {
            x=0;
        }
        repaint();
    }
    
    public static void main(String[] args) {
        JFrame jf = new JFrame("Program Berjalanku");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(700,200);
        jf.add(new Text());
        jf.setVisible(true);
    }
    
}
