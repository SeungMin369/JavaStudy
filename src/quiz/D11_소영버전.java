package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_소영버전 {

	/*
		2018년 9월 1일부터 제한. 이전은 제한없음.
		끝번호차량 출입제한
		월 1 6
		화 2 7
		수 3 8
		목 4 9
		금 5 0
		공휴일휴무일 적용제외(음력제외)
		제외차량: 장애인, 유아동승, 경차
	 */
	
	// 0: 일반차, 1: 장애인차, 2: 유아동승차, 3: 경차
	int type;
	// 4자리 차량번호
	String number;
	// 출입하는 날
	Calendar calendar;

	public D11_소영버전() {
		type = (int)(Math.random() * 4);
		number = "" + (int)(Math.random() * 10);
		number += (int)(Math.random() * 10);
		number += (int)(Math.random() * 10);
		number += (int)(Math.random() * 10);
		calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, (int)(Math.random() * 3000) * -1);
		System.out.println("car number: " + number + ", type: " + type + " (0: 일반차, 1: 장애인차, 2: 유아동승차, 3: 경차)");
	}
	
	// 요일에 맞춰 끝번호 제한
	boolean checkLastNumWithDay() {
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		int last = Integer.parseInt(number.substring(3));
		
		return (day == 2 && (last == 1 || last == 6)) 
				|| (day == 3 && (last == 2 || last == 7)) 
				|| (day == 4 && (last == 3 || last == 8)) 
				|| (day == 5 && (last == 4 || last == 9))
				|| (day == 6 && (last == 5 || last == 0));
	}
	
	// 주말, 공휴일 유무
	boolean checkHoliday() {
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		
		return (day == 1 || day == 7) // 주
				|| (month == 1 && date == 1) // 신정
				|| (month == 3 && date == 1) // 삼일절
				|| (month == 5 && date == 5) // 어린이날
				|| (month == 6 && date == 6) // 현충일
				|| (month == 8 && date == 15) // 광복절
				|| (month == 10 && date == 3) // 개천절
				|| (month == 10 && date == 9) // 한글날
				|| (month == 12 && date == 25); // 크리스마스
	}
	
	// 제외차량
	boolean checkExeptCar() {
		// 0: 일반차량은 제외아님
		return type != 0;
	}
	
	// 사업 시행 기간
	boolean checkPeriod() {
		Calendar start = Calendar.getInstance();
		start.set(2018, 9, 1);
		
		return calendar.compareTo(start) >= 0;
	}
	
	void checkCarNumber() {
		SimpleDateFormat current = new SimpleDateFormat("yyyy년 MM월 dd일 EEEEEE");
		if(!checkPeriod()) {
			System.out.println("오늘 " + current.format(calendar.getTime()) + "은 " + "시행기간이 아닙니다.");
			return;
		}
		if(checkHoliday()) {
			System.out.println("오늘 " + current.format(calendar.getTime()) + "은 " + "공휴일, 휴무일 입니다.");
			return;
		}
		if(checkExeptCar()) {
			String carT = "일반차";
			if(type == 1) carT = "장애인차";
			else if(type == 2) carT = "유아동승차";
			else if(type == 3) carT = "경차";
			System.out.println(carT + "는 제외차량입니다.");
			return;
		}
		if(checkLastNumWithDay()) {
			System.out.println("오늘 " + current.format(calendar.getTime()) + "은 " + number + "번 차량의 출입이 불가합니다.");
			return;
		}

		System.out.println("오늘 " + current.format(calendar.getTime()) + "은 " + number + "번 차량의 출입이 가능합니다.");
	}
	
	public static void main(String[] args) {
		D11_소영버전 car = new D11_소영버전();
		car.checkCarNumber();
		System.out.println();
		D11_소영버전 car2 = new D11_소영버전();
		car2.checkCarNumber();
		System.out.println();
		D11_소영버전 car3 = new D11_소영버전();
		car3.checkCarNumber();
		System.out.println();
	}
}