/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_datastruct;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Darell
 */
public class ShipmentForm extends javax.swing.JFrame {

    String formType;
    private String filepathAdminOrders = "C:\\Users\\HP\\Desktop\\Files(Programming)"
            + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct\\src\\project_datastruct\\Admin_Orders.txt";
    private String filepathUserOders;
    private String filepathInventory = "C:\\Users\\HP\\Desktop\\Files(Programming)"
            + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct\\src\\project_datastruct\\Item_Inventory.txt";
    private String filepathAcc = "C:\\Users\\HP\\Desktop\\Files(Programming)"
            + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct\\src\\project_datastruct\\Accounts.txt";
    private int orderID;
    private String receiverName;
    private String date;
    private String product;
    private String status;
    private double price;
    private int quantity;
    private double total;

    /**
     * Creates new form ShipmentForm
     */
    public ShipmentForm() {
        super("Shipment");
        initComponents();
        
        this.filepathUserOders = "C:\\Users\\HP\\Desktop\\Files(Programming)"
                + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct"
                + "\\src\\project_datastruct\\" + shpname.getText().replace(" ", "") + ".txt";
        lbItemPrice.setText(lblPrice.getText());
        showTotalShipForm();
    }

    public ShipmentForm(String fullName, String imageCon, String prodName, String price) {
        super("Shipment");
        initComponents();
        lbProductCon.setIcon(new ImageIcon(imageCon));
        this.shpname.setText(fullName);
        lblProdName.setText(prodName);
        lblPrice.setText(price);
        shpcontact.setText(getContactNumber());
        shpaddress.setText(getAddress());
        lbItemPrice.setText(lblPrice.getText());
        showTotalShipForm();
        lblStocks.setText("Stocks: " + getStocks());
        lbItemPrice.setText(lblPrice.getText().toString() + ".00");
        this.filepathUserOders = "C:\\Users\\HP\\Desktop\\Files(Programming)"
                + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct"
                + "\\src\\project_datastruct\\" + shpname.getText().replace(" ", "") + ".txt";
    }

    private void compute() {
        this.price = (double) Double.parseDouble(this.lblPrice.getText().substring(1).trim());
        this.quantity = Integer.parseInt(this.tfQuantity.getText().trim());
        this.total = (double) this.price * this.quantity;

    }

    private void submitOrderAdmin(int ID, String name,
            String date, String product, double price, int quantity, double total, String status) {
        FileWriter fw = null;
        PrintWriter pr = null;
        try {
            fw = new FileWriter(this.filepathAdminOrders, true);
            pr = new PrintWriter(fw);

            pr.print(ID);
            pr.print(" ");
            pr.print(name);
            pr.print(" ");
            pr.print(date);
            pr.print(" ");
            pr.print(product);
            pr.print(" ");
            pr.print(price);
            pr.print(" ");
            pr.print(quantity);
            pr.print(" ");
            pr.print(total);
            pr.print(" ");
            pr.print(status);

            pr.println("");
            pr.close();
            fw.close();

        } catch (IOException ioe) {
            System.out.println("Creating Acc");
        }

    }

    private void submitUserOrderList(int ID, String product, double total, String status) {
        FileWriter fw = null;
        PrintWriter pr = null;
        try {
            fw = new FileWriter(this.filepathUserOders, true);
            pr = new PrintWriter(fw);

            pr.print(ID);
            pr.print(" ");
            pr.print(product);
            pr.print(" ");
            pr.print(total);
            pr.print(" ");
            pr.print(status);

            pr.println("");
            pr.close();
            fw.close();

        } catch (IOException ioe) {
            System.out.println("Creating Acc");
        }

    }

