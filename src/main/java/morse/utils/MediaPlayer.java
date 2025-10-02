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
    private void playSound(){
        // TODO: Write the code that will allow for an audio file to be played.
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
