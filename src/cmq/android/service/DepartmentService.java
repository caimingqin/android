package cmq.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DepartmentService extends Service {

	@Override
	public IBinder onBind(Intent intent) {

		String code = intent.getStringExtra("code");
		System.out.println("code===========>>>>" + code);
		return null;
	}

	@Override
	public void onCreate() {
		System.out.println("==========================>>>>>onCreate()");
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() {
		System.out.println("=========================>>>>>onDestroy()");
	}

}
