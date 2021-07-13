import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.postlife.java3.testing.ArrayZeroSizeException;
import ru.postlife.java3.testing.SomeMethodsApp;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class SMATest {
    public SomeMethodsApp methodsApp;

    @BeforeEach
    public void init() {
        methodsApp = new SomeMethodsApp();
    }

    @ParameterizedTest
    @MethodSource("dataForGetArrayAfterLastFour")
    void testGetArrayAfterLastFour(int[] resultArray, int[] inputArray) {
        Assertions.assertArrayEquals(resultArray, methodsApp.getArrayAfterLastFour(inputArray));
    }

    private static Stream<Arguments> dataForGetArrayAfterLastFour() {
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(Arguments.arguments(new int[]{1, 2, 3, 1}, new int[]{1, 5, 8, 4, 1, 2, 3, 1}));
        argumentsList.add(Arguments.arguments(new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
        argumentsList.add(Arguments.arguments(new int[]{}, new int[]{4, 4}));
        argumentsList.add(Arguments.arguments(new int[]{3, 2, 1}, new int[]{1, 2, 3, 4, 3, 2, 1}));
        return argumentsList.stream();
    }

    @Test
    void testGetArrayAfterLastFourRuntimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> methodsApp.getArrayAfterLastFour(new int[]{1, 2, 3, 5, 6}));
    }

    @Test
    void testGetArrayAfterLastFourZeroSizeException() {
        Assertions.assertThrows(ArrayZeroSizeException.class, () -> methodsApp.getArrayAfterLastFour(new int[]{}));
    }

    @ParameterizedTest
    @MethodSource("dataForIsContainOnlyOneAndFour")
    void testIsContainOnlyOneAndFour(boolean result, int[] inputArray) {
        Assertions.assertEquals(result, methodsApp.isContainOnlyOneAndFour((inputArray)));
    }

    private static Stream<Arguments> dataForIsContainOnlyOneAndFour() {
        List<Arguments> argumentsList = new ArrayList<>();
        argumentsList.add(Arguments.arguments(true, new int[]{1, 4, 4, 1, 4, 4, 4, 1, 1}));
        argumentsList.add(Arguments.arguments(true, new int[]{1, 4}));
        argumentsList.add(Arguments.arguments(false, new int[]{1}));
        argumentsList.add(Arguments.arguments(false, new int[]{4, 4, 4, 4}));
        argumentsList.add(Arguments.arguments(false, new int[]{4, 2, 1, 6}));
        argumentsList.add(Arguments.arguments(false, new int[]{11, 8, 4, 28, 1}));
        return argumentsList.stream();
    }

    @Test
    void testIsContainOnlyOneAndFourZeroSizeException() {
        Assertions.assertThrows(ArrayZeroSizeException.class, () -> methodsApp.isContainOnlyOneAndFour(new int[]{}));
    }
}
