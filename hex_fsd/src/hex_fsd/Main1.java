
	package hex_fsd;

	import java.util.Scanner;

	public class Main1 {
		public static void main(String[] args) {
			Bank users[] = new Bank[100];
			int c = 0;
			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.println("1......New Customer");
				System.out.println("2......Show All");
				System.out.println("3......Deposit Amount");
				System.out.println("4......Withdraw");
				System.out.println("5......Transfer Amount");
				System.out.println("6......Search by Account Number");
				System.out.println("7....close account");
				System.out.println("8......Exit");
				int ch = sc.nextInt();

				if (ch == 1) {
					//System.out.println("Enter Account Number:");
					//int ActNo1 = sc.nextInt();
					//sc.nextLine();

//					boolean isDuplicate = false;
//					for (int i = 0; i < c; i++) {
//						if (users[i].getActNo() == ActNo1) {
//							isDuplicate = true;
//							break;
//						}
//					}

//					if (isDuplicate) {
//						System.out.println("Account number already exists. ");}
				
//					 else {
						users[c] = new Bank();
						//users[c].setActNo(ActNo1);
                        sc.nextLine();
                        System.out.println("Enter Account Name:");
						String name1 = sc.nextLine();
						users[c].setName(name1);

						System.out.println("Enter Balance:");
						Double Balance1 = sc.nextDouble();
						users[c].setBalance(Balance1);

						c++;
					
				} else if (ch == 2) {
					for (int i = 0; i < c; i++) {
						System.out.println(users[i].toString());
					}
				} else if (ch == 3) {
					boolean flag = true;
					System.out.println("enter Account Nnumber");
					int ActNo1 = sc.nextInt();
					int i;
					for (i = 0; i < c; i++) {
						if (users[i].getActNo() == ActNo1) {
							flag = false;
							break;
						}
					}
					if (flag == true) {
						System.out.println("not found");

					} else {
						System.out.println("Enter Amount");
						Double deposit = sc.nextDouble();
						Double balance1 = users[i].getBalance() + deposit;
						users[i].setBalance(balance1);
						System.out.println("Balance updated");
					}
				} else if (ch == 4) {
					boolean flag = true;
					System.out.println("enter Account Nnumber");
					int ActNo1 = sc.nextInt();
					int i;
					for (i = 0; i < c; i++) {
						if (users[i].getActNo() == ActNo1) {
							flag = false;
							break;
						}
					}
					if (flag == true) {
						System.out.println("not found");

					} else {
						System.out.println("Enter Amount");
						Double withdraw = sc.nextDouble();

						Double balance1 = users[i].getBalance();
						if (balance1 >= withdraw) {
							balance1 -= withdraw;

							users[i].setBalance(balance1);
							System.out.println("Balance updated");
						} else {
							System.out.println("Insufficient balance.");
						}
					}
				} else if (ch == 5) {
					int pos1 = -1;
					int pos2 = -1;
					System.out.println("Enter Account number 1");
					int act1 = sc.nextInt();
					System.out.println("Enter Account number 1");
					int act2 = sc.nextInt();

					for (int i = 0; i < c; i++) {
						if (users[i].getActNo() == act1) {
							pos1 = i;
						}
						if (users[i].getActNo() == act2) {
							pos2 = i;
						}
					}

					if (pos1 == -1 && pos2 == -1) {
						System.out.println("Account number not found");
					} else {
						System.out.println("Enter Amount");
						int amount = sc.nextInt();
						double ta1 = users[pos1].getBalance();
						double ta2 = users[pos2].getBalance();

						if (ta1 >= amount) {
							users[pos1].setBalance(ta1 - amount);
							users[pos2].setBalance(ta2 + amount);
							System.out.println("Transfer successful");
						} else {
							System.out.println("not sufficient amount");
						}
					}

				} else if (ch == 6) {
					boolean flag = true;
					System.out.println("enter Account Nnumber");
					int ActNo1 = sc.nextInt();
					int i;
					for (i = 0; i < c; i++) {
						if (users[i].getActNo() == ActNo1) {
							flag = false;
							break;
						}
					}
					if (flag == false) {
						System.out.println(users[i].toString());
					} else {
						System.out.println("Not Found");
					}
				} else if (ch == 7) {
					int pos = 0;
					boolean flag=false;
					System.out.println("enter the account number of the account to be closed");
					int ActNo1 = sc.nextInt();
					for (int i=0;i<c;i++)
					{
						if(users[i].getActNo()==ActNo1)
						{
							pos=i;
							flag=true;
						}
						
					}
					if(flag==true)
					{
						for (int j=pos;j<c;j++)
						{
							users[j]=users[j+1];
						}
						users[c-1]=null;
						System.out.println("Account closed");
						c--;
					}
					else
					{
						System.out.println("Account does not exits");
					}
				

			} else {
					break;
				}
			}

			sc.close();
		}
	}


