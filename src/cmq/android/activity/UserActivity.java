package cmq.android.activity;

import java.util.ArrayList;
import java.util.List;

import cmq.android.R;
import cmq.android.adapter.UserBaseAdapter;
import cmq.android.domain.normal.User;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class UserActivity extends Activity {

	private ListView userListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user);
        userListView=(ListView) findViewById(R.id.userListView);
        System.out.println("userListView=====>>>"+userListView);
        UserBaseAdapter userBaseAdapter = new UserBaseAdapter(this, getUsers());
        userListView.setAdapter(userBaseAdapter);
        userListView.setOnItemClickListener(userBaseAdapter);
        userListView.setOnItemLongClickListener(userBaseAdapter);
        
        
	}

	private List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("100020880", "caimingqin"));
		users.add(new User("10004444", "xxxx"));
		users.add(new User("555555", "mmmmm"));
		users.add(new User("66666", "llll"));
		users.add(new User("777777", "nnnn"));
		return users;
	}
}
