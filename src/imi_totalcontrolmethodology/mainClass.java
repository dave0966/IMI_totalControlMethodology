package imi_totalcontrolmethodology;

import javax.swing.JOptionPane;

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
//            fm.createCSV("Workbook_test.xslx");
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
        	JOptionPane.showMessageDialog(null, "Rendering Error! Restart the Software.", "", JOptionPane.WARNING_MESSAGE, null);
        	System.err.print("Rendering Error! Restart the Software");
        }
        
//        System.out.println("mainClass: " + new fileManager().isFileCredentialValid("$Resource\\LOGO.jpg"));
    }
}
	