package impls.robots;

import interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by andrew_korneev on 31.03.2018.
 */
@Repository
public class RobotPool {

    @Autowired
    private Collection<Robot> robotPool;

    public Collection<Robot> get() {
        return robotPool;
    }
}
