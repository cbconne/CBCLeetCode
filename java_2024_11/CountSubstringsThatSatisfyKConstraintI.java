class CountSubstringsThatSatisfyKConstraintI {
    public int countKConstraintSubstrings(String s, int k) {
        // 滑动窗口
        int left = 0;
        int right = 0;
        int reResult = 0;
        while (right < s.length()) {
            // 判断当前窗口内是否满足条件
            String subString = s.substring(left, right + 1);
            if (check(subString, k)) {
                // 满足需求，右指针向右移动
                right++;
                continue;
            } else {
                // 不满足需求，计算当前左边界开始的不满足条件的子串数量，并更新左边界
                reResult += (s.length() - right);
                left++;
            }
        }
        // 最终结果为全部子串的数量减去不满足条件的子串的数量
        // s 的子串数量
        int allSubString = s.length() * (s.length() + 1) / 2;
        return allSubString - reResult;
    }

    private boolean check(String subString, int k) {
        // 判断子串是否满足条件：0 or 1 的数量不超过 k
        int k0 = k;
        int k1 = k;
        for (int i = 0; i < subString.length(); i++) {
            if (subString.charAt(i) == '0') {
                k0--;
            } else {
                k1--;
            }
        }
        if (k0 < 0 && k1 < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        CountSubstringsThatSatisfyKConstraintI countSubstringsThatSatisfyKConstraintI = new CountSubstringsThatSatisfyKConstraintI();
        System.out.println(countSubstringsThatSatisfyKConstraintI.countKConstraintSubstrings("0001111", 2));
        // System.out.println(countSubstringsThatSatisfyKConstraintI.countKConstraintSubstrings("1010101", 2));
    }
}