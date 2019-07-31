insert into taskfolder(id,foldername) values(1, '오늘');
insert into taskfolder(id,foldername) values(2, '내일');
insert into taskfolder(id,foldername) values(3, '미래');


insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(1, '밥주기', now(), now(), '완료', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(2, '물주기', now(), now(), '완료', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(3, '노래하기', now(), now(), '진행중', 2, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(4, '춤추기', now(), now(), '왼료', 3, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(5, '게임하기', now(), now(), '왼료', 3, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(6, '코딩하기', now(), now(), '진행중', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(7, '공부하기', now(), now(), '진행중', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(8, '안녕하기', now(), now(), '진행중', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(9, '감사하기', now(), now(), '진행중', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(10, '고맙기', now(), now(), '진행중', 1, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(11, '기러기', now(), now(), '진행중', 3, now());
insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate) values(12, '청소기', now(), now(), '왼료', 3, now());


-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(1, '밥주기', now(), now(), '완료', 1, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(2, '물주기', now(), now(), '완료', 1, now(),2);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(3, '노래하기', now(), now(), '진행중', 2, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(4, '춤추기', now(), now(), '왼료', 3, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(5, '게임하기', now(), now(), '왼료', 3, now(),3);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(6, '코딩하기', now(), now(), '진행중', 1, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(7, '공부하기', now(), now(), '진행중', 1, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(8, '안녕하기', now(), now(), '진행중', 1, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(9, '감사하기', now(), now(), '진행중', 1, now(),1);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(10, '고맙기', now(), now(), '진행중', 1, now(),2);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(11, '기러기', now(), now(), '진행중', 3, now(),3);
-- insert into task(id,content,regdate,updateat,currentstatus,impolevel,findate,taskfolder_id) values(12, '청소기', now(), now(), '왼료', 3, now(),3);
