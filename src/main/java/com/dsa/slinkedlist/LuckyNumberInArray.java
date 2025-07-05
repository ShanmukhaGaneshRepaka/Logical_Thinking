package com.dsa.slinkedlist;

public class ConversionArrToSLL {
    public static void main(String[] args) {
      Node head=  convertArrToSLL(new int[]{1,2,3,4});
        display(head);
    }

   static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }
    static Node convertArrToSLL(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node temp=head;
        for (int i = 1; i <arr.length ; i++) {
            Node node=new Node(arr[i]);
            temp.next=node;
            temp=node;
        }
        return head;
    }
    static void display(Node head)
    {
        while(head!=null){
            System.out.print(head.data+" ");
head=head.next;
        }
    }
}
