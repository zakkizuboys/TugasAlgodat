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
public interface LinearList {
    public boolean isEmpty();
    public int size();
    public Object get (int index);
    public int indexOf(Object elem);
    public Object remove(int index);
    public void add(int index, Object obj);
    public String toString();
}
