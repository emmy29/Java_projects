package tuck_shop_management_system;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class tuck_shop_management_system extends javax.swing.JFrame {
     
    public tuck_shop_management_system() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        calculate = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButtonRESET = new javax.swing.JButton();
        jButtonEXIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextReceipt = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonBallpen = new javax.swing.JButton();
        jButtonNotebook = new javax.swing.JButton();
        jButtonEraser = new javax.swing.JButton();
        jButtonPencil = new javax.swing.JButton();
        jButtonA4sheets = new javax.swing.JButton();
        jButtonMarker = new javax.swing.JButton();
        jButtonFolder = new javax.swing.JButton();
        jButtonHighlighter = new javax.swing.JButton();
        jCheckBoxNotebook = new javax.swing.JCheckBox();
        jTextFieldNotebook = new javax.swing.JTextField();
        jCheckBoxA4Notebook = new javax.swing.JCheckBox();
        jTextFieldA4Notebook = new javax.swing.JTextField();
        jCheckBoxSpiralNotebook = new javax.swing.JCheckBox();
        jTextFieldSpiralNotebook = new javax.swing.JTextField();
        jCheckBoxRoughNotebook = new javax.swing.JCheckBox();
        jTextFieldRoughNotebook = new javax.swing.JTextField();
        jCheckBoxBlue = new javax.swing.JCheckBox();
        jTextFieldBlue = new javax.swing.JTextField();
        jCheckBoxBlack = new javax.swing.JCheckBox();
        jTextFieldBlack = new javax.swing.JTextField();
        jCheckBox2H = new javax.swing.JCheckBox();
        jTextField2H = new javax.swing.JTextField();
        jCheckBoxA4sheets = new javax.swing.JCheckBox();
        jTextFieldA4sheets = new javax.swing.JTextField();
        jCheckBox6B = new javax.swing.JCheckBox();
        jTextField6B = new javax.swing.JTextField();
        jCheckBoxBlank = new javax.swing.JCheckBox();
        jTextFieldBlank = new javax.swing.JTextField();
        jCheckBoxGreen = new javax.swing.JCheckBox();
        jTextFieldGreen = new javax.swing.JTextField();
        jCheckBoxRed = new javax.swing.JCheckBox();
        jTextFieldRed = new javax.swing.JTextField();
        jCheckBoxEraser = new javax.swing.JCheckBox();
        jTextFieldEraser = new javax.swing.JTextField();
        jCheckBoxMarker = new javax.swing.JCheckBox();
        jTextFieldMarker = new javax.swing.JTextField();
        jCheckBoxFolder = new javax.swing.JCheckBox();
        jTextFieldFolder = new javax.swing.JTextField();
        jCheckBoxHighlighter = new javax.swing.JCheckBox();
        jTextFieldHighlighter = new javax.swing.JTextField();
        jButtonFolder1 = new javax.swing.JButton();
        jButtonFolder2 = new javax.swing.JButton();
        jCheckBoxSharpner = new javax.swing.JCheckBox();
        jTextFieldSharpner = new javax.swing.JTextField();
        jButtonBallpen1 = new javax.swing.JButton();
        jCheckBoxPhotostates = new javax.swing.JCheckBox();
        jTextFieldPhotostates = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        calculate.setText("CALCULATE");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonRESET.setText("RESET");
        jButtonRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRESETActionPerformed(evt);
            }
        });

        jButtonEXIT.setText("EXIT");
        jButtonEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXITActionPerformed(evt);
            }
        });

        jTextReceipt.setColumns(20);
        jTextReceipt.setRows(5);
        jScrollPane1.setViewportView(jTextReceipt);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("SUBTOTAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("TAX");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("TOTAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButtonRESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 430));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cost of Item and Receipt");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 205, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 330, 460));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBallpen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBallpen.setText("Ball pen");
        jButtonBallpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBallpenActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBallpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 143, 256, -1));

        jButtonNotebook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNotebook.setText("Notebooks");
        jButtonNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotebookActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 256, -1));

        jButtonEraser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEraser.setText("Eraser");
        jButtonEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEraserActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEraser, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 143, 210, -1));

        jButtonPencil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPencil.setText("Pencil");
        jButtonPencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPencilActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPencil, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 239, 256, -1));

        jButtonA4sheets.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonA4sheets.setText("Assignment sheets");
        jButtonA4sheets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonA4sheetsActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonA4sheets, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 307, 256, -1));

        jButtonMarker.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMarker.setText("Marker");
        jButtonMarker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarkerActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMarker, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 239, 210, -1));

        jButtonFolder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFolder.setText("Folder");
        jButtonFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFolderActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 307, 210, -1));

        jButtonHighlighter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHighlighter.setText("Highlighter");
        jButtonHighlighter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHighlighterActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonHighlighter, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 36, 210, -1));

        jCheckBoxNotebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxNotebook.setText("Notebook");
        jCheckBoxNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNotebookActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        jTextFieldNotebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 40, -1));

        jCheckBoxA4Notebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxA4Notebook.setText("A4");
        jCheckBoxA4Notebook.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxA4Notebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxA4NotebookActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxA4Notebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 60, 20));

        jTextFieldA4Notebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldA4Notebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 40, -1));

        jCheckBoxSpiralNotebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxSpiralNotebook.setText("Spiral");
        jCheckBoxSpiralNotebook.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxSpiralNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSpiralNotebookActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxSpiralNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 20));

        jTextFieldSpiralNotebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldSpiralNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, -1));

        jCheckBoxRoughNotebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxRoughNotebook.setText("White");
        jCheckBoxRoughNotebook.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxRoughNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRoughNotebookActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxRoughNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 60, 20));

        jTextFieldRoughNotebook.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldRoughNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 40, 20));

        jCheckBoxBlue.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxBlue.setText("Blue");
        jCheckBoxBlue.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlueActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 20));

        jTextFieldBlue.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBlueActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 40, 20));

        jCheckBoxBlack.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxBlack.setText("Black pen");
        jCheckBoxBlack.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlackActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, 20));

        jTextFieldBlack.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBlackActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 40, -1));

        jCheckBox2H.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBox2H.setText("2H");
        jCheckBox2H.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBox2H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2HActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2H, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, 20));

        jTextField2H.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField2H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2HActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2H, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 40, 20));

        jCheckBoxA4sheets.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxA4sheets.setText("A4");
        jCheckBoxA4sheets.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxA4sheets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxA4sheetsActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxA4sheets, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 20));

        jTextFieldA4sheets.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldA4sheets, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 40, -1));

        jCheckBox6B.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBox6B.setText("6B");
        jCheckBox6B.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBox6B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6BActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox6B, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 60, 20));

        jTextField6B.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField6B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6BActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6B, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 40, 20));

        jCheckBoxBlank.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxBlank.setText("Blank");
        jCheckBoxBlank.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxBlank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBlankActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxBlank, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 60, 20));

        jTextFieldBlank.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldBlank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBlankActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldBlank, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 40, 20));

        jCheckBoxGreen.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxGreen.setText("Green");
        jCheckBoxGreen.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGreenActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 20));

        jTextFieldGreen.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 40, 20));

        jCheckBoxRed.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxRed.setText("Red");
        jCheckBoxRed.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRedActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 70, 20));

        jTextFieldRed.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRedActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 40, 20));

        jCheckBoxEraser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxEraser.setText("Eraser");
        jCheckBoxEraser.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEraserActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxEraser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 70, 20));

        jTextFieldEraser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEraserActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEraser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 40, 20));

        jCheckBoxMarker.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxMarker.setText("Marker");
        jCheckBoxMarker.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxMarker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMarkerActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxMarker, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 20));

        jTextFieldMarker.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldMarker, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 40, -1));

        jCheckBoxFolder.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxFolder.setText("Folder");
        jCheckBoxFolder.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFolderActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 60, 20));

        jTextFieldFolder.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 40, -1));

        jCheckBoxHighlighter.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxHighlighter.setText("Highlighter");
        jCheckBoxHighlighter.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxHighlighter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHighlighterActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxHighlighter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 60, 20));

        jTextFieldHighlighter.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextFieldHighlighter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHighlighterActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldHighlighter, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 40, -1));

        jButtonFolder1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFolder1.setText("Sharpner");
        jButtonFolder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFolder1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFolder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 375, 256, -1));

        jButtonFolder2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFolder2.setText("Photostates");
        jButtonFolder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFolder2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFolder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 375, 210, -1));

        jCheckBoxSharpner.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxSharpner.setText("Sharpner");
        jCheckBoxSharpner.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxSharpner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSharpnerActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxSharpner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 60, 20));

        jTextFieldSharpner.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldSharpner, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 40, -1));

        jButtonBallpen1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBallpen1.setText("ITEMS");
        jButtonBallpen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBallpen1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBallpen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 7, 484, -1));

        jCheckBoxPhotostates.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBoxPhotostates.setText("Phostates");
        jCheckBoxPhotostates.setPreferredSize(new java.awt.Dimension(73, 21));
        jCheckBoxPhotostates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPhotostatesActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxPhotostates, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 60, 20));

        jTextFieldPhotostates.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(jTextFieldPhotostates, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 40, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 520, 460));

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("TUCK SHOP MANAGEMENT SYSTEM");
        jLabel1.setAlignmentY(1.0F);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(270, 270, 270))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 850, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBallpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBallpenActionPerformed
    jCheckBoxBlue.setEnabled(true);
    }//GEN-LAST:event_jButtonBallpenActionPerformed

    private void jButtonNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotebookActionPerformed
       
      jCheckBoxNotebook.setEnabled(true); 
    }//GEN-LAST:event_jButtonNotebookActionPerformed

    private void jButtonEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEraserActionPerformed
        jCheckBoxEraser.setEnabled(true);
    }//GEN-LAST:event_jButtonEraserActionPerformed

    private void jButtonPencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPencilActionPerformed
        jCheckBox2H.setEnabled(true);
    }//GEN-LAST:event_jButtonPencilActionPerformed

    private void jButtonA4sheetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonA4sheetsActionPerformed
        jCheckBoxA4sheets.setEnabled(true);
    }//GEN-LAST:event_jButtonA4sheetsActionPerformed

    private void jButtonMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarkerActionPerformed
        jCheckBoxMarker.setEnabled(true);
    }//GEN-LAST:event_jButtonMarkerActionPerformed

    private void jButtonFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFolderActionPerformed
        jCheckBoxFolder.setEnabled(true);
    }//GEN-LAST:event_jButtonFolderActionPerformed

    private void jButtonHighlighterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHighlighterActionPerformed
        jCheckBoxHighlighter.setEnabled(true);
    }//GEN-LAST:event_jButtonHighlighterActionPerformed

    private void jCheckBoxNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNotebookActionPerformed
       jTextFieldNotebook.setEnabled(true); 
    }//GEN-LAST:event_jCheckBoxNotebookActionPerformed

    private void jCheckBoxBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlueActionPerformed
       jTextFieldBlue.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxBlueActionPerformed

    private void jCheckBoxEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEraserActionPerformed
        jTextFieldEraser.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxEraserActionPerformed

    private void jCheckBox2HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2HActionPerformed
        jTextField2H.setEnabled(true);
    }//GEN-LAST:event_jCheckBox2HActionPerformed

    private void jCheckBoxA4sheetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxA4sheetsActionPerformed
        jTextFieldA4sheets.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxA4sheetsActionPerformed

    private void jCheckBoxMarkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMarkerActionPerformed
        jTextFieldMarker.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxMarkerActionPerformed

    private void jCheckBoxA4NotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxA4NotebookActionPerformed
        jTextFieldA4Notebook.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxA4NotebookActionPerformed

    private void jCheckBoxFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFolderActionPerformed
        jTextFieldFolder.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxFolderActionPerformed

    private void jCheckBoxRoughNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRoughNotebookActionPerformed
        jTextFieldRoughNotebook.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxRoughNotebookActionPerformed

    private void jCheckBoxSpiralNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSpiralNotebookActionPerformed
        jTextFieldSpiralNotebook.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxSpiralNotebookActionPerformed

    private void jCheckBoxBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlackActionPerformed
       jTextFieldBlack.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxBlackActionPerformed

    private void jCheckBoxSharpnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSharpnerActionPerformed
        jTextFieldSharpner.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxSharpnerActionPerformed

    private void jTextFieldBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBlackActionPerformed
        
    }//GEN-LAST:event_jTextFieldBlackActionPerformed

    private void jTextFieldHighlighterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHighlighterActionPerformed
      
    }//GEN-LAST:event_jTextFieldHighlighterActionPerformed

    private void jCheckBoxHighlighterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHighlighterActionPerformed
       jTextFieldHighlighter.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxHighlighterActionPerformed
    private JFrame frame;
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       jTextFieldNotebook.setEnabled(false);
       jTextField2H.setEnabled(false);
       jTextFieldMarker.setEnabled(false);
       jTextFieldFolder.setEnabled(false);
       jTextFieldRoughNotebook.setEnabled(false);
       jTextFieldBlack.setEnabled(false);
       jTextFieldBlue.setEnabled(false);
       jTextFieldEraser.setEnabled(false);
       jTextFieldA4sheets.setEnabled(false);
       jTextFieldA4Notebook.setEnabled(false);
       jTextFieldSpiralNotebook.setEnabled(false);
       jTextFieldSharpner.setEnabled(false);
       jTextField6B.setEnabled(false);
       jTextFieldGreen.setEnabled(false);
       jTextFieldRed.setEnabled(false);
       jTextFieldBlank.setEnabled(false);
       jTextFieldHighlighter.setEnabled(false);
       jTextFieldPhotostates.setEnabled(false);
    
    }//GEN-LAST:event_formWindowActivated

    private void jCheckBox6BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6BActionPerformed
        jTextField6B.setEnabled(true);
    }//GEN-LAST:event_jCheckBox6BActionPerformed

    private void jTextField2HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2HActionPerformed

    private void jTextField6BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6BActionPerformed

    private void jCheckBoxBlankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBlankActionPerformed
       jTextFieldBlank.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxBlankActionPerformed

    private void jTextFieldBlankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBlankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBlankActionPerformed

    private void jCheckBoxGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGreenActionPerformed
       jTextFieldGreen.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxGreenActionPerformed

    private void jCheckBoxRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRedActionPerformed
              jTextFieldRed.setEnabled(true);

    }//GEN-LAST:event_jCheckBoxRedActionPerformed

    private void jTextFieldRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRedActionPerformed

    private void jButtonFolder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFolder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFolder1ActionPerformed

    private void jButtonFolder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFolder2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFolder2ActionPerformed

    private void jButtonBallpen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBallpen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBallpen1ActionPerformed

    private void jCheckBoxPhotostatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPhotostatesActionPerformed
              jTextFieldPhotostates.setEnabled(true);

    }//GEN-LAST:event_jCheckBoxPhotostatesActionPerformed

    private void jTextFieldEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEraserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEraserActionPerformed

    private void jTextFieldBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBlueActionPerformed

    private void jButtonEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXITActionPerformed
        frame=new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "TUCK SHOP SYSTEM", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonEXITActionPerformed

    private void jButtonRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRESETActionPerformed

        jCheckBoxNotebook.setSelected(false);
        jCheckBox2H.setSelected(false);
        jCheckBoxMarker.setSelected(false);
        jCheckBoxFolder.setSelected(false);
        jCheckBoxRoughNotebook.setSelected(false);
        jCheckBoxBlack.setSelected(false);
        jCheckBoxBlue.setSelected(false);
        jCheckBoxEraser.setSelected(false);
        jCheckBoxA4sheets.setSelected(false);
        jCheckBoxA4Notebook.setSelected(false);
        jCheckBoxSpiralNotebook.setSelected(false);
        jCheckBoxSharpner.setSelected(false);
        jCheckBox6B.setSelected(false);
        jCheckBoxGreen.setSelected(false);
        jCheckBoxRed.setSelected(false);
        jCheckBoxBlank.setSelected(false);
        jCheckBoxHighlighter.setSelected(false);
        jCheckBoxPhotostates.setSelected(false);

        jTextFieldNotebook.setEnabled(false);
        jTextField2H.setEnabled(false);
        jTextFieldMarker.setEnabled(false);
        jTextFieldFolder.setEnabled(false);
        jTextFieldRoughNotebook.setEnabled(false);
        jTextFieldBlack.setEnabled(false);
        jTextFieldBlue.setEnabled(false);
        jTextFieldEraser.setEnabled(false);
        jTextFieldA4sheets.setEnabled(false);
        jTextFieldA4Notebook.setEnabled(false);
        jTextFieldSpiralNotebook.setEnabled(false);
        jTextFieldSharpner.setEnabled(false);
        jTextField6B.setEnabled(false);
        jTextFieldGreen.setEnabled(false);
        jTextFieldRed.setEnabled(false);
        jTextFieldBlank.setEnabled(false);
        jTextFieldHighlighter.setEnabled(false);
        jTextFieldPhotostates.setEnabled(false);

        this.dispose();
        new tuck_shop_management_system().setVisible(true);

    }//GEN-LAST:event_jButtonRESETActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        float tax=0.0f;
        float total=0.0f;
        int subtotal=0;
        int a,b,c,d,e,f,g;
        a=Integer.parseInt(jTextFieldNotebook.getText());

        if(jTextFieldA4Notebook.getText().length()==0){
            b=0;
        }else{
            b=Integer.parseInt(jTextFieldA4Notebook.getText());
        }

        if(jTextFieldSpiralNotebook.getText().length()==0){
            c=0;
        }else{
            c=Integer.parseInt(jTextFieldSpiralNotebook.getText());
        }

        if(jTextFieldRoughNotebook.getText().length()==0){
            d=0;
        }else{
            d=Integer.parseInt(jTextFieldRoughNotebook.getText());
        }
        if(jTextFieldBlue.getText().length()==0){
            e=0;
        }else{
            e=Integer.parseInt(jTextFieldBlue.getText());
        }

        if(jTextFieldBlack.getText().length()==0){
            f=0;
        }else{
            f=Integer.parseInt(jTextFieldBlack.getText());
        }

        if(jTextFieldGreen.getText().length()==0){
            g=0;
        }else{
            g=Integer.parseInt(jTextFieldGreen.getText());
        }
        int h=0;
        if(jTextFieldRed.getText().length()==0){
            h=0;
        }else{
           h=Integer.parseInt(jTextFieldRed.getText());
        } 
        int i=0;
        if(jTextField2H.getText().length()==0){
            i=0;
        }else{
            i=Integer.parseInt(jTextField2H.getText());
        }
        int j=0;
        if(jTextField6B.getText().length()==0){
            j=0;
        }else{
            j=Integer.parseInt(jTextField6B.getText());
        }
        int k=0;
        if(jTextFieldA4sheets.getText().length()==0){
            k=0;
        }else{
            k=Integer.parseInt(jTextFieldA4sheets.getText());
        }
        int l=0;
        if(jTextFieldBlank.getText().length()==0){
            l=0;
        }else{
            l=Integer.parseInt(jTextFieldBlank.getText());
        }
        int m=0;
        if(jTextFieldSharpner.getText().length()==0){
            m=0;
        }else{
            m=Integer.parseInt(jTextFieldSharpner.getText());
        }
        int n=0;
        if(jTextFieldHighlighter.getText().length()==0){
            n=0;
        }else{
            n=Integer.parseInt(jTextFieldHighlighter.getText());
        }
        int o=0;
        if(jTextFieldEraser.getText().length()==0){
            o=0;
        }else{
            o=Integer.parseInt(jTextFieldEraser.getText());
        }
        int p=0;
        if(jTextFieldMarker.getText().length()==0){
            p=0;
        }else{
            p=Integer.parseInt(jTextFieldMarker.getText());
        }
        int q=0;
        if(jTextFieldFolder.getText().length()==0){
            q=0;
        }else{
            q=Integer.parseInt(jTextFieldFolder.getText());
        }
        int r=0;
        if(jTextFieldPhotostates.getText().length()==0){
            r=0;
        }else{
            r=Integer.parseInt(jTextFieldPhotostates.getText());
        }
        
        int nb=10,sb=50,ab=60,wh=30,bl=10,re=10,gr=10,bk=10,hp=5,hb=3,as=30,bn=20,
        sh=5,hh=25,er=5,ma=35,fl=20,ps=1;
        

        subtotal=((a*nb)+(b*ab)+(c*sb)+(d*wh)+(e*bl)+(f*bk)+(g*gr)+(h*re)+(i*hp)+
            (j*hb)+(k*as)+(l*bn)+(m*sh)+(n*hh)+(o*er)+(p*ma)+(q*fl)+(r*ps));
        String sc=String.valueOf(subtotal);
        jTextField1.setText(sc);

        tax=subtotal/100;
        String st=String.valueOf(tax);
        jTextField2.setText(st);

        total=subtotal+tax;
        String tt=String.valueOf(total);
        jTextField3.setText(tt);
                

        int refs=1325+(int)(Math.random()*4238);
        Calendar timer=Calendar.getInstance();

        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate=new SimpleDateFormat("dd:MM:yy");
        tDate.format(timer.getTime());

        jTextReceipt.append("               Tuck shop management System\n"+"reference:\t"+refs+
        "\nITEMS   "+"       -price"+"  -quantity");
         if(jCheckBoxNotebook.isSelected()){
                jTextReceipt.append("\nNotebook"+"        "+nb+"   "+a);
            }
         if(jCheckBoxA4Notebook.isSelected()){
                jTextReceipt.append("\nA4"+"                      "+ab+"   "+b);
            }
         if(jCheckBoxSpiralNotebook.isSelected()){
                jTextReceipt.append("\nSpiral"+"               "+sb+"   "+c);
            }
         if(jCheckBoxRoughNotebook.isSelected()){
                jTextReceipt.append("\nRough"+"            "+wh+"   "+d);
            }
         if(jCheckBoxBlue.isSelected()){
                jTextReceipt.append("\nBlue pen"+"          "+bl+"   "+e);
            }
          if(jCheckBoxBlack.isSelected()){
                jTextReceipt.append("\nBlack Pen"+"         "+nb+"   "+a);
            }
         if(jCheckBoxGreen.isSelected()){
                jTextReceipt.append("\nGreen Pen"+"         "+gr+"   "+g);
            }
         if(jCheckBoxRed.isSelected()){
                jTextReceipt.append("\nRed Pen"+"           "+re+"   "+h);
            }
         if(jCheckBox2H.isSelected()){
                jTextReceipt.append("\n2H pensil"+"          "+hp+"   "+i);
            }
         if(jCheckBox6B.isSelected()){
                jTextReceipt.append("\n6B pensil"+"         "+hb+"   "+j);
            }
          if(jCheckBoxA4sheets.isSelected()){
                jTextReceipt.append("\nA4 sheets"+"       "+as+"   "+k);
            }
         if(jCheckBoxBlank.isSelected()){
                jTextReceipt.append("\nBlank Sheets"+"    "+bn+"   "+l);
            }
         if(jCheckBoxSharpner.isSelected()){
                jTextReceipt.append("\nSharpner"+"        "+sh+"   "+m);
            }
         if(jCheckBoxHighlighter.isSelected()){
                jTextReceipt.append("\nHighlighter"+"     "+hh+"   "+n);
            }
         if(jCheckBoxEraser.isSelected()){
                jTextReceipt.append("\nEraser"+"             "+er+"   "+o);
            }
         
         if(jCheckBoxMarker.isSelected()){
                jTextReceipt.append("\nMarker"+"           "+ma+"   "+p);
            }
         if(jCheckBoxFolder.isSelected()){
                jTextReceipt.append("\nFolder"+"             "+fl+"   "+q);
            }
          if(jCheckBoxPhotostates.isSelected()){
                jTextReceipt.append("\nPhotostates"+"     "+ps+"   "+r);
            }
        
        jTextReceipt.append( "\nTax = "+"          "+st+
            "\nSubtotal = "+"          "+sc+
           "\nTotal = "+"          "+tt+
            "\nDate:"+tDate.format(timer.getTime())+
            "\t\tTime:"+tTime.format(timer.getTime())+
            "\n\n\t thank you for shopping\n"
        );
    }//GEN-LAST:event_calculateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tuck_shop_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tuck_shop_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tuck_shop_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tuck_shop_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tuck_shop_management_system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonA4sheets;
    private javax.swing.JButton jButtonBallpen;
    private javax.swing.JButton jButtonBallpen1;
    private javax.swing.JButton jButtonEXIT;
    private javax.swing.JButton jButtonEraser;
    private javax.swing.JButton jButtonFolder;
    private javax.swing.JButton jButtonFolder1;
    private javax.swing.JButton jButtonFolder2;
    private javax.swing.JButton jButtonHighlighter;
    private javax.swing.JButton jButtonMarker;
    private javax.swing.JButton jButtonNotebook;
    private javax.swing.JButton jButtonPencil;
    private javax.swing.JButton jButtonRESET;
    private javax.swing.JCheckBox jCheckBox2H;
    private javax.swing.JCheckBox jCheckBox6B;
    private javax.swing.JCheckBox jCheckBoxA4Notebook;
    private javax.swing.JCheckBox jCheckBoxA4sheets;
    private javax.swing.JCheckBox jCheckBoxBlack;
    private javax.swing.JCheckBox jCheckBoxBlank;
    private javax.swing.JCheckBox jCheckBoxBlue;
    private javax.swing.JCheckBox jCheckBoxEraser;
    private javax.swing.JCheckBox jCheckBoxFolder;
    private javax.swing.JCheckBox jCheckBoxGreen;
    private javax.swing.JCheckBox jCheckBoxHighlighter;
    private javax.swing.JCheckBox jCheckBoxMarker;
    private javax.swing.JCheckBox jCheckBoxNotebook;
    private javax.swing.JCheckBox jCheckBoxPhotostates;
    private javax.swing.JCheckBox jCheckBoxRed;
    private javax.swing.JCheckBox jCheckBoxRoughNotebook;
    private javax.swing.JCheckBox jCheckBoxSharpner;
    private javax.swing.JCheckBox jCheckBoxSpiralNotebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField2H;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6B;
    private javax.swing.JTextField jTextFieldA4Notebook;
    private javax.swing.JTextField jTextFieldA4sheets;
    private javax.swing.JTextField jTextFieldBlack;
    private javax.swing.JTextField jTextFieldBlank;
    private javax.swing.JTextField jTextFieldBlue;
    private javax.swing.JTextField jTextFieldEraser;
    private javax.swing.JTextField jTextFieldFolder;
    private javax.swing.JTextField jTextFieldGreen;
    private javax.swing.JTextField jTextFieldHighlighter;
    private javax.swing.JTextField jTextFieldMarker;
    private javax.swing.JTextField jTextFieldNotebook;
    private javax.swing.JTextField jTextFieldPhotostates;
    private javax.swing.JTextField jTextFieldRed;
    private javax.swing.JTextField jTextFieldRoughNotebook;
    private javax.swing.JTextField jTextFieldSharpner;
    private javax.swing.JTextField jTextFieldSpiralNotebook;
    private javax.swing.JTextArea jTextReceipt;
    // End of variables declaration//GEN-END:variables
}
