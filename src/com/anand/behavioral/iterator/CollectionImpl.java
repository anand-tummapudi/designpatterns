package com.anand.behavioral.iterator;

public class CollectionImpl implements Collection {
	
	String []inputArr = {"Maria","Mary","John","David"};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Itr();
	}
	
	private class Itr implements Iterator{
		int index = 0;
		
		@Override
		public boolean hasNext() {
			if(index<inputArr.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return inputArr[index++];
			return null;
		}
		
	}

}
