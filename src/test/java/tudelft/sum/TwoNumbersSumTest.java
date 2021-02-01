package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void addTwoNumbersTestEquals(){
        TwoNumbersSum ts = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        first.add(1); first.add(2);
        second.add(3); second.add(8);

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(5); sum.add(0);

        ArrayList<Integer> result = ts.addTwoNumbers(first, second);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }

        Assertions.assertEquals(sum, result);
    }
    @Test
    public void addTwoNumbersWithIncreasedListSize(){
        TwoNumbersSum ts = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        first.add(9); first.add(9);
        second.add(3);

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(1); sum.add(0); sum.add(2);

        ArrayList<Integer> result = ts.addTwoNumbers(first, second);

        Assertions.assertEquals(sum, result);
    }



}
