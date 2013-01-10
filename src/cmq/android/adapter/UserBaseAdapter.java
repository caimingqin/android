package cmq.android.adapter;

import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cmq.android.R;
import cmq.android.domain.normal.User;

public class UserBaseAdapter extends BaseAdapter implements OnItemClickListener,OnItemLongClickListener {

	private Context context;
	private List<User> users;
	private View userrow;
	public UserBaseAdapter(Context context, List<User> users) {
		this.context = context;
		this.users = users;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return users.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return users.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		System.out.println("getItemId=============>>>>"+getItemId(position));
		if(convertView==null){
			LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			userrow=inflater.inflate(R.layout.userrow, null);
		}else{
			userrow=convertView;
		}
		TextView code=(TextView) userrow.findViewById(R.id.userCode);
		TextView name=(TextView) userrow.findViewById(R.id.userName);
		code.setText(users.get(position).getCode());
		name.setText(users.get(position).getName());
		return userrow;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		System.out.println("onItemClick======>>>>>"
				+users.get(position).getCode()+","
				+users.get(position).getName());
		
		
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
		System.out.println("onItemLongClick======>>>>>"
				+users.get(position).getCode()+","
				+users.get(position).getName());
		return false;
	}
	
	
	

}
