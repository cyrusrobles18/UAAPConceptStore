/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_datastruct;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;

/**
 *
 * @author Darell
 */
public class ListofOrders extends javax.swing.JFrame {

    private String filePath;

    /**
     * Creates new form ListofOrders
     */
    public ListofOrders() {
        initComponents();
        this.filePath = "C:\\Users\\HP\\Desktop\\Files(Programming)"
                + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct\\src\\project_datastruct\\"
                + lblAccName.getText().replace(" ", "") + ".txt";
    }

    public ListofOrders(String accName) {

        initComponents();

        this.lblAccName.setText(accName);
        this.filePath = "C:\\Users\\HP\\Desktop\\Files(Programming)"
                + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct\\src\\project_datastruct\\"
                + lblAccName.getText().replace(" ", "") + ".txt";
        readOrders();
    }

    private void readOrders() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filePath));
            String tempLine;
            String tempItemName;
            String tempTotal;
            String tempStatus;
            String[] acc;

            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");

                tempItemName = acc[1];
                tempTotal = acc[2];
                tempStatus = acc[3];

                lblProdName1.setText(tempItemName);
                lblTotalPrice1.setText(tempTotal);
                lblModeOfPayment1.setText(tempStatus);

                break;
            }
            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");

                tempItemName = acc[1];
                tempTotal = acc[2];
                tempStatus = acc[3];

                lblProdName2.setText(tempItemName);
                lblTotalPrice2.setText(tempTotal);
                lblModeOfPayment2.setText(tempStatus);

                break;

            }
            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");

                tempItemName = acc[1];
                tempTotal = acc[2];
                tempStatus = acc[3];

                lblProdName3.setText(tempItemName);
                lblTotalPrice3.setText(tempTotal);
                lblModeOfPayment3.setText(tempStatus);
                break;
            }
            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");

                tempItemName = acc[1];
                tempTotal = acc[2];
                tempStatus = acc[3];

                lblProdName4.setText(tempItemName);
                lblTotalPrice4.setText(tempTotal);
                lblModeOfPayment4.setText(tempStatus);
                break;
            }

            br.close();
        } catch (Exception e) {
            System.out.println("");
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

        Totalitems = new javax.swing.JLabel();
        itemstotal = new javax.swing.JLabel();
        listbackground = new javax.swing.JPanel();
        shipmenformLabel = new javax.swing.JLabel();
        produc1 = new javax.swing.JPanel();
        lblProdName1 = new javax.swing.JLabel();
        Totalitems1 = new javax.swing.JLabel();
        lblTotalPrice1 = new javax.swing.JLabel();
        lblModeOfPayment1 = new javax.swing.JLabel();
        produc2 = new javax.swing.JPanel();
        lblProdName2 = new javax.swing.JLabel();
        lblModeOfPayment2 = new javax.swing.JLabel();
        lblTotalPrice2 = new javax.swing.JLabel();
        Totalitems2 = new javax.swing.JLabel();
        produc3 = new javax.swing.JPanel();
        lblProdName3 = new javax.swing.JLabel();
        lblModeOfPayment3 = new javax.swing.JLabel();
        Totalitems3 = new javax.swing.JLabel();
        lblTotalPrice3 = new javax.swing.JLabel();
        produc4 = new javax.swing.JPanel();
        lblProdName4 = new javax.swing.JLabel();
        Totalitems4 = new javax.swing.JLabel();
        lblTotalPrice4 = new javax.swing.JLabel();
        lblModeOfPayment4 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        cancel2 = new javax.swing.JButton();
        cancel4 = new javax.swing.JButton();
        cancel3 = new javax.swing.JButton();
        btnBackOrder = new javax.swing.JButton();
        lblAccName = new javax.swing.JLabel();
        cancelAll = new javax.swing.JButton();

        Totalitems.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Totalitems.setForeground(new java.awt.Color(51, 51, 51));
        Totalitems.setText("Total Items:");

        itemstotal.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        itemstotal.setForeground(new java.awt.Color(51, 51, 51));
        itemstotal.setText("P0.00");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account");

        listbackground.setBackground(new java.awt.Color(255, 255, 255));

        shipmenformLabel.setBackground(new java.awt.Color(0, 0, 102));
        shipmenformLabel.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        shipmenformLabel.setForeground(new java.awt.Color(51, 51, 51));
        shipmenformLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_datastruct/1200px-Logo_of_University_Athletic_Association_of_the_Philippines.svg.png"))); // NOI18N
        shipmenformLabel.setText("UAAP CONCEPT STORE");

        produc1.setBackground(new java.awt.Color(255, 255, 255));
        produc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblProdName1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        lblProdName1.setForeground(new java.awt.Color(51, 51, 51));
        lblProdName1.setText("Product Name #1");

        Totalitems1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Totalitems1.setForeground(new java.awt.Color(51, 51, 51));
        Totalitems1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Totalitems1.setText("Total:");

        lblTotalPrice1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblTotalPrice1.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice1.setText("P0.00");

        lblModeOfPayment1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblModeOfPayment1.setForeground(new java.awt.Color(153, 153, 153));
        lblModeOfPayment1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModeOfPayment1.setText("mode of payment");

        javax.swing.GroupLayout produc1Layout = new javax.swing.GroupLayout(produc1);
        produc1.setLayout(produc1Layout);
        produc1Layout.setHorizontalGroup(
            produc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produc1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblProdName1)
                .addGap(290, 290, 290)
                .addGroup(produc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produc1Layout.createSequentialGroup()
                        .addComponent(Totalitems1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produc1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblModeOfPayment1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        produc1Layout.setVerticalGroup(
            produc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(produc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPrice1)
                    .addComponent(Totalitems1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModeOfPayment1)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produc1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProdName1)
                .addGap(28, 28, 28))
        );

        produc2.setBackground(new java.awt.Color(255, 255, 255));
        produc2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblProdName2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        lblProdName2.setForeground(new java.awt.Color(51, 51, 51));
        lblProdName2.setText("Product Name #2");

        lblModeOfPayment2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblModeOfPayment2.setForeground(new java.awt.Color(153, 153, 153));
        lblModeOfPayment2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModeOfPayment2.setText("mode of payment");

        lblTotalPrice2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblTotalPrice2.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice2.setText("P0.00");

        Totalitems2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Totalitems2.setForeground(new java.awt.Color(51, 51, 51));
        Totalitems2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Totalitems2.setText("Total:");

        javax.swing.GroupLayout produc2Layout = new javax.swing.GroupLayout(produc2);
        produc2.setLayout(produc2Layout);
        produc2Layout.setHorizontalGroup(
            produc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblProdName2)
                .addGap(289, 289, 289)
                .addGroup(produc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produc2Layout.createSequentialGroup()
                        .addComponent(Totalitems2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalPrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(produc2Layout.createSequentialGroup()
                        .addComponent(lblModeOfPayment2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        produc2Layout.setVerticalGroup(
            produc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc2Layout.createSequentialGroup()
                .addGroup(produc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produc2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblProdName2))
                    .addGroup(produc2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(produc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPrice2)
                            .addComponent(Totalitems2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblModeOfPayment2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        produc3.setBackground(new java.awt.Color(255, 255, 255));
        produc3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblProdName3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        lblProdName3.setForeground(new java.awt.Color(51, 51, 51));
        lblProdName3.setText("Product Name #3");

        lblModeOfPayment3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblModeOfPayment3.setForeground(new java.awt.Color(153, 153, 153));
        lblModeOfPayment3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModeOfPayment3.setText("mode of payment");

        Totalitems3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Totalitems3.setForeground(new java.awt.Color(51, 51, 51));
        Totalitems3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Totalitems3.setText("Total:");

        lblTotalPrice3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblTotalPrice3.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice3.setText("P0.00");

        javax.swing.GroupLayout produc3Layout = new javax.swing.GroupLayout(produc3);
        produc3.setLayout(produc3Layout);
        produc3Layout.setHorizontalGroup(
            produc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblProdName3)
                .addGap(288, 288, 288)
                .addGroup(produc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produc3Layout.createSequentialGroup()
                        .addComponent(Totalitems3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalPrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(produc3Layout.createSequentialGroup()
                        .addComponent(lblModeOfPayment3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        produc3Layout.setVerticalGroup(
            produc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc3Layout.createSequentialGroup()
                .addGroup(produc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produc3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(produc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPrice3)
                            .addComponent(Totalitems3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblModeOfPayment3))
                    .addGroup(produc3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblProdName3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        produc4.setBackground(new java.awt.Color(255, 255, 255));
        produc4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblProdName4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        lblProdName4.setForeground(new java.awt.Color(51, 51, 51));
        lblProdName4.setText("Product Name #4");

        Totalitems4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Totalitems4.setForeground(new java.awt.Color(51, 51, 51));
        Totalitems4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Totalitems4.setText("Total:");

        lblTotalPrice4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblTotalPrice4.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalPrice4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPrice4.setText("P0.00");

        lblModeOfPayment4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblModeOfPayment4.setForeground(new java.awt.Color(153, 153, 153));
        lblModeOfPayment4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModeOfPayment4.setText("mode of payment");

        javax.swing.GroupLayout produc4Layout = new javax.swing.GroupLayout(produc4);
        produc4.setLayout(produc4Layout);
        produc4Layout.setHorizontalGroup(
            produc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblProdName4)
                .addGap(291, 291, 291)
                .addGroup(produc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produc4Layout.createSequentialGroup()
                        .addComponent(Totalitems4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotalPrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(produc4Layout.createSequentialGroup()
                        .addComponent(lblModeOfPayment4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        produc4Layout.setVerticalGroup(
            produc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produc4Layout.createSequentialGroup()
                .addGroup(produc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produc4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblProdName4))
                    .addGroup(produc4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(produc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPrice4)
                            .addComponent(Totalitems4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblModeOfPayment4)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        cancel1.setBackground(new java.awt.Color(255, 255, 102));
        cancel1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        cancel1.setForeground(new java.awt.Color(51, 51, 51));
        cancel1.setText("Cancel");
        cancel1.setBorder(null);

        cancel2.setBackground(new java.awt.Color(255, 255, 102));
        cancel2.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        cancel2.setForeground(new java.awt.Color(51, 51, 51));
        cancel2.setText("Cancel");
        cancel2.setBorder(null);

        cancel4.setBackground(new java.awt.Color(255, 255, 102));
        cancel4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        cancel4.setForeground(new java.awt.Color(51, 51, 51));
        cancel4.setText("Cancel");
        cancel4.setBorder(null);

        cancel3.setBackground(new java.awt.Color(255, 255, 102));
        cancel3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        cancel3.setForeground(new java.awt.Color(51, 51, 51));
        cancel3.setText("Cancel");
        cancel3.setBorder(null);

        btnBackOrder.setBackground(new java.awt.Color(255, 255, 102));
        btnBackOrder.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        btnBackOrder.setForeground(new java.awt.Color(51, 51, 51));
        btnBackOrder.setText("Home");
        btnBackOrder.setBorder(null);
        btnBackOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackOrderActionPerformed(evt);
            }
        });

        lblAccName.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblAccName.setForeground(new java.awt.Color(51, 51, 51));
        lblAccName.setText("Account");

        cancelAll.setBackground(new java.awt.Color(255, 255, 102));
        cancelAll.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        cancelAll.setForeground(new java.awt.Color(51, 51, 51));
        cancelAll.setText("Cancel All");
        cancelAll.setBorder(null);

        javax.swing.GroupLayout listbackgroundLayout = new javax.swing.GroupLayout(listbackground);
        listbackground.setLayout(listbackgroundLayout);
        listbackgroundLayout.setHorizontalGroup(
            listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listbackgroundLayout.createSequentialGroup()
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(produc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(produc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(produc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(produc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(shipmenformLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        listbackgroundLayout.setVerticalGroup(
            listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listbackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipmenformLabel)
                    .addComponent(btnBackOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(produc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listbackgroundLayout.createSequentialGroup()
                        .addComponent(cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(listbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(listbackgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cancel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(cancelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(listbackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(listbackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackOrderActionPerformed
        new HomePage(lblAccName.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackOrderActionPerformed

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
            java.util.logging.Logger.getLogger(ListofOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListofOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListofOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListofOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListofOrders().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Totalitems;
    private javax.swing.JLabel Totalitems1;
    private javax.swing.JLabel Totalitems2;
    private javax.swing.JLabel Totalitems3;
    private javax.swing.JLabel Totalitems4;
    private javax.swing.JButton btnBackOrder;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton cancel2;
    private javax.swing.JButton cancel3;
    private javax.swing.JButton cancel4;
    private javax.swing.JButton cancelAll;
    private javax.swing.JLabel itemstotal;
    private javax.swing.JLabel lblAccName;
    private javax.swing.JLabel lblModeOfPayment1;
    private javax.swing.JLabel lblModeOfPayment2;
    private javax.swing.JLabel lblModeOfPayment3;
    private javax.swing.JLabel lblModeOfPayment4;
    private javax.swing.JLabel lblProdName1;
    private javax.swing.JLabel lblProdName2;
    private javax.swing.JLabel lblProdName3;
    private javax.swing.JLabel lblProdName4;
    private javax.swing.JLabel lblTotalPrice1;
    private javax.swing.JLabel lblTotalPrice2;
    private javax.swing.JLabel lblTotalPrice3;
    private javax.swing.JLabel lblTotalPrice4;
    private javax.swing.JPanel listbackground;
    private javax.swing.JPanel produc1;
    private javax.swing.JPanel produc2;
    private javax.swing.JPanel produc3;
    private javax.swing.JPanel produc4;
    private javax.swing.JLabel shipmenformLabel;
    // End of variables declaration//GEN-END:variables
}
