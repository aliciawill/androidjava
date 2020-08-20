import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OptionPaneButton
{
       private static void createAndShowUI()
       {
           ImageIcon icon = new ImageIcon("About16.gif");
           JButton button = new JButton();
           TextIcon text = new TextIcon(button, "Maybe");
           CompoundIcon compound =
               new CompoundIcon(CompoundIcon.Axis.X_AXIS, button.getIconTextGap(), icon, text);

           Object options[] = {compound, "Not Now", "Go Away"};

           int value = JOptionPane.showOptionDialog(null,
               "Would you like some green eggs to go with that ham?",
               "A Silly Question",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,
               options,
               options[2]);

           System.out.println(value);

           if (value == JOptionPane.YES_OPTION)
           {
               System.out.println("Maybe");
           }
           else
           {
               System.out.println("Not today");
           }
       }

       public static void main(String[] args)
       {
           EventQueue.invokeLater(new Runnable()
           {
               public void run()
               {
                   createAndShowUI();
               }
           });
       }

}