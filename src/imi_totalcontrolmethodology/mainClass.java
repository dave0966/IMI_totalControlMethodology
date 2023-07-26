package imi_totalcontrolmethodology;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * @author USer1
 */

public class mainClass{
	static fileManager fm = new fileManager();
	static LogFolderManager lfm = new LogFolderManager();
	static ResourceFolderManager rfm = new ResourceFolderManager();
	static DataToSheetManager dtsm = new DataToSheetManager();
	static OutputFolderManager ofm = new OutputFolderManager();
	
     public static void main(String[] args) {
        try {
//        	if(!rfm.checkResource())
//        		throw new FileNotFoundException();
        		
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            new mainFrame();
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) 
        {
        	JOptionPane.showMessageDialog(null, "Rendering Error! Restart the I.M.E.S. - Total Control Methodology", "", JOptionPane.WARNING_MESSAGE, null);
        	System.err.print("Rendering Error! Restart the Application");
        	e.printStackTrace();
        }
        
    }
}
	