package graphics;

import java.awt.Color;
import java.io.Serial;
import javax.swing.JPanel;

public class SquarePanel extends JPanel {

    @Serial
    private static final long serialVersionUID = 1L;

    public SquarePanel(Color d) {
        this.setBackground(d);
    }


    // &begin[Update]
    public void ChangeColor(Color d) {

        // &begin[TEST]
        private
        // &begin[schmestusTEST]
        this.setBackground(d);

        // &begin[IntersectingFeature]
        this.repaint();
        // &end[schmestusTEST]
        private
        // &end[IntersectingFeature]
        // &end[TEST]

        // &begin[schmestusTEST]
        private
        private
        private
        private
        // &end[schmestusTEST]

    }

    // &end[Update]
}

