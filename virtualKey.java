import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class virtualKey {

	public static void main(String[] args) {

		List<String> mylist = new ArrayList<String>();

		System.out.println("    LockedMe.com");
		System.out.println("         -Developed by Company Lockers Pvt. Ltd.");
		mylist.add("harry.pdf");
		mylist.add("tom.pdf");
		mylist.add("mart.pdf");
		mylist.add("joy.pdf");
		mylist.add("aster.pdf");
		template(mylist);
	}

	public static void template(List mylist) {

		System.out.println("1.Reteriving the file name in an ascending order");
		System.out.println("2.Business-level operations");
		System.out.println("3.Option to close the application");
		System.out.print("Choose one option(1/2/3): ");

		try {
			Scanner sc = new Scanner(System.in);
			int y = sc.nextInt();
			switch (y) {
			case 1: {
				Collections.sort(mylist);
				System.out.println(mylist + "\n");
				template(mylist);
				break;

			}
			case 2:
				while (true) {
					System.out.println();
					System.out.println("1.Add a file to the existing directory list");
					System.out.println("2.Delete a  file from the existing directory list ");
					System.out.println("3.Search a  file from the main directory");
					System.out.println("4.Exit to the main menu");
					System.out.print("choose one option(1/2/3/4): ");
					int z = sc.nextInt();
					System.out.println();

					switch (z) {
					case 1: {
						System.out.print("enter a file name you want to add: ");
						String s = sc.next();
						mylist.add(s);

						System.out.println(s + " File Added");
						System.out.println(mylist);

						break;
					}
					case 2: {
						System.out.print("enter a file name you want to delete: ");
						String a = sc.next();
						int check = 0;

						for (int i = 0; i < mylist.size(); i++) {
							if (mylist.get(i).equals(a)) {
								System.out.println(mylist.get(i) + " file deleted");
								mylist.remove(a);

								System.out.print(mylist + "\n\n");
								check = 1;
							}
						}
						if (check == 0) {
							System.out.println("file not found......");
							System.out.print(mylist + "\n\n");
						}

						break;
					}

					case 3: {
						int check1 = 0;
						System.out.print("enter a file name you want to search: ");
						String b = sc.next();
						// System.out.println(mylist);
						for (int i = 0; i < mylist.size(); i++) {
							if (mylist.get(i).equals(b)) {
								System.out.println("search successfull.......");
								System.out.println(mylist.get(i) + " found");
								check1 = 1;
								System.out.println("");
								break;
							}

						}
						if (check1 == 0) {
							System.out.println("file not found");
						}

						break;
					}

					case 4: {
						System.out.println("");
						template(mylist);
						System.exit(0);
						break;

					}
					default:
						System.out.println("invalid input");
						break;

					}
				}
			case 3: {
				System.out.println("Thank you for using our application........");
				break;

			}
			default: {
				System.out.println("Invalid input.......");
				break;
			}
			}
		} catch (Exception e) {
			System.out.println("please enter a valid choice");
			template(mylist);

		}
	}
}