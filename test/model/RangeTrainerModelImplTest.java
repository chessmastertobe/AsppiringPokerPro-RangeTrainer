package model;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeTrainerModelImplTest extends TestCase {

  RangeTrainerModel rm1;
  RangeTrainerModel rm2;
  RangeTrainerModel rm3;


  Range r1;
  Range r2;
  Tag t1;
  Tag t2;


  void initData() {

    rm1 = new RangeTrainerModelImpl();
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

    r1.addTag(t1);
    r1.addTag(t2);

    rm1.addRange(r1);
    rm1.addRange(r2);


  }

  public void testGetCategories() {
    initData();
    ArrayList<String> cat = new ArrayList<String>(Arrays.asList("Openraising","BB Defense"));

    assertEquals(cat,rm1.getCategories());

  }

  public void testGetRanges() {
    initData();


  }

  public void testAddRange() {
  }

  public void testPrintModel() {
    initData();
    assertEquals("<BeginRangeTrainer>\n" +
            "<BeginRange> Openraising UTG\n" +
            "<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 \n" +
            "<EndTag>\n" +
            "<BeginTag> RFI/Fold Green\n" +
            "A2s A3s A4s A5s A6s A7s A8s A9s ATs 99 22 \n" +
            "<EndTag>\n" +
            "<BeginTag> Call 3-Bet Yellow\n" +
            "54s 65s 44 \n" +
            "<EndTag><EndRange><BeginRange> BB Defense BB<EndRange>\n" +
            "<EndRangeTrainer",rm1.printModel());

  }

  public void testExportRangeModel() {
  }

  public void testUpdateCategories() {
  }
}