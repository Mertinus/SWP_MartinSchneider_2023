package components;

import java.util.List;
import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files = new ArrayList<PhoneFile>();

    public SDCard(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void SaveFile(PhoneFile file) {
        files.add(file);
    }

    public List<PhoneFile> GetAllFiles() {
        return files;
    }

    public int GetFreeSpace() {
        int spaceSum = 0;
        for (PhoneFile f : files)
            spaceSum+=f.getSize();

        if (spaceSum > capacity)
            return 0;
        else
            return capacity - spaceSum;
    }


}
