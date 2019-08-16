package myself.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * brain
 * @author liyuanlIn
 *
 */
public class Fuman {
private static String name="lili";
private static final LocalDate  bitrhDate=LocalDate.parse("20190816", DateTimeFormatter.BASIC_ISO_DATE);

private static class FumanHolder {
	private static Fuman instance = new Fuman();
}
public static Fuman brain() {
	return FumanHolder.instance;
}
private Fuman() {
}

private String name() {
	return name;
}

private String say() {
	return null;
}

private void listen(String sentence) {
	
}

private void think() {
	
}

}
