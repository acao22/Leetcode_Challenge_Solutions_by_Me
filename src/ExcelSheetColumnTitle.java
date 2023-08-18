//Name: 168. Excel Sheet Column Title
//Difficulty: Easy
//Description: Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//Runtime Complexity: O(n)
//Space Complexity: O(n)
//Data Structure: while loop


class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        String returnString = "";
        while (columnNumber > 0) {
            columnNumber--;
            char curr = (char) ('A' + (columnNumber % 26));
            returnString = curr + returnString;
            columnNumber = columnNumber / 26;
        }
        return returnString;
    }
}