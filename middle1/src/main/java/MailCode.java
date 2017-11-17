public enum MailCode {
    BIRTHDAY, INVITATION, USER_FRIENDLY, USEFUL_INFO, SPAM;
    public String toString() {
        switch (this) {
            case BIRTHDAY:
                return "Happy Birthday";
            case INVITATION:
                return "Welcome to new event";
            case USEFUL_INFO:
                return "maybe u wana know this";
            case USER_FRIENDLY:
                return "it's me, mario!";
            case SPAM:
                return "top 10 anime fails";
            default:
                return "Spam... ";
        }
    }
}
