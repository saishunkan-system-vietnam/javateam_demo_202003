-- create table
drop table if exists app_user;
create table app_user
(
    user_id             bigint          not null,
    user_name           varchar(36)     not null,
    encryted_password   varchar(128)    not null,
    enabled             bit             not null
) ;
alter table app_user
  add constraint app_user_pk primary key (user_id);

alter table app_user
  add constraint app_user_uk unique (user_name);