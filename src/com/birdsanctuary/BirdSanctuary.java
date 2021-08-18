package com.birdsanctuary;

public class BirdSanctuary {
	
//	static BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
	
	
	public static void main(String[] args) {
		
	BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
     
	  Penguin penguin = new Penguin();
       penguin.id = "Pe1" ;
      Dove dove = new Dove();
      dove.id = "D1";
      Parrot parrot = new Parrot();
      parrot.id = "P1";
      Ostrich ostrich = new Ostrich();
      ostrich.id = "O1";  
      
       
        birdSanctuaryManager.add(dove);
        birdSanctuaryManager.add(penguin);
        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(ostrich);
        

        birdSanctuaryManager.print();
        birdSanctuaryManager.printFlyable();
        birdSanctuaryManager.printSwimmable();
        birdSanctuaryManager.printEats();
    }


	}
	
//        BirdSanctuary birdSanctuary = new BirdSanctuary();
//        	 birdSanctuary.showOptions();
//         
//     
//	}
//        public void showOptions() {
//        	int choice =  0;
//       BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();	
//        	while(choice != 10) {
//        		System.out.println("select your operation you want to perform");
//        		System.out.println("1.add the bird \n 2.remove the bird \n "
//        			+ " 3.print all birds \n "+ "4.print flyable birds \n 5.print swimmable birds \n 8.Exit");
//        		Scanner sc = new Scanner(System.in);
//        		choice = sc.nextInt();
//        		switch(choice) {
//        		case 1:
//        			Bird bird = new Bird();
//        			System.out.println("choose bird color");
//        			System.out.println("1.WHITE\n2.BLACK\n3.GREEN\n4.YELLOW\n5.GREY");
//        		
//        			
//        			break;
//        		case 2:
//        			System.out.println("Enter Bird id to remove:");
//        			String id = sc.next();
//        			Bird d = birdSanctuaryManager.getBird(id);
//        			birdSanctuaryManager.remove(d);
//        			break;
//        		case 3:
//        			birdSanctuaryManager.print();
//        			break;
//        		case 4:
//        			birdSanctuaryManager.printFlyable();
//        			break;
//        		case 5:
//        			birdSanctuaryManager.printSwimmable();
//        			break;
//        		case 8:
//        			break;
//        			
//            }
//        }
//    }
//
//}
