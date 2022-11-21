package week5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class WordSpilt {

	public static void main(String[] args) throws IOException{

		String contents = new String(
				Files.readAllBytes(Paths.get("동백꽃.txt")), // 파일들
				StandardCharsets.UTF_8
				); // 파일 내용 전체를 하나의 string으로 읽음
		// Split into words; nonletters are delimiters
		String[] sa = contents.split("\\PL+");
		//ApL은 정규식에서 letter(숫자, 공백, 구두점 아닌 알파벳 글자) 한 글지 //MPL은 정규식에서 letter이 아닌 한 글자를 의미한다.
		//전세계 모든 언어에 적용된다.
		List<String> list = List.of(sa);
		System.out.println("단어 수: "+ list.size());
		Set<String> set = new HashSet<>(list);
		System.out.println("어휘 : " + set.size());
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String w = it.next();
			map.put(w, map.getOrDefault(w, 0) + 1);
		}
		System.out.println("맵 엔트리 수: "+ map.size());
		System.out.println();

		Set<String> keySet = map.keySet();
		it = keySet.iterator();
		int count = 0;
		while (it.hasNext() && count < 10) {
			String k = it.next();
			System.out.println(k + " " + map.get(k));
			count++;
		}
		System.out.println();
	}

}
