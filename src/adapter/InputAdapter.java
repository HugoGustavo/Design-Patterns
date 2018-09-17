package adapter;

public class InputAdapter extends InputUSB {
	private InputPS2 inputPS2;
	
	public InputAdapter(InputPS2 inputPS2) {
		this.inputPS2 = inputPS2;
	}
	
	@Override
	public void connectUSBPort() {
		inputPS2.connectPS2Input();
	}
}
