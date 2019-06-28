package model;

import junit.framework.TestCase;

public class RangeImplTest extends TestCase {
  Range r1;
  Range r2;
  Tag t1;
  Tag t2;

  void initData() {
    r1 = new RangeImpl("Openraising", "UTG");
    r2 = new RangeImpl("BB Defense", "BB");


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
    r1.addTag(t1);

    t2 = new TagImpl("Call 3-Bet","Yellow");


    t2.addHand("54s");
    t2.addHand("65s");
    t2.addHand("44");





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
    assertEquals("HJ",r1.getPosition());
    initData();
  }

  public void testGetPosition() {
    initData();
    assertEquals("UTG",r1.getPosition());

  }

  public void testAddTag() {
    initData();
    assertEquals(1,r1.getTags().size()
    );

    r1.addTag(t2);
    assertEquals(2,r1.getTags().size());

  }

  public void testGetTags() {
    //It's just a getter. Kinda irrelevant to make tests


  }

  public void testPrintRange() {
    initData();

    assertEquals("<BeginRange>\n" +
            "<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 \n" +
            "<EndTag><EndRange>",r1.printRange());

    assertEquals("<BeginRange><EndRange>",r2.printRange());

    r1.addTag(t2);

    assertEquals("<BeginRange>\n" +
            "<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 \n" +
            "<EndTag>\n" +
            "<BeginTag> Call 3-Bet Yellow\n" +
            "54s 65s 44 \n" +
            "<EndTag><EndRange>",r1.printRange());

    initData();
  }
}