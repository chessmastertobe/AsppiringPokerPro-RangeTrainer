package view;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

/**
 * This object represents the main frame for the software
 */
public class RangeTrainerFrame extends JFrame {
  public RangeTrainerFrame() {
    setTitle("Range Trainer");
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(screenSize.width/2,screenSize.height/2);
    setLocation(10,200);

    addWindowListener(new WindowAdapter() {
      /**
       * Invoked when a window is in the process of being closed. The close operation can
       * be overridden at this point.
       */
      @Override
      public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        System.exit(0);
      }
    });
  }
}
