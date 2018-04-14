/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Dewberry
 */
public class BackgroundMusic {
    String fileName;
    AudioStream audioStream;
    InputStream in;
    
    public BackgroundMusic(String fileName) {
        this.fileName = fileName;
        try {
            loadBgm();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BackgroundMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadBgm() throws FileNotFoundException{
        in = getClass().getResourceAsStream("/sounds/" + fileName);
        try {
            audioStream = new AudioStream(in);
        } catch (IOException ex) {
            Logger.getLogger(BackgroundMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void play(){
        AudioPlayer.player.start(audioStream);
        
    }
    
    public void stop(){
        AudioPlayer.player.stop(audioStream);
        
    }
    
    
    
}
