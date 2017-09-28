/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change2d;

/**
 *
 * @author zakkizuboys
 */
public class ChangeLength2d {

    public int[][] ch2D(int[] array, int b, int k) {
//        if (array.length != (rows * cols)) {
//            throw new IllegalArgumentException("Invalid array length");
//        }

        int[][] a = new int[b][k];
        for (int i = 0; i < b; i++) {
            System.arraycopy(array, (i * k), a[i], 0, k);
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" kolom " + j + " " + "baris " + i + " : ");
                System.out.print(a[i][j]);
                System.out.println();
            }
        }

        return a;

    }
}
