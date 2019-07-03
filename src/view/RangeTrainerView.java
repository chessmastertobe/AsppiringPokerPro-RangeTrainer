package view;

import model.RangeTrainerModel;

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
   *Displays The Range view with the given model.
   */
  public void displayEditView(RangeTrainerModel r);

}
