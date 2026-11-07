/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node banaya
        // Isse answer wali linked list banana easy ho jata hai
        ListNode dummy = new ListNode(0);

        // Current pointer answer list mein kaam karega
        ListNode current = dummy;

        // Carry ko store karega
        int carry = 0;

        // Jab tak kisi bhi list mein node available hai
        // ya carry bacha hua hai
        while (l1 != null || l2 != null || carry != 0) {

            // Agar l1 mein node hai to uski value lo
            // warna 0 maan lo
            int value1 = 0;
            if (l1 != null) {
                value1 = l1.val;
            }

            // Agar l2 mein node hai to uski value lo
            // warna 0 maan lo
            int value2 = 0;
            if (l2 != null) {
                value2 = l2.val;
            }

            // Dono values + previous carry
            int sum = value1 + value2 + carry;

            // Current digit nikalo
            int digit = sum % 10;

            // Next carry nikalo
            carry = sum / 10;

            // Answer list mein new node add karo
            current.next = new ListNode(digit);

            // Current ko new node par move karo
            current = current.next;

            // l1 ko next node par move karo
            if (l1 != null) {
                l1 = l1.next;
            }

            // l2 ko next node par move karo
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // Dummy ke next se actual answer start hota hai
        return dummy.next;
    }
}