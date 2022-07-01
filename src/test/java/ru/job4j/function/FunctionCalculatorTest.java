package ru.job4j.function;

import org.junit.Test;

import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.job4j.function.FunctionCalculator.diapason;

public class FunctionCalculatorTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSqrFunctionThenSqrResults() {
        List<Double> result = diapason(5, 8, x -> x * x);
        List<Double> expected = asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPowFunctionThenPowResults() {
        List<Double> result = diapason(5, 8, x -> Math.pow(x, 3));
        List<Double> expected = asList(125D, 216D, 343D);
        assertThat(result, is(expected));
    }
}