class Solution {
    public int numTilePossibilities(String tiles) {
        int[] cnt = new int[26];
        for (char c : tiles.toCharArray()) cnt[c - 'A']++;
        return dfs(cnt);
    }

    private int dfs(int[] cnt) {
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == 0) continue;
            total++;          // using this letter creates a new non-empty sequence
            cnt[i]--;         // choose
            total += dfs(cnt);// extend
            cnt[i]++;         // backtrack
        }
        return total;
    }
}
