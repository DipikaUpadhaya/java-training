package day25;

//we now remove implements Queue<E> and do extends AbstractQueue and also remove size method from here
public class CircularQueue<E> extends AbstractQueue<E>{
    @Override
    public void add(E item) {

    }

    @Override
    public E remove() {
        return null;
    }

//    @Override
//    public int size() {
//        return 0;
//    }


}
