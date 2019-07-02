package model;

import java.util.ArrayList;

/**
 * A RangeImpl is an instance of a Range
 */
public class RangeImpl implements Range {

  private String category;
  private String position;
  private ArrayList<Tag> tags;

  /**
   * Constructs a RangeImpl using the supplied category and position
   */
  public RangeImpl(String category, String position) {
    this.category = category;
    this.position = position;
    this.tags = new ArrayList<Tag>();
  }

  /**
   * Returns the name of the category the Range belongs to.
   */
  @Override
  public String getCategory() {
    return this.category;
  }

  /**
   * Sets the category of the Range
   */
  @Override
  public void setCategory(String c) {
    this.category = c;
  }

  /**
   * Sets the position of the Range.
   */
  @Override
  public void setPosition(String c) {
    this.position = c;

  }

  /**
   * gets the position of the Range.
   */
  @Override
  public String getPosition() {
    return this.position;
  }

  /**
   * Adds a tag to the Range
   */
  @Override
  public void addTag(Tag t) {
    this.tags.add(t);

  }

  /**
   * Remove Tag
   */
  @Override
  public void removeTag(String name) {
    for (int i = 0; i < this.tags.size(); i++) {
      if (this.tags.get(i).getName().equals(name)) {
        this.tags.remove(this.tags.get(i));
      }
    }
  }

  /**
   * returns all the tags in the Range
   */
  @Override
  public ArrayList<Tag> getTags() {
    return this.tags;
  }

  /**
   * Returns a string representing the range
   */
  @Override
  public String printRange() {
    StringBuilder out = new StringBuilder();
    out.append("<BeginRange> " + this.category + " " + this.position);


    for (Tag t : this.tags) {
      out.append("\n");
      out.append(t.printHands());
    }

    out.append("<EndRange>");

    return out.toString();
  }
}
