class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder("");
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                if (carry == 1) {
                    result.insert(0, "1");
                    carry = 0;
                } else {
                    result.insert(0, "0");
                }
                i--;
                j--;
            } else if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (carry == 1) {
                    result.insert(0, "1");
                    carry = 1;
                } else {
                    result.insert(0, "0");
                    carry = 1;
                }
                i--;
                j--;
            } else {
                if (carry == 1) {
                    result.insert(0, "0");
                    carry = 1;
                } else {
                    result.insert(0, "1");
                }
                i--;
                j--;
            }
        }
        while (i >= 0) {
            if (carry == 1 && a.charAt(i) == '1') {
                result.insert(0, "0");
                carry = 1;
                i--;
            } else if (carry == 1 && a.charAt(i) == '0') {
                result.insert(0, "1");
                carry = 0;
                i--;
            } else {
                result.insert(0, a.charAt(i));
                i--;
            }
        }

        while (j >= 0) {
            if (carry == 1 && b.charAt(j) == '1') {
                result.insert(0, "0");
                carry = 1;
                j--;
            } else if (carry == 1 && b.charAt(j) == '0') {
                result.insert(0, "1");
                j--;
                carry = 0;
            } else {
                result.insert(0, b.charAt(j));
                j--;
            }
        }

        if (carry == 1) {
            result.insert(0, 1);
        }
        return result.toString();
    }
}