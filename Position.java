enum Position {
    S("S"),
    CF("CF"),
    LW("LW"),
    RW("RW"),
    LM("LM"),
    RM("RM"),
    CM("CM"),
    DM("DM"),
    CB("CB"),
    LB("LB"),
    RB("RB");


    private final String text;

    Position(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
    
}