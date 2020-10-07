package study;

/**
 * @ClassName DLinkList1
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/7
 **/
public class DLinkList1<E> {
    DLinkeNode1<E> dhead;

    public DLinkList1() {
        dhead = new DLinkeNode1<E>();
        dhead.prior = null;
        dhead.next = null;
    }

    public void CreateListR(E[] a) {
        DLinkeNode1<E> s, t;
        t = dhead;
        for (int i = 0; i < a.length; i++) {
            s = new DLinkeNode1<E>(a[i]);
            t.next = s;
            s.prior = t;
            t = s;
        }
        t.next = null;
    }

    public String toString() {
        String ans = "";
        DLinkeNode1<E> p = dhead.next;
        while (p!=null){
            ans += p.data+"["+p.freq+"]";
            p = p.next;
        }
        return ans;
    }
}

