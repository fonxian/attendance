package com.attendance.util;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class SpeakUtil {

	public static void attend(String name){
		ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");

		Dispatch sapo = sap.getObject();
		try {

			// 音量 0-100
			sap.setProperty("Volume", new Variant(100));
			// 语音朗读速度 -10 到 +10
			sap.setProperty("Rate", new Variant(-3));
			// 执行朗读
			Dispatch.call(sapo, "Speak", new Variant(name));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sapo.safeRelease();
			sap.safeRelease();
		}
	}
	
	public static void main(String[] args) {
		attend("语音朗读功能测试");
	}
	
}
