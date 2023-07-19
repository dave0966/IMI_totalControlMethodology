package imi_totalcontrolmethodology;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author USer1
 */

public class mainClass{
	static DataToSheetManager dtsm = new DataToSheetManager();
	static LogFolderManager lfm = new LogFolderManager();
	static OutputFolderManager ofm = new OutputFolderManager();
	static ResourceFolderManager rfm = new ResourceFolderManager();
	static fileManager fm = new fileManager();
	
     public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            new mainFrame();
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
        	JOptionPane.showMessageDialog(null, "Rendering Error! Restart the I.M.E.S. - Total Control Methodology", "", JOptionPane.WARNING_MESSAGE, null);
        	System.err.print("Rendering Error! Restart the Software");
        }
        
    }
}
	