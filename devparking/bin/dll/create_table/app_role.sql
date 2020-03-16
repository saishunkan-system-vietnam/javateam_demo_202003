-- create table
drop table if exists app_role;
create table app_role
(
  role_id           bigint          not null,
  role_name         varchar(30)     not null,
  created_datetime  timestamp       not null default current_timestamp,
  update_datetime   timestamp       not null default current_timestamp,
  is_deleted        bool            not null default false
);
--
alter table app_role
  add constraint app_role_pk primary key (role_id);

alter table app_role
  add constraint app_role_uk unique (role_name);