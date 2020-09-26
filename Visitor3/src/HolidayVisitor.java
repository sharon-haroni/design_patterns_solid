class HolidayVisitor  implements Visitor {
    public void visit(GoldCustomer customer) {
        System.out.println("Holiday sales for GoldCustomer " + customer.getMail());
        // send mail for sales
    }

    public void visit(RegularCustomer customer) {
        System.out.println("Holiday sales for RegularCustomer " + customer.getMail());
        // send mail for sales
    }

    public void visit(PlatiniumCustomer customer ) {
        System.out.println("Holiday sales for PlatiniumCustomer " + customer.getMail());
        // send mail for sales
    }
}
