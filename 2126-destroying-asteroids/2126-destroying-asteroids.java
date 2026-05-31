class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long newMass = mass;
        for (int i = 0; i < asteroids.length; i++) {
            if (newMass < asteroids[i])
                return false;
            newMass += asteroids[i];
        }
        return true;
    }
}