package packagelab11;

public class Hashtable {
    private Entry[] entries;
    private int n;
    private int count;

    public Hashtable() {
        this(100);
    }

    
    public Hashtable(int n) {
        this.n = n;
        entries = new Entry[n];
        for (int i = 0; i < n; i++) {
            Entry newEntry = new Entry();
            entries[i] = newEntry;
        }
        count = 0;
    }

    private int getHashReminder(Object o) {
        return ((o.hashCode())%n);
    }

    public int findNextVacantSlot(Object o) {
        // get the hash of the object
        int hashValue = getHashReminder(o);

        // Check if all the entries are busy
        if (count == n)
            return hashValue;

        while (entries[hashValue].status != "Empty" && entries[hashValue].hash() != o.hashCode()) {
            System.out.println("Collision at position " + hashValue + ". Linear probing");
            hashValue = (hashValue + 1)%n;
        }

        // return the possible position for the new entry
        return hashValue;
    }

    public boolean insert(Object o) {
        int hashValue = findNextVacantSlot(o);

        // Check if the position is busy
        if (entries[hashValue].status != "Occupied") {
            entries[hashValue].dataObject = o;
            entries[hashValue].status = "Occupied";

            // Increase number of busy elements
            count += 1;

            return true;
        }

        return false;
    }

    public int checkPresent(Object o) {
        // get the hash of the object
        int hashValue = getHashReminder(o);

        int numOfITerations = 0;

        // Linear probe till an empty entry is found or the same element is found or if the whole hash table is checked
        while (numOfITerations < n && entries[hashValue].status != "Empty" && entries[hashValue].hash() != o.hashCode()) {
            System.out.println("The status at position " + hashValue + " is " + entries[hashValue].status + ". Linear probing");
            hashValue = (hashValue + 1)%n;
            numOfITerations += 1;
        }

        // An entry is found 
        if (entries[hashValue].status == "Occupied" && entries[hashValue].hash() == o.hashCode())
            return hashValue;

        return -1;
    }

    public boolean find(Object o) {
        int index = checkPresent(o);

        if (index == -1)
            return false;
        return true;
    }

    public boolean delete(Object o) {
        // check if the object is present
        int index = checkPresent(o);

        // if the object is present mark the entry as deleted
        if (index != -1) {
            entries[index].status = "Deleted";
            return true;
        }

        // return false if the object is not present 
        return false;
    }

    // print the contents of the hash table 
    @Override
    public String toString() {
        for (int i = 0; i < n; i++) {
            if (entries[i].status == "Occupied") {
                System.out.print(entries[i].toString() + " ");
            }
            System.out.println(entries[i].status);
        }
        return "";
    }

}

