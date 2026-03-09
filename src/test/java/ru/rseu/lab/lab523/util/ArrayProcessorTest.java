package ru.rseu.lab.lab523.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProcessorTest {

    @Test
    void swapElements_shouldSwapElementsCorrectly() {
        var testArray = new int[]{1, 2, 3, 4};
        var expectedArray = new int[]{4, 2, 3, 1};
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(testArray);
        ArrayProcessor arrayProcessor = new ArrayProcessor(arrayWorker);

        assertDoesNotThrow(arrayProcessor::swapElements);
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    void swapElements_shouldSwapElementsCorrectlyIfReverse() {
        var testArray = new int[]{4, 3, 2, 1};
        var expectedArray = new int[]{4, 2, 3, 1};
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(testArray);
        ArrayProcessor arrayProcessor = new ArrayProcessor(arrayWorker);

        assertDoesNotThrow(arrayProcessor::swapElements);
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    void swapElements_shouldNotSwapElementsIfNoOdd() {
        var testArray = new int[]{4, 8, 16, 6};
        var expectedArray = new int[]{4, 8, 16, 6};
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(testArray);
        ArrayProcessor arrayProcessor = new ArrayProcessor(arrayWorker);

        assertDoesNotThrow(arrayProcessor::swapElements);
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    void swapElements_shouldNotSwapElementsIfNoEven() {
        var testArray = new int[]{3, 1, 15, 9};
        var expectedArray = new int[]{3, 1, 15, 9};
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(testArray);
        ArrayProcessor arrayProcessor = new ArrayProcessor(arrayWorker);

        assertDoesNotThrow(arrayProcessor::swapElements);
        assertArrayEquals(expectedArray, testArray);
    }

}