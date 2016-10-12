package autoCompletePackage;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoComplete implements AutoCompleteInterface {
	
	private ArrayList<String> searchDataList;
	
	public AutoComplete() {
		
	}
	public AutoComplete(String list) throws IOException {

		    BufferedReader in = null;
		    try {
		      searchDataList = new ArrayList<String>();
		        in = new BufferedReader(new FileReader( "/data/datalist.txt"));
		      String inputLine;
		      while ((inputLine = in.readLine()) != null)
		        searchDataList.add(inputLine);
		    }
		    finally {
		      if (in != null)
		        in.close();
		    }
		    Insertion.sort(searchDataList);
		  }

	

	public double weightOf(String term) {
		return 0 ;
		
		
            
		
		
	}

	@Override
	public String bestMatch(String prefix) {
		
		
		
		return prefix ;
	}

	@Override
	 public Iterable<String> matches(String prefix, int k) {
		
        return searchDataList ;
		
	}

	@Override
	public void display() {
		
		
	}

}
