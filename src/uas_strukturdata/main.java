/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_strukturdata;


import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Revaldi
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public HashTable h; 
    public int sizeTable;
    DefaultTableModel model;
    String[] header = new String[]{"Index","Nama","NIM","Prodi","Fakultas"};
    public Object[] objs;
    public int nomor;
    
    public main(int s) {
        this.sizeTable = s;
        initComponents();
        model = new DefaultTableModel(header,0);
        h = new HashTable(sizeTable);
        objs = new Object[100];
        tableData.setModel(model); 
        this.nomor = 0;
        
    }

    private main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        displaySB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        display_acc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        homeSB = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        home_acc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertSB = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        insert_acc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        display_name = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insertPanel = new javax.swing.JPanel();
        txtNama = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtFakultas = new javax.swing.JTextField();
        simpan_btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txt_nomor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_urutkan = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tampilkan_btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        display_nama = new javax.swing.JLabel();
        display_nim = new javax.swing.JLabel();
        display_prodi = new javax.swing.JLabel();
        display_fakultas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kelola Data Mahasiswa");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(51, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(250, 720));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displaySB.setBackground(new java.awt.Color(51, 51, 51));
        displaySB.setPreferredSize(new java.awt.Dimension(250, 70));
        displaySB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displaySBMouseClicked(evt);
            }
        });
        displaySB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_table_48px.png"))); // NOI18N
        displaySB.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, -1, -1));

        display_acc.setBackground(new java.awt.Color(204, 0, 0));
        display_acc.setForeground(new java.awt.Color(153, 0, 0));
        displaySB.add(display_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Display");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        displaySB.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 25, -1, -1));

        sidePanel.add(displaySB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        homeSB.setBackground(new java.awt.Color(51, 51, 51));
        homeSB.setPreferredSize(new java.awt.Dimension(250, 70));
        homeSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeSBMouseClicked(evt);
            }
        });
        homeSB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_48px_1.png"))); // NOI18N
        homeSB.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, -1, -1));

        home_acc.setBackground(new java.awt.Color(204, 0, 0));
        home_acc.setForeground(new java.awt.Color(153, 0, 0));
        home_acc.setOpaque(true);
        homeSB.add(home_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Home");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        homeSB.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 25, -1, -1));

        sidePanel.add(homeSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        insertSB.setBackground(new java.awt.Color(51, 51, 51));
        insertSB.setPreferredSize(new java.awt.Dimension(250, 70));
        insertSB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertSBMouseClicked(evt);
            }
        });
        insertSB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_writer_male_48px.png"))); // NOI18N
        insertSB.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, -1, -1));

        insert_acc.setBackground(new java.awt.Color(204, 0, 0));
        insert_acc.setForeground(new java.awt.Color(153, 0, 0));
        insertSB.add(insert_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Insert");
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        insertSB.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 25, -1, -1));

        sidePanel.add(insertSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/k2.png"))); // NOI18N
        sidePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_150px.png"))); // NOI18N
        sidePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        display_name.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        display_name.setForeground(new java.awt.Color(255, 255, 255));
        display_name.setText("Nama");
        sidePanel.add(display_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        contentPanel.setPreferredSize(new java.awt.Dimension(1030, 720));
        contentPanel.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("SELAMAT DATANG");
        homePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 460, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_200px_1.png"))); // NOI18N
        homePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        contentPanel.add(homePanel, "card2");

        insertPanel.setBackground(new java.awt.Color(255, 255, 255));
        insertPanel.setPreferredSize(new java.awt.Dimension(1030, 720));
        insertPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNama.setBorder(null);
        txtNama.setOpaque(false);
        insertPanel.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 420, -1));

        txtNIM.setBackground(new java.awt.Color(255, 255, 255));
        txtNIM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNIM.setBorder(null);
        insertPanel.add(txtNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 420, -1));

        txtProdi.setBackground(new java.awt.Color(255, 255, 255));
        txtProdi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtProdi.setBorder(null);
        insertPanel.add(txtProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 420, -1));

        txtFakultas.setBackground(new java.awt.Color(255, 255, 255));
        txtFakultas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtFakultas.setBorder(null);
        insertPanel.add(txtFakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 420, -1));

        simpan_btn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        simpan_btn.setText("Simpan");
        simpan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_btnActionPerformed(evt);
            }
        });
        insertPanel.add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 120, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Kosongkan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        insertPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nomor Index");
        insertPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("NIM");
        insertPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Prodi");
        insertPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Fakultas");
        insertPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        insertPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 120, -1));
        insertPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 420, -1));
        insertPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 420, -1));
        insertPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 420, -1));
        insertPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 420, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator6.setOpaque(true);
        insertPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 20));
        insertPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 420, -1));

        jLabel20.setFont(new java.awt.Font("Clarendon Blk BT", 2, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText(" INSERT DATA MAHASISWA");
        insertPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, -1));

        txt_nomor.setBackground(new java.awt.Color(255, 255, 255));
        txt_nomor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_nomor.setBorder(null);
        insertPanel.add(txt_nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 420, 25));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nama ");
        insertPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setText("Reset Table Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        insertPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 180, 40));

        contentPanel.add(insertPanel, "card3");

        displayPanel.setBackground(new java.awt.Color(255, 255, 255));
        displayPanel.setPreferredSize(new java.awt.Dimension(1030, 720));
        displayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableData.setBackground(new java.awt.Color(255, 255, 255));
        tableData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableData.setForeground(new java.awt.Color(0, 0, 0));
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableData.setGridColor(new java.awt.Color(255, 255, 255));
        tableData.setShowHorizontalLines(false);
        tableData.setShowVerticalLines(false);
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        displayPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 490, -1));
        displayPanel.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 150, 370, 30));

        jButton3.setText("Cari");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        displayPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 100, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama", "NIM" }));
        displayPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 100, 30));

        btn_urutkan.setText("Urutkan");
        btn_urutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_urutkanActionPerformed(evt);
            }
        });
        displayPanel.add(btn_urutkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 100, 30));

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        displayPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 100, -1));

        tampilkan_btn.setText("Tampilkan");
        tampilkan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkan_btnActionPerformed(evt);
            }
        });
        displayPanel.add(tampilkan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 100, -1));

        jLabel17.setFont(new java.awt.Font("Clarendon Blk BT", 2, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText(" DISPLAY DATA MAHASISWA");
        displayPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, -1));

        jSeparator7.setBackground(new java.awt.Color(204, 0, 0));
        jSeparator7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator7.setOpaque(true);
        displayPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nama : ");
        displayPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("NIM : ");
        displayPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Prodi :");
        displayPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Fakultas : ");
        displayPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        display_nama.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        display_nama.setForeground(new java.awt.Color(0, 0, 0));
        display_nama.setText("-");
        displayPanel.add(display_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        display_nim.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        display_nim.setForeground(new java.awt.Color(0, 0, 0));
        display_nim.setText("-");
        displayPanel.add(display_nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        display_prodi.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        display_prodi.setForeground(new java.awt.Color(0, 0, 0));
        display_prodi.setText("-");
        displayPanel.add(display_prodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        display_fakultas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        display_fakultas.setForeground(new java.awt.Color(0, 0, 0));
        display_fakultas.setText("-");
        displayPanel.add(display_fakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        contentPanel.add(displayPanel, "card4");

        mainPanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1030, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeSBMouseClicked
        homeBtn();
    }//GEN-LAST:event_homeSBMouseClicked

    private void insertSBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertSBMouseClicked
        insertBtn();
    }//GEN-LAST:event_insertSBMouseClicked

    private void displaySBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displaySBMouseClicked
        displayBtn();
    }//GEN-LAST:event_displaySBMouseClicked

    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed
        String nama = txtNama.getText();
        long nim = Long.parseLong(txtNIM.getText());
        String prodi = txtProdi.getText();
        String fakultas = txtFakultas.getText();
        int nomor = Integer.parseInt(txt_nomor.getText());
        
        
        h.insert(nama,nim,nomor,prodi,fakultas);
    }//GEN-LAST:event_simpan_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt_nomor.setText(null);
        txtNama.setText(null);
        txtNIM.setText(null);
        txtProdi.setText(null);
        txtFakultas.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tampilkan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkan_btnActionPerformed

       tampilkan();
        
    }//GEN-LAST:event_tampilkan_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        h.displayTable();
        System.out.println(sizeTable);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        model.setRowCount(0);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_urutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_urutkanActionPerformed
        String valueCombo = jComboBox1.getSelectedItem().toString();
        if(valueCombo.equals("Nama")){
            h.quickSortNama();
            tampilkan();
            
        } else {
            h.quickSortNim();
            tampilkan();
            h.percobaan = 0;
        }

    }//GEN-LAST:event_btn_urutkanActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        int baris = tableData.rowAtPoint(evt.getPoint());
        String d_nama = tableData.getValueAt(baris,1).toString();
        display_nama.setText(d_nama);
        
        String d_nim = tableData.getValueAt(baris,2).toString();
        display_nim.setText(d_nim);
        
        
        String d_prodi = tableData.getValueAt(baris,3).toString();
        display_prodi.setText(d_prodi);
        
        String d_fakultas = tableData.getValueAt(baris,4).toString();
        display_fakultas.setText(d_fakultas);
    }//GEN-LAST:event_tableDataMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cari = txt_search.getText();
        int hasil = h.binary_search(cari);
        model.setRowCount(0);
        Object[]obj = {hasil,h.hashArray[hasil].nama,h.hashArray[hasil].nim,h.hashArray[hasil].prodi,h.hashArray[hasil].fakultas};
        model.addRow(obj);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        homeBtn();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        insertBtn();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        displayBtn();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        h.TurnNull();
    }//GEN-LAST:event_jButton4ActionPerformed

   public void tampilkan(){
       model.setRowCount(0);
       for(int i=0;i<h.size;i++){
            if(h.hashArray[i] == null){
                h.hashArray[i] = null;
            }
            else {
                Object[]obj = {i,h.hashArray[i].nama,h.hashArray[i].nim,h.hashArray[i].prodi,h.hashArray[i].fakultas};
                model.addRow(obj);              
            }             
        }
   }
   public void bar(JLabel bar){
        home_acc.setOpaque(false);
        insert_acc.setOpaque(false);
        display_acc.setOpaque(false);
        bar.setOpaque(true);
        sidePanel.repaint();
        sidePanel.revalidate();
   }
   public void homeBtn(){
       //menghilangkan panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel.revalidate();
        //menambahkan panel
        contentPanel.add(homePanel);
        contentPanel.repaint();
        contentPanel.revalidate();
        //merah
        bar(home_acc);
   }
   public void insertBtn(){
       //menghilangkan panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel.revalidate();
        //menambahkan panel
        contentPanel.add(insertPanel);
        contentPanel.repaint();
        contentPanel.revalidate();
        //merah
        bar(insert_acc);
   }
   public void displayBtn(){
       //menghilangkan panel
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel.revalidate();
        //menambahkan panel
        contentPanel.add(displayPanel);
        contentPanel.repaint();
        contentPanel.revalidate();
        //merah
        bar(display_acc);
   }
   public void hapusData(int key){
      h.delete(key);
   }
   
  
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_urutkan;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JPanel displaySB;
    private javax.swing.JLabel display_acc;
    private javax.swing.JLabel display_fakultas;
    private javax.swing.JLabel display_nama;
    public javax.swing.JLabel display_name;
    private javax.swing.JLabel display_nim;
    private javax.swing.JLabel display_prodi;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeSB;
    private javax.swing.JLabel home_acc;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JPanel insertSB;
    private javax.swing.JLabel insert_acc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTable tableData;
    private javax.swing.JButton tampilkan_btn;
    private javax.swing.JTextField txtFakultas;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtProdi;
    private javax.swing.JTextField txt_nomor;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
