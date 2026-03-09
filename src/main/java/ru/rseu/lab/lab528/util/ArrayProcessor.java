package ru.rseu.lab.lab528.util;

import ru.rseu.lab.lab528.exception.ElementNotFoundException;
import ru.rseu.lab.lab528.resourcer.ProjectResourcer;
import ru.rseu.lab.lab528.resourcer.Resourcer;

public class ArrayProcessor {
    private final IntArrayWorker arrayWorker;
    private final Resourcer resourcer = ProjectResourcer.getInstance();

    public ArrayProcessor(IntArrayWorker arrayWorker) {
        this.arrayWorker = arrayWorker;
    }

    private int findFirstOdd() {
        for (int i = 0; i < arrayWorker.getArraySize(); i++) {
            if (arrayWorker.getFromPosition(i) % 2 != 0) {
                return i;
            }
        }


        var notFoundMessage = resourcer.getString("message.odd.not.found");
        System.out.println(notFoundMessage);
        throw new ElementNotFoundException(notFoundMessage);
    }

    private int findLastEven() {
        for (int i = arrayWorker.getArraySize() - 1; i >= 0; i--) {
            if (arrayWorker.getFromPosition(i) % 2 == 0) {
                return i;
            }
        }

        var notFoundMessage = resourcer.getString("message.even.not.found");
        System.out.println(notFoundMessage);
        throw new ElementNotFoundException(notFoundMessage);
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

            var swapSuccessfulMessage = resourcer.getString("message.swap.successful");
            System.out.println(swapSuccessfulMessage);
            System.out.println(arrayWorker);
        } catch (ElementNotFoundException e) {
            System.out.println(resourcer.getString("message.swap.failed") + e.getMessage());
        }
    }
}
