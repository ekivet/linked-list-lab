import com.sun.tools.javac.util.GraphUtils;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		//to-do
		size--;
		return true;
	}

	public T get(int index) {
		//to-do
		return currentNode.getData();
	}

	public void add(T obj) {
		//to-do
		size++;
	}

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
		size++;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
		}

		@Override
		public T next() {
			//to-do
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
}
