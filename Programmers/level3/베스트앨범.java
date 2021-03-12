import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution(new String[]{"classic", "pop", "classic", "classic","jazz","pop", "Rock", "jazz"}, new int[]{500, 600, 150, 800, 1100, 2500, 100, 1000});
    }
    public static int[] solution(String[] genres, int[] plays) {
        Map<String, List<int[]>> map = new TreeMap<>();
        for(int i = 0; i < genres.length; i++){
            if (map.containsKey(genres[i])){
                map.get(genres[i]).add(new int[]{i, plays[i]});
            }else{
                ArrayList<int[]> list = new ArrayList<>();
                list.add(new int[]{i, plays[i]});
                map.put(genres[i], list);
            }
        }

        List<Genre> rank = new ArrayList<>();
        for(String key : map.keySet()){
            List<int[]> li = map.get(key);
            li.sort((a1, a2) -> a2[1] - a1[1]);

            int sum = 0;
            for(int i = 0; i< li.size(); i++){
                sum += li.get(i)[1];
            }
            rank.add(new Genre(sum, key));
        }

        rank.sort((a1, a2) -> a2.total - a1.total);

        List<Integer> result = new ArrayList<>();

        for(Genre x: rank){
            result.add(map.get(x.name).get(0)[0]);
            if (map.get(x.name).size() > 1)
                result.add(map.get(x.name).get(1)[0]);
        }

        result.stream().toArray();
        return result.stream().mapToInt(i->i).toArray();
    }
}


class Genre{
    int total;
    String name;

    public Genre(int total, String name) {
        this.total = total;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                ", total=" + total +
                ", name='" + name + '\'' +
                '}';
    }
}