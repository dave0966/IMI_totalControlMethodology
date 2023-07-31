package imi_totalcontrolmethodology;

import static java.awt.Color.WHITE;
import java.awt.Image;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author USer1
 */
public class fileSelector extends javax.swing.JFrame implements GlobalResource{

	private fileManager fm = new fileManager();
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JLabel jLabel1;
	private JTextField jTextField1;

    public fileSelector(){
    	
        initComponents();
        this.getContentPane().setBackground(WHITE);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setIconImage(img_icon);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
    	jTextField1 = new JTextField();
    	
        jLabel1 = new JLabel();
        jLabel1.setIcon(new ImageIcon(img_logo)); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1 = new JButton();
        jButton1.setText("...");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JFileChooser chooser = new JFileChooser();
            	chooser.setCurrentDirectory(new File("$Output"));
                chooser.setFileFilter(new FileNameExtensionFilter("Excel file", "xls", "xlsx"));
                
                if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                	File f = chooser.getSelectedFile();
                	jTextField1.setText(f.getAbsolutePath());
                	jButton2.setEnabled(true);
                }
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Select File");
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);

        jButton2 = new JButton();
        jButton2.setText("Continue");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               	String dir = jTextField1.getText();
            	if(new File(dir).exists() && fm.isFileCredentialValid(dir)) {
//            		System.out.println(mainClass.fm.getTemplateType(dir));
            		new promptFrame(mainClass.fm.getTemplateType(dir));
            		dispose();
            	}
//            	else
//            		JOptionPane.showMessageDialog(null, "The file does not exist. Please check the selected file directory .", "File Selection Error", JOptionPane.WARNING_MESSAGE);
            }
        });
        
        jButton3 = new JButton();
        jButton3.setText("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	dispose();
                new mainFrame();
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
