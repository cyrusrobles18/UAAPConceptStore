/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_datastruct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author roblescw, caballav, calalangd <dev@NationaUniversity(Student)>
 */
public class OrderQueue_Admin {

    private final String filepathOrders = "C:\\Users\\HP\\Desktop\\Files(Programming)"
            + "\\JavaProgramming\\Project_DataStruct\\Project_DataStruct\\src\\project_datastruct\\Admin_Orders.txt";

    private int maxSize;
    private int[] queArray;
    private int front;
    public int rear;
    private int nItems;

    public OrderQueue_Admin(int s) // constructor
    {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = getLatestIdNumber();
    }

    public void enqueueOrders(int ID, String name,
            String date, String product, double price, int quantity, double total, String status) {
        FileWriter fw = null;
        PrintWriter pr = null;
        try {
            fw = new FileWriter(this.filepathOrders, true);
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

        rear++;
        nItems++;
        queArray[rear] = nItems;
    }

    //Dequeque within 3 days
    public void dequeue(String ID, String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy" + "-" + "HH:mm");
        String currentDate = sdf.format(new Date());
        LocalDate curDate = LocalDate.parse(currentDate);
        LocalDate orderDate = LocalDate.parse(date);
        String tempFile = "tempFile.txt";
        File oldFile = new File(filepathOrders);
        File newFile = new File(tempFile);
        String tempID = "";
        String tempName = "";
        String tempDate = "";
        long daysBetween = ChronoUnit.DAYS.between(curDate, orderDate);
        int intID = Integer.parseInt(ID);

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathOrders));
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String tempLine;
            String[] order;
            while ((tempLine = br.readLine()) != null) {
                order = tempLine.split(" ");

                if (daysBetween >= 3) { //Three days shipout
                    if (!order[intID].equalsIgnoreCase(date)) {
                        pw.print(tempLine);
                    }
                }
            }
        pw.flush();
        pw.close();
        br.close();
        bw.close();
        fw.close();
        
        oldFile.delete();
        File dump = new File(filepathOrders);
        newFile.renameTo(dump);
        } catch (Exception e) {
        }

        int tempOrders = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;

    }

    private int getLatestIdNumber() {
        String id = "";
        int ID = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filepathOrders));
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

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
}
