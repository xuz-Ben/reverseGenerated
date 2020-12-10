drop table if exists p_data_surce;
/*==============================================================*/
/* Table: p_data_surce                                          */
/*==============================================================*/
create table p_data_surce
(
   id                   bigint                         not null,
   data_type            varchar(50)                    null,
   data_name            varchar(50)                    null,
   dirver_calss_name    varchar(100)                   null,
   create_time          date                           null,
   create_by            varchar(50)                    null,
   update_time          date                           null,
   update_by            varchar(50)                    null,
   constraint PK_P_DATA_SURCE primary key (id)
);

comment on table p_data_surce is
'数据原表';
comment on column p_data_surce.id is
'id';
comment on column p_data_surce.data_type is
'数据源类型';
comment on column p_data_surce.data_name is
'数据源名称';
comment on column p_data_surce.dirver_calss_name is
'对应的驱动类';
comment on column p_data_surce.create_time is
'创建时间';
comment on column p_data_surce.create_by is
'创建人';
comment on column p_data_surce.update_time is
'更新时间';
comment on column p_data_surce.update_by is
'更新人';

create table p_date_resuce_user
(
   id                   bigint                         not null,
   data_resuce_id       bigint                         not null,
   ip                   varchar(50)                    null,
   port                 varchar(10)                    null,
   account              varchar(50)                    null,
   password             varchar(50)                    null,
   userId               bigint                         null,
   create_time          date                           null,
   create_by            varchar(50)                    null,
   update_time          date                           null,
   update_by            varchar(50)                    null,
   constraint PK_P_DATE_RESUCE_USER primary key (id)
);
comment on table p_date_resuce_user is
'用户创建数据源';
comment on column p_date_resuce_user.id is
'id';
comment on column p_date_resuce_user.data_resuce_id is
'data_resuce_id';
comment on column p_date_resuce_user.ip is
'ip';
comment on column p_date_resuce_user.port is
'端口';
comment on column p_date_resuce_user.account is
'账号';
comment on column p_date_resuce_user.password is
'密码';
comment on column p_date_resuce_user.userId is
'用户id';
comment on column p_date_resuce_user.create_time is
'创建时间';
comment on column p_date_resuce_user.create_by is
'创建人';
comment on column p_date_resuce_user.update_time is
'更新时间';
comment on column p_date_resuce_user.update_by is
'更新人';
alter table p_date_resuce_user
   add constraint FK_P_DATE_R_REFERENCE_P_DATA_S foreign key (data_resuce_id)
      references p_data_surce (id)
      on update restrict
      on delete restrict;