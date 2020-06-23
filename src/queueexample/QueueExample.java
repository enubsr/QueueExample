/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.logging.Level;
import java.util.logging.Logger;
import singlylinkedlist.SNode;

/**
 *
 * @author Enubs
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        SNode<String> node1 = new SNode("node1", null);
        SNode<String> node2 = new SNode("node2", null);
        SNode<String> node3 = new SNode("node3", null);
        SNode<String> node4 = new SNode("node4", null);
        SNode<String> node5 = new SNode("node5", null);

        QueueList<SNode> queue = new QueueList<>();
        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);
        queue.enqueue(node5);
        
        try {
            System.out.println("Size: " + queue.size());
            System.out.println("Before Dequeue");
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
