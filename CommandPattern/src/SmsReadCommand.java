
public class SmsReadCommand implements Command{
	Sms sms;
	
	public SmsReadCommand(Sms sms) {
		this.sms = sms;
	}

	@Override
	public void execute() {
		sms.read();
	}

}
