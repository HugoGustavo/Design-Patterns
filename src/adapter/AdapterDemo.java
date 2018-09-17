package adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		InputPS2 inputPS2 = new InputPS2();
		InputAdapter inputAdapter = new InputAdapter(inputPS2);
		inputAdapter.connectUSBPort();
	}

}
