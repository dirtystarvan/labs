package ru.rseu.lab.lab523;

import ru.rseu.lab.lab523.util.IntArrayWorkerImpl;
import ru.rseu.lab.lab523.util.IntArrayWorker;
import ru.rseu.lab.lab523.util.ArrayProcessor;

public class Lab523Application {
	public static void main(String[] args) {
		IntArrayWorker arrayWorker = new IntArrayWorkerImpl(1, 2, 3, 4);
		ArrayProcessor arrayProcessor = new ArrayProcessor(arrayWorker);

		arrayProcessor.swapElements();
	}
}
