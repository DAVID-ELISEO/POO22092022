/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author davideliseo
 */
public class VentanaSwing extends JFrame{
     private JTextField cuadro;
     private JButton boton;
     private JLabel resultado;
     
    
    
    
    
    public VentanaSwing() throws HeadlessException {
        setTitle("Conversion de °C a °F");
        setSize(400,300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro=new JTextField(5);
        ImageIcon icono=new ImageIcon("user.dir")+"/ico/fes/swing/carro.png");
            @Override
            public void paintIcon(Component cmpnt, Graphics grphcs, int i, int i1) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int getIconWidth() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int getIconHeight() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }
        boton = new JButton("COnvertir");
        boton.setBackground(Color.GREEN);
        boton.setOpaque(true);
        boton.setToolTipText("Clic para convertir en °F");
        resultado = new JLabel("°F");
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                System.exit(0);
                
            }
           
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                float gradosFarenheit= 0.0f;
                float celsius=0.0f;
                try {
                    
                    celsius = Float.parseFloat(cuadro.getText());
                    
                    gradosFarenheit = (celsius * (9.0f/5.0f)) + 32.0f;
                    resultado.setText(gradosFarenheit + "°F");
                } catch (Exception ex) { 
                    System.out.println(ex.toString());
                    
                    
                }
                
            }
            
            
        });
        
      
        
    }
    

   
    
}
