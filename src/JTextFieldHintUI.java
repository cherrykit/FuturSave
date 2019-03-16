
import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.event.FocusEvent;  
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.plaf.basic.BasicTextFieldUI;  
import javax.swing.text.JTextComponent;

//This class ensures that the text fields display their purpose when there is no text in them
public class JTextFieldHintUI extends BasicTextFieldUI implements KeyListener {  
    private String hint;
    private Color  hintColor;

    public JTextFieldHintUI(String hint, Color hintColor) {
        this.hint = hint;
        this.hintColor = hintColor;
    }

    private void repaint() {
        if (getComponent() != null) {
            getComponent().repaint();
        }
    }

    @Override
    protected void paintSafely(Graphics g) {
        // Render the default text field UI
        super.paintSafely(g);
        // Render the hint text
        JTextComponent component = getComponent();
        
        //display purpose if no text in field
        if (component.getText().length() == 0) {
            g.setColor(hintColor);
            int padding = (component.getHeight() - component.getFont().getSize()) / 2;
            int inset = 3;
            g.drawString(hint, inset, component.getHeight() - padding - inset);
        }
    }

    //remove purpose if a key is entered
    @Override
    public void keyTyped(KeyEvent e) {
        
    	repaint();
    
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    	
    	repaint();
    	
    }

    @Override
    public void installListeners() {
        super.installListeners();
        getComponent().addKeyListener(this);
    }

    @Override
    public void uninstallListeners() {
        super.uninstallListeners();
        getComponent().removeKeyListener(this);
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		repaint();
		
	}
}