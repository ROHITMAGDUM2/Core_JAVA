package ptplcop01;

import java.util.function.ToIntFunction;

public class Example03 {
	public static void main(String[] args) {
		String text = "Aa aA aB Ba aC Ca";
		ToIntFunction<String> func = text::indexOf;
		System.out.println(func.applyAsInt("a"));
	}
}