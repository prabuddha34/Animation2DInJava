import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class animationpanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image enemy;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 7;
    int x = 0;
    int y = 7;

    animationpanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.WHITE);


        // Load image
        enemy = new ImageIcon(animationpanel.class.getResource("Screenshot 2025-05-23 113934.png")).getImage();
        // Start timer
        timer = new Timer(10, this); // update every 10ms
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Clear the panel first
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(enemy, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) {
            xVelocity=xVelocity*-1;
        }
        if(y>=PANEL_HEIGHT-enemy.getWidth(null) || y<0) {
            yVelocity=yVelocity*-1;
        }
        y=y+yVelocity;
        x = x + xVelocity;
        repaint();
    }
}
