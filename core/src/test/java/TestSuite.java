import lemongrenade.core.coordinator.AdapterManagerTest;
import lemongrenade.core.coordinator.CoordinatorCommandBoltTest;
import lemongrenade.core.coordinator.JobManagerTest;
import lemongrenade.core.database.lemongraph.LemonGraphOfflineTest;
import lemongrenade.core.database.lemongraph.LemonGraphTest;
import lemongrenade.core.database.mongo.LGJobDAOImplTest;
import lemongrenade.core.models.LGJobTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdapterManagerTest.class,
        JobManagerTest.class,
        LGJobTest.class,
        CoordinatorCommandBoltTest.class,
        LGJobDAOImplTest.class,
        LemonGraphOfflineTest.class,
        LemonGraphTest.class
        // LemonGraph tester needs lemongraph running, which breaks the maven compile sometimes
        // need to rethink that
        //,LemonGraphTest.class
})

public class TestSuite {

}


