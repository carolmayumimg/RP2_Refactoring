import java.util.Enumeration;

public abstract class Statement {
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

  abstract String addHeader(String name);

  abstract String addFigures(String title, double charge);

  abstract String addFooter(double totalCharge, int totalPoints);
}