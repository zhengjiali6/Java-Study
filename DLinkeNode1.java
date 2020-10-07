package study;

/**
 * @ClassName DLinkeNode1
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/7
 **/
public class DLinkeNode1<E> {
    E data;
    DLinkeNode1<E> prior;
    DLinkeNode1<E> next;
    int freq;

    public DLinkeNode1() {
        freq = 0;
        prior = null;
        next = null;
    }

    public DLinkeNode1(E d){
        freq = 0;
        data = d;
        prior = null;
        next = null;
    }

}
