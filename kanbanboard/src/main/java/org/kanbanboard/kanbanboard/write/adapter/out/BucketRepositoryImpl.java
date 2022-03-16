package org.kanbanboard.kanbanboard.write.adapter.out;

import org.kanbanboard.kanbanboard.write.domain.core.Bucket;
import org.kanbanboard.kanbanboard.write.domain.core.BucketRepository;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

public class BucketRepositoryImpl implements BucketRepository {

    private NamedParameterJdbcTemplate jdbcTemplate;

    public BucketRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void create(final Bucket bucket) {

        String sql = """
          INSERT INTO list(uuid, position, name) 
          values (:uuid, :position, :name)""";

        MapSqlParameterSource parameters = new MapSqlParameterSource();

        parameters.addValue("uuid", bucket.getUuid());
        parameters.addValue("position", bucket.getPosition());
        parameters.addValue("name", bucket.getName());

        jdbcTemplate.update(sql, parameters);

    }
}
