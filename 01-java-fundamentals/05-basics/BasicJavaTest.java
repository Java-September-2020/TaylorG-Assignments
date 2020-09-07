import java.util.Arrays;
public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava basic = new BasicJava();
        basic.oneTo255();

        basic.printOdds();

        basic.getArrSum();

        int[] arr = {1,3,5,7,9,13};
        basic.iterateArr(arr);

        int[] arr2 = {1,-2,3,-4,5,0};
        basic.maxNum(arr2);

        int[] arr3 = {2,4,6};
        basic.avgArr(arr3);

        System.out.println(basic.arrOdd());

        int y = 3;
        int[] arr4 = {1,3,5,7,10,12};
        System.out.println(basic.greaterThanY(arr4, y));

        int[] arr5 = {1,5,10,-2};
        basic.squareVal(arr5);

        int[] arr6 = {-1,2,3,-4,5};
        basic.removeNeg(arr6);

        double[] arr7 = {1,5,10,-2,-3};
        System.out.println(Arrays.toString(basic.maxMinAvg(arr7)));

        int[] arr8 = {1,5,10,7,-2};
        System.out.println(Arrays.toString(basic.shiftArray(arr8)));

    }
}