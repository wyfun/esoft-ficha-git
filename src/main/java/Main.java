import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        //Create a new frame
        JFrame frame = new JFrame("JLabel Example");
        //Create a label to display centered text
        JLabel label = new JLabel("Hello World!", JLabel.CENTER);
        //Add label to frame
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}