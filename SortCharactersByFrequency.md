``` Java
class Solution {
    static class Pair implements Comparable<Pair> {
        int frequency;
        char element;
        public Pair(int frequency,char element){
            this.frequency=frequency;
            this.element=element;
        }
        @Override
        public int compareTo(Pair p2){
            if(this.frequency==p2.frequency){
                return this.element-p2.element;
            }
            return this.frequency-p2.frequency;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] array=s.toCharArray();
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int frequency=entry.getValue();
            char element=entry.getKey();
            pq.add(new Pair(frequency,element));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Pair current=pq.poll();
            int frequent=current.frequency;
            char elem=current.element;
            for(int i=0;i<frequent;i++){
                sb.append(elem);
            }
        }
        return sb.toString();
    }
}
```