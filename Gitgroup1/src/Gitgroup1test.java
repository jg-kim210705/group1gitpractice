import java.util.Scanner;


class hello{
	String stuno;
	int nono;
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public int getNono() {
		return nono;
	}
	public void setNono(int nono) {
		this.nono = nono;
	}
	
}

class test2{
	
	public void test() {
		System.out.println("??");
	}
}

public class Gitgroup1test {
	
	

	public static void main(String[] args) {
		System.out.println("현재 연결된 번호: 1번, 2번, 3번");
		System.out.println("번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		a = sc.nextInt();
		hiyo hiyo = new hiyo();
		Yu1 yu = new Yu1();
//		jingunZzang jz = new jingunZzang();

		switch(a) {
		case 1 : 
			hiyo.ho();
			break;
		case 2 : 
			Yu1.Yu();
			break;
		case 3 :
			jz.jingunGanzi();
			break;
		case 4 : break;
		default : break;
		}
		

	}

}
