public class VisitorDemo {
    public static void main( String[] args ) {
        Element[] list = {new GoldCustomer(), new RegularCustomer(), new PlatiniumCustomer()};
        HolidayVisitor holiday = new HolidayVisitor();
        WeekendVisitor weekend = new WeekendVisitor();
        for (Element element : list) {
            element.accept(holiday);
        }
        for (Element element : list) {
            element.accept(weekend);
        }
    }
}