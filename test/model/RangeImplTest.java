package model;

import junit.framework.TestCase;

public class RangeImplTest extends TestCase {
  Range r1;
  Range r2;
  Tag t1;

  void initData() {
    r1 = new RangeImpl("Openraising", "UTG");
    r2 = new RangeImpl("BB Defense", "BB");

    r1.addTag(t1);
    t1 = new TagImpl("RFI/Fold","Green");
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


  public void testGetCategory() {
    initData();
    assertEquals("Openraising",r1.getCategory());

  }

  public void testSetCategory() {
    initData();
    r1.setCategory("Globalization");
    assertEquals("Globalization",r1.getCategory());
    initData();
  }

  public void testSetPosition() {
    initData();

    r1.setPosition("HJ");
  }

  public void testGetPosition() {
  }

  public void testAddTag() {
  }

  public void testGetTags() {
  }

  public void testPrintRange() {
  }
}