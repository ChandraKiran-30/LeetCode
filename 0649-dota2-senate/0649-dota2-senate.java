class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq = new ArrayDeque<>();
        Queue<Integer> dq = new ArrayDeque<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            char ch = senate.charAt(i);
            if (ch == 'R')
                rq.offer(i);
            else
                dq.offer(i);
        }
        while (!rq.isEmpty() && !dq.isEmpty()) {
            int rx = rq.poll();
            int dx = dq.poll();
            if (rx < dx)
                rq.offer(rx + n);
            else
                dq.offer(dx + n);
        }
        return (!rq.isEmpty()) ? "Radiant" : "Dire";
    }
}