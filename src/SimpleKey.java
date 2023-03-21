import java.awt.*;
import java.awt.event.*;
public class SimpleKey extends Frame implements KeyListener{
    String msg = "";
    String keyState = "";
    public SimpleKey(){
        addKeyListener(this);
        addWindowListener(new MyWindowListener());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg = String.valueOf(e.getKeyChar());
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyState = "Key Down";
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyState = "Key Up";
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg,20,100);
        g.drawString(keyState,20,50);

    }

    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();
        appwin.setSize(new Dimension(200,150));
        appwin.setVisible(true);
        appwin.setTitle("SimpleKey");
    }

    class MyWindowListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }

}
