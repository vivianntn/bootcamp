package Form;

public class Address {
  private String line1;
  private String line2;
  private String line3;

  public Address(String line1, String line2, String line3) {
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public String getLine1() {
    return this.line1;
  }

  public String getLine2() {
    return this.line2;
  }

  public String getLine3() {
    return this.line3;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public String toString() {
    return "line1 : " + this.line1 + //
        " line2 : " + this.line2 + //
        " line3 : " + this.line3;
  }

  public static void main(String[] args) {
    // create a Form Object, with Address Object
    Form form = new Form("Vivian", "Ng",
        new Address("abc", "def", "hij"));
    //or separate in two lines
    Address address = new Address("abc", "def", "hij");
    //Form form = new Form("Vivian", "Ng", address);
    System.out.println(form); //call form.toString()

    System.out.println(form.getAddress());// call Address Object toString()

    System.out.println(form.getAddress().getLine2());

    Form form2 = new Form("vicky", "ng", new Address("abc", "def", "hij"));

    form.getAddress().setLine2("xyz");
    System.out.println(form.getAddress().getLine2());

    System.out.println(form2.getAddress().getLine2());



  }
}
