import java.awt.*;

import javax.swing.*;

import view.Menu.LoadButton;
import view.Menu.MenuPanel;
import view.Menu.MenuPanelImpl;
import view.Menu.NewButton;
import view.RangeTrainerFrame;
import view.RangeView.RangePanelImpl;

public class Main {

  public static void main(String[] args) {
    //Load The Menu
    JFrame f = new RangeTrainerFrame();
    Container contentPane = f.getContentPane();
    MenuPanelImpl m = generateMenu();
    RangePanelImpl r = new RangePanelImpl(650,650);
    contentPane.add(r);

    f.show();
  }

  //Generates the Menu
  private static MenuPanelImpl generateMenu() {
    //Adding "New Range" Button
    MenuPanelImpl m = new MenuPanelImpl();
    int mpanel_height = m.getHeight();
    int mpanel_width = m.getWidth();
    NewButton n = new NewButton();
    LoadButton l = new LoadButton();
    n.setHorizontalAlignment(m.getWidth()/2);
    n.setVerticalAlignment(m.getHeight()/2);

    m.add(n);
    m.add(l);

    return m;

  }

  //
}
