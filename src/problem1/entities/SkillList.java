package problem1.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SkillList {
	ArrayList<String> arr;

	public SkillList() {
		arr = new ArrayList<>(Arrays.asList("Java",".Net", "Android", "NodeJS", "Angular", "AI"));
	}
	
	public void display() {
		Iterator<String> it = arr.iterator();
		System.out.println("ArrayList: ");
		System.out.print("[");
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.print("]");
	}
	
	public boolean remove(String skill) {
		for (String s : arr) {
			if(s.equalsIgnoreCase(skill)) {
				arr.remove(arr.indexOf(s));
				System.out.println("Removed success!");
				display();
				return true;
			}
		}
		System.out.println("Skill don't exist!");
		return false;
	}
	
	public void update(int index, String skillNew) {
		if (index < arr.size()) {
			arr.set(index, skillNew);
			arr.get(index);
		} else {
			System.out.println("No exist!");
		}
	}
	
	public void getHead(int position) {
		
	}
}
