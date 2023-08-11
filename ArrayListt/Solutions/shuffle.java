public static ArrayList<Integer> shuffle(ArrayList<Integer> nums, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            ans.add(nums.get(i));
            ans.add(nums.get(n + i));
        }
        return ans;
    }
