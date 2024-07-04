class ReverseString{
public static void main(String str[]){
String org_string = "Honesty";
String rev_string = "";
for(int i = 0;i<org_string.length();i++){
rev_string = org_string.charAt(i) + rev_string;
}
System.out.println("Reverse String: " + rev_string);
}
}
