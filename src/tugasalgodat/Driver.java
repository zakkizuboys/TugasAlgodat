/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat;

import java.util.Scanner;

/**
 *
 * @author zakkizuboys
 */
public class Driver {

    public static void main(String[] args) {

        Algodat al = new Algodat();
        Scanner sc = new Scanner(System.in);
        int a;

//        ArrayLinearList a = new ArrayLinearList();
//        a.size = 5;
//        a.add(0, new Integer(4));
//        a.add(0, new Integer(3));
//        a.add(0, new Integer(2));
//        a.add(0, new Integer(1));
//        a.add(0, new Integer(0));
//
//        Iterator y = a.Iterator();
//        while (y.hasNext()) {
//            System.out.println(y.next() + " ");
//        }
//        System.out.println();
//
//        a.remove(3);
//        System.out.println(a.get(4));
        Object[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] nm = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("pilih metode yang diinginkan");
        System.out.println("1. add");
        System.out.println("2. setsize");
        System.out.println("3. trim");
        System.out.println("4. clear");
        System.out.println("5. remove range");
        System.out.println("6. clone");
        System.out.print("masukkan pilihan anda : ");

        a = sc.nextInt();

        switch (a) {
            case 1:
                //add
                al.add(9, nm);
                break;
            case 2:
                //setSize
                al.setSize(5, nm);
                break;
            case 3:
                //trim
                al.trim(9, nm);
                break;
            case 4:
                //clear
                numbers = (Object[]) Algodat.removeElement(numbers);
                System.out.println(numbers[0]);
                System.out.println(numbers[1]);
                System.out.println(numbers[2]);
                System.out.println(numbers[3]);
                System.out.println(numbers[4]);
                System.out.println(numbers[5]);
                System.out.println(numbers[6]);
                break;
            case 5:
                al.removeRange(numbers, 2, 4);
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
                break;
            case 6:
                al.clone(nm);
                break;
        }
    }

}
