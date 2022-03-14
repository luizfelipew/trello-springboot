package org.kanbanboard.kanbanboard.write.adapter.out;

import org.kanbanboard.kanbanboard.write.domain.core.BucketRepository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.UUID;

public class BucketRepositoryImpl implements BucketRepository {

    private NamedParameterJdbcTemplate jdbcTemplate;

    public BucketRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void create(UUID uuid, int position, String name) {

        String sql = """
          INSERT INTO list(uuid, position, name) 
          values (:uuid, :position, :name)""";

        MapSqlParameterSource parameters = new MapSqlParameterSource();

        parameters.addValue("uuid", uuid);
        parameters.addValue("position", position);
        parameters.addValue("name", name);

        jdbcTemplate.update(sql, parameters);

    }
}
