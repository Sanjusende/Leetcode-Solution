public class touppercase {
    public static void toupercase(String str){
      StringBuilder sb=new StringBuilder(' ');
      char ch= Character.toUpperCase(str.charAt(0));
     sb.append(ch) ;
     for(int i=1;i<str.length();i++){
        char c=str.charAt(i);
        if(c==' ' && i<str.length()-1){
            sb.append(c);
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(c);
        }
     }
     System.out.println(sb.toString());
    }   

    public static void main(String[] args) {
        String str="sanjay sende";
        toupercase(str);
    }
}
