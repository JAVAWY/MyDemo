package mail;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 发送QQ邮件
 * 
 * @author Wang
 * @date 2020年3月25日
 */
public class TestMail {

    public static void main(String[] args) {

        String from = "1040375485@qq.com"; //发件人的邮箱地址
        String to = "2326669056@qq.com";    //收件人的邮箱地址
        String subject = "温馨提示~";    //邮件主题
        String body = "请记得填报疫情信息呀~";    //邮件内容

        //设置发送邮件的一些属性
        Properties prop = new Properties();
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.host", "smtp.qq.com");
        prop.setProperty("mail.smtp.port", "465");
        prop.setProperty("mail.smtp.auth", "true");
        prop.setProperty("mail.debug", "true");
        prop.setProperty("mail.smtp.ssl.enable", "true"); //qq邮箱必须设置这一项，ssl加密选项

        
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                //这里需要验证邮箱的授权码，QQ邮箱需要授权码
                return new PasswordAuthentication(from, "yvumudbtkrdsbebg");
            }
        });
        
        MimeMessage message = new MimeMessage(session);
        try {
            Transport transport = session.getTransport();
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSentDate(new Date());
            message.setSubject(subject);
            //如果仅仅是发送文本，使用setText()方法
            message.setText(body);
            
            //如果是发送html格式的邮件则需要使用setContent()方法，并且设置参数text/html; 这两个方法是等价的,后面执行的会覆盖前一个方法设置的内容
            message.setContent("<h1>快到时间啦！记得填报疫情信息呀~</h1>","text/html;charset=gb2312");
            message.saveChanges();
            session.setDebug(true);
            transport.connect(from, "yvumudbtkrdsbebg");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}