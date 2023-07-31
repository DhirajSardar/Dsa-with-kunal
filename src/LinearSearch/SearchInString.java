package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name  = "Dhiraj ";
        char target ='D';
//        boolean ans = SearchInstring (name,target);
         char ans = SearchInstring1(name,target);
        System.out.println(ans);

    }
    static  boolean SearchInstring(String str, char target )
    {
        if (str == null) {

            return  false;
        }
         for ( int i =0;i<str.length();i++)
         {
              if (target== str.charAt(i)){
                  return true;
              }
         }
        return  false;
    }
    static  char SearchInstring1(String str, char target )
    {
        if (str == null) {

            return str.charAt(str.length() -1) ;
        }
         for ( int i =0;i<str.length();i++)
         {
              if (target== str.charAt(i)){
                  return str.charAt(i);
              }
         }
        return str.charAt(str.length()-1);
    }
}
