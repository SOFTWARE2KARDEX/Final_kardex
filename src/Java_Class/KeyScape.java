/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Class;

import static Representacion.frminicio.escritorio;
import Representacion.frmplancha;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author Anthony
 * 
 */

public class KeyScape implements KeyListener{

    private JInternalFrame internalframe = null;

    public KeyScape(JInternalFrame internalframe) {
        this.internalframe = internalframe;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            internalframe.getDesktopPane().getDesktopManager().closeFrame(internalframe);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
