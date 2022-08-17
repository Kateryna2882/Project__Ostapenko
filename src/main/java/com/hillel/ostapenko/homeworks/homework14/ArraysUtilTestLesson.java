//package com.hillel.ostapenko.homeworks.homework14;
//
//import org.junit.jupiter.api.Test;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ArraysUtilTest {
//    int[] array;
//
//    @BeforeEach
//    public void setUpBeforeEach() {
//        array = new int[] {1, 2, 3, 4};
//    }
//
//    @Test
//    public void testAssertEqualseGetElementIndex() {
//        assertEquals(3, ArraysUtil.getElementIndex(array, 4));
//    }
//
//    @Test
//    public void testAssertTrueGetElementIndex() {
//        assertTrue(ArraysUtil.getElementIndex(array, 4) == 3);
//    }
//
//    @Test
//    public void testAssertFalseGetElementIndex() {
//        assertFalse(ArraysUtil.getElementIndex(array, 1) == 3);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3, 4})
//    public void checkIndex(int value) {
//        assertEquals(3, ArraysUtil.getElementIndex(array, value));
//    }
//
//    @ParameterizedTest
//    @MethodSource("getValue")
//    public void checkIndex2(int value) {
//        assertEquals(3, ArraysUtil.getElementIndex(array, value));
//    }
//
//    public static Stream<Integer> getValue() {
//        return Stream.of(
//                1, 2, 3, 4
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("getValue2")
//    public void checkIndex3(int value, String str) {
//        assertEquals(3, ArraysUtil.getElementIndex(array, value));
//        assertTrue(str.length() == 6);
//    }
//
//    public static Stream<Arguments> getValue2() {
//        return Stream.of(
//                Arguments.arguments(1, "qwerty"),
//                Arguments.arguments(3, "hello"),
//                Arguments.arguments(4, "qewrewq")
//        );
//    }
//
//}