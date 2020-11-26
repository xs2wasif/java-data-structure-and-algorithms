package com.xs2wasifali.dp;

public class AssemblyLineScheduling {
    public static int carAssembly(int[][] a, int[][] t, int[] e, int[] x) {

        int num_stations = a[0].length;
        int[] T1 = new int[num_stations];
        int[] T2 = new int[num_stations];

        T1[0] = e[0] + a[0][0];
        T2[0] = e[1] + a[1][0];

        for (int i = 1; i < num_stations; ++i) {
            T1[i] = Math.min(T1[i - 1] + a[0][i], T2[i - 1] + t[1][i] + a[0][i]);
            T2[i] = Math.min(T2[i - 1] + a[1][i], T1[i - 1] + t[0][i] + a[1][i]);
        }

        return Math.min(T1[num_stations - 1] + x[0], T2[num_stations - 1] + x[1]);
    }

    public static void main(String[] args) {
        int[][] a = {{7, 4, 9, 3}, {2, 9, 5, 4}};
        int[][] t = {{0, 7, 4, 5}, {0, 9, 2, 8}};
        int[] e = {10, 12};
        int[] x = {3, 5};

        System.out.println(carAssembly(a, t, e, x));
    }
}
