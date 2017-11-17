public class Main {
    public static void main(String args[]){
        Client client1 = new Client("Quebert", 13, Sex.MAN, "cube@mail.ru");
        MailCode ml1 = MailCode.USER_FRIENDLY;
        MailCode ml2 = MailCode.SPAM;
        Client client2 = new Client("Jessica", 17, Sex.WOMAN, "bogocoder@ukr.net");
        MailCode ml3 = MailCode.BIRTHDAY;
        String cont1 = "Hey m8,\n thx for da gift";
        String cont2 = "Btw, u might wanna try this www.randomstaff.com";
        String cont3 = "Hey bae, happy bday";
        MailBox box = new MailBox();
        box.addMailInfo(new MailInfo(client1, ml1, cont1));
        box.addMailInfo(new MailInfo(client1, ml2, cont2));
        box.addMailInfo(new MailInfo(client2, ml3, cont3));
        box.sendAll();
    }
}
