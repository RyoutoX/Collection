package practice;

import java.time.LocalDate;

class Task implements Comparable<Task> {

	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;

	}

	public String getTask() {
		return task;
	}

	public LocalDate getDate() {
		return date;
	}

	public int compareTo(Task task) {
		return (this.date.compareTo(task.date));

	}

}




