/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import singlylinkedlist.SList;
import singlylinkedlist.SNode;

/**
 *
 * @author Enubs
 */
public class QueueList<E> implements Queue<E> {
    
    private SList<E> list;
    
    public QueueList(){
        list = new SList<>();
    }

    @Override
    public void enqueue(E e) {
        list.addLast((SNode) e);
    }

    @Override
    public E dequeue() throws EmptyQueueException{
        if(list.size() == 0){
            throw new EmptyQueueException();
        }
        return (E) list.removeFirst();
        
    }

    @Override
    public E first() throws EmptyQueueException{
        if(list.size() == 0){
            throw new EmptyQueueException();
        }
        return (E) list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public void displayQueue(){
        list.showList();
    }
}
