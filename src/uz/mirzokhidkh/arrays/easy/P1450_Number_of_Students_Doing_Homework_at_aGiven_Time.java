package uz.mirzokhidkh.arrays.easy;

public class P1450_Number_of_Students_Doing_Homework_at_aGiven_Time {
    public static void main(String[] args) {
        System.out.println(busyStudent(new int[]{1,2,3},new int[]{3,2,7},4));
        System.out.println(busyStudent(new int[]{9,8,7,6,5,4,3,2,1},new int[]{10,10,10,10,10,10,10,10,10},5));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }

        return count;
    }

}
