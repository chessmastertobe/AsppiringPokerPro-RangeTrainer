package view;

/**
 * The main frame of RangeTrainer. This interface is in charge of managing which panels are to
 * be displayed and managing the flow of data to various parts of the GUI.
 */
public interface RangeTrainerView {

  /**
   * Displays the Menu
    */
  public void displayMenu();

  /**
   * Displays the Edit View
   */
  public void editView();
}
