1. Create a lambda with Java 11 Runtime
2. In runtime settings set handler as `com.demo.athena.AthenaUDFHandler`
3. Run Query from athena
```
USING EXTERNAL FUNCTION compress(inp varchar) RETURNS varchar LAMBDA 'udf-athena-new' 
select compress('test');

USING EXTERNAL FUNCTION compress(inp varchar) RETURNS varchar LAMBDA 'udf-athena-new' 
select compress(period) from <tableName>;
```