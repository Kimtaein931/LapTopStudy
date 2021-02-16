import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	/* parameter, 매개변수
	 * 프로그램이 실행될 때 입력값을 받는 가장 표준적인 방법
	 * args 파라미터를 통해서 받는다.
	 * 파라미터가 여러개가 들어올 땐 [0], [1] 등 
	 * 런 컨
	 */
	public static void main(String[] args) {
		//String id = args[0];
		//String bright = args[1];
		
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		// 타입   // 변수
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
	
}
