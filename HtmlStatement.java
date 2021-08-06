import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
    return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
  }

  public String addFigures(String title, double charge) {
    return title + ": " + String.valueOf(charge) + "<BR>\n";
  }

  public String addFooter(double totalCharge, int totalPoints) {
    return "<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n" +
    "On this rental you earned <EM>" +  String.valueOf(totalPoints) + "</EM> frequent renter points<P>";
  }
}
