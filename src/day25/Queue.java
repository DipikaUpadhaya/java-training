package day25;

public interface Queue<E> {

    void add (E item );
    E remove();
    int size();// we move this method to abstractqueue class because of reuse



}
