/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat;

/**
 *
 * @author zakkizuboys
 */
public class Algodat extends ArrayLinearList {

    int[] n;

    public static Object[] removeElement(Object[] original) {
//        int[] n = new int[original.length];
//    //int[] n = new int[original.length - 1];
//    //System.arraycopy(original, 0, n, 0, element);
//    System.arraycopy(original, 0, n, 0, original.length- element);
//    return n;

        Object[] v = new Object[original.length];
        //System.arraycopy(original, 0, n, 0, element);
        //System.arraycopy(n, 0, original, 0, n.length);
        //System.arraycopy(original, element + 1, n, element, original.length - element - 1);
        //return original;

        for (int i = 0; i < v.length; i++) {
            v[i] = null;
        }
        return v;
    }

    public Object setSize(int newSize, int[] a) {
        //System.out.println("d" +size);
        if (size > newSize) {
            int index = size - newSize;
            Object removeElement = a[index];
            for (int j = 0; j < index; j++) {
                for (int i = index + 1; i < size; i++) {
                    a[i - 1] = a[i];
                }
                a[--size] = 0;
            }
            return removeElement;
        } else {
            n = new int[a.length];
            System.arraycopy(a, 0, n, 0, a.length);
        }
        for (int i = 0; i < newSize; i++) {
            System.out.println(n[i]);
        }
        return n;
    }

    public void trim(int num, int[] a) {
        if (a.length <= num) {
            n = new int[a.length];
            System.arraycopy(a, 0, n, 0, a.length);
        }
        try {
            for (int f = 0; f < num; f++) {
                System.out.println(n[f]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException h) {
            System.out.println("array tidak digunakan");
        }
    }

    public void add(int index, int[] h) {
        try {
            if (h.length < index) {

                for (int i = 0; i < index; i++) {
                    System.out.println(h[i]);
                }

            } else {
                n = new int[h.length];
                System.arraycopy(h, 0, n, 0, h.length);
                for (int i = 0; i < h.length; i++) {
                    System.out.println(h[i]);
                }
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException b) {
            System.out.println("array kosong");
        }
    }

}
