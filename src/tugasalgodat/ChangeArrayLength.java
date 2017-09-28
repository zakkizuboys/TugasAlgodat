/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat;

import java.lang.reflect.Array;

/**
 *
 * @author zakkizuboys
 */
public class ChangeArrayLength {
    public static Object [] changeLength1D(Object [] a, int n, int newLength){
        Object[] newarray = (Object[]) Array.newInstance(a.getClass().getComponentType(), newLength);
        System.arraycopy(a, 0, newarray, 0, n);
        return newarray;
    }

    public static Object[] changeLength1D(Object[] a, int newlength) {
        return changeLength1D(a, a.length, newlength);
    }
}
