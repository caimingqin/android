package cmq.android.domain.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable{

	private String name;
	private int age;
	
	
	
	 public static final Parcelable.Creator<Person> CREATOR = new Creator<Person>() {

		@Override
		public Person createFromParcel(Parcel source) {
			Person p = new Person();
			p.name=source.readString();
			p.age=source.readInt();
			return p;//���ض���
		}

		@Override
		public Person[] newArray(int size) {
			return new Person[size];
		}  
		       
		    };  

	
	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeInt(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

   
}
