package myproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Rogue1 {
    public ImageIcon imb = new ImageIcon(this.getClass().getResource("Rogueback.png"));
    public ImageIcon im = new ImageIcon(this.getClass().getResource("Rogue.png"));
    public int x = 0;
    public int y = 90;
    public int count = 0;
    public boolean alive = true;
    int distanceP;
     int distancePfire;
     int distancePfire2;
    public boolean back = false;
    
    Rogue1(){
        
    }
}
