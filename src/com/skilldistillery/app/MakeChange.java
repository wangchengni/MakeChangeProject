package com.skilldistillery.app;
import java.util.Scanner;
public class MakeChange {

	static Scanner kb = new Scanner(System.in);
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Please tell me the price of this Item:");
			double itemPrice = kb.nextDouble();
//			System.out.println(itemPrice);
			System.out.println("Please tell me how much they tendered:");
			double amountTender = kb.nextDouble();
			
			if (amountTender == itemPrice) {
				System.out.println("Thank you for your purchase");
			}
			else if (amountTender < itemPrice ) {
				System.out.println("Please give me the right amount");
			}
			else if (amountTender > itemPrice)  {
				int twentyDols = 20;
				int tenDols = 10;
				int fiveDols = 5;
				int oneDols = 1;
				double quart = 0.25;
				double dime = 0.1;
				double nickle = 0.05;
				double pennies = 0.01;
				double rstAmt = amountTender - itemPrice;
					if (rstAmt%twentyDols == 0) {
						int quto = (int) (rstAmt/twentyDols);
						System.out.println("Here is the "+quto+" twenty dollars for your changes");
					}
					else if  (rstAmt%twentyDols !=0){
						int quto1 = (int)(rstAmt/twentyDols);
						int remd1 = (int)(rstAmt%twentyDols);
							if(remd1 % tenDols ==0) {
								int ten1 = remd1/tenDols;
								System.out.println("Here is the "+quto1+" twenty dollare and "+ ten1 +" ten dollars");
							}
							else if (remd1 % tenDols !=0) {
								int quto2 = (int)(remd1/tenDols);
								int remd2 = (int)(remd1%tenDols);
									if(remd2 % fiveDols == 0) {
										int five1 = remd2/fiveDols;
										System.out.println("Here is the " +quto1 +
												" twenty dollars and "+ quto2 +" ten dollars "+ five1 +" five dollars");
									}
								int five1 = remd2/fiveDols;
								
							}
//						
					}
			}
			}
			}


