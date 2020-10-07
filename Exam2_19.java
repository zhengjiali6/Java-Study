package study;

/**
 * @ClassName Exam2_19
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/7
 **/
public class Exam2_19 {
    private static void swap(DLinkeNode1<Integer> p,DLinkeNode1<Integer> q){
        int tmp = p.data;
        p.data = q.data;
        q.data = tmp;
        tmp = p.freq;
        p.freq = q.freq;
        q.freq = tmp;
    }

    private static boolean LocateElem(DLinkList1<Integer> L,Integer x){
        DLinkeNode1<Integer> p,pre;
        p = L.dhead.next;
        while (p!=null && !p.data.equals(x)){
            p = p.next;
        }
        if (p == null){
            return false;
        }
        p.freq++;
        pre = p.prior;
        while (pre!=L.dhead && pre.freq<p.freq){
            swap(pre,p);
            p = pre;
            pre = p.prior;
        }
        return true;
    }

    public static void Find(DLinkList1<Integer> L,Integer x){
        System.out.println("查找值为"+x+"的节点");
        if (LocateElem(L,x)){
            System.out.println("查找成功，双链表L:"+L.toString());
        }else {
            System.out.println("查找失败");
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5};
        DLinkList1<Integer> L = new DLinkList1<Integer>();
        L.CreateListR(a);
        System.out.println("L"+L.toString());
        Find(L,5);
        Find(L,1);
        Find(L,4);
        Find(L,5);
        Find(L,2);
        Find(L,4);
        Find(L,5);
    }
}
