package com.anand.behavioral.iterator;

public class IteratorClient {

	public static void main(String[] args) {

		/*
		 * List<String> listOfCountries = new ArrayList<>();
		 * listOfCountries.add("India"); listOfCountries.add("Japan");
		 * listOfCountries.add("Germany"); listOfCountries.add("US");
		 * listOfCountries.add("Australia");
		 * 
		 * Iterator<String> iterator = listOfCountries.iterator();
		 * 
		 * System.out.println("Iterator Type:"+iterator.toString());
		 * 
		 * while(iterator.hasNext()) { System.out.println("Country:"+iterator.next()); }
		 * 
		 * Set<String> setOfCountries = new HashSet<>(); setOfCountries.add("India");
		 * setOfCountries.add("India"); setOfCountries.add("France");
		 * setOfCountries.add("Germany"); setOfCountries.add("Japan");
		 * 
		 * Iterator<String> setIterator = setOfCountries.iterator();
		 * 
		 * System.out.println("###### Iterator Type:"+setIterator.toString());
		 * 
		 * while(setIterator.hasNext()) {
		 * System.out.println("Country:"+setIterator.next()); }
		 */
		
		CollectionImpl collectionImpl = new CollectionImpl();
		Iterator iterator =  collectionImpl.getIterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			String name = (String)obj;
			
			System.out.println("Name:"+name);
		}
	}

}
