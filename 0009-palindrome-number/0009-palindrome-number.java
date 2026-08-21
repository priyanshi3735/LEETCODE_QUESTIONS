class Solution {
    public boolean isPalindrome(int x) {
      StringBuilder sb=new StringBuilder();
      String str=x+"";
      sb.append(str);
      sb.reverse();
      if(str.equals(sb.toString())){return true;}
      return false;
    }
}