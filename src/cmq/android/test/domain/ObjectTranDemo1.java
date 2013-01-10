package cmq.android.test.domain;

import cmq.android.domain.parcelable.Person;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ObjectTranDemo1 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView mTextView = new TextView(this);  
	     Person p = (Person)getIntent().getParcelableExtra(Serializable2ParcelableActivity.PAR_KEY);  
	     Log.i("p",p.getName());
	     mTextView.setText(p.getName()+"/n"+p.getAge() );  
	     setContentView(mTextView);  

	}
}
