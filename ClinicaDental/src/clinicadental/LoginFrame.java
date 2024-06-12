
package clinicadental;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
    public JPanel login;
    

    public LoginFrame(){
        LoginFrame thi = this;
        this.setResizable(false);
        this.setSize(1000,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setVisible(true);
        
        //variable de color;
        Color baseOscura = new Color(107,146,243,255);
        
        
        
        // panel principal de login
        login = new JPanel();
        login.setLayout(null);
        login.setBounds(0, 0, 1000, 500);
        
        
        
        // boton para cerrar la aplicacion
         JLabel exit = new JLabel("X");
        exit.setBounds(950, 20, 30, 30);
        exit.setFont(new Font( "SansSerif", Font.PLAIN, 40 ));
        exit.setForeground(baseOscura);
        exit.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        login.add(exit);
        
        
        
        ////labels de usuario y contraseña Inicio
        JLabel lUsuario = new JLabel("Usuario");
        lUsuario.setFont(new Font( "SansSerif", Font.PLAIN, 20 ));
        lUsuario.setForeground(baseOscura);
        JLabel lContra = new JLabel("Contraseña");
        lContra.setFont(new Font( "SansSerif", Font.PLAIN, 20 ));
        lContra.setForeground(baseOscura);
        lUsuario.setBounds(560, 50, 100, 30);
        lContra.setBounds(560, 200, 200, 30);
        login.add(lUsuario);
        login.add(lContra);
        
        //TextFields para los formularios
        JTextField usuario = new JTextField();
        usuario.setBounds(560, 125, 280, 30);
        usuario.setFont(new Font( "SansSerif", Font.PLAIN, 20 ));
        usuario.setBorder(null);
        usuario.setForeground(baseOscura);
        JTextField pass = new JTextField();
        pass.setBorder(null);
        pass.setBounds(560, 268, 280, 30);
        pass.setFont(new Font( "SansSerif", Font.PLAIN, 20 ));
        pass.setForeground(baseOscura);
        login.add(usuario);
        login.add(pass);
        
        
        JPanel log = new JPanel();
        log.setBackground(baseOscura);
        JLabel lLog =new JLabel("Login");
        lLog.setFont(new Font( "SansSerif", Font.PLAIN, 20 ));
        lLog.setForeground(new Color(255,255,255,255));
        log.add(lLog);
        log.setBounds(700, 400, 100  , 40);
        login.add(log);
        log.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "El usuario es incorrecto");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        
        });
        
        
        
        
        //Imagen de fondo, presenta la forma y el logo, para mas facilidad
        JLabel fondo = new JLabel();
        fondo.setBackground(Color.red);
        fondo.setIcon(new ImageIcon("src//Images//Background.jpg"));
        fondo.setBounds(0, 0, 1000, 500);
        login.add(fondo);
        
       
        
        // layout y set visible sirve para que el panel se ajuste completamente a la ventana
        this.setLayout(new GridLayout(1,1));
        this.add(login);
        
    }
    
    
}
