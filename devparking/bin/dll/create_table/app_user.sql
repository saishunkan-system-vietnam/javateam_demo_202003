-- create table
drop table if exists app_user;
create table app_user
(
    user_id             bigint          not null,
    user_name           varchar(36)     not null,
    phone               varchar(11)     not null,
    encryted_password   varchar(128)    not null,
    enabled             bit             not null,
    created_datetime    timestamp       not null default current_timestamp,
    update_datetime     timestamp       not null default current_timestamp,
    is_deleted          bool            not null default false
) ;
alter table app_user
  add constraint app_user_pk primary key (user_id);

alter table app_user
  add constraint app_user_uk unique (user_name);