package controller;

/**
 * Created by Odin on 2/14/2017.
 */
public class GUIController {

    private GUIController(){}

    private static ICoR ui;
    public static void initIcoR(ICoR ui){
        GUIController.ui = ui;
    }

}
