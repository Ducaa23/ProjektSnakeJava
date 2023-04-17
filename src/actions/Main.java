package actions;

import clocks.SpielUhr;
import gui.Gui;

public class Main {
    public static void main(String[] args) {
        Gui g = new Gui();
        SpielUhr gc = new SpielUhr();

        g.create();
        gc.start();
    }
}
