set CMDBDriver=oracle.jdbc.driver.OracleDriver
set CMDBDURL=jdbc:oracle:thin:@localhost:1521/orcl
set CMDBUser=ncbadb
set CMDBPassword=ncba123
set CMDBPoolSize=10
set CMDBValidationQuery= "select systimestamp from dual"
set CMDBTestConnectionOnCheckout=false
set ChannelDBSchema=ncbacib
java -jar target\CustomerEntitlementServices-bootable.jar  -Djboss.bind.address=0.0.0.0