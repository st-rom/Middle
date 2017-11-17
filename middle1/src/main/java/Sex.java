public enum Sex {
    MAN, WOMAN;

    public String toString() {
        switch (this) {
            case MAN:
                return "Man";
            case WOMAN:
                return "Woman";
            default:
                return "Gender Fluid";
        }
    }
}