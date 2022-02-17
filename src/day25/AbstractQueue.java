package day25;

public abstract class AbstractQueue <E> implements Queue<E>{

    @Override
    public int size() {
        return 0;
    }

    //if same method used in more classes we separetly move that to one class and extends that class by other
    //so we remove size method from CircularQueue and LinkedListQueue and make AbstractQueue which is further extended

}
