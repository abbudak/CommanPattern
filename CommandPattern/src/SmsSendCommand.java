
public class SmsSendCommand implements Command{
	Sms sms;
	
	public SmsSendCommand(Sms sms) {
		this.sms = sms;
	}

	@Override
	public void execute() {
		sms.send();
	}

}
