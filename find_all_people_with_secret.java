//leetcode question 2092

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        int[] arr = new int[100000];
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr[i] = i;   
        }
        arr[firstPerson] = 0;
        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[2]));
        int i = 0;
        while (i < meetings.length) {
            int currentTime = meetings[i][2];
            temp.clear();
            while (i < meetings.length && meetings[i][2] == currentTime) {
                int g1 = find(arr, meetings[i][0]);
                int g2 = find(arr, meetings[i][1]);
                arr[Math.max(g1, g2)] = Math.min(g1, g2);
                temp.add(meetings[i][0]);
                temp.add(meetings[i][1]);
                ++i;
            }
            for (int j = 0; j < temp.size(); ++j) {
                if (find(arr, temp.get(j)) != 0) {
                    arr[temp.get(j)] = temp.get(j);
                }
            }
        }
        for (int j = 0; j < n; ++j) {
            if (find(arr, j) == 0) result.add(j);
        }
        return result;
    }
    static int find(int[] arr, int index) {
        while (index != arr[index]){ 
            index = arr[index];
        }
        return index;
    }
}

// class Solution {
//     public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
//         List<Integer> list = new ArrayList<>();
//         Set<Integer> set = new HashSet<>();
//         Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[2]));
//         set.add(0);
//         set.add(firstPerson);
//         int time = meetings[0][0];
//         for(int i=0;i<meetings.length;i++){
//             if(set.contains(meetings[i][0]) || set.contains(meetings[i][1]) || time == firstPerson){
//                 set.add(meetings[i][0]);
//                 set.add(meetings[i][1]);
//             }
//             // time = meetings[i][2];
//         }
//         list.addAll(set);
//         return list;
//     }
// }