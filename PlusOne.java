import javax.swing.*;        //JFrame, JPanel, JButton, and so fourth...
import java.awt.*;           //Font and color
import java.awt.event.*;     //Event-handling


public class PlusOne implements ActionListener
{

    //Define GUI elements
    JFrame mainFrame;

    JPanel mainPanel,
           numberPanel;

    JLabel titleLabel,
           enterLabel;

    JTextField numberField;

    JButton enterButton;

    Font titleFont,
         generalFont,
         smallFont;

    //Create colors
    Color niceBlack = new Color(51, 51, 51);
    Color niceGrey = new Color(102, 102, 102);
    Color niceLightGrey = new Color(152, 152, 152);


    public PlusOne()
    {
        JFrame mainFrame = new JFrame("Know Your Times Tables");

        //PANELS
        //Build panels
        JPanel mainPanel = new JPanel();
        JPanel numberPanel = new JPanel();

        //Set panel layout
        mainPanel.setLayout(null);
        numberPanel.setLayout(null);

        //Set panel bounds
        numberPanel.setBounds(10, 10, 260, 120);

        //Set frame colour
        mainPanel.setBackground(niceBlack);
        numberPanel.setBackground(niceGrey);
        
        //Add to frame
        mainFrame.add(mainPanel);

        //Add to main panel
        mainPanel.add(numberPanel);

        //LABELS
        //Build labels
        JLabel titleLabel = new JLabel("Times Tables");
        JLabel enterLabel = new JLabel("Enter a number begin:");

        //Set bounds
        titleLabel.setBounds(5, 10, 200, 35);
        enterLabel.setBounds(10, 50, 200, 20);

        //Set color
        titleLabel.setForeground(Color.WHITE);
        enterLabel.setForeground(Color.WHITE);

        //Add to panel
        numberPanel.add(titleLabel);
        numberPanel.add(enterLabel);

        //TEXT FIELD
        //Build text field
        JTextField numberField = new JTextField();

        //Set bounds
        numberField.setBounds(10, 80, 200, 20);

        //Set color
        numberField.setForeground(Color.WHITE);
        numberField.setBackground(niceLightGrey);

        //Add to panel
        numberPanel.add(numberField);

        //BUTTON
        //Build
        JButton enterButton = new JButton("Go");

        //Set bounds
        enterButton.setBounds(210, 80, 50, 20);

        //Set color
        enterButton.setForeground(Color.WHITE);
        enterButton.setBackground(niceBlack);

        //Add to panel
        numberPanel.add(enterButton);

        //FONTS
        //Build fonts
        titleFont = new Font("TimesRoman", Font.BOLD, 30);
        generalFont = new Font("TimesRoman", Font.BOLD, 15);
        smallFont = new Font("TimesRoman", Font.BOLD, 11);

        //Set title font
        titleLabel.setFont(titleFont);

        //Set general font
        enterLabel.setFont(generalFont);

        //Set small font
        numberField.setFont(smallFont);
        enterButton.setFont(smallFont);

        //FRAME
        //Set bounds
        mainFrame.setBounds(100, 100, 298, 180);

        //Set visible
        mainFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
        String initialNumber;
        Integer number;

        if (event.getSource() == enterButton)
        {
            initialNumber = numberField.getText();
            number = Integer.valueOf(initialNumber);

            while (number < 1000000)
            {
                number += number;
                System.out.println(number);
            }
        }


    }

}
