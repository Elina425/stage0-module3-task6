package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result = ((int)(numberToBeRounded * 100))/100 ;
        System.out.println(result);
    }
}
