package Chapter14;

import java.util.Iterator;

/**
 * Created by yuwang on 2016-05-24.
 */
public class MyIterableCollection<T> implements Iterable<T> {


    @Override
    public Iterator<T> iterator() {
        return new MyIterableCollectionIterator<T>();
    }

    private class MyIterableCollectionIterator<T> implements Iterator<T> {


        @Override
        public boolean hasNext() {
            return false;
        }

        public MyIterableCollectionIterator() {
            super();
        }

        @Override
        public T next() {
            T dummyElement = (T) new Object();
            return dummyElement;
        }
    }


    public static void main(String argus[]) {

        MyIterableCollection<String> myIterableCollection = new MyIterableCollection<>();
        Iterator<String> iterator = myIterableCollection.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());


    }

}
