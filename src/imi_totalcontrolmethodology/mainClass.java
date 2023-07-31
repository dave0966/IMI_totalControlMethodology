package imi_totalcontrolmethodology;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author USer1
 */

public class mainClass{
//	static fileManager fm = new fileManager();
	static LogFolderManager lfm = new LogFolderManager();
	static ResourceFolderManager rfm = new ResourceFolderManager();
	static DataToSheetManager dtsm = new DataToSheetManager();
	static OutputFolderManager ofm = new OutputFolderManager();
//	
     public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
//            new mainFrame();
            dtsm.addToBuffer(3, 5, "Am");
            dtsm.addToBuffer(30, 14, "ba");
            dtsm.addToBuffer(20, 15, "tu");
            dtsm.addToBuffer(10, 16, "kam");
            dtsm.addToBuffer(7, 14, "Top");
            dtsm.addToBuffer(0, 5, "a");
            dtsm.addToBuffer(0, 6, "cio");
            dtsm.addToBuffer(0, 7, "Jholo");
            dtsm.addToBuffer(0, 8, "Lawrence");
            dtsm.addToBuffer(0, 9, "Steven");
            dtsm.addToBuffer(0, 10, "Jerome");
            dtsm.addToBuffer(3, 5, "Am");
            dtsm.addToBuffer(30, 14, "ba");
            dtsm.addToBuffer(20, 15, "tu");
            dtsm.addToBuffer(10, 16, "kam");
            dtsm.addToBuffer(7, 14, "Top");
            dtsm.addToBuffer(0, 5, "a");
            dtsm.addToBuffer(0, 6, "cio");
            dtsm.addToBuffer(0, 7, "Jholo");
            dtsm.addToBuffer(0, 8, "Lawrence");
            dtsm.addToBuffer(0, 9, "Steven");
            dtsm.addToBuffer(0, 10, "Jerome");
            dtsm.addToBuffer(7, 5, "Am");
            dtsm.addToBuffer(30, 14, "ba");
            dtsm.addToBuffer(20, 15, "tu");
            dtsm.addToBuffer(10, 16, "kam");
            dtsm.addToBuffer(7, 14, "Top");
            dtsm.addToBuffer(0, 5, "a");
            dtsm.addToBuffer(0, 6, "cio");
            dtsm.addToBuffer(0, 7, "Jholo");
            dtsm.addToBuffer(0, 8, "Lawrence");
            dtsm.addToBuffer(0, 9, "Steven");
            dtsm.addToBuffer(0, 10, "Jerome");
            dtsm.commit();
//            dtsm.flash();
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
        	JOptionPane.showMessageDialog(null, "Rendering Error! Restart the I.M.E.S. - Total Control Methodology", "", JOptionPane.WARNING_MESSAGE, null);
        	System.err.print("Rendering Error! Restart the Application");
        	ex.printStackTrace();
        }
        
    }
}
	