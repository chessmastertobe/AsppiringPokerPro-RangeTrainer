package model;


import java.util.ArrayList;

/**
 * A tag represents a specific action that is assigned to a set of hands
 */
public interface Tag {

  /**
   * Returns the name of the tag
   */
  public String getName();

  /**
   * sets the name of the tag
   */
  public void setName(String name);

  /**
   * Sets the color of the tag
   */
  public void setColor(String color);

  /**
   * Gets the color of the tag
   */
  public String getColor();

  /**
   * Returns a string representing all the hands assigned to the tag.
   */
  public String printHands();

  /**
   * Returns a list of all the hands contained in the tag
   */
  public ArrayList<String> getHands();

  /**
   * Adds a hand to the Tag
   */
  public void addHand(String h);




}
