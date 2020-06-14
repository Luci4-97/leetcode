/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    // Conrner case
    if (head == null || head.next == null) return false;
    // Slow and fast pointer
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != fast) {
      if (fast == null || fast.next == null) return false;
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
}
// @lc code=end
