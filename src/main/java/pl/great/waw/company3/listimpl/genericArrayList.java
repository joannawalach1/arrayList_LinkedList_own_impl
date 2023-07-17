package pl.great.waw.company3.listimpl;

import java.util.Arrays;

public class genericArrayList implements ListIn {
    private int i = 0;
    private Object[] objects = new Object[10];
    private Object element;
    private int INITIAL_CAPACITY = 10;

    @Override
    public Object getElement(int index) {
        int size = objects.length;
        if ((index>0) || (index< size-1)) {
            return objects[index];
        } else throw new ArrayIndexOutOfBoundsException("index" + i);
    }

    @Override
    public Object addElement(Object element) {
        Object[] objects1 = new Object[10];
        Object[] objects2 = new Object[0];
        int size = 10;
        for (int i = 0; i < objects1.length; i++) {
            if (objects1.length == size) {
                objects2 = Arrays.copyOf(objects1, objects1.length * 2);
            }
            int newLength = objects2.length + 1;
            objects2[newLength-2] = element;
        }
        return element;
    }

    @Override
    public Object deleteElement(int index) {
        if (index >= 0 && index < objects.length) {
            Object elementToRemove = objects[index];

            for (int i = index; i < objects.length - 1; i++) {
                objects[i] = objects[i + 1];
            }

            objects[objects.length - 1] = null;

            int size = objects.length;
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
        return true;
    }
}



