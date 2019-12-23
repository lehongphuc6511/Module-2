package TH_List;

import javafx.css.Size;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    // Tao mang? element vs 10 phan tu?
    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    // Phuong thuc ensureCapa
    private void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    // Phuong thuc add
    public void add(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size ++]= e;
    }

    // Phuong thuc get (Khi co [E] Thi` tra? ve` return sau do')
    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index : " + i + "\n" + "Size" + i);
        }
        return (E) element[i];
    }
}
