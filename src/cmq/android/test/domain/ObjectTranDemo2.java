package cmq.android.test.domain;

import cmq.android.domain.serializable.Book;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ObjectTranDemo2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView mTextView = new TextView(this);  
	     Book b = (Book)getIntent().getSerializableExtra(Serializable2ParcelableActivity.SER_KEY);  
	     mTextView.setText(b.getName()+"/n"+b.getCode()+b.getPage().getFont()+b.getPage().getSize() );  
	     setContentView(mTextView);  
	}
}
