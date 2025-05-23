import javax.swing.*;

public class animationframe extends JFrame {
    animationpanel panel;
    animationframe(){
        panel=new animationpanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
