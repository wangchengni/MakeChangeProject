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
						double remd1 = (double)(rstAmt%twentyDols);
							if(remd1 % tenDols ==0) {
								double ten1 = remd1/tenDols;
								System.out.println("Here is the "+quto1+" twenty dollare and "+ ten1 +" ten dollars");
							}
							else if (remd1 % tenDols !=0) {
								int quto2 = (int)(remd1/tenDols);
								double remd2 = (double)(remd1%tenDols);
									if(remd2 % fiveDols == 0) {
										double five1 = remd2/fiveDols;
										System.out.println("Here is the " +quto1 +
												" twenty dollars and "+ quto2 +" ten dollars "+ five1 +" five dollars");
										}
									else if(remd2 % fiveDols != 0) {
										int quto3 = (int)(remd2/fiveDols);
										double remd3 = (double)(remd2%fiveDols);
											if(remd3 %oneDols==0) {
												double one1 =remd3/oneDols;
												System.out.println("Here is the "+quto1 +" twenty dollars and "+quto2 +
														" ten dollars "+ quto3 +" five dollars "+one1 +" one dollars");
												}
											else if(remd3%oneDols !=0) {
												int quto4 = (int)(remd3/oneDols);
												double remd4 = remd3 % oneDols;
														if (remd4 %quart ==0) {
															double quart1 = remd4 / quart;
															System.out.println("Here is the "+quto1 +" twenty dollars and "+
														quto2 +" ten dollars "+ quto3 +" five dollars "+
														quto4 +" one dollars "+ quart1 +" quarts");
														}
															else if(remd4 %quart !=0) {
																int quto5 = (int)(remd4/quart);
																double remd5 = remd4%quart;
																		if(remd5 % dime ==0) {
																			double dime1 = remd5/dime;
																			System.out.println("Here is the "+quto1 +" twenty dollars and "+
																			quto2 +" ten dollars "+ quto3 +" five dollars "+
																			quto4 +" one dollars "+ quto5 +" quarts"
																			+ dime1 +" dimes");
																		}
																		else if(remd5 % dime != 0) {
																			int quto6 = (int)(remd5/dime);
																			double remd6 = remd5 % dime;
																				if(remd6%nickle == 0) {
																					double nickle1 = remd6/nickle;
																					System.out.println("Here is the "+quto1 +" twenty dollars and "+
																							quto2 +" ten dollars "+ quto3 +" five dollars "+
																							quto4 +" one dollars "+ quto5 +" quarts"
																							+ quto6 +" dimes" +nickle1 +" nickles");
																				}
																				else if(remd6 % nickle !=0) {
																					int quto7 = (int)(remd6%nickle);
																					double  remd7 = remd6 % nickle;
																					double pennis1 = remd7/pennies;
																					System.out.println("Here is the "+quto1 +" twenty dollars and "+
																							quto2 +" ten dollars "+ quto3 +" five dollars "+
																							quto4 +" one dollars "+ quto5 +" quarts"
																							+ quto6 +" dimes" +quto7 +" nickles"+ pennis1 +" pennies");
																					
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
				

		


			
		
			


