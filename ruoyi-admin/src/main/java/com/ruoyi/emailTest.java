package com.ruoyi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* *
 * eamil测试类
 * */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RuoYiApplication.class)
public class emailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    //这里自己给自己发送
    @Test
    public void  sendtest() throws MessagingException {

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        // 设置邮件主题、发送人和收件人
        helper.setSubject("这是一封带有附件的邮件");
        helper.setFrom("1420889454@qq.com");
        helper.setTo("1376700075@qq.com");
        // 设置邮件内容
        helper.setText("这是一封带有附件的邮件，请查收！");
        // 添加附件
        FileSystemResource file = new FileSystemResource(new File("D:\\TOOLS\\HMMER\\hmmer3.0_windows\\result\\1683085934444tet.out"));
        helper.addAttachment("1683085934444tet.out", file);
        // 发送邮件
        javaMailSender.send(message);
    }

    @Test
    public void testtime(){
    }
}
 

