package ArrayList;

import java.util.ArrayList;

public class ArrayListIntegerEx {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListIntegerEx() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public int get(int index) {
        isIndexExist(index);
        return elements[index];
    }

    public boolean add(int value) {
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    private int[] increaseCapacity() {
        int[] temp = new int[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }

    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return index;
    }

    public int remove(int index) {
        isIndexExist(index);
        int[] temp = elements;
        elements = new int[temp.length - 1];
        int value = temp[index];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
        return value;
    }

    public boolean addAll(ArrayList<Integer> i) {
        Object[] ob = i.toArray();
        int numCount = ob.length;
        if (numCount > elements.length - size) {
            int[] temp = new int[(elements.length * 2) + numCount];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        System.arraycopy(ob, 0, elements, size, numCount);
        size += numCount;
        return true;
    }

}
