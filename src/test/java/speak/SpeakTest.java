package speak;

import java.io.IOException;

import com.attendance.util.SpeakUtil;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class SpeakTest {

	public static void main(String[] args) throws IOException {

			//attend("语音朗读功能测试");
			SpeakUtil su = new SpeakUtil();
			Thread t1 = new Thread(su);
			t1.start();
			su.setName("方志杰");

	}

}
