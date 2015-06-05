/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Class;

import static Representacion.frminicio.escritorio;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author Anthony Flores Llantoy
 * 
 */

public class AddKey extends KeyAdapter{

    private JButton jbutton;
    
    public AddKey(JButton jbutton) {
        this.jbutton = jbutton;
    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            jbutton.doClick();
        }
    }
    
      
//    public void keyScape(JButton jbutton){
//        KeyStroke kstescape = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0,false);
//        Action atcescape = new AbstractAction(){
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jbutton.doClick();
//                //inhabilitar();
//            }
//            
//        };
//        escritorio.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(kstescape, "ESCAPE");
//        escritorio.getRootPane().getActionMap().put("ESCAPE", atcescape);
//    }
    
}
