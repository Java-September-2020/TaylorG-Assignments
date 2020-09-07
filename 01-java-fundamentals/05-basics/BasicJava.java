import java.util.ArrayList;
public class BasicJava {
    public static void oneTo255() {
        for(int i = 1; i <= 255; i++){
        System.out.println(i);
        }
    }

    public static void printOdds() {
        for(int i = 1; i <= 255; i += 2){
            System.out.println(i);
        }
    }

    public static void getArrSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public static void iterateArr(int[] arr) {
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static int maxNum(int[] arr2) {
        int max = arr2[0];
        for(int i : arr2) {
            if (i > max)
            max = i;
        }
        return max;
    }

    public static void avgArr(int[] arr3) {
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < arr3.length; i++) 
            sum += arr3[i];
            avg = sum / arr3.length;
            System.out.println(avg);
    }

    public ArrayList<Integer> arrOdd() {
        ArrayList<Integer> oddArr = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i += 2){
            oddArr.add(i);
        }
        return oddArr;
    }

    public int greaterThanY(int[] arr4, int y) {
        int count = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > y) {
            count++;
            }
        }
        return count;
    }

    public static void squareVal(int[] arr5) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < arr5.length; i++) {
            arr5[i] = arr5[i] * arr5[i];
            newArr.add(arr5[i]);
        }
        System.out.println(newArr);
    }

    public static void removeNeg(int[] arr6) {
        ArrayList<Integer> newArr2 = new ArrayList<Integer>();
        for(int i = 0; i < arr6.length; i++) {
            if(arr6[i] < 0)
            arr6[i] = 0;
            newArr2.add(arr6[i]);
        }
        System.out.println(newArr2);
    }

    public double[] maxMinAvg(double[] arr7) {
        double max = arr7[0];
        double min = arr7[0];
        double sumAvg = 0;
        
        for(double i : arr7) {
            if(i > max) {
                max = i;
            } 
            else if(i < min) {
                min = i;
            }
            sumAvg += i;
        }
        sumAvg /= arr7.length;
        double[] mma = {max,min,sumAvg};
        return mma;
    }

    public int[] shiftArray(int[] arr8){
        for(int i = 0; i < arr8.length-1; i++){
            arr8[i] = arr8[i+1];
        }
        arr8[arr8.length-1] = 0;
        return arr8;
    }
}