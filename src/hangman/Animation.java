/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Dewberry
 */
public class Animation {
    
    private ArrayList<ImageIcon> imageSet;
    private int numOfFrame;
    private int numOfImages;
    private int d,c,b,a;
    
    public Animation(int numOfImages, String folderName, String imageName) {
        imageSet = new ArrayList();
        numOfFrame = 0;
        this.numOfImages = numOfImages;
        d = 0;
        b = 0;
        c = 0;
        a = 0;
        
        for (int i = 1; i < numOfImages + 1; i++){
            if (d < 9){
                d++;
            } else if (c < 9){
                c++;
                d = 0;
            } else if (b < 9){
                b++;
                c = 0;
                d = 0;
            } else if (a < 9){
                a++;
                b = 0;
                c = 0;
                d = 0;
            }
            
            ImageIcon image = loadImage(folderName, imageName);
            imageSet.add(image);
        }
        
    }
    
    private ImageIcon loadImage(String folderName, String imageName){
        ImageIcon image = new ImageIcon(getClass().getResource("/images/" + folderName + "/" + imageName +
                String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d) + ".png"));
        return image;
    }
    
    public void animate(JLabel icon){
        icon.setIcon(imageSet.get(numOfFrame));
        
        numOfFrame++;
        
        if (numOfFrame == numOfImages){
            numOfFrame = 0;
        }
        
        
    }
}
