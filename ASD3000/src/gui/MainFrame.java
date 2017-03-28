package gui;

import controller.GUIController;
import controller.ICoR;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Odin on 1/31/2017.
 */
public class MainFrame extends JFrame implements ICoR {

    private NorthPane northPane;
    private CenterPane centerPane;
    private SouthPane southPane;

    public MainFrame(String title){
        super(title);

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
            c.add(northPane = new NorthPane(), BorderLayout.NORTH);
            c.add(centerPane = new CenterPane(), BorderLayout.CENTER);
            c.add(southPane = new SouthPane(), BorderLayout.SOUTH);

       });



    }

    public void init() {
        GUIController.initIcoR(this);
    }

}
