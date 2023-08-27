package addnos;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger first =  getNumberFromNode(l1);
        BigInteger second =  getNumberFromNode(l2);



        BigInteger. result = first.add(second);
        return createListNode(result);

    }

    private BigInteger getNumberFromNode(ListNode l){
        StringBuilder number = new StringBuilder();
        number.append(l.val);

        ListNode current =l;
        while(null!=current.next){
            number.append(current.next.val);
            current =current.next;
        }
        return new BigInteger(number.reverse().toString());
    }


    private ListNode createListNode(BigInteger i){
        StringBuilder sb = new StringBuilder(i.toString());

        char[] chars= sb.reverse().toString().toCharArray();

        System.out.println(chars);
        ListNode result = new ListNode();
        ListNode current = result;

        for(int index=0;index<chars.length-1;index++){
            current.val = Character.getNumericValue(chars[index]);
            System.out.println(current.val);
            current.next = new ListNode(Character.getNumericValue(chars[index+1]));
            current = current.next;

        }
        return result;

    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
       Solution solution = new Solution();
       ListNode ln = solution.addTwoNumbers(new ListNode(0),new ListNode(1));
       System.out.println("ss "+ln);

    }
}
