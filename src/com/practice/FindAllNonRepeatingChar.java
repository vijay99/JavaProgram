package com.triky.interview.question;

public class FindAllNonRepeatingChar {
    public static void main(String args[]) {
        String str = "aabbbcddea";
        int n = str.length();
        int index[] = new int[n];
        char nonrepeatChar[] = new char[n];
        int count=0,x=0,a=0;
        boolean match = false;
        for (int i = 0; i < n; i++) {
            count=0;
            match = false;
           for(int element:index){
               if(element==i)
                   match = true;
                    break;
           }
            if(match==true)
                continue;
            else{
                for (int j = i + 1; j < n; j++) {
                    if (str.charAt(i) == str.charAt(j))
                        index[x] = j;
                    x++;
                    count++;
                }
            }
            if(count==0){
                nonrepeatChar[a]=str.charAt(i);
                a++;
            }




        }
        for(int k=0;k<n;k++)
            System.out.println(nonrepeatChar[k]);
    }
}
