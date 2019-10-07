package view.RangeView;

import java.awt.*;

import javax.swing.*;

import model.Range;
import view.RangePanel;

/**
 * A Range Panel object displays the Current Range Matrix
 */
public class RangePanelImpl extends JPanel implements RangePanel {

  private static int height;
  private static int width;
  private String[][] matrix;


  public RangePanelImpl(int height, int width) {
    this.height = height;
    this.width = width;
    this.matrix = new String[13][13];
    String[] cards = {"A","K","Q","J","T","9","8","7","6","5","4","3","2"};

    for (int i = 0; i < 13; i++) {
      for (int j = 0; j < 13; j++) {
        if (i > j) {
          this.matrix[i][j] = cards[j] + cards[i] + "o";
        } else if (j > i) {
          this.matrix[i][j] = cards[i] + cards[j] + "s";
        } else {
          this.matrix[i][j] = cards[i] + cards[j];
        }
        System.out.print(matrix[i][j] + " ");

      }
      System.out.println("\n");
    }

  }

  public void paintComponent(Graphics g) {
    int row = 0;
    int col = 0;
    Font font = new Font("Times New Roman", Font.CENTER_BASELINE, this.width/26);
    g.setFont(font);
   for (int i = 0; i < this.width; i+=this.width/13) {

      for (int j = 0; j < this.height; j+=this.height/13) {
        g.setColor(Color.green);
        g.fillRect(i,j,this.width/13,this.height/13);
        g.setColor(Color.black);
        g.drawRect(i,j,this.width/13,this.height/13);
        System.out.println(row + "-" + col);
        String hand = matrix[col][row];
        g.drawString(hand, i,j + this.height/13);
        //System.out.println("Coords: " + i + " " + j);
        //System.out.println(this.height/13);
        col++;
      }
      col = 0;
      row++;
    }

    /*for (int i = 0; i < 130; i+=10) {
      for (int j = 0; j < 130; j+=10) {
        g.drawRect(i,j,10,10);
        System.out.println("Coords: " + i + " " + j);
      }
    }*/

  }


  /**
   * Takes in a range and displays it
   */
  @Override
  public void acceptRange(Range r) {

  }

  /**
   * Sets the height of the Panel
   */
  @Override
  public void setHeight(int h) {

  }

  /**
   * Sets the width of the Panel
   */
  @Override
  public void setWidth(int w) {

  }
}
