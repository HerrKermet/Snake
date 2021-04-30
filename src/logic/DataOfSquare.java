package logic;

import java.util.ArrayList;
import java.awt.Color;

import graphics.SquarePanel;

public class DataOfSquare {
    //ArrayList that'll contain the colors
    private final ArrayList<Color> C = new ArrayList<>();
    private int color;
    private final SquarePanel square;

    public DataOfSquare(int col) {

        //Lets add the color to the arrayList
        C.add(Color.darkGray);// &line[Snake]
        C.add(Color.BLUE);    // &line[Food]
        C.add(Color.white);   // &line[Playing_Area]
        color = col;
        square = new SquarePanel(C.get(color));
    }

    // &begin[Update, Show]
    public void lightMeUp(SquareToLightUp c) {
        square.ChangeColor(C.get(c.ordinal()));
    }
    // &end[Update, Show]

    public SquarePanel getSquare() {
        return square;
    }
}

