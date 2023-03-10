import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assignment12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("홍길동", 1, 100, 100, 100));
		al.add(new Student("송중기", 2, 90, 60, 80));
		al.add(new Student("김자바", 3, 70, 80, 75));
		al.add(new Student("이자바", 4, 80, 75, 90));
		al.add(new Student("안자바", 5, 90, 60, 100));
		
		Collections.sort(al);
		Iterator hi = al.iterator();
		
		while(hi.hasNext()) {
			System.out.println(hi.next().toString());
		}
	
	}

}

class Student implements Comparable<Student> {
	private String name;
	private int id, kor, eng, math;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Student(String name, int id, int kor, int eng, int math) {
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return (kor + eng + math);
	}
	
	public double getAvg() {
		return (getTotal() / 3);
	}
	
	public String toString() {
		return (name + ", " + id + ": " + kor + ", " + eng + ", " + math + " / " + getAvg());
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(getAvg() < o.getAvg()) {
			return -1;
		} else if(getAvg() > o.getAvg()) {
			return 1;
		} else { 
			return 0;
		}
	}
}