package model;

import java.util.ArrayList;

/**
 * A tagimpl represents an instance of a tag.
 */
public class TagImpl implements Tag {

  private String name;

  private String color;

  private ArrayList<String> hands;

  /**
   * This constructor creates an empty tag without any hands yet added.
   * @param name
   * @param color
   */
  public TagImpl(String name, String color) {
    this.name = name;
    this.color = color;
    this.hands = new ArrayList<String>();
  }

  /**
   * Returns the name of the tag
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * sets the name of the tag
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the color of the tag
   */
  @Override
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Gets the color of the tag
   */
  @Override
  public String getColor() {
    return this.color;
  }

  /**
   * Returns a string representing all the hands assigned to the tag.
   */
  @Override
  public String printHands() {
    StringBuilder out = new StringBuilder();
    out.append("<BeginTag> " + this.name + " " + this.color + "\n");
    int linecount = 0;
    for (String s : this.hands) {
      linecount++;
      out.append(s + " ");
      if (linecount > 13) {
        out.append("\n");
        linecount = 0;
      }
    }
    out.append("\n");
    out.append("<EndTag>");

    return out.toString();
  }

  /**
   * Returns a list of all the hands contained in the tag
   */
  @Override
  public ArrayList<String> getHands() {
    return this.hands;
  }

  /**
   * Adds a hand to the Tag
   */
  @Override
  public void addHand(String h) {
    this.hands.add(h);
  }
}
