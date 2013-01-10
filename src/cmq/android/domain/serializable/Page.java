package cmq.android.domain.serializable;

import java.io.Serializable;


public class Page implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String font;
	private String size;
	
	
	public Page() {
		super();
	}
	public Page(String font, String size) {
		super();
		this.font = font;
		this.size = size;
	}
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	

}
