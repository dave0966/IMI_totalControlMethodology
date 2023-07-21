package imi_totalcontrolmethodology;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author USer1
 */
public class promptFrame extends JFrame {
	private JButton bt_continue, bt_return;
	private JComboBox<String> cb_productType, cb_employeeNum;
	private JLabel IMI_logo, lb_selectProduct, lb_employeeNum ,lb_shift;
	private JTextField tf_shift;
    /**
     * Creates new form promptFrame
     */
	
	//Constructor for New Instance
    promptFrame() {
    	initFrame();
    }
    
    //Constructor for Existing File
    promptFrame(int productType) {
    	if(!(productType == -1)) {
	    	initFrame();
	    	System.out.println("Product Type: " + productType);
	    	cb_productType.setSelectedIndex(productType);
	    	cb_productType.setEnabled(false);
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null, "Unknown Product Type. Wait for updated software version.", "Unknown Product Error", JOptionPane.WARNING_MESSAGE);
    		new fileSelector();
    	}
    }
    
    private void initFrame() {
    	Image icon = new ImageIcon(this.getClass().getResource("LOGO.jpg")).getImage();
    	initComponents();
        this.setTitle("SELECT PRODUCT TYPE");
        this.setIconImage(icon);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        this.setVisible(true); 
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        IMI_logo = new JLabel();
        IMI_logo.setIcon(new ImageIcon(getClass().getResource("/imi_totalcontrolmethodology/image-300x150.jpg"))); // NOI18N

		tf_shift = new JTextField();
        bt_continue = new JButton();
        bt_return = new JButton();

        cb_productType = new JComboBox<>();
        cb_productType.setModel(new DefaultComboBoxModel<>(new String[] { "Valeo IKS AVIEW", "Valeo STLA AVIEW", "Valeo STLA SASY" }));
        
        lb_selectProduct = new JLabel();
        lb_selectProduct.setHorizontalAlignment(SwingConstants.CENTER);
        lb_selectProduct.setText("SELECT PRODUCT TYPE");

        lb_employeeNum = new JLabel();
        lb_employeeNum.setHorizontalAlignment(SwingConstants.CENTER);
        lb_employeeNum.setText("EMPLOYEE NUMBER");

        lb_shift = new JLabel();
        lb_shift.setHorizontalAlignment(SwingConstants.CENTER);
        lb_shift.setText("SHIFT");

        bt_continue.setText("Continue");
        bt_continue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bt_continueActionPerformed(evt);
            }
        });

        bt_return.setText("Previous");
        bt_return.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bt_returnActionPerformed(evt);
            }
        });

        cb_employeeNum = new JComboBox<>();
        cb_employeeNum.setEditable(true);
        cb_employeeNum.setModel(new DefaultComboBoxModel<>(new String[] { "  - -  Select Employee Number or Insert here - -"}));
        
        for(String str: mainClass.fm.getEmployeeNumList()) 
//        {
        	cb_employeeNum.addItem(str);
//        	System.out.println(str);
//        }
        
        cb_employeeNum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cb_employeeNumActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(IMI_logo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_selectProduct, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_productType, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_shift)
                                    .addComponent(cb_employeeNum, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(lb_shift, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_employeeNum, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(bt_return, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(bt_continue, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(IMI_logo)
                .addGap(18, 18, 18)
                .addComponent(lb_selectProduct, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_productType, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE) //GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_employeeNum, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(cb_employeeNum, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_shift, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_shift, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_continue, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_return, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
    }

    private void bt_returnActionPerformed(ActionEvent evt) {
    	int condition = JOptionPane.showConfirmDialog(null, "The prompted input will not be save. Are you sure?", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
	    if(condition == 0) {
	    	mainFrame mf = new mainFrame();
		    dispose();
	    }
    }

    private void cb_employeeNumActionPerformed(ActionEvent evt) {
        if(cb_employeeNum.getSelectedIndex() > 0)
            cb_employeeNum.setEditable(false);
 		
        if(cb_employeeNum.getSelectedIndex() == 0)
            cb_employeeNum.setEditable(true);
    }

    private void bt_continueActionPerformed(ActionEvent evt) {
    	String selectedItem = cb_employeeNum.getSelectedItem().toString();
    	
    	if(!(selectedItem.length() == 8))
    		JOptionPane.showMessageDialog(null, "Check prompted Employee Number! \nThe Employee Number must be 8 characters.", "Invalid Employee Number", JOptionPane.WARNING_MESSAGE);
    	
    	else if(!mainClass.fm.isNumeric(selectedItem)) 
    			JOptionPane.showMessageDialog(null, "Prompt Employee Number \""+selectedItem+"\" couldn't recognized!", "Invalid Employee Number", JOptionPane.WARNING_MESSAGE);
	    	
    	else if(tf_shift.getText().isEmpty())
    			JOptionPane.showMessageDialog(null, "Check prompted Shift. \""+tf_shift.getText()+"\" is invalid", "Invalid Shift", JOptionPane.WARNING_MESSAGE);
		
    	else 
    	{
    		mainClass.fm.addEmployeeNum(selectedItem);
    		mainClass.dtsm.insertToBuffer(3, java.time.LocalDate.now().toString());
    		mainClass.dtsm.insertToBuffer(4, cb_employeeNum.getSelectedItem().toString());
    		mainClass.dtsm.insertToBuffer(5, tf_shift.getText());
    		
		    	switch(cb_productType.getSelectedIndex()) {
		    		case 0:
//		    			System.out.println("Opening Valeo IKS - Total Methodology Template");
		    			IKS_fillupFrame_1 IKSF= new IKS_fillupFrame_1(0);
		    			break;
		    		case 1:
//		    			System.out.println("Opening Valeo STLA Aview - Total Methodology Template");
		    			STLA_Aview_form fillup= new STLA_Aview_form(0);
		    			break;
		    		case 2:
//		    			System.out.println("Opening Valeo STLA SASY - Total Methodology Template");
		    			STLA_SASY3_fillupFrame_1 SASY3= new STLA_SASY3_fillupFrame_1(0);
		    			break;
		    	}
		    dispose();
    	}
    }
}
