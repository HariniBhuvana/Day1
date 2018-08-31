package com.harini.day1;

public class Date {
	public static String getDate(String date) {
		String month;
		String[] dated = date.split(",");
		if (Integer.parseInt(dated[0]) > 31) {
			System.out.println("Wrong Date");
			return "Wrong";
		}
		switch (dated[1]) {
		case "01":
			month = "January";
			break;
		case "02":
			month = "February";
			break;
		case "03":
			month = "March";
			break;
		case "04":
			month = "April";
			break;
		case "05":
			month = "May";
			break;
		case "06":
			month = "June";
			break;
		case "07":
			month = "July";
			break;
		case "08":
			month = "August";
			break;
		case "09":
			month = "September";
			break;
		case "10":
			month = "October";
			break;
		case "11":
			month = "November";
			break;
		case "12":
			month = "December";
			break;
		default:
			System.out.println("Wrong Date");
			return "Wrong";
		}
		System.out.println(dated[0] + "/" + month + "/" + dated[2]);
		return dated[0] + "/" + month + "/" + dated[2];
		
	}
}


