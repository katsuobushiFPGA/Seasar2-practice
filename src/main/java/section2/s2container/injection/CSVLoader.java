package section2.s2container.injection;

import java.util.ArrayList;
import java.util.List;

public class CSVLoader {
    private String fileName;
    private List<String> fileNames = new ArrayList<String>();

    public CSVLoader(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    
    public void addFileName(String fileName) {
    	this.fileNames.add(fileName);
    }
    
    public List<String> getFileNames() {
    	return fileNames;
    }

}
