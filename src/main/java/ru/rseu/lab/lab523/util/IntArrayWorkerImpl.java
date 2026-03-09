package ru.rseu.lab.lab523.util;

/*
*
* Поле одномерный массив типа int
* Методы реализуют получение и изменениме элементов массива
* Метод возвращающий массив целиком отсутствует
* Параметрами конструктора должны быть элементы массива, количество которых заранее неизвестно
* Метод toString переопределен
*
* Спроектировать класс B
*, одним из параметров конструктора класса должеен быть объект класса А
*
* Найти первый элемент массива с нечетным значением и последний элемент с четным значением
* Поменять их местами
* В случае отсутствия четных или нечетных элементов вывести лог
*
* */

import java.util.Arrays;

public class IntArrayWorkerImpl implements IntArrayWorker {
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
                            "There is no position=%d in inner array. Legal indexes are: [%d, %d]",
                            position,
                            0,
                            innerArray.length == 0
                                    ? 0
                                    : innerArray.length - 1
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
