package imi_totalcontrolmethodology;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

/**
 *
 * @author USer1
 */
public class mainFrame extends JFrame  {

    private JButton bt_createNewFile;
    private JButton bt_existingFile;
	private Image icon = new ImageIcon(this.getClass().getResource("LOGO.jpg")).getImage();
    
	/**
     * Creates new form NewJFrame1
     */
    public mainFrame() {
    	System.out.println(this.getClass().getSimpleName());
    	System.out.println(new File("..\\$Resource").getAbsolutePath());
        initComponents();
        this.setTitle("START");
        this.setIconImage(icon);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        bt_createNewFile = new JButton("CREATE NEW FILE");
        bt_createNewFile.setFocusPainted(false);
        bt_createNewFile.setFocusable(false);
        bt_createNewFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	dispose();
            	promptFrame frame2 = new promptFrame();
            }
        });

        bt_existingFile = new JButton("SELECT EXISTING FILE");
        bt_existingFile.setFocusPainted(false);
        bt_existingFile.setFocusable(false);
        bt_existingFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	dispose();
                fileSelector frame3 = new fileSelector();
            }
        });

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bt_createNewFile, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_existingFile, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(bt_createNewFile, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(bt_existingFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


    }
}