    private String getStocks() {
        String stocks = "";
        String itemName = lblProdName.getText().toString().replace(" ", "").trim();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathInventory));
            String tempLine;
            String tempItemName;
            String[] acc;

            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");
                tempItemName = acc[1];

                if (tempItemName.trim().equals(itemName)) {
                    stocks = acc[3];
                    break;

                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("");
        }
        return stocks;
    }

    private String getContactNumber() {
        String contactNum = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathAcc));
            String tempLine;
            String tempReceiverName;
            String[] acc;

            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(",");
                tempReceiverName = acc[3];

                if (tempReceiverName.trim().equals(shpname.getText())) {
                    contactNum = acc[5];
                    break;

                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("");
        }

        return contactNum;
    }

    private String getAddress() {
        String address = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathAcc));
            String tempLine;
            String tempReceiverName;
            String[] acc;

            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(",");
                tempReceiverName = acc[3];

                if (tempReceiverName.trim().equals(shpname.getText())) {
                    address = acc[4];
                    break;

                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("");
        }

        return address;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        shipmentform = new javax.swing.JPanel();
        shipmentbg = new javax.swing.JPanel();
        shipmenformLabel = new javax.swing.JLabel();
        lblProdName = new javax.swing.JLabel();
        lbProductCon = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblStocks = new javax.swing.JLabel();
        Quantitylabel = new javax.swing.JPanel();
        shpname = new javax.swing.JTextField();
        Name_shpform = new javax.swing.JLabel();
        shpcontact = new javax.swing.JTextField();
        Contact_shpform = new javax.swing.JLabel();
        shpaddress = new javax.swing.JTextField();
        Address_shpform = new javax.swing.JLabel();
        COD = new javax.swing.JRadioButton();
        DCC = new javax.swing.JRadioButton();
        Total = new javax.swing.JLabel();
        Totalamount = new javax.swing.JLabel();
        lblQuan = new javax.swing.JLabel();
        appliedvoucher = new javax.swing.JLabel();
        paymentmethod = new javax.swing.JLabel();
        Placeorderbtn = new javax.swing.JButton();
        Totalitems = new javax.swing.JLabel();
        lbItemPrice = new javax.swing.JLabel();
        Address_shpform1 = new javax.swing.JLabel();
        tfQuantity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnQuanPlus = new javax.swing.JButton();
        btnQuanMinus = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("NU BULLDOGS TEE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shipmentform.setBackground(new java.awt.Color(204, 204, 204));

        shipmentbg.setBackground(new java.awt.Color(255, 255, 255));

        shipmenformLabel.setBackground(new java.awt.Color(0, 0, 102));
        shipmenformLabel.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        shipmenformLabel.setForeground(new java.awt.Color(51, 51, 51));
        shipmenformLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_datastruct/1200px-Logo_of_University_Athletic_Association_of_the_Philippines.svg.png"))); // NOI18N
        shipmenformLabel.setText("UAAP CONCEPT STORE");

        lblProdName.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        lblProdName.setForeground(new java.awt.Color(51, 51, 51));
        lblProdName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdName.setText("NU BULLDOGS TEE");
        lblProdName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbProductCon.setBackground(new java.awt.Color(255, 255, 255));
        lbProductCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_datastruct/BulldogShirt.png"))); // NOI18N
        lbProductCon.setBorder(null);

        lblPrice.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        lblPrice.setText("P300");

        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 1, 14)); // NOI18N
        jLabel2.setText("100% Original Product");

        jLabel4.setFont(new java.awt.Font("Open Sans Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Free Return/Exchange");

        lblStocks.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        lblStocks.setForeground(new java.awt.Color(153, 153, 153));
        lblStocks.setText("Stocks: 100");

        javax.swing.GroupLayout shipmentbgLayout = new javax.swing.GroupLayout(shipmentbg);
        shipmentbg.setLayout(shipmentbgLayout);
        shipmentbgLayout.setHorizontalGroup(
            shipmentbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentbgLayout.createSequentialGroup()
                .addGroup(shipmentbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shipmentbgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(shipmenformLabel))
                    .addGroup(shipmentbgLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(shipmentbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(shipmentbgLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lblPrice))
                            .addGroup(shipmentbgLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblStocks))))
                    .addGroup(shipmentbgLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lbProductCon))
                    .addGroup(shipmentbgLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 76, Short.MAX_VALUE))
        );
        shipmentbgLayout.setVerticalGroup(
            shipmentbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shipmentbgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(shipmenformLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbProductCon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProdName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStocks)
                .addGap(52, 52, 52))
        );

        Quantitylabel.setBackground(new java.awt.Color(255, 255, 255));

        shpname.setBackground(new java.awt.Color(204, 204, 204));
        shpname.setForeground(new java.awt.Color(0, 0, 0));
        shpname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        shpname.setBorder(null);
        shpname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        shpname.setEnabled(false);
        shpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shpnameActionPerformed(evt);
            }
        });
        shpname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                shpnameKeyReleased(evt);
            }
        });

        Name_shpform.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Name_shpform.setText("Name of Receiver");

        shpcontact.setBackground(new java.awt.Color(204, 204, 204));
        shpcontact.setForeground(new java.awt.Color(0, 0, 0));
        shpcontact.setBorder(null);
        shpcontact.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        shpcontact.setEnabled(false);

        Contact_shpform.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Contact_shpform.setText("Contact No.");

        shpaddress.setBackground(new java.awt.Color(204, 204, 204));
        shpaddress.setBorder(null);
        shpaddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        shpaddress.setEnabled(false);

        Address_shpform.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Address_shpform.setText("Address");

        COD.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(COD);
        COD.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        COD.setText("Cash on Delivery");
        COD.setBorder(null);
        COD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODActionPerformed(evt);
            }
        });

        DCC.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(DCC);
        DCC.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        DCC.setText("Debit / Credit Card");
        DCC.setBorder(null);
        DCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCCActionPerformed(evt);
            }
        });

        Total.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        Total.setForeground(new java.awt.Color(51, 51, 51));
        Total.setText("Total Amount:");

        Totalamount.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        Totalamount.setForeground(new java.awt.Color(51, 51, 51));
        Totalamount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Totalamount.setText("P0.00");

        lblQuan.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lblQuan.setForeground(new java.awt.Color(51, 51, 51));
        lblQuan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuan.setText("0");

        appliedvoucher.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        appliedvoucher.setForeground(new java.awt.Color(51, 51, 51));
        appliedvoucher.setText("Quantity");

        paymentmethod.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        paymentmethod.setText("Payment Method");

        Placeorderbtn.setBackground(new java.awt.Color(255, 255, 102));
        Placeorderbtn.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        Placeorderbtn.setForeground(new java.awt.Color(102, 102, 102));
        Placeorderbtn.setText("Place Order");
        Placeorderbtn.setBorder(null);
        Placeorderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceorderbtnActionPerformed(evt);
            }
        });

        Totalitems.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        Totalitems.setForeground(new java.awt.Color(51, 51, 51));
        Totalitems.setText("Item");

        lbItemPrice.setFont(new java.awt.Font("Open Sans Extrabold", 1, 14)); // NOI18N
        lbItemPrice.setForeground(new java.awt.Color(51, 51, 51));
        lbItemPrice.setText("P0.00");

        Address_shpform1.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Address_shpform1.setText("Quantity");

        tfQuantity.setBackground(new java.awt.Color(204, 204, 204));
        tfQuantity.setForeground(new java.awt.Color(0, 0, 0));
        tfQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuantity.setText("1");
        tfQuantity.setBorder(null);
        tfQuantity.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfQuantity.setEnabled(false);
        tfQuantity.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tfQuantityInputMethodTextChanged(evt);
            }
        });
        tfQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfQuantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuantityKeyReleased(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 102));
        btnBack.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 102, 102));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnQuanPlus.setBackground(new java.awt.Color(255, 255, 102));
        btnQuanPlus.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        btnQuanPlus.setForeground(new java.awt.Color(102, 102, 102));
        btnQuanPlus.setText("+");
        btnQuanPlus.setBorder(null);
        btnQuanPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanPlusActionPerformed(evt);
            }
        });

        btnQuanMinus.setBackground(new java.awt.Color(255, 255, 102));
        btnQuanMinus.setFont(new java.awt.Font("Open Sans Extrabold", 1, 12)); // NOI18N
        btnQuanMinus.setForeground(new java.awt.Color(102, 102, 102));
        btnQuanMinus.setText("-");
        btnQuanMinus.setBorder(null);
        btnQuanMinus.setEnabled(false);
        btnQuanMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnQuanMinusMouseReleased(evt);
            }
        });
        btnQuanMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanMinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QuantitylabelLayout = new javax.swing.GroupLayout(Quantitylabel);
        Quantitylabel.setLayout(QuantitylabelLayout);
        QuantitylabelLayout.setHorizontalGroup(
            QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuantitylabelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Address_shpform)
                            .addGroup(QuantitylabelLayout.createSequentialGroup()
                                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shpname, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name_shpform))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Contact_shpform)
                                    .addComponent(shpcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(shpaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(paymentmethod)
                        .addGroup(QuantitylabelLayout.createSequentialGroup()
                            .addComponent(COD)
                            .addGap(44, 44, 44)
                            .addComponent(DCC))
                        .addGroup(QuantitylabelLayout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Placeorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(QuantitylabelLayout.createSequentialGroup()
                            .addComponent(Address_shpform1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnQuanMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(btnQuanPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Totalitems, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuantitylabelLayout.createSequentialGroup()
                        .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Total)
                            .addComponent(appliedvoucher))
                        .addGap(105, 105, 105)
                        .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Totalamount)
                            .addComponent(lbItemPrice))))
                .addGap(48, 48, 48))
        );
        QuantitylabelLayout.setVerticalGroup(
            QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuantitylabelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_shpform)
                    .addComponent(Contact_shpform))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shpname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shpcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Address_shpform)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shpaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuantitylabelLayout.createSequentialGroup()
                        .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address_shpform1)
                            .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(QuantitylabelLayout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(paymentmethod)
                        .addGap(9, 9, 9)
                        .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(COD)
                            .addComponent(DCC))
                        .addGap(27, 27, 27)))
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbItemPrice)
                    .addComponent(Totalitems))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuan)
                    .addComponent(appliedvoucher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(Totalamount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QuantitylabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Placeorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout shipmentformLayout = new javax.swing.GroupLayout(shipmentform);
        shipmentform.setLayout(shipmentformLayout);
        shipmentformLayout.setHorizontalGroup(
            shipmentformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentformLayout.createSequentialGroup()
                .addComponent(shipmentbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        shipmentformLayout.setVerticalGroup(
            shipmentformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentformLayout.createSequentialGroup()
                .addGroup(shipmentformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shipmentbg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Quantitylabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shipmentform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shipmentform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceorderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceorderbtnActionPerformed

        compute();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy" + "-" + "HH:mm");
        this.date = sdf.format(new Date());
        this.product = lblProdName.getText().toString().replace(" ", "");
        this.receiverName = shpname.getText().toString().trim().replace(" ", "");

        this.orderID = getLatestIdNumberUserList() + 1;
        if (orderID < 5) {
            submitUserOrderList(this.orderID, this.product, this.total, this.status);

            this.orderID = getLatestIdNumber() + 1;
            submitOrderAdmin(orderID, receiverName, date, product, price, quantity, total, status);
            new HomePage().setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_PlaceorderbtnActionPerformed
    private int getLatestIdNumber() {
        String id = "";
        int ID = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathAdminOrders));
            String tempLine;
            String tempID;

            String[] acc;
            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");
                tempID = acc[0];

                id = tempID;
            }
            ID = Integer.parseInt(id);
            br.close();
        } catch (Exception e) {
            System.out.println("ID");
        }

        return ID;
    }

    private int getLatestIdNumberUserList() {
        String id = "";
        int ID = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathUserOders));
            String tempLine;
            String tempID;

            String[] acc;
            while ((tempLine = br.readLine()) != null) {
                acc = tempLine.split(" ");
                tempID = acc[0];

                id = tempID;
            }
            ID = Integer.parseInt(id);
            br.close();
        } catch (Exception e) {
            System.out.println("ID");
        }

        return ID;
    }

    private void tfQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantityKeyReleased

    }//GEN-LAST:event_tfQuantityKeyReleased

    private void tfQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantityKeyPressed

    }//GEN-LAST:event_tfQuantityKeyPressed

    private void shpnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shpnameKeyReleased

    }//GEN-LAST:event_shpnameKeyReleased

    private void CODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODActionPerformed
        this.status = "COD";
    }//GEN-LAST:event_CODActionPerformed

    private void DCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCCActionPerformed
        this.status = "BANK";
    }//GEN-LAST:event_DCCActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (this.lblProdName.getText().contains("LANYARD")) {
            new Lanyards(shpname.getText()).setVisible(true);
            this.setVisible(false);
        } else if (this.lblProdName.getText().contains("TEE")) {
            new HomePage(shpname.getText()).setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void shpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shpnameActionPerformed

    private void btnQuanPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanPlusActionPerformed
        int quan = Integer.parseInt(tfQuantity.getText());
        int stocks = Integer.parseInt(lblStocks.getText().replace("Stocks: ", ""));
        if (stocks > quan && quan > 0) {
            btnQuanMinus.setEnabled(true);
            tfQuantity.setEditable(true);

            quan++;
            tfQuantity.setText(Integer.toString(quan));

            showTotalShipForm();
            
        } else {
            tfQuantity.setEditable(false);
            btnQuanPlus.setEnabled(false);
        }


    }//GEN-LAST:event_btnQuanPlusActionPerformed

    private void btnQuanMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanMinusActionPerformed
        int quan = Integer.parseInt(tfQuantity.getText());
        int stocks = Integer.parseInt(lblStocks.getText().replace("Stocks: ", ""));
        if (stocks > quan && quan > 0) {
            btnQuanMinus.setEnabled(true);
            btnQuanPlus.setEnabled(true);
            tfQuantity.setEditable(true);

            quan--;
            tfQuantity.setText(Integer.toString(quan));

            showTotalShipForm();
            
        } else {
            tfQuantity.setEditable(false);
            btnQuanPlus.setEnabled(true);
        }
        if (quan == 1) {
            btnQuanMinus.setEnabled(false);
        }
    }//GEN-LAST:event_btnQuanMinusActionPerformed

    private void showTotalShipForm() {
        try {
            compute();
            lblQuan.setText(tfQuantity.getText());
            Totalamount.setText("P" + this.total);
        } catch (Exception e) {
        }

    }
    private void btnQuanMinusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanMinusMouseReleased

    }//GEN-LAST:event_btnQuanMinusMouseReleased

    private void tfQuantityInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tfQuantityInputMethodTextChanged

    }//GEN-LAST:event_tfQuantityInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShipmentForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_shpform;
    private javax.swing.JLabel Address_shpform1;
    private javax.swing.JRadioButton COD;
    private javax.swing.JLabel Contact_shpform;
    private javax.swing.JRadioButton DCC;
    private javax.swing.JLabel Name_shpform;
    private javax.swing.JButton Placeorderbtn;
    private javax.swing.JPanel Quantitylabel;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Totalamount;
    private javax.swing.JLabel Totalitems;
    private javax.swing.JLabel appliedvoucher;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnQuanMinus;
    private javax.swing.JButton btnQuanPlus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbItemPrice;
    private javax.swing.JButton lbProductCon;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblQuan;
    private javax.swing.JLabel lblStocks;
    private javax.swing.JLabel paymentmethod;
    private javax.swing.JLabel shipmenformLabel;
    private javax.swing.JPanel shipmentbg;
    private javax.swing.JPanel shipmentform;
    private javax.swing.JTextField shpaddress;
    private javax.swing.JTextField shpcontact;
    private javax.swing.JTextField shpname;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables
}
