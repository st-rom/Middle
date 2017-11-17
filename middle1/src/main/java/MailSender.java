public class MailSender{
    public void sendMail(MailInfo info){
        System.out.println(info.client.getName() + "get's mail with headline" + info.getMailCode() +
                "\nOn his mail adress" + info.client.getEmail());
    }
}