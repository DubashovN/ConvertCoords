package ru.dubashov;

public class Convert {
    public static int[] psrseArray(String[] cords) {
        String[] dd = cords[1].split(" ");
        int[] intDd = new int[dd.length];
        for (int i = 0; i < dd.length; i++) {
            intDd[i] = Integer.parseInt(dd[i]);
        }
        return intDd;
    }

    public static String convertDdToSevenD(String[] cords) {
        int[] dd = psrseArray(cords);
        return dd[0] + " " + dd[1] / 60 + " " + dd[2] / 3600;
    }

    public static String convertDdSixMToSevenD(String[] cords) {
        int[] dd = psrseArray(cords);
        return dd[0] + " " + dd[1] / 60;
    }

    public static String convertSevenDToDd(String[] cords) {
        String[] sevenD = cords[1].split("\\.");
        int dd = Integer.parseInt(sevenD[0]);
        int mm = (Integer.parseInt(sevenD[0]) - dd) * 60;
        int ss = ((Integer.parseInt(sevenD[0]) - dd) * 60 - mm) * 60;
        return dd + " " + mm + " " + ss;
    }
}
