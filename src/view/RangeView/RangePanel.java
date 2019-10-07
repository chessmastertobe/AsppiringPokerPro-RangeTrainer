package view;

import model.Range;

/**
 * The Range panel displays the table of Texas Hold'em starting hands along with
 * an edit, delete, and add button.
 * - The edit button allows the user to edit the name of a currently selected range at a specific
 * position.
 * - The delete button allows the user to delete a position within a category,
 *- The add button allows a user to add a new position within the category.
 */
public interface RangePanel {

  /**
   * Takes in a range and displays it
   */
  public void acceptRange(Range r);

  /**
   * Sets the height of the Panel
   */
  public void setHeight(int h);



  /**
   * Sets the width of the Panel
   */
  public void setWidth(int w);

}
