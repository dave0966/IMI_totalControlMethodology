package imi_totalcontrolmethodology;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

/**
 *
 * @author USer1
 */
public class IKS_fillupFrame_1 extends JFrame implements GlobalResource{
	private int mode = 0;
	
    public IKS_fillupFrame_1(int state) {
    	initComponents();
        this.setTitle("I.M.E.S. - Valeo IKS AVIEW Focus Active Alignment");
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setIconImage(img_icon);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.mode = state;
    }	

    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Ground strap");
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Start-up Check List");
        jTextField2.setFocusable(false);
        jTextField2.setRequestFocusEnabled(false);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Program Version");
        jTextField3.setFocusable(false);
        jTextField3.setRequestFocusEnabled(false);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Test Icon Name");
        jTextField4.setFocusable(false);
        jTextField4.setRequestFocusEnabled(false);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("NG Reference Sample Expiration Date");
        jTextField5.setFocusable(false);
        jTextField5.setRequestFocusEnabled(false);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Pass Reference Sample Expiration Date");
        jTextField6.setFocusable(false);
        jTextField6.setRequestFocusEnabled(false);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Reject Reference Sample Verification");
        jTextField7.setFocusable(false);
        jTextField7.setRequestFocusEnabled(false);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Good Reference Sample Verification");
        jTextField8.setFocusable(false);
        jTextField8.setRequestFocusEnabled(false);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Tilt checking of gripper (up AA)");
        jTextField9.setFocusable(false);
        jTextField9.setRequestFocusEnabled(false);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Build 3 units");
        jTextField10.setFocusable(false);
        jTextField10.setRequestFocusEnabled(false);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("UV Time");
        jTextField11.setFocusable(false);
        jTextField11.setRequestFocusEnabled(false);

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("UV Intensity");
        jTextField12.setFocusable(false);
        jTextField12.setRequestFocusEnabled(false);

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Valeo Drive Present in \"My Computer\"");
        jTextField13.setFocusable(false);
        jTextField13.setRequestFocusEnabled(false);

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Tilt checking of gripper (down AA)");
        jTextField14.setFocusable(false);
        jTextField14.setRequestFocusEnabled(false);

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Reference Sample MTF check");
        jTextField15.setFocusable(false);
        jTextField15.setRequestFocusEnabled(false);

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Local Disk Drives D, E, and F -- etc. (all applicable)");
        jTextField16.setFocusable(false);
        jTextField16.setRequestFocusEnabled(false);

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Particle/White Test1");
        jTextField17.setFocusable(false);
        jTextField17.setRequestFocusEnabled(false);

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Adhesive Dispense Weight");
        jTextField18.setFocusable(false);
        jTextField18.setRequestFocusEnabled(false);

        jTextField19.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("Reference");
        jTextField19.setFocusable(false);
        jTextField19.setRequestFocusEnabled(false);

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Alarm sound when removed from terminal");
        jTextField20.setToolTipText("");
        jTextField20.setFocusable(false);
        jTextField20.setRequestFocusEnabled(false);

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("1");
        jTextField21.setFocusable(false);
        jTextField21.setRequestFocusEnabled(false);

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("WPIMN200_IMI");
        jTextField22.setFocusable(false);
        jTextField22.setRequestFocusEnabled(false);

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("Pass");
        jTextField23.setFocusable(false);
        jTextField23.setRequestFocusEnabled(false);

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("Good Reference Sample");
        jTextField24.setFocusable(false);
        jTextField24.setRequestFocusEnabled(false);

        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("Fail");
        jTextField25.setFocusable(false);
        jTextField25.setRequestFocusEnabled(false);

        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setText("NG Reference Sample");
        jTextField26.setFocusable(false);
        jTextField26.setRequestFocusEnabled(false);

        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setText("(\\\\192.168.56.45)(V:)");
        jTextField27.setFocusable(false);
        jTextField27.setRequestFocusEnabled(false);

        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setText("80%");
        jTextField28.setFocusable(false);
        jTextField28.setRequestFocusEnabled(false);

        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("3.5 Seconds");
        jTextField29.setFocusable(false);
        jTextField29.setRequestFocusEnabled(false);

        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("Settings: 3 second UV");
        jTextField30.setFocusable(false);
        jTextField30.setRequestFocusEnabled(false);

        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("Perform bubble checking");
        jTextField31.setFocusable(false);
        jTextField31.setRequestFocusEnabled(false);

        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("Perform bubble checking");
        jTextField32.setFocusable(false);
        jTextField32.setRequestFocusEnabled(false);

        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("Remaining Free Space should not be less than 10GB");
        jTextField33.setFocusable(false);
        jTextField33.setRequestFocusEnabled(false);

        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("Center > 61         Corner > 45");
        jTextField34.setFocusable(false);
        jTextField34.setRequestFocusEnabled(false);

        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("60 +/-2");
        jTextField35.setFocusable(false);
        jTextField35.setRequestFocusEnabled(false);

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("Enabled/Passed");
        jTextField36.setFocusable(false);
        jTextField36.setRequestFocusEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("$Resource\\image-300x150.jpg"));
        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actual 1", "Actual 2", "Actual 3", "Actual 4", "Actual 5", "Actual 6", "Actual 7", "Actual 8", "Actual 9", "Actual 10", "Actual 11" }));
        jComboBox1.setSelectedIndex(mainClass.dtsm.selectedColumnToIndex());
        jComboBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				mainClass.dtsm.setSelectedColumn_Actual(jComboBox1.getSelectedIndex());
			}
        });
        
        jButton1.setText("Proceed");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	if (JOptionPane.showConfirmDialog(null, "Do you like to commit and proceed to next page?", "WARNING",
        		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        	    		mainClass.dtsm.insertToBuffer(7, jComboBox3.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(8, jComboBox4.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(9, jComboBox6.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(10, jComboBox5.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(11, jComboBox9.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(12, jComboBox8.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(13, jComboBox10.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(14, jComboBox7.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(15, jComboBox12.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(16, jComboBox14.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(17, jComboBox15.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(18, jComboBox13.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(19, jComboBox11.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(20, jComboBox16.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(21, jComboBox17.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(22, jComboBox18.getSelectedItem().toString());
        	    		mainClass.dtsm.insertToBuffer(23, jComboBox19.getSelectedItem().toString());
        	    		dispose();
        		        new IKS_fillupFrame_2nd(mode);
        	    }
            }
        });

        jButton2.setText("Previous");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	if (JOptionPane.showConfirmDialog(null, "The prompt input will not be save. Proceed?", "WARNING",
        		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            			mainClass.dtsm.flash();
            			dispose();
            			
            			if(mode == 0)
            				new promptFrame();
            			else
            				new fileSelector();
        	    }
            }
        });
        
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL ( , )" }));
        jComboBox3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox3.getSelectedIndex() == 2)
					jComboBox3.setEditable(true);
				else
					jComboBox3.setEditable(false);
			}
        });
        
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox4.getSelectedIndex() == 2)
					jComboBox4.setEditable(true);
				else
					jComboBox4.setEditable(false);
			}
        });
        
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox5.getSelectedIndex() == 2)
					jComboBox5.setEditable(true);
				else
					jComboBox5.setEditable(false);
			}
        });
        
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox6.getSelectedIndex() == 2)
					jComboBox6.setEditable(true);
				else
					jComboBox6.setEditable(false);
			}
        });
        
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox7.getSelectedIndex() == 2)
					jComboBox7.setEditable(true);
				else
					jComboBox7.setEditable(false);
			}
        });
        
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox8.getSelectedIndex() == 2)
					jComboBox8.setEditable(true);
				else
					jComboBox8.setEditable(false);
			}
        });
        
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox9.getSelectedIndex() == 2)
					jComboBox9.setEditable(true);
				else
					jComboBox9.setEditable(false);
			}
        });
        
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox10.getSelectedIndex() == 2)
					jComboBox10.setEditable(true);
				else
					jComboBox10.setEditable(false);
			}
        });
        
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox11.getSelectedIndex() == 2)
					jComboBox11.setEditable(true);
				else
					jComboBox11.setEditable(false);
			}
        });
        
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox12.getSelectedIndex() == 2)
					jComboBox12.setEditable(true);
				else
					jComboBox12.setEditable(false);
			}
        });
        
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox13.getSelectedIndex() == 2)
					jComboBox13.setEditable(true);
				else
					jComboBox13.setEditable(false);
			}
        });
        
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox14.getSelectedIndex() == 2)
					jComboBox14.setEditable(true);
				else
					jComboBox14.setEditable(false);
			}
        });
        
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox15.getSelectedIndex() == 2)
					jComboBox15.setEditable(true);
				else
					jComboBox15.setEditable(false);
			}
        });
        
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox16.getSelectedIndex() == 2)
					jComboBox16.setEditable(true);
				else
					jComboBox16.setEditable(false);
			}
        });
        
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox17.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox17.getSelectedIndex() == 2)
					jComboBox17.setEditable(true);
				else
					jComboBox17.setEditable(false);
			}
        });
        
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox18.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox18.getSelectedIndex() == 2)
					jComboBox18.setEditable(true);
				else
					jComboBox18.setEditable(false);
			}
        });
        
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "PASS", "FAIL  ( , )" }));
        jComboBox19.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(jComboBox19.getSelectedIndex() == 2)
					jComboBox19.setEditable(true);
				else
					jComboBox19.setEditable(false);
			}
        });

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13)
                            .addComponent(jTextField10)
                            .addComponent(jTextField11)
                            .addComponent(jTextField14)
                            .addComponent(jTextField9)
                            .addComponent(jTextField16)
                            .addComponent(jTextField15)
                            .addComponent(jTextField17)
                            .addComponent(jTextField18)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField19)
                            .addComponent(jTextField33)
                            .addComponent(jTextField34)
                            .addComponent(jTextField32)
                            .addComponent(jTextField31)
                            .addComponent(jTextField30)
                            .addComponent(jTextField29)
                            .addComponent(jTextField28)
                            .addComponent(jTextField27)
                            .addComponent(jTextField26)
                            .addComponent(jTextField24)
                            .addComponent(jTextField25)
                            .addComponent(jTextField23)
                            .addComponent(jTextField21)
                            .addComponent(jTextField22)
                            .addComponent(jTextField20)
                            .addComponent(jTextField36)
                            .addComponent(jTextField35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 256, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox15, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox18, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox17, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        
        panel.setLayout(layout);
        this.add(new JScrollPane(panel));
        pack();
    }
    
