package model;

import java.util.ArrayList;

/**
 * A range represents a series of starting hands. A Range has both a category, and a position.
 */
public interface Range {
  /**
   * Returns the name of the category the Range belongs to.
   */
  public String getCategory();

  /**
   * Sets the category of the Range
   */
  public void setCategory(String c);

  /**
   * Sets the position of the Range.
   */
  public void setPosition(String c);

  /**
   * gets the position of the Range.
   */
  public String getPosition();

  /**
   * Adds a tag to the Range
   */
  public void addTag(Tag t);

  /**
   * Remove Tag
   */
  public void removeTag(String name);

  /**
   * returns all the tags in the Range
   */
  public ArrayList<Tag> getTags();

  /**
   * Returns a string representing the range
   * @return
   */
  public String printRange();





}
