package com.song;

public class LinkedList extends LinkedNode{

}
class LinkedNode{
    LinkedNode next;
    int val;

    public static LinkedNode reverse(LinkedNode head) {
        if (head==null|| head.next==null)return head;
        LinkedNode a= head,b = head.next;
        a.next = null;
        while (b != null) {
            LinkedNode t = b.next;
            b.next = a;
            a = b;
            b = t;
        }
        return a;
    }

    public static LinkedNode makeLinkedList(int size) {
        LinkedNode head = new LinkedNode(0);
        LinkedNode t = head;
        for (int i = 1; i < size; i++) {
            t.next = new LinkedNode(i);
            t = t.next;
        }
        return head;
    }

    public static void scan(LinkedNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(' ');
            head = head.next;
        }
        System.out.println(sb.toString());
    }

    public LinkedNode() {
    }

    public LinkedNode(int val) {
        this.val = val;
    }

    public LinkedNode(LinkedNode next) {
        this.next = next;
    }

    public LinkedNode(LinkedNode next, int val) {
        this.next = next;
        this.val = val;
    }
}
