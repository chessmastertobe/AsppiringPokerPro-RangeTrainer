package model;

import junit.framework.TestCase;

import java.util.ArrayList;

public class TagImplTest extends TestCase {

  Tag t1;
  ArrayList<String> h;

  void initData() {
   t1 = new TagImpl("RFI/Fold","Green");
   h = new ArrayList<String>();

    h.add("A2s");
    h.add("A3s");
    h.add("A4s");
    h.add("A5s");
    h.add("A6s");
    h.add("A7s");
    h.add("A8s");
    h.add("A9s");
    h.add("ATs");
    h.add("99");
    h.add("22");


   t1.addHand("A2s");
   t1.addHand("A3s");
    t1.addHand("A4s");
    t1.addHand("A5s");
    t1.addHand("A6s");
    t1.addHand("A7s");
    t1.addHand("A8s");
    t1.addHand("A9s");
    t1.addHand("ATs");
    t1.addHand("99");
    t1.addHand("22");
  }



  public void testGetName() {
    initData();
    assertEquals(t1.getName(),"RFI/Fold");

  }

  public void testSetName() {
    initData();
    t1.setName("3-Bet");
    assertEquals(t1.getName(),"3-Bet");
    initData();

  }

  public void testSetColor() {
    initData();
    t1.setColor("Yellow");
    assertEquals(t1.getColor(), "Yellow");
    initData();
  }

  public void testPrintHands() {
    initData();
    assertEquals(t1.printHands(),"<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 \n" +
            "<EndTag>");

  }

  public void testGetHands() {
    initData();
    assertEquals(t1.getHands(),h);

  }

  public void testAddHand() {
    initData();
    assertEquals(t1.printHands(),"<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 \n" +
            "<EndTag>");
    t1.addHand("K9s");
    t1.addHand("AA");
    t1.addHand("43s");
    t1.addHand("65s");
    t1.addHand("98s");
    assertEquals(t1.printHands(), "<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 K9s AA 43s \n" +
            "65s 98s \n" +
            "<EndTag>");

  }
}