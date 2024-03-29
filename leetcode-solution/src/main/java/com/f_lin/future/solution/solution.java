package com.f_lin.future.solution;

/**
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * ]
 *
 * @author F_lin fengjunlin@sobey.com
 * @version 1.0
 * @since 2021/9/28
 */
public class solution {

    public static void main(String[] args) {
        System.out.println(replaceSpace(""));
    }




    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (' ' == c) {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
