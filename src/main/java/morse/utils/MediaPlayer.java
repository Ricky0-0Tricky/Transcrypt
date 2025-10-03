/*
 * The MIT License
 *
 * Copyright 2025 Ricky☆.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package morse.utils;

import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Author: Ricky☆. 
 * Starting Date: 02/10/2025.
 * Ending Date: dd/MM/YYYY.
 * Description: The following class represents a Media Player.
 * As its name implies, it is responsible for playing media
 * files in the likes of .AIFF, .AU or .WAV formats.
 */
public class MediaPlayer {
    /**
     * Audio Clip that will eventualy be played.
     */
    private Clip clip;
    
    /**
     * Method to play the audio of a given file.
     */
    public void playSound(String fileName){
        try {
            // Obtains the Input Stream from the file and converts it into a buffered one
            InputStream audioFile = this.getClass().getResourceAsStream("/sounds/" + fileName + ".wav");
            InputStream bufferedIn = new BufferedInputStream(audioFile);
            // Gets the Audio Stream from the Buffered Input Stream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);
            // Opens the Clip according to the Audio Stream and plays it
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            // Ensures that the audio is played until its very end
            while (!clip.isRunning()) {
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            }
        } catch (Exception e) {
            System.out.println("Error while playing the file: " + e.getMessage());
        }
    }
    
    /**
     * Method to resume the audio that was paused.
     */
    public void resume() {
        // Check if the clip isn't null and is actually running
        if (clip != null && !clip.isRunning()) {
            clip.start();
        }
    }
    
    /**
     * Method to pause the audio that's playing.
     */
    public void pause() {
        // Check if the clip isn't null and is actually running
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
        
    /**
     * Method to stop the audio that's playing.
     */
    public void stop(){
        // Check if the clip isn't null and is actually running
        if(clip != null && clip.isRunning()){
            clip.stop();
            clip.close();
        }
    }
    
    /**
     * Method "toString".
     * @return Object's Definition
     */
    @Override
    public String toString(){
        return "This object is an instance of the Media Player class.";
    }
}
