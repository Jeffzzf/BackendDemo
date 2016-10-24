package user;

import com.jeffzzf.basic.dao.UserDAO;
import com.jeffzzf.basic.po.UserPO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.AbstractTest;

public class UserTest extends AbstractTest {
    private static final Logger log = LogManager.getLogger("mainLogger");

    @Autowired
    private UserDAO userDAO;
    @Test
    public void addTest() {
        UserPO po = new UserPO();
        po.setName("zzf");
        po.setGender(0);
        userDAO.addUser(po);
        log.info("Finished");
    }

    @Test
    public void getTest() {
        UserPO po = userDAO.getUserById(1);
        Assert.assertNotNull(po);
    }
}
