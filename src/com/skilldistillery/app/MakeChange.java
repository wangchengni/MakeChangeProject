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
				int twentyHund = 2000;
				int tenDols = 10;
				int tenHund = 1000;
				int fiveDols = 5;
				int fiveHund = 500;
				int oneDols = 1;
				int oneHund = 100;
				double quart = 0.25;
				int quartHund = 25;
				double dime = 0.1;
				int dimeHund = 10;
				double nickle = 0.05;
				int nickleHund = 5;
				double pennies = 0.01;
				int penniesHund = 1;
				int amountTenderHund = (int)(amountTender*100);
				int itemPriceHund = (int)(itemPrice*100);
				int rstAmt = amountTenderHund-itemPriceHund;
					if (rstAmt%twentyHund == 0) {
						int quto = (int) (rstAmt/twentyDols);
						System.out.println("Here is the "+quto+" twenty dollars for your changes");
					}
					else if  (rstAmt%twentyHund !=0){
						int quto1 = rstAmt/twentyHund;
						int remd1 = rstAmt%twentyHund;
							if(remd1 % tenHund ==0) {
								int ten1 = remd1/tenHund;
								System.out.println("Here is the "+quto1+" twenty dollare and "+ ten1 +" ten dollars");
							}
							else if (remd1 % tenHund !=0) {
								int quto2 = remd1/tenHund;
								int remd2 = remd1%tenHund;
									if(remd2 % fiveHund == 0) {
										int five1 = remd2/fiveHund;
										System.out.println("Here is the " +quto1 +
												" twenty dollars and "+ quto2 +" ten dollars "+ five1 +" five dollars");
										}
									else if(remd2 % fiveHund != 0) {
										int quto3 = remd2/fiveHund;
										int remd3 = remd2%fiveHund;
											if(remd3 %oneHund==0) {
												int one1 =remd3/oneHund;
												System.out.println("Here is the "+quto1 +" twenty dollars and "+quto2 +
														" ten dollars "+ quto3 +" five dollars "+one1 +" one dollars");
												}
											else if(remd3%oneHund !=0) {
												int quto4 = remd3/oneHund;
												int remd4 = remd3 % oneHund;
														if (remd4 %quartHund ==0) {
															int quart1 = remd4 / quartHund;
															System.out.println("Here is the "+quto1 +" twenty dollars and "+
														quto2 +" ten dollars "+ quto3 +" five dollars "+
														quto4 +" one dollars "+ quart1 +" quarts");
														}
															else if(remd4 %quartHund !=0) {
																int quto5 = remd4/quartHund;
																int remd5 = remd4%quartHund;
																		if(remd5 % dimeHund ==0.0) {
																			int dime1 = remd5/dimeHund;
																			System.out.println("Here is the "+quto1 +" twenty dollars and "+
																			quto2 +" ten dollars "+ quto3 +" five dollars "+
																			quto4 +" one dollars "+ quto5 +" quarts "
																			+ dime1 +" dimes");
																		}
																		else if(remd5 % dimeHund != 0) {
																			int quto6 = remd5/dimeHund;
																			int remd6 = remd5 % dimeHund;
																				if(remd6%nickleHund == 0) {
																					int nickle1 = remd6/nickleHund;
																					System.out.println("Here is the "+quto1 +" twenty dollars and "+
																							quto2 +" ten dollars "+ quto3 +" five dollars "+
																							quto4 +" one dollars "+ quto5 +" quarts "
																							+ quto6 +" dimes " +nickle1 +" nickles");
																				}
																				else if(remd6 % nickleHund !=0) {
																					int quto7 = remd6/nickleHund;
																					int remd7 = remd6%nickleHund;
																						if(remd7 %penniesHund==0) {
																							int pennis1 =remd7/penniesHund;
																						
																					System.out.println("Here is the "+quto1 +" twenty dollars and "+
																							quto2 +" ten dollars "+ quto3 +" five dollars "+
																							quto4 +" one dollars "+ quto5 +" quarts "
																							+ quto6 +" dimes " +quto7 +" nickles "+ pennis1 +" pennies");
																					
																				}
																		}
																		}
																	}
															
															}
														}
												}
												
										}
								}
		}
}