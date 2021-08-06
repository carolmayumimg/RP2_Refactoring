public class TextStatement extends Statement {
  public String addHeader(String name) {
    return "Rental Record for " + name + "\n";
  }

  public String addFigures(String title, double charge) {
    return "\t" + title + "\t" + String.valueOf(charge) + "\n";
  }

  public String addFooter(double totalCharge, int totalPoints) {
    return "Amount owed is " + String.valueOf(totalCharge) + "\n" +
    "You earned " + String.valueOf(totalPoints) + " frequent renter points";
  }
}
