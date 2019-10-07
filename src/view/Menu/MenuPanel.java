package view.Menu;

import model.RangeTrainerModel;
import view.RangeTrainerFrame;

/**
 * The Menu Panel is the panel that is displayed when the software is opened.
 */
public interface MenuPanel {

  /**
   * Opens a blank range editing interface for the user.
   */
  public RangeTrainerModel newRange();

  /**
   * Loads a range file for quizzing or editing.
   */
  public RangeTrainerModel loadRange(String path);
}
