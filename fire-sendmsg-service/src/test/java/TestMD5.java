import com.honeywell.sendmsg.service.FireSendmsgApplication;
import com.honeywell.sendmsg.service.entity.Message;
import com.honeywell.sendmsg.service.entity.SendBody;
import com.honeywell.sendmsg.service.service.SendmsgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FireSendmsgApplication.class)
public class TestMD5 {

    @Autowired
    SendmsgService sendmsgService;

    @Test
    public void getMD5()  {

        SendBody sendBody = new SendBody();
        sendBody.setAudience_type("all");
        Message message = new Message("title", "@@@@@@@@@@@@@@@@2");
        sendBody.setMessage(message);
        boolean b = sendmsgService.sendMsgToOneAccount(sendBody);
        System.out.println(b+"00000000000000000");
    }

}
