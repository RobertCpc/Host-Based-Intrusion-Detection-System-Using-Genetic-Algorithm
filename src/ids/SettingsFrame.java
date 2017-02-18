/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ids;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author olu
 */
public class SettingsFrame extends javax.swing.JFrame {

        static String[] ElementNames = {"ADMIN_EMAIL", "TRIGGER_VALUE","PORT_FILTER", "ARP_FILTER", "ICMP_FILTER","IGMP_FILTER","IP_FILTER","TCP_FILTER","UDP_FILTER","ALLPROTOCOL_FILTER"};
     
        
    /**
     * Creates new form SettingsFrame
     */
    public SettingsFrame() {
        initComponents();
        PortNameField.setEnabled(false);
        PortNumberField.setEnabled(false);
        AddPortButton.setEnabled(false);
        synchronized(IDS.query){
        String[] ToSave = IDS.query.ProbeXML(ElementNames);
        SpinnerModel spinmodel =  FitnessSpinner.getModel();
      
        AdminMailField.setText(ToSave[0]);

         spinmodel.setValue(Integer.decode(ToSave[1]));
          FilterComboBox.setSelectedIndex(Integer.parseInt(ToSave[2]));
            ARPCheckBox.setSelected(Boolean.parseBoolean(ToSave[3]));
          ICMPCheckBox.setSelected(Boolean.parseBoolean(ToSave[4]));
            IGMPCheckBox.setSelected(Boolean.parseBoolean(ToSave[5]));
              IPCheckBox.setSelected(Boolean.parseBoolean(ToSave[6]));
                TCPCheckBox.setSelected(Boolean.parseBoolean(ToSave[7]));
                  UDPCheckBox.setSelected(Boolean.parseBoolean(ToSave[8]));
                    FilterAllCheckBox.setSelected(Boolean.parseBoolean(ToSave[9]));
        }
     
       
       
        
                    
                   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdminMailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FitnessSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        ARPCheckBox = new javax.swing.JCheckBox();
        ICMPCheckBox = new javax.swing.JCheckBox();
        IGMPCheckBox = new javax.swing.JCheckBox();
        TCPCheckBox = new javax.swing.JCheckBox();
        UDPCheckBox = new javax.swing.JCheckBox();
        IPCheckBox = new javax.swing.JCheckBox();
        FilterAllCheckBox = new javax.swing.JCheckBox();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        FilterComboBox = new javax.swing.JComboBox();
        PortNameField = new javax.swing.JTextField();
        PortNumberField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddPortBox = new javax.swing.JCheckBox();
        AddPortButton = new javax.swing.JButton();
        RevertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SETTINGS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        AdminMailField.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Email Address");

        FitnessSpinner.setToolTipText("Would Trigger Alert If Chromosome Fitness is Below This Value");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fitness % Mark");

        SaveButton.setBackground(new java.awt.Color(255, 255, 255));
        SaveButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(0, 0, 51));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROTOCOL FILTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 12), java.awt.Color.white)); // NOI18N
        jLayeredPane1.setOpaque(true);

        ARPCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        ARPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        ARPCheckBox.setText("ARP");
        ARPCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ARPCheckBoxItemStateChanged(evt);
            }
        });

        ICMPCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        ICMPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        ICMPCheckBox.setText("ICMP");
        ICMPCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ICMPCheckBoxItemStateChanged(evt);
            }
        });

        IGMPCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        IGMPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        IGMPCheckBox.setText("IGMP");
        IGMPCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IGMPCheckBoxItemStateChanged(evt);
            }
        });

        TCPCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        TCPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        TCPCheckBox.setText("TCP");
        TCPCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TCPCheckBoxItemStateChanged(evt);
            }
        });

        UDPCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        UDPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        UDPCheckBox.setText("UDP");
        UDPCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                UDPCheckBoxItemStateChanged(evt);
            }
        });

        IPCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        IPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        IPCheckBox.setText("IP/IPv6");
        IPCheckBox.setToolTipText("Will automatically also filter UDP and TCP");
        IPCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IPCheckBoxItemStateChanged(evt);
            }
        });

        FilterAllCheckBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        FilterAllCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        FilterAllCheckBox.setText("FILTER ALL");
        FilterAllCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilterAllCheckBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(FilterAllCheckBox))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ARPCheckBox)
                            .addComponent(IGMPCheckBox)
                            .addComponent(TCPCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ICMPCheckBox)
                            .addComponent(IPCheckBox)
                            .addComponent(UDPCheckBox))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ARPCheckBox)
                    .addComponent(ICMPCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IGMPCheckBox)
                    .addComponent(IPCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UDPCheckBox)
                    .addComponent(TCPCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(FilterAllCheckBox)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(ARPCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ICMPCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(IGMPCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TCPCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(UDPCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(IPCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(FilterAllCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PORT FILTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 12), java.awt.Color.white)); // NOI18N

        FilterComboBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        FilterComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FILTER ALL", "HTTP - port 80", "SSL - port 443", "FTP - port 21", "SSH - port 22", "TELNET - port 23", "SMTP - port 25", "POP3 - port 110", "IMAP - port 143", "IMAP3 - port 993", "DNS - port 53", "NETBIOS - port 139", "SAMBA - port 137", "AD - port 445", "LDAP - port 389", "SQL - port 156" }));

        PortNameField.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        PortNameField.setText("e.g DNS");
        PortNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PortNameFieldKeyTyped(evt);
            }
        });

        PortNumberField.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        PortNumberField.setText("e.g 53");
        PortNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PortNumberFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Port Name");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Port No.");

        AddPortBox.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13)); // NOI18N
        AddPortBox.setForeground(new java.awt.Color(255, 255, 255));
        AddPortBox.setText("Add New Port");
        AddPortBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AddPortBoxItemStateChanged(evt);
            }
        });

        AddPortButton.setBackground(new java.awt.Color(255, 255, 255));
        AddPortButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        AddPortButton.setForeground(new java.awt.Color(0, 0, 51));
        AddPortButton.setText("ADD");
        AddPortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPortButtonActionPerformed(evt);
            }
        });

        RevertButton.setBackground(new java.awt.Color(255, 255, 255));
        RevertButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        RevertButton.setForeground(new java.awt.Color(0, 0, 51));
        RevertButton.setText("REVERT TO DEFAULT");
        RevertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FilterComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(RevertButton)
                        .addGap(18, 18, 18)
                        .addComponent(AddPortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(AddPortBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PortNameField)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(13, 13, 13)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(PortNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PortNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPortBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPortButton)
                    .addComponent(RevertButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(FilterComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PortNameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PortNumberField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(AddPortBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(AddPortButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(RevertButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FitnessSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(AdminMailField)
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminMailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FitnessSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

        String AdminMail = AdminMailField.getText();
           SpinnerModel spinmodel =  FitnessSpinner.getModel();
           Integer FitnessValue;
           try{
           FitnessValue = (Integer) spinmodel.getValue();
           }catch(Exception ex){
               IDS.msg.ErrorMessages("Only Integers Accepted ");
               return;
           }
if(AdminMail.equals("")){
    IDS.msg.ErrorMessages("Please Input the Admin Email");
    return;
}  
else if(!AdminMail.contains("@")){
     IDS.msg.ErrorMessages("Please Input a Valid Admin Email");
    return;
}
else if(FitnessValue>100 || FitnessValue<0){
       IDS.msg.ErrorMessages("Please Select A Trigger Fitness % Between 0 and 100%");
    return;
}
           
    int PortFilterIndex = FilterComboBox.getSelectedIndex();
    String PortFilterIndexString = String.valueOf(PortFilterIndex );
    String arp="false",icmp="false",igmp="false",ip="false",tcp="false",udp="false",all="false";
if(ARPCheckBox.isSelected()==true){
    arp = "true";
}
if(ICMPCheckBox.isSelected()==true){
    icmp = "true";
}
if(IGMPCheckBox.isSelected()==true){
    igmp = "true";
}
if(IPCheckBox.isSelected()==true){
    ip = "true";
}
if(TCPCheckBox.isSelected()==true){
    tcp = "true";
}
if(UDPCheckBox.isSelected()==true){
    udp = "true";
}
if(FilterAllCheckBox.isSelected()==true){
    all = "true";
}
String SpinnerValue = String.valueOf((int)FitnessValue);
String[] ToSave = {AdminMail , SpinnerValue,PortFilterIndexString, arp, icmp, igmp, ip, tcp, udp,all};

 //Generate port filter string
                    if(Integer.parseInt(ToSave[2])==0){
                        IDS.ActivatePortFilter=false;
                    }
                    else{
                        IDS.ActivatePortFilter=true;
                        String[] get = FilterComboBox.getSelectedItem().toString().split(" ");
                      IDS.PortFilterString = get[2]+" "+get[3];
                      synchronized(IDS.print){
                                            IDS.print.TextAreaAppend(IDS.PortFilterString+" Filtering Activated\n");
                      
                      }
                    }
                   
                    //Generate Protocol Filter String
                    String[] Protocols = {"arp","icmp","igmp","ip","tcp","udp"};
                    String ProtoFilterString="";
                    if(Boolean.parseBoolean(ToSave[9])==true){
                        IDS.ActivateProtocolFilter=true;
                    }
                      else{
                        for(int i=3; i<9; i++){
                          
                            switch(ToSave[i]){
                                case "true":
                                     ProtoFilterString = ProtoFilterString+Protocols[i-3]+" or ";
                                    break;
                               case "false":
                                    
                                    break;
                                  
                                        
                            }
                        }
                        IDS.ProtoFilterString = ProtoFilterString.substring(0, ProtoFilterString.length()-4);
                      synchronized(IDS.print){
                        IDS.print.TextAreaAppend(IDS.ProtoFilterString +" Protocol Filtering Activated\n");
                      }
                    }


//Write New Settings to XML File in memory
        try {
            //IDS.InputFile = new File("settings.xml");
            //IDS.saxBuilder = new SAXBuilder();
            org.jdom2.Document document = IDS.saxBuilder.build(IDS.InputFile);
            org.jdom2.Element rootElement = document.getRootElement();
            //get preferencecss
            org.jdom2.Element UserPreferences = rootElement.getChild("settings");
            // loop the preferences child node
            for (int i = 0; i < 10; i++) {
                org.jdom2.Element IndividualElement = UserPreferences.getChild(ElementNames[i]);
                IndividualElement.setText(ToSave[i]);
            }

           
            //Write to file in real life
            FileOutputStream fileout = new FileOutputStream("settings.xml");
            IDS.xmlout.output((org.jdom2.Document) document, fileout);
            fileout.flush();
            fileout.close();
           synchronized(IDS.msg){
             
            IDS.msg.InformationMessages("Save Successfull. Kindly Restart Sniffing if You are Already Doing So");
           }
            this.dispose();
        } catch (Exception ex) {
             synchronized(IDS.msg){
            IDS.msg.ErrorMessages("Error: " + ex);
             }
        }

    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ARPCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ARPCheckBoxItemStateChanged
        if(ARPCheckBox.isSelected()){
            FilterAllCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_ARPCheckBoxItemStateChanged

    private void ICMPCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ICMPCheckBoxItemStateChanged
        if(ICMPCheckBox.isSelected()){
            FilterAllCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_ICMPCheckBoxItemStateChanged

    private void IGMPCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IGMPCheckBoxItemStateChanged
         if(IGMPCheckBox.isSelected()){
            FilterAllCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_IGMPCheckBoxItemStateChanged

    private void IPCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IPCheckBoxItemStateChanged
         if(IPCheckBox.isSelected()){
            FilterAllCheckBox.setSelected(false);
           FilterAllCheckBox.setSelected(false);
            UDPCheckBox.setSelected(true);
            UDPCheckBox.setEnabled(false);
            TCPCheckBox.setSelected(true);
             TCPCheckBox.setEnabled(false); 
        }
          else{
              UDPCheckBox.setEnabled(true);
                TCPCheckBox.setEnabled(true);
                 UDPCheckBox.setSelected(false);
                  TCPCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_IPCheckBoxItemStateChanged

    private void TCPCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TCPCheckBoxItemStateChanged
        if(TCPCheckBox.isSelected()){
            FilterAllCheckBox.setSelected(false);
        }
       
    }//GEN-LAST:event_TCPCheckBoxItemStateChanged

    private void UDPCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_UDPCheckBoxItemStateChanged
        if(UDPCheckBox.isSelected()){
            FilterAllCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_UDPCheckBoxItemStateChanged

    private void FilterAllCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilterAllCheckBoxItemStateChanged
        if(FilterAllCheckBox.isSelected()){
            ARPCheckBox.setSelected(false);
            ICMPCheckBox.setSelected(false);
             IGMPCheckBox.setSelected(false);
              IPCheckBox.setSelected(false);
               TCPCheckBox.setSelected(false);
                UDPCheckBox.setSelected(false);
          
        }
    }//GEN-LAST:event_FilterAllCheckBoxItemStateChanged

    private void AddPortBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AddPortBoxItemStateChanged
       if(AddPortBox.isSelected()==true){
        PortNameField.setEnabled(true);
        PortNumberField.setEnabled(true);
        AddPortButton.setEnabled(true);
          PortNameField.setText("");
        PortNumberField.setText("");
       }
       else{
           PortNameField.setEnabled(false);
        PortNumberField.setEnabled(false);
        AddPortButton.setEnabled(false); 
                 PortNameField.setText("E.g. DNS");
        PortNumberField.setText("E.g. 53");
       }
    }//GEN-LAST:event_AddPortBoxItemStateChanged

    private void PortNumberFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PortNumberFieldKeyTyped
           char c = evt.getKeyChar();
        if ((!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PortNumberFieldKeyTyped

    private void PortNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PortNameFieldKeyTyped
            char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_TAB) || (c == KeyEvent.VK_ENTER) || (c == KeyEvent.VK_SPACE) ) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_PortNameFieldKeyTyped

    private void AddPortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPortButtonActionPerformed
      
   //WriteToFile writer = new WriteToFile();
    //ReadFile reader = new ReadFile();
        String PortName =  PortNameField.getText();
      String PortNumber =  PortNumberField.getText();
      if(PortName.equals("")){
          synchronized(IDS.msg){
          IDS.msg.ErrorMessages("Please enter A Port Name");
          return;
          }
      }
      else if(Integer.parseInt(PortNumber)>1024){
          synchronized(IDS.msg){
          IDS.msg.ErrorMessages("Please enter A Valid Port Number");
          return;
          }
      }
      String Concat = PortName.toUpperCase()+" - "+"port "+PortNumber;
            
            try {
                synchronized(IDS.writer){ //This sync not actually necessary. Nod dual thread operation on this method
                IDS.writer.Write(Concat, "ports.txt");
                }
            }catch(Exception ex){
                synchronized(IDS.msg){
                IDS.msg.ErrorMessages("File Not Found: "+ex);
                return;
                }
            }
            synchronized(IDS.reader){
              ArrayList list = IDS.reader.Read("ports.txt");
            
              FilterComboBox.removeAllItems();
              for (int i=0; i<list.size(); i++){
                     FilterComboBox.addItem(list.get(i));
              }
              }
         synchronized(IDS.msg){
                IDS.msg.InformationMessages("New Port Successfully Added");   
         }
    }//GEN-LAST:event_AddPortButtonActionPerformed

    private void RevertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevertButtonActionPerformed
      
        ReadFile reader = new ReadFile();
        WriteToFile writer = new WriteToFile();
       ArrayList list = reader.Read("defaultports.txt");
        FilterComboBox.removeAllItems();
        for (int i=0; i<list.size(); i++){
                     FilterComboBox.addItem(list.get(i));
              }
    
          writer.OverWrite(list, "ports.txt");
         IDS.msg.InformationMessages("Revert Successfull");
    }//GEN-LAST:event_RevertButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ARPCheckBox;
    private javax.swing.JCheckBox AddPortBox;
    private javax.swing.JButton AddPortButton;
    private javax.swing.JTextField AdminMailField;
    private javax.swing.JCheckBox FilterAllCheckBox;
    private javax.swing.JComboBox FilterComboBox;
    private javax.swing.JSpinner FitnessSpinner;
    private javax.swing.JCheckBox ICMPCheckBox;
    private javax.swing.JCheckBox IGMPCheckBox;
    private javax.swing.JCheckBox IPCheckBox;
    private javax.swing.JTextField PortNameField;
    private javax.swing.JTextField PortNumberField;
    private javax.swing.JButton RevertButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JCheckBox TCPCheckBox;
    private javax.swing.JCheckBox UDPCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}