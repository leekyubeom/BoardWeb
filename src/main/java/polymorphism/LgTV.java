package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	public LgTV(){
		System.out.println("===> LgTV ��ü ����");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---���� �Ҵ�.");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---���� ����.");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---�Ҹ� �ø���.");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV---�Ҹ� ������.");
	}
}
