class RecentCounter {
    Queue<Integer> dq;

    public RecentCounter() {
        dq = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        dq.offer(t);
        while ((!dq.isEmpty()) && (dq.peek() < t - 3000))
            dq.poll();
        return dq.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */