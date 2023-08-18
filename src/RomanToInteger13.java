//Name: 13. Roman To Integer
//Difficulty: Easy
//Description: Given a roman numeral, convert it to an integer.
//Runtime Complexity: O(n) - linear time complexity
//Space Complexity: O(1) - constant space complexity

public class RomanToInteger13 {
    public int romanToInt(String s) {
        int solution = 0;
        for (int i = 0; i < s.length(); i++) {
            String curr = s.substring(i, i + 1);
            if (curr.equals("M")) {
                solution = solution + 1000;
            } else if (curr.equals("D")) {
                solution = solution + 500;
            } else if (curr.equals("C")) {
                if (i + 2 <= s.length()) {
                    if (s.substring(i + 1, i + 2).equals("D")) {
                        solution = solution + 400 - 500;
                    }
                    else if (s.substring(i + 1, i + 2).equals("M")) {
                        solution = solution + 900 - 1000;
                    } else {
                        solution = solution + 100;
                    }
                } else {
                    solution = solution + 100;
                }
            } else if (curr.equals("L")) {
                solution = solution + 50;
            } else if (curr.equals("X")) {
                if (i + 2 <= s.length()) {
                    if (s.substring(i + 1, i + 2).equals("L")) {
                        solution = solution + 40 - 50;
                    }
                    else if (s.substring(i + 1, i + 2).equals("C")) {
                        solution = solution + 90 - 100;
                    } else {
                        solution = solution + 10;
                    }
                } else {
                    solution = solution + 10;
                }
            } else if (curr.equals("V")) {
                solution = solution + 5;
            } else if (curr.equals("I")) {
                if (i + 2 <= s.length()) {
                    if (s.substring(i + 1, i + 2).equals("V")) {
                        solution = solution + 4 - 5;
                    }
                    else if (s.substring(i + 1, i + 2).equals("X")) {
                        solution = solution + 9 - 10;
                    } else {
                        solution = solution + 1;
                    }
                } else {
                    solution = solution + 1;
                }
            }
        }
        return solution;
    }
}