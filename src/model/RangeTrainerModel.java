package model;

import java.util.ArrayList;

/**
 * A RangeTrainerModel is an object that represents a comprehensive set of ranges for a specific
 * category of poker. For example: 6-max cash game, Tournament, etc
 */
public interface RangeTrainerModel {

  /**
   * this returns a list of all the categories within the model. Examples include
   * openraising, BB defense, etc
   * @return a list of all the categories in the range as strings.
   */
  public ArrayList<String> getCategories();

  /**
   *Returns a list of all the ranges in the model.
   */
  public ArrayList<Range> getRanges();

  /**
   * Adds a Range to the model.
   */
  public ArrayList<Range> addRange();

  /**
   * Replaces A range in the model.
   */
  public void replaceRange(String category, String position);

  /**
   * Exports the range to a text file.
   */
  public void exportRangeModel(String filename);

  /**
   * Updates the list of categories based on the ranges currently held within the model.
   */
  public void updateCategories();


}
