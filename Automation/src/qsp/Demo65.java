//write a script to enter Qsp in notePad
package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Demo65 {
      public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Robot r=new Robot();
		Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_SHIFT);		
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(3000);
		r.mouseMove(1000,200);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		Thread.sleep(3000);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	
		
	    
	}
}
