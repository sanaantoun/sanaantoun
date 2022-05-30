package assignment4comp249;

import java.util.NoSuchElementException;

public class CellList implements Cloneable{
private class CellNode implements Cloneable{
	private CellPhone aCellPhone;
	private CellNode next;
	
	public CellNode() {
		this.aCellPhone = null;
		this.next = null;
	}
	
	public CellNode(CellPhone aCellPhone, CellNode next) {
		this.aCellPhone = aCellPhone;
		this.next = next;
	}
	
	public CellNode(CellNode another) {
		this.aCellPhone = another.aCellPhone.clone();
		this.next = another.next;
	}

	public CellPhone getaCellPhone() {
		return aCellPhone;
	}

	public void setaCellPhone(CellPhone aCellPhone) {
		this.aCellPhone = aCellPhone;
	}

	public CellNode getNext() {
		return next;
	}

	public void setNext(CellNode next) {
		this.next = next;
	}
	
	public CellNode clone() {
		return new CellNode(this);
	}
	
}

private CellNode head;
private int size;

public CellList() {
	this.head = null;
	this.size = 0;
}

public CellList(CellList other) {
	this.size = other.size;
	if(other.head == null) {
		head = null;
	}
	else {
		head = null;
		CellNode t1 = other.head;
		CellNode t2 = null;
		while(t1 != null) {
			if(head == null) {
				head = new CellNode(t1);
				t2 = head;
			}
			else {
				t2.next = new CellNode(t1);
				t2 = t2.next;
			}
			t1 = t1.next;
		}
		t2 = null;
	}
}

public void addToStart(CellPhone other) {
	head = new CellNode(other, head);
	size++;
}

public void insertAtIndex(CellPhone other, int index) {
	try {
		if(index < 0 || index > (this.size - 1))
			throw new NoSuchElementException("Out of the bound of current list.");
		if(index == 0)
			addToStart(other);
		else {
			CellNode node = head;
			for(int i = 0; i < (index-1); i++) {
				node = node.next;
			}
			node.next = new CellNode(other, node.next);
			node = null;
			size++;
		}
	} 
	catch(NoSuchElementException e) {
		System.out.println(e.getMessage());
		System.out.println("Information hasn't been inserted.");
		
	}
}

public void deleteFromIndex(int index) {
	try {
		if(index < 0 || index > (this.size -1))
			throw new NoSuchElementException("out of the bound of current list.");
		if(index == 0)
			deleteFromStart();
		else {
			CellNode node = head;
			for(int i = 0; i < index-1; i++) {
				node = node.next;
			}
			node.next = node.next.next;
			node = null;
			size--;
		}
	}
	catch(NoSuchElementException e) {
		System.out.println(e.getMessage());
		System.out.println("No information deleted.");
		
	}
}

public void deleteFromStart() {
	if(head ==  null)
		return;
	head = head.next;
	size--;
}

public void replaceAtIndex(CellPhone other, int index) {
	if(index < 0 || index > (this.size - 1))
		return;
	if(head == null)
		return;
	else {
		CellNode node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		node.aCellPhone = other;
	}
}

private CellNode find(long serialnumber) {
	int iteration = 0;
	if(head == null) {
		iteration++;
		return null;
	}
	else {
		CellNode node = head;
		while(node != null && node.aCellPhone.getSerialNum() != serialnumber) {
			node = node.next;
			iteration++;
		}
		System.out.println("Number of iterations is: " + iteration);
		if(node == null) {
			return null;
		}
		else {
			return node;
		}
	}
}

public boolean contains(long serialnumber) {
	if(find(serialnumber) == null) {
		return false;
	}
	else {
		return true;
	}
}

public void showContents() {
	if(head == null) {
		System.out.println("==========================================================");
		System.out.println("There are no items in the list to display.");
		System.out.println("==========================================================");
		}
	else {
		CellNode node = head;
		System.out.println("==========================================================");
		System.out.println("The current size of the list is " + size + ". Here are the contents: ");
		System.out.println("==========================================================");
		while(node != null) {
			System.out.println(node.aCellPhone + "--->");
			node = node.next;
		}
	}
}

public boolean equals(CellList another) {
	if(this == null || another == null)
		return false;
	if(this.size != another.size)
		return false;
	else {
		CellNode c1 = this.head;
		CellNode c2 = another.head;
		while(c1 != null && c2 != null) {
			if(c1.aCellPhone.equals(c2.aCellPhone)) {
				c1 = c1.next;
				c2 = c2.next;
			}
			else
				return false;
		}
		return true;
		}
	}
}
