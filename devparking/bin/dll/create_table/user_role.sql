-- create table
drop table if exists user_role;
create table user_role
(
  id                    bigint      not null,
  user_id               bigint      not null,
  role_id               bigint      not null,
  created_datetime      timestamp   not null default current_timestamp,
  update_datetime       timestamp   not null default current_timestamp,
  is_deleted            bool        not null default false
);
--
alter table user_role
  add constraint user_role_pk primary key (id);

alter table user_role
  add constraint user_role_uk unique (user_id, role_id);

alter table user_role
  add constraint user_role_fk1 foreign key (user_id)
  references app_user (user_id);

alter table user_role
  add constraint user_role_fk2 foreign key (role_id)
  references app_role (role_id);