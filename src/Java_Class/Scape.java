
package Java_Class;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

/**
 *
 * @author Anthony
 * 
 */

public class Scape {
    
    private JInternalFrame internalFrame = null;

    public Scape(JInternalFrame internalFrame) {
        this.internalFrame = internalFrame;
    }
    
    public void mapeoTecla(){
        
        ActionMap mapaAccion = internalFrame.getRootPane().getActionMap();
        InputMap map = internalFrame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        KeyStroke Key_ESC = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0,true);
        
        map.put(Key_ESC, "accion_ESC");
        mapaAccion.put("accion_ESC",Accion_ESC());
        
    }
    
    public AbstractAction Accion_ESC(){
        return new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                internalFrame.getDesktopPane().getDesktopManager().closeFrame(internalFrame);
            }
        };
    }
}
