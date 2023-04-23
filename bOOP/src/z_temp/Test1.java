package z_temp;
import java.awt.*;
public class Test1 {
	
	// has-a(해즈어)
	Frame f;

	Test1(){
		f = new Frame("나의 첫 창");
		f.setSize(400, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
	}
	
}
