package ru.rseu.lab.lab523.util;

import ru.rseu.lab.lab523.exception.ElementNotFoundException;

public class ArrayProcessor {
    private final IntArrayWorker arrayWorker;

    public ArrayProcessor(IntArrayWorker arrayWorker) {
        this.arrayWorker = arrayWorker;
    }

    private int findFirstOdd() {
        for (int i = 0; i < arrayWorker.getArraySize(); i++) {
            if (arrayWorker.getFromPosition(i) % 2 != 0) {
                return i;
            }
        }

        System.out.println("Odd element not found");
        throw new ElementNotFoundException("Odd element not found");
    }

    private int findLastEven() {
        for (int i = arrayWorker.getArraySize() - 1; i >= 0; i--) {
            if (arrayWorker.getFromPosition(i) % 2 == 0) {
                return i;
            }
        }

        System.out.println("Even element not found");
        throw new ElementNotFoundException("Even element not found");
    }

    private void exchange(int firstIndex, int secondIndex) {
        int temp = arrayWorker.getFromPosition(firstIndex);
        arrayWorker.setToPosition(firstIndex, arrayWorker.getFromPosition(secondIndex));
        arrayWorker.setToPosition(secondIndex, temp);
    }

    public void swapElements() {
        try {
            int firstOddIndex = findFirstOdd();
            int lastEvenIndex = findLastEven();

            exchange(firstOddIndex, lastEvenIndex);

            System.out.println("Swapped successfully");
            System.out.println(arrayWorker);
        } catch (ElementNotFoundException e) {
            System.out.println("Swap failed: " + e.getMessage());
        }
    }
}
