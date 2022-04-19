
package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	
	public static void main(String[] args) {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		Collections.sort(list);

		for (Task i : list) {
			System.out.println(dateTimeFormatter.format(i.getDate()) + ":" + (i.getTask()));

		}
	}

}