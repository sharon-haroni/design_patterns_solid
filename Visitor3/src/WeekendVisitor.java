class WeekendVisitor implements Visitor {
    public void visit(GoldCustomer customer) {
        System.out.println("weekend sales for GoldCustomer " + customer.getMail());
        // send mail for sales
    }

    public void visit(RegularCustomer customer) {
        System.out.println("weekend sales for RegularCustomer " + customer.getMail());
        // send mail for sales
    }

    public void visit(PlatiniumCustomer customer ) {
        System.out.println("weekend sales for PlatiniumCustomer " + customer.getMail());
        // send mail for sales
    }
}
