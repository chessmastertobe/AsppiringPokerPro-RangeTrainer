package view.Menu;

import java.awt.*;

import javax.swing.*;

import model.RangeTrainerModel;

/**
 * The menu panel that is displayed at the start of the software.
 */
public class MenuPanelImpl extends JPanel implements MenuPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);




  } //paintComponent

  /**
   * Opens a blank range editing interface for the user.
   */
  @Override
  public RangeTrainerModel newRange() {
    return null;
  }

  /**
   * Loads a range file for quizzing or editing.
   */
  @Override
  public RangeTrainerModel loadRange(String path) {
    return null;
  }
}
