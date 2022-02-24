package packagelab11;

public class Entry {
	
    public Object dataObject;
    public String status;

    public Entry() {
        status = "Empty";
    }

    @Override
    public String toString() {
        return dataObject.toString();
    }

    public int hash() {
        return dataObject.hashCode();
    }
}

