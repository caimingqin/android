package cmq.android.activity;

import cmq.android.R;
import cmq.android.handler.DepartmentHandler;
import cmq.android.service.DepartmentService;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Intent intent = new Intent(this,DepartmentService.class);
		intent.putExtra("code", "9000100");
		startService(intent);
		final DepartmentHandler myHandler = new DepartmentHandler();
		final Message message = new Message();
		Bundle bundle = new Bundle();
		bundle.putString("code", "11111111111111");
		message.setData(bundle);
		myHandler.sendMessage(message);
	}
    public void startUserActivity(View view){
    	System.out.println("startUserActivity============>>>>>now");
    	Intent intent = new Intent(MainActivity.this, UserActivity.class);
    	startActivity(intent);
    }
	
	@Override
	protected void onResume() {
		super.onResume();

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		stopService(new Intent(this,DepartmentService.class));
	}

}
