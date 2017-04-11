//Given two Sorted Single Linked Lists, merge and provide a single sorted linked list.
/*

class ListNode
{
  int val;
  ListNode next;

ListNode(int x)
{
  val = x;
}
}

*/

class MergeSortedLists
{

  public ListNode mergeLists(ListNode l1,ListNode l2)
  {
    ListNode head;
    ListNode pointer1;
    ListNode pointer2;
    ListNode mergePointer;
    
    if(l1 == null && l2 == null)
      return null;
    
    if(l1 == null && l2 != null)
      return l2;
    
    if(l2 == null && l1 != null)
      return l1;
    
    pointer1 = l1;
    pointer2 = l2;
    mergePointer = head;
    
    while(pointer1 != null || pointer2 != null)
    {
      if(pointer1.val > pointer2.val)
      {
        ListNode temp = new ListNode();
        temp.val = pointer2.val;
        temp.next = null;
        if(mergePointer == null)
          mergePointer = temp;
        else
        {
          mergePointer.next = temp;
          mergePointer = temp;
        }
        pointer2 = pointer2.next;
      }
      else
      {
        ListNode temp = new ListNode();
        temp.val = pointer1.val;
        temp.next = null;
        if(mergePointer == null)
          mergePointer = temp;
        else
        {
          mergePointer.next = temp;
          mergePointer = temp;
        }
        pointer1 = pointer1.next;
      }
    }
    
   while(pointer1 != null)
   {
     ListNode temp = new ListNode();
     temp.val = pointer1.val;
     temp.next = null;
     mergePointer.next = temp;
     mergePointer = temp;
     pointer1 = pointer1.next;
   }
    
   while(pointer2 != null)
   {
     ListNode temp = new ListNode();
     temp.val = pointer2.val;
     temp.next = null;
     mergePointer.next = temp;
     mergePointer = temp;
     pointer2 = pointer2.next;
   }
    return head;
  }
}
