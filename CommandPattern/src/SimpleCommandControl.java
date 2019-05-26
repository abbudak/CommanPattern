
public class SimpleCommandControl {
	Command slot;
	 
	public SimpleCommandControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void commandSent() {
		slot.execute();
	}
}