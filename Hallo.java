import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Hallo {

	static int [] m = new int[5];
	static char vowel= 'v';
	
	//public static void main(String[] args) {
	public static void main(String\u005B\u005D args) { //������� ����� �������� �� ����� � unicode
		int x, a=6, b=7;
		x=a++ + b++; //������������� ����������� � ��������� ������� � ������ �� ���� ����������, � �� �� ��, ������� �������������
		System.out.println(x + " " + a + " " + b );
		byte bait = -128;
		bait--;
		System.out.println(bait);
		Hallo whatImDoing = new Hallo();
		
		System.out.println(Character.isJavaIdentifierStart(vowel));
		
		new Hallo(m);
		System.out.println(" ");
		System.out.println("ne="+ ~1);
		whatImDoing.isVowelOrNot();
		isEven();
		//new Hallo(); //��� ��������� ������� ���������������� ����������� ��� ����������
		Integer i=128; // ���� 127==127 �� ���
		Integer q=128;
		System.out.println(i==q);
		
		//Scanner scr = new Scanner (System.in);
		//System.out.println("������� ��� ");
		//String name = scr.next();
		//System.out.println(name + " ���");
		//System.out.println(new GregorianCalendar());
		/*GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		d.set(Calendar.DAY_OF_MONTH,1);*/
		//new CalendarTest();
		whatImDoing.checkSwitch(2);
	}
	
	Hallo (){ //�����������
		System.out.printf("%tc", new Date()); //����� ������� ���� � �������
	}
	
	Hallo (int m[]){  //���������� ������������
		for (int i =0; i<5; i++){
			m[i]=(int) (Math.random()*11)-5; // [0;1)*11 = [0:11) | [0:11)-5=[-5:6) | (int)[-5:6) = [-5;5]
		}
		Arrays.sort(m);
		for (int i: m){ //foreach
			
		System.out.print(i+" ");
			}
	}
	
	void isVowelOrNot (){
		for (int i=0; i<10; i++){
		int symb = (int)(Math.random()*32)+1072;
		char c = (char)symb; // char ������ ������������� �������� ������� �� ������� ������
		switch (c){
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�': System.out.println(c+" - �������"); 
			break;
		case '�':
		case '�': System.out.println(c+" - ����");
			break;
		default: System.out.println(c+" - ���������");
		}
	}
	}
	
	static void isEven (){
		int x=15;
		switch(x%2){
		case 1: System.out.println(x+1); 
			break;
		default: System.out.println(x+2);}
	}
	void checkSwitch(int m){
		switch(m){
		case 1: System.out.println("1");
		case 2: System.out.println("2");
		case 3: System.out.println("3");
		break;}
	}
	
}
