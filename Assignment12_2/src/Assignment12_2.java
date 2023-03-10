//고객의 이름과 포인트 점수를 관리하는 프로그램을 HashMap을 이용하여 작성하시오. 같은 이름이 들어오면 포인트를 누적하여 관리한다

import java.util.*;
public class Assignment12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hm = new HashMap();
		Scanner input = new Scanner(System.in);
		
		System.out.println("포인트 관리 프로그램입니다.");
		
		while(true) {
			System.out.print("1. 입력 2. 삭제 3. 출력 4. 종료 / 선택한 번호는 >>> ");
			int flag = input.nextInt();
			
			if(flag == 4) {
				System.exit(0);
			} else if (flag == 1) {
				System.out.print("이름과 포인트 입력 >> ");
				String name = input.next();
				int point = input.nextInt();
				hm.put(name, hm.getOrDefault(name, 0) + point);
			} else if (flag == 2) {
				System.out.print("삭제하려는 이름은 >> ");
				String name = input.next();
				
				if(hm.containsKey(name) == true) {
					hm.remove(name);
					System.out.println(name + "은 삭제되었습니다.");
				} else {
					System.out.println("존재하지 않는 이름입니다.");
				}
			} else if (flag == 3) {
				System.out.println(hm.toString());
			}
		}	
	}
}