import java.util.Enumeration;

public class TextStatement extends Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = addHeader(aCustomer.getName());

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += addFigures(each.getMovie().getTitle(), each.getCharge());
    }
    
    result += addFooter(aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
    return result;
  }

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
