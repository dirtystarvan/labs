package ru.rseu.lab.lab528.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayWorkerImplTest {

    @Test
    void getFromPosition_shouldReturnPosition() {
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(1, 2, 3);

        assertEquals(3, arrayWorker.getFromPosition(2));
    }

    @Test
    void getFromPosition_shouldReturnIfOnlyOneElement() {
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(1);

        assertEquals(1, arrayWorker.getFromPosition(0));
    }

    @Test
    void getFromPosition_shouldThrowExceptionOnEmptyArray() {
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl();

        assertThrows(IllegalArgumentException.class, () -> arrayWorker.getFromPosition(2));
    }

    @Test
    void setToPosition_shouldSetValueToPosition() {
        var testPosition = 1;
        var testValue = 10;
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(1, 2, 3);

        assertEquals(2, arrayWorker.getFromPosition(testPosition));

        arrayWorker.setToPosition(testPosition, testValue);

        assertEquals(testValue, arrayWorker.getFromPosition(testPosition));
    }

    @Test
    void setToPosition_shouldSetToPositionIfOnlyOneElement() {
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl(1);

        assertEquals(1, arrayWorker.getFromPosition(0));

        arrayWorker.setToPosition(0, 10);

        assertEquals(10, arrayWorker.getFromPosition(0));
    }

    @Test
    void setToPosition_shouldThrowExceptionOnEmptyArray() {
        IntArrayWorker arrayWorker = new IntArrayWorkerImpl();

        assertThrows(IllegalArgumentException.class, () -> arrayWorker.setToPosition(2, 10));
    }

}
