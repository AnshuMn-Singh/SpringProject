package module14JUnit;

public class MyMath {
    //{1,2,3} => 1+2+3 = 6
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        return sum;
    }
}