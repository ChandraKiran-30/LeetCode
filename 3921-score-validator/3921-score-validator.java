class Solution {
    public int[] scoreValidator(String[] events) {
        int cnt = 0, score = 0;
        for (int i = 0; i < events.length; i++) {
            if (cnt == 10)
                   break;
            if (events[i].equals("W"))
                cnt++;
            else if (events[i].equals("WD") || events[i].equals("NB"))
                score++;
            else {
                int x = Integer.parseInt(events[i]);
                score += x;
            }
        }
        return new int[]{score, cnt};
    }
}