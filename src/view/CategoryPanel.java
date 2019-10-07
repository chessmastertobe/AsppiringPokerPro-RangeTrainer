package view;

import java.util.ArrayList;

import controller.RangeTrainerController;

/**
 * A category panel is the panel that lists the categories of ranges such as:
 * - Openraising
 * - Blind Defense
 * - Button vs RFI
 * The category panel has the capability to edit the name of a category, add a new category,
 * and delete a category.
 */
public interface CategoryPanel {

  /**
   * Takes in a list of categories
   */
  public void acceptCategories(ArrayList<String> cat);


  /**
   * Recieves the controller.
   */
  public void recieveController(RangeTrainerController control);
}
