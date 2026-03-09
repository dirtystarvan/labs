package ru.rseu.lab.lab528;


import ru.rseu.lab.lab528.util.ArrayProcessor;
import ru.rseu.lab.lab528.util.IntArrayWorker;
import ru.rseu.lab.lab528.util.IntArrayWorkerImpl;

import java.util.Locale;

public class ClientRunner {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		IntArrayWorker arrayWorker = new IntArrayWorkerImpl(1, 2, 3, 4);
		ArrayProcessor arrayProcessor = new ArrayProcessor(arrayWorker);

		arrayProcessor.swapElements();
	}
}
