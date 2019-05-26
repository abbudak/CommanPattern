
public class CommandTest {
	public static void main(String[] args) {
		SimpleCommandControl remote = new SimpleCommandControl();
		Sms sms = new Sms();
		SmsReadCommand smsRead = new SmsReadCommand(sms);
		
		SmsSendCommand smsSend = new SmsSendCommand(sms);
 
		remote.setCommand(smsRead);
		remote.commandSent();
		remote.setCommand(smsSend);
		remote.commandSent();
		
    }
	
}