package usecaseGUI.controller;

import usecaseGUI.ICoR;

/**
 * Created by Odin on 2/14/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class GUIController {

    private GUIController(){}

    private static ICoR ui;
    public static void initIcoR(ICoR ui){
        GUIController.ui = ui;
    }

    public static void setGame(String game) {
        ui.setGame(game);
    }

}
