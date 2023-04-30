drop table if exists course
drop table if exists course_seq
drop table if exists course_students
drop table if exists lesson
drop table if exists lesson_seq
drop table if exists student
drop table if exists student_seq

create table courses (
    id bigint not null auto_increment, 
    date date, 
    description varchar(100), 
    name varchar(100) not null, 
    firstname varchar(100) not null, 
    lastname varchar(100) not null, 
    primary key (id)
) engine=InnoDB;

create table course_seq (next_val bigint) engine=InnoDB
insert into course_seq values ( 1 )

create table course_students (
    courses_id bigint not null, 
    students_id bigint not null
) engine=InnoDB;

create table lesson (
    id bigint not null auto_increment, 
    date DATE default now(), 
    description varchar(1000), 
    course_id bigint, 
    primary key (id)
) engine=InnoDB;

create table lesson_seq (next_val bigint) engine=InnoDB
insert into lesson_seq values ( 1 )

create table student (
    id bigint not null auto_increment, 
    firstname varchar(100) not null, 
    lastname varchar(100) not null, 
    email varchar(100) not null, 
    primary key (id)
) engine=InnoDB;

create table student_seq (next_val bigint) engine=InnoDB
insert into student_seq values ( 1 )

alter table course_students add constraint FK532dg5ikp3dvbrbiiqefdoe6m

    foreign key (students_id) references student (id);

alter table course_students add constraint FKh6irfl8rj4jgb3xrlyxsr2bdk

    foreign key (courses_id) references course (id);

alter table lesson add constraint FKjs3c7skmg8bvdddok5lc7s807

    foreign key (course_id) references course (id);