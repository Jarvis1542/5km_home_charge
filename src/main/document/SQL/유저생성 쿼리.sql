/* SQL CommandLine 기준 */

conn sys as sysdba;
1234

create user cap identified by 1234;
grant connect, resource, dba to cap;

conn cap/1234;

commit;