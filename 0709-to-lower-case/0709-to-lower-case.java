class Solution {
    public String toLowerCase(String str) {
         StringBuffer res = new StringBuffer();
        for(int i=0;i<str.length();i++)
          if(str.charAt(i)>='A' && str.charAt(i)<='Z')
              res.append((char)(str.charAt(i) + ('a' - 'A')));
            else
              res.append(str.charAt(i));
      return res.toString();
    }
}