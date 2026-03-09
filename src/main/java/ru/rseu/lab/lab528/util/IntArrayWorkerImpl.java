package ru.rseu.lab.lab528.util;

import ru.rseu.lab.lab528.resourcer.ProjectResourcer;
import ru.rseu.lab.lab528.resourcer.Resourcer;

import java.util.Arrays;

public class IntArrayWorkerImpl implements IntArrayWorker {
    private final Resourcer resourcer = ProjectResourcer.getInstance();
    private final int[] innerArray;

    public IntArrayWorkerImpl(int... digits) {
        this.innerArray = digits;
    }

    @Override
    public int getFromPosition(int position) {
        validatePosition(position);

        return innerArray[position];
    }

    @Override
    public void setToPosition(int position, int value) {
        validatePosition(position);

        innerArray[position] = value;
    }

    @Override
    public int getArraySize() {
        return innerArray.length;
    }

    private void validatePosition(int position) {
        if (position < 0 || position > innerArray.length - 1) {
            throw new IllegalArgumentException(
                    String.format(
                            resourcer.getString("message.illegal.position"),
                            position
                    )
            );
        }
    }

    @Override
    public String toString() {
        return "IntArrayWorker{" +
                "innerArray=" + Arrays.toString(innerArray) +
                '}';
    }
}
