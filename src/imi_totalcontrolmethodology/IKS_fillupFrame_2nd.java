package imi_totalcontrolmethodology;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;

/**
 *
 * @author USer1
 */
public class IKS_fillupFrame_2nd extends javax.swing.JFrame {

    /**
     * Creates new form fillupFrame2nd
     */
	int mode = 0;
    public IKS_fillupFrame_2nd(int state) {
    	Image icon = new ImageIcon("$Resource\\LOGO.jpg").getImage();
    	
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("I.M.E.S. - VALEO IKS AVIEW");
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.mode = state;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();


        jLabel1.setIcon(new javax.swing.ImageIcon("$Resource/image-300x150.jpg"));
        jLabel1.setText("jLabel1");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Model No.");
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Sub-lot No.");
        jTextField4.setFocusable(false);
        jTextField4.setRequestFocusEnabled(false);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("P.O No.");
        jTextField3.setFocusable(false);
        jTextField3.setRequestFocusEnabled(false);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Time Conducted");
        jTextField8.setFocusable(false);
        jTextField8.setRequestFocusEnabled(false);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("First Material for Material Quantity");
        jTextField7.setFocusable(false);
        jTextField7.setRequestFocusEnabled(false);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("First Material Verification Inspector Employee Number");
        jTextField6.setFocusable(false);
        jTextField6.setRequestFocusEnabled(false);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("First Material Inspector Remarks");
        jTextField5.setFocusable(false);
        jTextField5.setRequestFocusEnabled(false);

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Quantity In");
        jTextField13.setFocusable(false);
        jTextField13.setRequestFocusEnabled(false);

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Quantity out");
        jTextField12.setFocusable(false);
        jTextField12.setRequestFocusEnabled(false);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("First pass Yield (Output/Input)*100");
        jTextField11.setFocusable(false);
        jTextField11.setRequestFocusEnabled(false);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Final Out (First Test Out + Retest Pass)*100");
        jTextField10.setFocusable(false);
        jTextField10.setRequestFocusEnabled(false);

        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actual 1", "Actual 2", "Actual 3", "Actual 4", "Actual 5", "Actual 6", "Actual 7", "Actual 8", "Actual 9", "Actual 10", "Actual 11" }));
        jComboBox1.setSelectedIndex(mainClass.dtsm.selectedColumnToIndex());
//        if(mode == 1)
//        	refreshComboBox();
        jComboBox1.setEnabled(false);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (JOptionPane.showConfirmDialog(null, "Do you like to commit and proceed to next page?", "WARNING",
        		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        	    		mainClass.dtsm.insertToBuffer(26, jTextField54.getText());
        	    		mainClass.dtsm.insertToBuffer(27, jTextField55.getText());
        	    		mainClass.dtsm.insertToBuffer(28, jTextField56.getText());
        	    		mainClass.dtsm.insertToBuffer(29, jTextField57.getText());
        	    		mainClass.dtsm.insertToBuffer(30, jTextField58.getText());
        	    		mainClass.dtsm.insertToBuffer(31, jTextField59.getText());
        	    		mainClass.dtsm.insertToBuffer(32, jTextField60.getText());
        	    		mainClass.dtsm.insertToBuffer(33, jTextField61.getText());
        	    		mainClass.dtsm.insertToBuffer(34, jTextField62.getText());
        	    		mainClass.dtsm.insertToBuffer(35, jTextField63.getText());
        	    		mainClass.dtsm.insertToBuffer(36, jTextField64.getText());
        	    		
        	    		mainClass.dtsm.insertToBuffer(38, jTextField67.getText());
        	    		mainClass.dtsm.insertToBuffer(39, jTextField68.getText());
        	    		mainClass.dtsm.insertToBuffer(40, jTextField69.getText());
        	    		mainClass.dtsm.insertToBuffer(41, jTextField70.getText());
        	    		mainClass.dtsm.insertToBuffer(42, jTextField71.getText());
        	    		mainClass.dtsm.insertToBuffer(43, jTextField65.getText());
        	    		mainClass.dtsm.insertToBuffer(44, jTextField66.getText());
        	    		
        	    		try {
        	    			mainClass.lfm.setRecentfileLog(mainClass.dtsm.getWorkingFileDir(), 0);
//    		            	mainClass.fm.createCopyXLSX(0);
    		        		mainClass.dtsm.commit(0, false);
        	    		}catch(IndexOutOfBoundsException e) {
        	    			
        	    		}
        	    		


		        		if(mode == 0)
		                    mainClass.lfm.setRecentfileLog(mainClass.dtsm.getWorkingFileDir(), 0);

		        			
		        		if(mainClass.dtsm.isErrorFree()) {
		        			mainClass.dtsm.flash();
			            	System.out.println("(IKS_2) Copy and Save File");
			            	dispose();
			            	new promptFrame();
		        		}
            	}
            }
        });

        jButton2.setText("Previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (JOptionPane.showConfirmDialog(null, "The prompt input will not be save. Proceed?", "WARNING",
        		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	            	dispose();
	            	IKS_fillupFrame_1 IKSFF = new IKS_fillupFrame_1(0);
        	    }
            }
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField57)
                            .addComponent(jTextField59)
                            .addComponent(jTextField60)
                            .addComponent(jTextField58)
                            .addComponent(jTextField61)
                            .addComponent(jTextField63)
                            .addComponent(jTextField64)
                            .addComponent(jTextField62)
                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField55)
                            .addComponent(jTextField56)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField66, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField65, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField71, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField70, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField69, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField67)
                            .addComponent(jTextField68))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 157, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1)
                            .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(180, 180, 180))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField66, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panel.setLayout(layout);
        this.add(new JScrollPane(panel));
        pack();
    }
    
//    private void refreshComboBox() {
//    	jTextField54.setText(getTextTF(26));
//    	jTextField54.setText(getTextTF(27));
//    	jTextField54.setText(getTextTF(28));
//    	jTextField54.setText(getTextTF(29));
//    	jTextField54.setText(getTextTF(30));
//    	jTextField54.setText(getTextTF(31));
//    	jTextField54.setText(getTextTF(32));
//    	jTextField54.setText(getTextTF(33));
//    	jTextField54.setText(getTextTF(34));
//    	jTextField54.setText(getTextTF(35));
//    	jTextField54.setText(getTextTF(36));
//    	
//    	jTextField54.setText(getTextTF(38));
//    	jTextField54.setText(getTextTF(39));
//    	jTextField54.setText(getTextTF(40));
//    	jTextField54.setText(getTextTF(41));
//    	jTextField54.setText(getTextTF(42));
//    	jTextField54.setText(getTextTF(43));
//    	jTextField54.setText(getTextTF(44));
//    }
    
//    private String getTextTF(int row_index) {
//    	return mainClass.dtsm.getCellValue(row_index, mainClass.dtsm.getSelectedColumn_Actual());
//    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField8;
}
