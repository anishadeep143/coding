package coding.lab2;

public class MediaItem extends Item {
private int length;

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

@Override
public String toString() {
	return "MediaItem [length=" + length + "]";
}

public MediaItem(int length) {
	super();
	this.length = length;
}

public MediaItem() {
	super();
	// TODO Auto-generated constructor stub
}

public MediaItem(int uid, String title, int noc,int length) {
	super(uid, title, noc);
	this.length = length;
	// TODO Auto-generated constructor stub
}

}
