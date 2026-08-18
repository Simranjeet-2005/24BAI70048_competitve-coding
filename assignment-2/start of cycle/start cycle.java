public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode hare=head;
        ListNode turtle=head;
        while(hare!=null && hare.next!=null){
         hare=hare.next.next;
         turtle=turtle.next;
         if(hare==turtle){
            break;
         }
        }
         if(hare==null || hare.next==null){
            return null;
         }
            turtle=head;
           while(hare!=turtle){
                hare=hare.next;
                turtle=turtle.next;
                }
              return turtle;
        
    }