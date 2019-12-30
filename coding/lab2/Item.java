package coding.lab2;

public abstract class Item {
private int uid;
private String title;
private int noc;
public Item(){}

public Item(int uid, String title, int noc) {
	super();
	this.uid = uid;
	this.title = title;
	this.noc = noc;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + noc;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + uid;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	if (noc != other.noc)
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	if (uid != other.uid)
		return false;
	return true;
}
public int getNoc() {
	return noc;
}
public void setNoc(int noc) {
	this.noc = noc;
}
@Override
public String toString() {
	return "Item [uid=" + uid + ", title=" + title + ", noc=" + noc + "]";
}

}
