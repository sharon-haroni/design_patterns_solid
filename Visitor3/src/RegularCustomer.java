class RegularCustomer implements Element {
    public void   accept( Visitor v ) {
        v.visit( this );
    }

    public String getMail() {
        return "EMail ...";
    }
}

