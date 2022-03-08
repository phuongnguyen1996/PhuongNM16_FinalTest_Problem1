package problem1.management;

import java.util.Scanner;

import problem1.entities.SkillList;

public class SkillManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Get all skill....................");
		System.out.println("2.Remove skill.....................");
		System.out.println("3.Update skill.....................");
		System.out.println("4.Get head.........................");
		System.out.println("5.Exit.............................");
		System.out.println("====================");

		System.out.print("Your choose:");
		int choise = sc.nextInt();

		SkillList skillList = new SkillList();

		String skill;
		int index;
		
		switch (choise) {
		case 1:
			skillList.display();
			break;
		case 2:
			System.out.println("Remove skill by skill: ");
			skill = sc.next();

			skillList.remove(skill);
			
			break;
		case 3:
			System.out.println("Update skill by index: ");
			index = sc.nextInt();
			
			System.out.println("Enter skill: ");
			skill = sc.next();
			
			skillList.update(index, skill);
			
			break;
		case 4:

			break;
		default:
			break;
		}

		sc.close();
	}
}
