package view;

import java.util.ArrayList;

import model.Range;
import model.RangeTrainerModelImpl;
import model.Tag;

/**
 * The tags panel contains a dashboard of tags with their respective color. The user
 * has the ability to edit, delete, and add a tag.
 * Editing:
 *  - User can change tag name, color, and select/deselect starting hands displayed in the
 *  range panel.
 *
 * Delete:
 *  -User can delete a tag and the changes are reflected in the range panel.
 *
 * Add:
 *  -User enters a name and a color and the new tag is created. The user can then select/deselect
 *  hands in the interface.
 */
public interface TagsPanel {

  /**
   * Accepts a list of tags and displays it in the panel.
   */
  public void acceptTags(ArrayList<Tag> t);

}
