package usecaseGUI;

import usecaseGUI.controller.GUIController;
import usecaseGUI.controller.ShortcutListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Odin on 1/31/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class MainFrame extends JFrame implements ICoR {

    private final NorthPane northPane = new NorthPane();
    private final DomainView domainView = new DomainView();
    private final SouthPane southPane = new SouthPane();

    public MainFrame(){
        super("Odin's Board Games");

        //Swing thread to handle graphics in proper order,
        //without this many concurrency problems can occur.
        //This does slow down performance a bit.
        SwingUtilities.invokeLater(() -> {

            //set LayoutManager
            setLayout(new BorderLayout());

            //set attributes
            setSize(1200, 800);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            //get contentPane
            Container c = getContentPane();

            //add components
            c.add(northPane, BorderLayout.NORTH);
            c.add(domainView, BorderLayout.CENTER);
            c.add(southPane, BorderLayout.SOUTH);

            ShortcutListener shortcutListener = new ShortcutListener();
            addKeyListener(shortcutListener);

       });



    }

    public void init() {
        GUIController.initIcoR(this);
    }

    @Override
    public void setGame(String game) {
        domainView.setGame(game);
    }

}
