package speak;

import java.io.IOException;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class SpeakTest {

	public static void main(String[] args) throws IOException {
		ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");

		Dispatch sapo = sap.getObject();
		try {

			// 音量 0-100
			sap.setProperty("Volume", new Variant(100));
			// 语音朗读速度 -10 到 +10
			sap.setProperty("Rate", new Variant(-3));

			// 执行朗读
			Dispatch.call(sapo, "Speak", new Variant("测试一下"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sapo.safeRelease();
			sap.safeRelease();
		}
	}

}
