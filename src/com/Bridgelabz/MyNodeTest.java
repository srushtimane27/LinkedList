package com.Bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyNodeTest {
    private Object Assert;
    @Test
    public void given3NumberWhenLinkedShouldPassedLinkedListTest(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode)&&
                         myFirstNode.getNext().equals(myThirdNode);

        assertTrue (result);
        
    }

}
