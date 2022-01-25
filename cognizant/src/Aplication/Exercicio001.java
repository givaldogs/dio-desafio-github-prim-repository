package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar agora = Calendar.getInstance();

		System.out.println("A data corrente é : " + agora.getTime());
		// A data corrente é : Sun Jul 14 20:50:31 BRT 2019

		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias atrás: " + agora.getTime());
		// 15 dias atrás: Sat Jun 29 20:50:31 BRT 2019

		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses depois: " + agora.getTime());
		// 4 meses depois: Tue Oct 29 20:50:31 BRT 2019

		agora.add(Calendar.YEAR, 2);
		System.out.println("2 anos depois: " + agora.getTime());
		// 2 anos depois: Fri Oct 29 20:50:31 BRT 2021

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a data de vencimento :");
		var vencimento = sc.next();
		Date y1 = sdf1.parse(vencimento);

		agora.setTime(y1);
		agora.add(Calendar.DATE, +10);
		//y1 = agora.getTime();
		int day = agora.get(Calendar.DAY_OF_WEEK);

		switch (day) {
		case Calendar.SATURDAY:
			agora.add(Calendar.DAY_OF_WEEK, 2);
			// talvez cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); ?
			break;
		case Calendar.SUNDAY:
			agora.add(Calendar.DAY_OF_WEEK, 1);
			break;
		default:
			break;
		}
		y1 = agora.getTime();
		System.out.println("Data digita + 10 dias = " + y1);
		
		sc.close();
	}

}
