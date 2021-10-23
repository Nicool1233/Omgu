package com.company;

public class StringProcessor {
    private StringBuilder line;

    public StringProcessor()
    {
        line = null;
    }
    public StringProcessor(StringBuilder argument)
    {
        line = argument;
    }
    public StringBuilder Expansion(int N, StringBuilder s)
    {
        StringBuilder exp = new StringBuilder(s);
        if(N>0) {
            for (int i = 1; i < N; i++) {
                exp.append(s);
            }
        }
        if(N == 0)
        {
            exp = null;
        }
        if(N<0)
        {
            throw new IllegalArgumentException("Отрицательный параметр N");

        }
        return exp;
    }
    public int Occurrences(String a, String b)
    {
        int count = 0;
        if(b != null)
            {
                for (int i = 0; i <= a.length() - b.length(); i++) {
                    String substring = a.substring(i, i + b.length());
                    if (substring.equals(b)) {
                        count = count + 1;
                    }
                }
            }else
            {
                throw new IllegalArgumentException("Отрицательный параметр N");
            }
        return count;
    }
    public StringBuilder Remake(String a)
    {
        StringBuilder remakeNew = new StringBuilder();
        int x = a.length();
        char prikol;
        for(int i = 0; i<x; i++)
        {
            prikol = a.charAt(i);
            if(prikol == 49)
            {
                remakeNew.append("Один");
            }
            if(prikol == 50)
            {
                remakeNew.append("Два");
            }
            if(prikol == 51)
            {
                remakeNew.append("Три");
            }
        }
        return remakeNew;
    }
}
