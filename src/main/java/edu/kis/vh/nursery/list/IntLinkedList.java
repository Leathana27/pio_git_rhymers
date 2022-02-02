package edu.kis.vh.nursery.list;

public class IntLinkedList {
//TODO: cała klasa jest nie używana
  private static final int ERRNO_LIST_EMPTY = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERRNO_LIST_EMPTY;
    
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return ERRNO_LIST_EMPTY;
    
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
