package org.example.chapter8;

import java.util.*;
import java.util.stream.Stream;

public class Example5 {
    public int[] solution(String[] genres, int[] plays) {
        /**
         * 베스트 앨범
         * 장르 배열이 주어지고 plays 배열이 주어진다.
         * 첫 번째, 장르별로 많이 재생된 순으로 리턴한다.
         * 두 번째, 장르안에서 play 횟수만큼 먼저 리턴한다.
         * 세 번째, 두 곡씩 짝지어서 나와야 하기 때문에 한 곡은 패스.
         *
         * 의사 코드
         * 1. 어떤 장르가 가장 많이 재상되었는지 분류?
         * 2. 장르안에서도 어떤 노래가 가장 많이 재생되었는지 분류.
         * 3. 분류된 순서로 결과를 리턴 해준다.
         *
         *
         */
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>();
        HashMap<String, Integer> playMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genreMap.computeIfAbsent(genre, k -> new ArrayList<>());
            genreMap.get(genre).add(new int[]{i, play});
            playMap.put(genre, playMap.getOrDefault(genre, 0) + play);
        }

        ArrayList<Integer> answer = getIntegers(playMap, genreMap);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private static ArrayList<Integer> getIntegers(HashMap<String, Integer> playMap, HashMap<String, ArrayList<int[]>> genreMap) {
        ArrayList<Integer> answer = new ArrayList<>();

        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet().stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSong = genreMap.get(entry.getKey()).stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);

            sortedSong.forEach(song -> answer.add(song[0]));
        });

        return answer;
    }
}
