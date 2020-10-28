package com.zhangxing.springboot01quick;

/**
 * @author zhangxing
 * @Description: 测试LeetCode
 * @date 2020/10/28 9:51
 */
public class LeetCode {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i = head.next, j = head.next;
        j = j.next;
        while (j.next!=null){
            if (i.val != j.val){
                i.next = j;
            }
            j = j.next;
        }
        return i;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
