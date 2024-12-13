public class sortlist {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public static sortlist.ListNode insert(ListNode head, int val) {
            ListNode node = new ListNode(val);
            if (head == null)
                return node;
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            return head;
        }

        public static sortlist.ListNode sort(ListNode head)
        {
            if (head==null || head.next==null) {
                return head;
            }
            boolean swapped;
            do{
                swapped=false;
                ListNode current=head;
                while(current.next!=null){
                    if(current.val > current.next.val)
                    {
                        int temp=current.val;
                        current.val=current.next.val;
                        current.next.val=temp;

                        swapped =true;

                    }
                    current=current.next;
                }
            }while(swapped);
            return head;
        }

        public static void print(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + "->");
                current = current.next;
            }
            System.out.println("null");
        }

    }

    public static void main(String[] args) {
        ListNode head = null;
        head = ListNode.insert(head, 98);
        head = ListNode.insert(head, 999);
        head = ListNode.insert(head, 65);
        head = ListNode.insert(head, 87);
        head = ListNode.insert(head, -7);
        ListNode.print(head);
        head=ListNode.sort(head);
        ListNode.print(head);
    }
}
