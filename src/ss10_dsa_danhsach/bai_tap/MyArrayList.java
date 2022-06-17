package ss10_dsa_danhsach.bai_tap;

import java.util.ArrayList;

public class MyArrayList<E> {

        private  int size;
        public static final int INITIAL_CAPACITY = 16;
        private Object[] data ;

        public MyArrayList() {
            data = new Object[INITIAL_CAPACITY];
        }

        public MyArrayList(E[] objects) {
            data = new Object[INITIAL_CAPACITY];

        }

        public void add(int index, E e) {
            ensureCapacity();

            for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];

            data[index] = e;

            size++;
        }
        public Object clone(){
            Object[] newData = new Object[size];
            System.arraycopy(data,0,newData,0,size);
            return newData;
        }

        private void ensureCapacity() {
            if (size >= data.length) {
                E[] newData = (E[]) (new Object[size * 2 + 1]);
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
        }


        public void clear() {
            data = (E[]) new Object[INITIAL_CAPACITY];
            size = 0;
        }


        public boolean contains(E e) {
            for (int i = 0; i < size; i++)
                if (e.equals(data[i]))
                    return true;
            return false;
        }


        public E get(int index) {
            checkIndex(index);
            return (E)data[index];


        }

        private void checkIndex(int index) {


            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException
                        ("index " + index + " out of bounds");
        }


        public int indexOf(E e) {
            for (int i = 0; i < size; i++)
                if (e.equals(data[i])) return i;
            return -1;
        }


        public int lastIndexOf(E e) {

            for (int i = size - 1; i >= 0; i--) if (e.equals(data[i])) return i;
            return -1;
        }

        public E remove(int index) {
            checkIndex(index);

            E e = (E)data[index];
            for (int j = index; j < size - 1; j++)
                data[j] = data[j + 1];
            data[size - 1] = null;
            size--;
            return e;
        }

        public E set(int index, E e) {
            checkIndex(index);
            E old = (E)data[index];
            data[index] = e;
            return old;
        }
    public int size(){
            return size;
    }
        public String toString() {
            StringBuilder result = new StringBuilder("[");

            for (int i = 0; i < size; i++) {
                result.append(data[i]);
                if (i < size - 1) result.append(", ");
            }

            return result.toString() + "]";
        }
      }

