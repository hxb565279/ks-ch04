###1、在Spring的配置文件中配置JDBC时，需要定义了三个Bean，分别是dataSource、jdbcTemplate和需要注入类的Bean。在定义jdbcTemplate时，需要将dataSource注入到jdbcTemplate中，而其他需要使用jdbcTemplate的Bean，也需要将jdbcTemplate注入到该Bean中，这样配置完成后，Spring JDBC就可以使用了。

###2、在JdbcTemplate类中，提供了大量的更新和查询数据库的方法，我们就是使用的这些方法来操作数据库的，其常用的方法包括execute()、update()和query()。其中execute()方法能够完成执行SQL语句的功能，update()方法可以完成插入、更新和删除数据的操作，query()方法可以用来处理各种对数据库表的查询操作。
