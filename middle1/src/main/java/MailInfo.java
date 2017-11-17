import java.util.Random;

public class MailInfo {
    protected MailCode mailCode;
    protected Client client;
    protected String content;
    public MailInfo(Client client, MailCode mailcode, String content){
        this.client = client;
        this.mailCode = mailcode;
        this.content = content;
    }
    //public Client client = new Client("Quebert", 13, Sex.MAN, "cube@mail.ru");
    //private int mailCode = new Random().nextInt(100000) + 111111;


    public void setMailCode(MailCode ml){
        mailCode = ml;
    }

    public String getMailCode(){
        return mailCode.toString();
    }

    public String getContent(){
        return content;
    }
}
