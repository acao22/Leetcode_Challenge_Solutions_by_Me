//Name: 876. Middle of the Linked List
//Difficulty: Easy
//Description: Given the head of a singly linked list, return the middle node of the linked list.
    //If there are two middle nodes, return the second middle node.
//Runtime Complexity: O(n)
//Space Complexity: O(1)
//Data Structure:


class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp1 = head;
        while (temp1 != null) {
            length++;
            temp1 = temp1.next;
        }
        int mid = length / 2;

        int count = 0;
        ListNode temp2 = head;
        while (count < mid) {
            temp2 = temp2.next;
            count++;
        }
        return temp2;
    }
}