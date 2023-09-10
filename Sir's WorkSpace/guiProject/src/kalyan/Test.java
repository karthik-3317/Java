package kalyan;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
public class Test {
static MyHighlightPainter myHighlightPainter = new MyHighlightPainter(Color.red);

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JEditorPane jep = new JEditorPane();
            jep.setText("Lost rain wandering parking lots and highways in search of the earth. Down-on-its-luck rain watering plastic petunias on a twentieth-floor balcony. Angry rain condemned to storm sewers, denied rivers. Rebellious rain. Tried to rally ducks and frogs to rise up when their marsh was bulldozed for bungalows. Didn’t work. Tired rain.\r\n"
					+ "\r\n"
					+ "Here, old neighbor rain. Fickle friend rain. Trickling deep to farmers who’ve become dirt, white finger bones point and skulls grumble: “Where were you, prayed-for rain?” Regretful rain, that corn withered, cattle and children went thirsty. Sorrowful, as if a downpour would help now.\r\n"
					+ "\r\n"
					+ "Dying rain, mossy and misty-eyed.d");
            frame.add(jep);
            frame.pack();
            frame.setVisible(true);

            highlight(jep, "rain");

        }
    });
}

public static void highlight(JTextComponent textComp, String pattern) {
    removeHighlights(textComp);

    try {
        Highlighter hilite = textComp.getHighlighter();
        Document doc = textComp.getDocument();
        String text = doc.getText(0, doc.getLength());
        int pos = 0;

  
        while ((pos = text.indexOf(pattern, pos)) >= 0) {
        
            hilite.addHighlight(pos, pos + pattern.length(), myHighlightPainter);
            pos += pattern.length();
        }
    } catch (BadLocationException e) {
    }
}


public static void removeHighlights(JTextComponent textComp) {
    Highlighter hilite = textComp.getHighlighter();
    Highlighter.Highlight[] hilites = hilite.getHighlights();

    for (int i = 0; i < hilites.length; i++) {
        if (hilites[i].getPainter() instanceof MyHighlightPainter) {
            hilite.removeHighlight(hilites[i]);
        }
    }
}


}
