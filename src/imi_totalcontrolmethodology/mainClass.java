package imi_totalcontrolmethodology;

import javax.swing.JOptionPane;

/**
 *
 * @author USer1
 */
public class mainClass{
     public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
//            new mainFrame();
            new fileManager().createCSV("Swap");
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
        	JOptionPane.showMessageDialog(null, "Rendering Error! Restart the Software.", "", JOptionPane.WARNING_MESSAGE, null);
        	System.err.print("Rendering Error! Restart the Software");
        }
        
        new fileManager().isFileCredentialValid("C:\\Users\\Leak_Tester\\Downloads\\IMI_totalControlMethodology\\$Resource\\Valeo_STLA _SASSY3_EOL.xlsx");
    }
}
	