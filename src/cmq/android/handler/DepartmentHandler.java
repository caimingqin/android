package cmq.android.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class DepartmentHandler extends Handler{
	private Message message;
	@Override
	public void handleMessage(Message msg) {
		super.handleMessage(msg);
		Bundle bundle = msg.getData();
		System.out.println("bundle.get(code)================>>>"+bundle.get("code"));
		this.message=msg;
	}
	
	public Message callback(){
		return this.message;
	}
	
	
}