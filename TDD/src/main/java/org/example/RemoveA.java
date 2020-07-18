package org.example;

public class RemoveA {

    public String removeAlphabetA(String mInputString) {

        String mResult = mInputString;

        if (mInputString.length() <= 2 && mInputString.contains("A")) {
            mResult = mResult.replace("A", "");
        } else if (mInputString.length() <= 2) {
            return mResult;
        } else {
            String two = mInputString.substring(0, 2);
            String rest = mInputString.substring(2);
            mResult = two.replace("A", "") + rest;
        }

        return mResult;
    }
}
