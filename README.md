1. Run mvn clean install to create jar
2. Create a lambda with Java 11 Runtime
3. Upload the jar `athena-udf-1.0.jar` from target
4. In runtime settings set handler as `com.demo.athena.AthenaUDFHandler`
5. Run Query from athena
```
USING EXTERNAL FUNCTION compress(inp varchar) RETURNS varchar LAMBDA 'udf-athena-new' 
select compress('test');

USING EXTERNAL FUNCTION compress(inp varchar) RETURNS varchar LAMBDA 'udf-athena-new' 
select compress(period) from <tableName>;
```