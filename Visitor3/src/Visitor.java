interface Visitor {
    void visit(GoldCustomer customer);
    void visit(RegularCustomer customer);
    void visit(PlatiniumCustomer customer);
}

