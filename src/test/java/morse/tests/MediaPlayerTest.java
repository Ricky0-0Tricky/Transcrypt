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
package morse.tests;

import morse.utils.MediaPlayer;

/**
 * Author: Ricky☆. 
 * Starting Date: 03/10/2025.
 * Ending Date: dd/MM/2025.
 * Description: The following class pretends to carry out
 * tests on the class "MediaPlayer" with the intent of
 * guaranteeing the predicted behaviour is assured.
 */
public class MediaPlayerTest {
    /**
     * Media Player.
     */
    MediaPlayer media;
    
    /**
     * Names of the Files that will be played.
     */
    String[] fileNames = {"dit","dah"};
    
    
    public MediaPlayerTest() throws Exception{
        setupClass();
    }
    
    /**
     * Setup Method for the Class.
     * @throws Exception Possible Exception
     */
    public void setupClass() throws Exception {
        this.media = new MediaPlayer();
    }
    
    /**
     * Destructive Method for the Class.
     * @throws Exception Possible Exception 
     */
    public void tearDownClass() throws Exception {
        this.media = null;
    }
    
    /**
     * Method to test the abillity of the Media Player 
     * to play audio from certain predefined files.
     * @throws Exception Possible Exception
     */
    public void testSound() throws Exception{
        // Cycle to play the predefined audio files 
        for(int i = 0; i < 2; i++){
            System.out.println("Currently playing the " + fileNames[i] + " audio file...");
            this.media.playSound(fileNames[i]);
        }
    }
    
    /**
     * Main Test Method.
     * @param args Possible Arguments (aren't used in this case)
     * @throws Exception Possible Exception
     */
    public static void main(String[] args) throws Exception {
        MediaPlayerTest test = new MediaPlayerTest();
        test.testSound();
    }
}
