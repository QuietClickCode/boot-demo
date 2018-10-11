package com.example.demo.utils.sort;

/**
 * @author zwq
 * @date 2018/6/6 15:59
 */
public class InsertSort {

    public static void main(String[] args) {
        shellSort();
    }

    /**
     * 直接插入排序
     */
    private static void directSort() {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        // 直接插入排序
        for (int i = 1; i < a.length; i++) {
            // 待插入元素
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                // 将大于temp的往后移动一位
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
        System.out.println();
        System.out.println("排序之后：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }

    }

    /**
     * 二分法插入排序
     */
    private static void dichotomySort() {
        int[] a = {49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1};
        for (int i = 0; i < a.length; i++)
        {
            int temp = a[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            while (left <= right)
            {
                mid = (left + right) / 2;
                if (temp < a[mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--)
            {
                a[j + 1] = a[j];
            }
            if (left != i)
            {
                a[left] = temp;
            }
        }
    }

    private static void shellSort(){
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        // 希尔排序
        int d = a.length;
        while (true)
        {
            d = d / 2;
            for (int x = 0; x < d; x++)
            {
                for (int i = x + d; i < a.length; i = i + d)
                {
                    int temp = a[i];
                    int j;
                    for (j = i - d; j >= 0 && a[j] > temp; j = j - d)
                    {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            if (d == 1)
            {
                break;
            }
        }
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
}
