package org.mad;

import java.util.*;

public class Example1 {
    public int solution(int n, int[][] prices, int[] order, int cost) {
        /*
        // 1. 중고 가격 저장
        Map<Integer, Integer> priceMap = new HashMap<>();
        Set<Integer> neededStickers = new HashSet<>();
        int onlyMarketStickerCost = 0;
        for (int[] price : prices) {
            priceMap.put(price[0], price[1]);
            onlyMarketStickerCost += price[1];
            neededStickers.add(price[0]);
        }


        // 3. 빵을 최소 몇 개 사야 하는지 찾기
        Set<Integer> collected = new HashSet<>(); // 현재까지 모은 스티커
        int minBread = 0;
        for (int sticker : order) {
            minBread++;
            if (neededStickers.contains(sticker)) {
                collected.add(sticker);
            }
            if (collected.size() == neededStickers.size()) {
                break; // 필요한 스티커를 모두 모으면 종료
            }
        }



        // 4. 방법 1: 빵을 minBread개 사서 모을 때 비용
        int breadCost = Math.min(minBread * cost + onlyMarketStickerCost, onlyMarketStickerCost);

        // 5. 방법 2: 빵을 덜 사고 부족한 스티커를 중고로 구매하는 최소 비용 계산
        int minMarketCost = Integer.MAX_VALUE;

        // 경우의 수: 빵을 x개 샀을 때 나머지 중고로 구매하는 비용 계산
        Set<Integer> tempCollected = new HashSet<>();
        for (int i = 0; i < order.length; i++) {
            tempCollected.add(order[i]);
            int breadCount = i + 1; // 현재까지 산 빵 개수
            int tempCost = breadCount * cost;

            // 중고 구매해야 할 스티커 찾기
            for (int s : neededStickers) {
                if (!tempCollected.contains(s)) {
                    tempCost += priceMap.get(s);
                }
            }

            // 최소 비용 업데이트
            minMarketCost = Math.min(minMarketCost, tempCost);
        }

        // 6. 두 방법 중 최소 비용 반환
        return Math.min(breadCost, minMarketCost);
         */

        // 1. 중고 가격 저장
        Map<Integer, Integer> priceMap = new HashMap<>();
        for (int[] price : prices) {
            priceMap.put(price[0], price[1]);
        }

        // 2. 필요한 스티커 목록 (prices에 있는 스티커만 필요)
        Set<Integer> neededStickers = new HashSet<>(priceMap.keySet());

        // 3. order에서 얻을 수 있는 스티커 확인
        Map<Integer, Integer> firstAppearance = new HashMap<>();
        for (int i = 0; i < order.length; i++) {
            firstAppearance.putIfAbsent(order[i], i + 1);
        }

        // 4. 중고로만 사야 하는 스티커 확인
        int forcedMarketCost = 0;
        Set<Integer> mustBuyFromMarket = new HashSet<>();
        for (int sticker : neededStickers) {
            if (!firstAppearance.containsKey(sticker)) {
                forcedMarketCost += priceMap.get(sticker);
                mustBuyFromMarket.add(sticker);
            }
        }

        // 5. 모든 스티커를 중고로 사는 경우의 비용
        int minCost = forcedMarketCost;
        for (int sticker : neededStickers) {
            if (!mustBuyFromMarket.contains(sticker)) {
                minCost += priceMap.get(sticker);
            }
        }

        // 6. 필요한 스티커들을 모을 최소 빵 개수 찾기
        List<Integer> positions = new ArrayList<>();
        for (int sticker : neededStickers) {
            if (!mustBuyFromMarket.contains(sticker) && firstAppearance.containsKey(sticker)) {
                positions.add(firstAppearance.get(sticker));
            }
        }

        if (!positions.isEmpty()) {
            int minBread = Collections.max(positions);
            minCost = Math.min(minCost, minBread * cost);
        }

        return minCost;
    }
}
