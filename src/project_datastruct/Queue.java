/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_datastruct;

/**
 *
 * @author roblescw <dev@NationaUniversity(Student)>
 */
public class Queue {

    private int maxSize;
    private String[] queArray;
    private int front;
    public int rear; 	// made public for printing purposes
    private int nItems;

    // --------------------------------------------------------------
    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = new String[maxSize];
        front = 0; //default 0, will be overwritten once first element is queued
        rear = -1;
        nItems = 0;
    }

    // --------------------------------------------------------------
    public void enqueue(String orders) // put item at rear of queue
    {

        rear++;
        queArray[rear] = orders; // increment rear and insert
        nItems++; // one more item
        //System.out.println("Inserted: " + j);
    }

    // --------------------------------------------------------------
    public String dequeue() // take item from front of queue
    {
        String tempOrders = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
        {
            front = 0;
        }
        nItems--; // one less item

        //System.out.println("Removed: " + temp);
        return tempOrders;
    }

    // --------------------------------------------------------------
    public String peekFront() // peek at front of queue
    {
        return queArray[front];
    }

    // --------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }

    // --------------------------------------------------------------
    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }

    // --------------------------------------------------------------
    public int size() // number of items in queue
    {
        return nItems;
    }

}