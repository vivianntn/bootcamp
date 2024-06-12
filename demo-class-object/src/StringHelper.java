public class StringHelper {

private String str;

public StringHelper(String str) {
  this.str = str;
}

//instance method
public void setCharAt(int index, char ch){ //change the Object at attribute
  String s = "";
  for (int i = 0; i< this.str.length(); i++) {
    if (i == index)
    s += ch;
    else
    s += this.str.charAt(i);
  }
  this.str = s; // revise the string object inside StringHelper Object
}

public String toString(){
  return this.str;
}

public StringHelper append(String s){ //returning the Object itself
  this.str += s;
  return this;
}

public String substring(int startIdx, int endIdx){
  String s = "";
  for (int i = startIdx; i< endIdx; i++) {
    s += this.str.charAt(i);
  }
  //this.str = s; //didn't write this = no change to the object
  return s;
}


  public static void main(String[] args) {
    StringHelper sh = new StringHelper("hello");
    sh.setCharAt(3, 'a');
    System.out.println(sh.toString()); //helao

    sh.append(" world");
    System.out.println(sh.toString()); //helao world

    //chain method call
    sh.append("!!!").append(" I'm Viv.").setCharAt(10, '#');
    System.out.println(sh.toString());

    System.out.println(sh.substring(2, 5)); //lao

  }
  
}
