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

/**
 * Author: Ricky☆. 
 * Starting Date: 02/10/2025.
 * Ending Date: dd/MM/YYYY.
 * Description: The following class represents a Timer.
 * It is supposed to time events such as media playing 
 * intervals (dits and dahs).
 */
public class Timer {
    /**
     * Method to introduce the corresponding
     * delay for a space between chars.
     */
    private void charSpaceDelay() throws InterruptedException{
        Thread.sleep(100);
    }
    
    /**
     * Method to introduce the corresponding
     * delay for a space between letters.
     */
    private void betLetterDelay() throws InterruptedException{
        Thread.sleep(300);
    }
    
    /**
     * Method to cause the corresponding
     * delay for a space between words.
     */
    private void betWordDelay() throws InterruptedException{
        Thread.sleep(700);
    }
}
