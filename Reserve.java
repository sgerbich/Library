interface Reserve {
    boolean isReservable();

    void loan();

    void returnBook();
    
    int lateCharge();
}