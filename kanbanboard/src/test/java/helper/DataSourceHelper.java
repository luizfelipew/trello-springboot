package helper;


import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.SQLException;

public abstract class DataSourceHelper{

    protected BasicDataSource dataSource = new BasicDataSource();

    @BeforeEach
    void init() {

//        String url = "jdbc:h2:mem:DATABASE_TEST;" +
//            "MODE=PostgreSQL;" +
//            "INIT=RUNSCRIPT FROM 'classpath.sql'\\;" +
//            "RUNSCRIPT FROM 'src/main/resources/db/migrationV002__Load_dataset.sql";

        String url = "jdbc:h2:mem:DATABASE_TEST;" +
            "MODE=PostgreSQL;" +
            "INIT=RUNSCRIPT FROM 'src/main/resources/db/migration/V001__Initial_setup.sql'\\;" +
            "RUNSCRIPT FROM 'classpath:fixture/dataset.sql'\\;";

        dataSource.setUrl(url);
        dataSource.setMaxTotal(1);
    }

    @AfterEach
    void terminate() throws SQLException {
        dataSource.close();
    }
}