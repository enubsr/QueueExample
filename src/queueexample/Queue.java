/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

/**
 *
 * @author Enubs
 */
public interface Queue<E> {
    public void enqueue(E e);
    public E dequeue() throws EmptyQueueException;
    
    public E first() throws EmptyQueueException;
    public int size();
    public boolean isEmpty();
}
