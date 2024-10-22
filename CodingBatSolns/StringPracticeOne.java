//Hello_Name
public String helloName(String name) {
  return "Hello " + name  +  "!";
 
}

//First_Half
public String firstHalf(String str) {
  

  return str.substring(0, str.length() /2);

  
}

//Make_Abba
public String makeAbba(String a, String b) {
  return a + b + b + a;
  
}

//Make_Tags
public String makeTags(String tag, String word) {
  
  return String "<" + tag + ">" + word + "</" + tag + ">";
  
}

//makeOutWord
public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2,out.length());

}

//extraEnd
public String extraEnd(String str) {
  return str.substring(str.length()-2) +
  str.substring(str.length()-2) +
  str.substring(str.length()-2);
}
