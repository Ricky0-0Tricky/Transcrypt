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

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 * Author: Ricky☆. 
 * Starting Date: 02/10/2025.
 * Ending Date: dd/MM/YYYY.
 * Description: The following class represents a File Manager.
 * Designed, as of this moment, to handle file submissions for
 * substitution of the default future audio files that will be
 * included.
 */
public class FileManager {
    
    /**
     * Method to save a given file.
     * 
     * @param submittedFile File that needs to be saved
     * @return Result of the Attempt
     */
    public boolean saveFile(File submittedFile){
        // TODO: Write the code to save a file
        return true;
    }
    
    /**
     * Evaluation Method to check if the file is valid.
     * 
     * @param submittedFile File to evaluate
     * @return Admissibility of File
     */
    private boolean isValidFile(File submittedFile){
        // TODO: Write the code to check if the file is admissible or not
        return true;
    }
    
    /**
     * Method to go over the format of the given file.
     * 
     * @param submittedFile File to look over
     * @return Whether or not it's in allowed format
     */
    private boolean isValidFormat(File submittedFile){
        // TODO: Write the code to check if the format of the file is legal
        return true;
    }
    
    
     /**
     * Método para avaliar a duração do ficheiro fornecido.
     *
     * @param submittedFile Ficheiro fornecido
     * @return Valor lógico da avaliação da duração
     */
    private boolean isValidLength(File submittedFile) {
        // Obtains the duration of the file
        double fileDuration = getFileDuration(submittedFile);
        // Case where the file doesnt exceed the max duration and respects the minimum
        if (fileDuration > 0 && fileDuration < 3.0) {
            return true;
        }
        // Case where the file doesnt meet the defined criteria
        return false;
    }

    /**
     * Method to obtain the file's duration in seconds.
     *
     * @param submittedFile Submitted File
     * @return Duration of the given file in seconds
     */
    private double getFileDuration(File submittedFile) {
        try {
            // Tries to obtain the Audio Stream and it's format
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(submittedFile);
            AudioFormat format = audioInputStream.getFormat();
            // Obtains the number of frames of the Stream and calculates the duration through the number of frames and frame rate
            long frames = audioInputStream.getFrameLength();
            double fileDuration = (frames + 0.0) / format.getFrameRate();
            // Returns the duration in seconds
            return fileDuration;
        } catch (Exception ex) {
            // Prints the StackTrace if something bad happens
            ex.printStackTrace();
            return 0.0;
        }
    }
    
    /**
     * Method "toString"
     * @return Object's Definition
     */
    @Override
    public String toString(){
        return "This object is an instance of the File Manager class.";
    }
    
}