//    private void refreshComboBox() {
//    	jComboBox1.setSelectedIndex(getIndexCombo(7));
//    	jComboBox3.setSelectedIndex(getIndexCombo(8));
//    	jComboBox4.setSelectedIndex(getIndexCombo(9));
//    	jComboBox5.setSelectedIndex(getIndexCombo(10));
//    	jComboBox6.setSelectedIndex(getIndexCombo(11));
//    	jComboBox7.setSelectedIndex(getIndexCombo(12));
//    	jComboBox8.setSelectedIndex(getIndexCombo(13));
//    	jComboBox9.setSelectedIndex(getIndexCombo(14));
//    	jComboBox10.setSelectedIndex(getIndexCombo(15));
//    	jComboBox11.setSelectedIndex(getIndexCombo(16));
//    	jComboBox12.setSelectedIndex(getIndexCombo(17));
//    	jComboBox13.setSelectedIndex(getIndexCombo(18));
//    	jComboBox14.setSelectedIndex(getIndexCombo(19));
//    	jComboBox15.setSelectedIndex(getIndexCombo(20));
//    	jComboBox16.setSelectedIndex(getIndexCombo(21));
//    	jComboBox17.setSelectedIndex(getIndexCombo(22));
//    	jComboBox18.setSelectedIndex(getIndexCombo(23));
//    	jComboBox19.setSelectedIndex(getIndexCombo(24));
//    }
//    
//    private int getIndexCombo(int row_index) {
//    	String str = mainClass.dtsm.getCellValue(row_index, mainClass.dtsm.getSelectedColumn_Actual());
//    	if(str.equalsIgnoreCase("✓"))
//    		return 1;
//    	if(str.equalsIgnoreCase("X"))
//    		return 2;
//    	
//    	return 0;
//    }
    
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
}
