import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<MailInfo>();
    private MailSender sender = new MailSender();

    public void addMailInfo(MailInfo mi){
        infos.add(mi);
    }

    public void sendAll(){
        for(int i = 0; i < infos.size(); i++){
            sender.sendMail(infos.get(i));
        }
    }
}
