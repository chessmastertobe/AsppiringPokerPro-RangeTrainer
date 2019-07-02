package model;

import java.util.ArrayList;

/**
 * An Implementation of the RangeTrainerModel
 */
public class RangeTrainerModelImpl implements RangeTrainerModel {

  private ArrayList<String> categories;
  private ArrayList<Range> ranges;

  RangeTrainerModelImpl() {
    this.categories = new ArrayList<String>();
    this.ranges = new ArrayList<Range>();
  }

  /**
   * this returns a list of all the categories within the model. Examples include openraising, BB
   * defense, etc
   *
   * @return a list of all the categories in the range as strings.
   */
  @Override
  public ArrayList<String> getCategories() {
    return this.categories;
  }

  /**
   * Returns a list of all the ranges in the model.
   */
  @Override
  public ArrayList<Range> getRanges() {
    return this.ranges;
  }

  /**
   * Adds a Range to the model.
   */
  @Override
  public void addRange(Range r) {
    this.ranges.add(r);
    this.updateCategories();
  }

  /**
   * Returns a string representing the entire model.
   */
  @Override
  public String printModel() {
    this.updateCategories();
    StringBuilder out = new StringBuilder();

    out.append("<BeginRangeTrainer>");
    out.append("\n");

    for (Range r : this.ranges) {
      out.append(r.printRange());
    }

    out.append("\n");
    out.append("<EndRangeTrainer");

    return out.toString();
  }


  /**
   * Exports the range to a text file.
   */
  @Override
  public void exportRangeModel(String filename) {

  }

  /**
   * Updates the list of categories based on the ranges currently held within the model.
   */
  @Override
  public void updateCategories() {
   ArrayList<String> cat = new ArrayList<String>();

   for (Range r : this.ranges) {
     if (!cat.contains(r.getCategory())) {
       cat.add(r.getCategory());
     }
   }
   this.categories = cat;
  }
}
