package com.Bridgelabz;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MyLinkListTest {
    @Test
    public void given3NumberWhenLinkedShouldPassedLinkedListShouldBeAddedToTop(){
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.add(mySecondNode);
        myLinkList.add(myThirdNode);
        myLinkList.printMyNode();
        boolean result = myLinkList.head.equals(myThirdNode) &&
                         myLinkList.head.getNext().equals(mySecondNode) &&
                         myLinkList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
