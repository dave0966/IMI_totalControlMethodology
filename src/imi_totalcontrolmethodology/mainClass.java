package imi_totalcontrolmethodology;

import javax.swing.JOptionPane;

/**
 *
 * @author USer1
 */
public class mainClass extends fileManager{
     public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            new mainFrame();
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
        	JOptionPane.showMessageDialog(null, "Rendering Error! Restart the Software.", "", JOptionPane.WARNING_MESSAGE, null);
        	System.err.print("Rendering Error! Restart the Software");
        }
        
    }
}
