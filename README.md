# AutoComplete
Name:  John Cuddihy
Course: Applied Computing yr2
Student no,: 20070200
Module: Algorithms

Assignement 1

BruteQuickAuto}
  In this assignment,we were implementing an autocomplete interface. Bruteforce was done first, followed by a quicker autocomplete. 
  Because of the amount of time i put into this assignment, i could not give any more time to it with out neglecting other subjects
  So could not finish the assignment completely, will return to this after the semester.
  
 -What was complete, 

  AutoComplete interface:
  Term class: Reads in terms from a data text file saves them to an array.
  BruteAutocomplete class : Takes in the term array and searchs for best match, the weight of term and all matches
  Client class: Cli interface driven class, allows user to input a prefix to be searched calling methods from brute auto
  BruteAutoTest class: two method tests passed
  
 -Other classes (left uncomplete)
 One of the tests- testmatches kept failing= tried debugging but no luck
 The client class worked fine funtionality wise, but it had problems when the data file was added
to the project the following errors occured that I was unable to solve:

Exception in thread "main" java.lang.NumberFormatException: For input string: "5627187200	the"
	at sun.misc.FloatingDecimal.readJavaFormatString(Unknown Source)
	at sun.misc.FloatingDecimal.parseDouble(Unknown Source)
	at java.lang.Double.parseDouble(Unknown Source)
	at model.Term.InTerms(Term.java:60)
	at model.AutoCompleteClient.main(AutoCompleteClient.java:51)
I think both the test issue and the client reading in the data are linked as the same method was at the root cause
  QuickAutoComplete methods: I had a few methods included in the term class and in the BruteAutoConplete class,
These were marked out as I didn't get the chance of implementing them at the end.
  
 -Installation 
  It was run in an IDE like eclipse
  
 -Usage
  
 -Run AutocompleteClient class to bring up CLI inferface follow the instructions on screen
 +used IDE  eclipse
  
 -History
 
  
  Began working on this 12/10/16
  Last commit was 4/11/16
  with regular commits mostly for the first couple of weeks and then the final draft.
