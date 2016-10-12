package autoCompletePackage;

public interface AutoCompleteInterface {
	
	  // Returns the weight of the term, or 0.0 if no such term.
    public double weightOf(String term);

    // Returns the highest weighted matching term, or null if no matching term.
    public String bestMatch(String prefix);

    // Returns the highest weighted k matching terms (in descending order of weight), as an
    // iterable.
    // If fewer than k matches, return all matching terms (in descending order
    // of weight).
    public Iterable<String> matches(String prefix, int k);
    
    //returns a list of terms relating to the prefix and displays them
	public void display();

}
