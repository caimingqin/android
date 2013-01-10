package cmq.android.test.domain;

import cmq.android.R;
import cmq.android.domain.parcelable.Person;
import cmq.android.domain.serializable.Book;
import cmq.android.domain.serializable.Page;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Serializable2ParcelableActivity extends Activity implements OnClickListener {
	private Button sButton,pButton;  
	   public  final static String SER_KEY = "com.tutor.objecttran.ser";  
	   public  final static String PAR_KEY = "com.tutor.objecttran.par";  
	   public void onCreate(Bundle savedInstanceState) {  
	       super.onCreate(savedInstanceState);  
	       setContentView(R.layout.main);     
	       setupViews();  
	         
	   }  
	     
	   //�ҵ�һ������Ǻ�  
	   public void setupViews(){  
	       sButton = (Button)findViewById(R.id.button1);  
	       pButton = (Button)findViewById(R.id.button2);  
	       sButton.setOnClickListener(this);  
	       pButton.setOnClickListener(this);  
	   }  
	   //Serializeable���ݶ���ķ���  
	   public void SerializeMethod(){  
	       Book b = new Book();
	       b.setCode("80080803");
	       b.setName("һ������");
	       b.setPage(new Page("#ffff","168"));
	       Intent mIntent = new Intent(this,ObjectTranDemo2.class);  
	       Bundle mBundle = new Bundle();  
	       mBundle.putSerializable(SER_KEY,b);  
	       mIntent.putExtras(mBundle);  
	         
	       startActivity(mIntent);  
	   }  
	   //Pacelable���ݶ��󷽷�  
	   public void PacelableMethod(){  
	       Person p = new Person();  
	       p.setAge(89);
	       p.setName("ССè");
	       Intent mIntent = new Intent(this,ObjectTranDemo1.class);  
	       Bundle mBundle = new Bundle();  
	       mBundle.putParcelable(PAR_KEY, p);  
	       mIntent.putExtras(mBundle);  
	         
	       startActivity(mIntent);  
	   }  
	   //�ť����¼���Ӧ  
	   public void onClick(View v) {  
	       if(v == sButton){  
	           SerializeMethod();  
	       }else{  
	           PacelableMethod();  
	       }  
	   }  

}

