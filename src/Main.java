import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int output=0;
		int temp=0;
		int remember=0,remember2=0;
		for(int i=0;i<9;i++) {
			numbers.add(sc.nextInt()); //9개 입력 받기
		}

		breakOut:
			for(int i=0;i<9;i++) {
				remember = numbers.get(i);
				numbers.remove(i);
				for(int j=0;j<8;j++) {
					remember2 = numbers.get(j);
					numbers.remove(j);
					for(int k=0;k<7;k++) {
						output = output + numbers.get(k);
					}

					if(output==100) {break breakOut;}
					else {
						output=0;
						numbers.add(j,remember2);
					}
				}
				numbers.add(i,remember);
			}


		int l=0,check=0;
		while(true){
			if(numbers.get(l)>numbers.get(l+1)) {
				temp = numbers.get(l);
				numbers.remove(l);
				numbers.add(l+1, temp);
				check=0;
			}
			l++;
			check++;
			if(l==6) l=0;
			if(check==6) break;
		}

		for (int index = 0; index < numbers.size(); index++) {
			System.out.println(numbers.get(index));
		}
	}

}
