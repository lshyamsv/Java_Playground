package easyquestions;

public class NesterForLoops {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("It's so freaking cold outside!");
//		}
//		
//		System.out.println("----------");
//		
//		String[] colors = {"Red", "Blue", "Green"};
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(colors[i]);
//		}
//		
//		System.out.println("----------");
//		
//		String[][] fancyColors = { {"Red", "Blue", "Green"},
//								   {"Cyan", "Magenta", "Turqiouse"}
//		};
//		
//		for(int row = 0; row < 2; row++) {
//			for(int column = 0; column < 3; column++) {
//				System.out.println(fancyColors[row][column]);
//			}
//		}
//		
//		System.out.println("----------");
		
		for(int i = 0; i < 5; i++) { // i=0 , 0 <5 ,// i =1 // i =2 // i =3 
			for(int j = 0; j < i; j++) { //  j= 0, 0 <0 // j =0, 0 <1 //  j =0; 0<2 // j= 1, 1<2  // j =0 , 0 <3  // j = 1, 1 <3
				System.out.println("i: " + i + ", j: " + j); // i =1, j = 0  // i =2, j=0 // i= 2 , j = 1 // i = 3, j=0  // 
			}
		}
		
		

	}

    }