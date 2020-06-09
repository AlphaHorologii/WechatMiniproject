DROP TABLE IF EXISTS author;
CREATE TABLE author
(
    authorid  int auto_increment primary key,
    name varchar(45) not null,
    country varchar(45) default 'china' null,
    intro varchar(255) null,
    totalBook int default 0 not null,
    image varchar(255) default 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png' null,
    categoryid int default 0
) DEFAULT CHARSET = gbk;

INSERT INTO library.author (authorid, name, country, intro, totalBook, image, categoryid)
 VALUES (1, '天蚕土豆', '中国', '喜欢拖更，烂尾和瞎弄', 4, 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png', 1);
INSERT INTO library.author (authorid, name, country, intro, totalBook, image, categoryid)
 VALUES (2, '唐家三少', '中国', '功成名就，有钱了，可惜亡妻', 3, 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png', 1);
INSERT INTO library.author (authorid, name, country, intro, totalBook, image, categoryid)
 VALUES (3, '陈振宇', '中国？', '著名教授，旧日支配者，scp-87，恐怖男人', 2, 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png', 2);
INSERT INTO library.author (authorid, name, country, intro, totalBook, image, categoryid)
 VALUES (4, '玛格丽特·米切尔', '美国', '', 1, 'url', 3);

DROP TABLE IF EXISTS book;
CREATE TABLE book
(
    bookid int auto_increment primary key,
    author_id int null,
    categoryId int default 1 not null,
    image varchar(255) default 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png' null,
    summary varchar(500) null,
    publisher varchar(45) null,
    title varchar(45) null,
    rating double null,
    pubdate varchar(45) null,
    catalog varchar(6000) null
) DEFAULT CHARSET = gbk;

INSERT INTO library.book (bookid, author_id, categoryId, image, summary, publisher, title, rating, pubdate, catalog)
 VALUES (1, 3, 2, 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png', '著名教授，师兄杀手，倾心巨作，可能没人能看懂', '南京大学出版社', '数据科学基础', 9.99, '2020-5-17', '没人知道');
INSERT INTO library.book (bookid, author_id, categoryId, image, summary, publisher, title, rating, pubdate, catalog)
 VALUES (2, 2, 1, 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png', '斗罗大陆，很强，可以让作者吃老本吃到死', '随便一个出版社', '斗罗大陆', 6, '2020-5-17', '太长了');
INSERT INTO library.book (bookid, author_id, categoryId, image, summary, publisher, title, rating, pubdate, catalog)
 VALUES (3, 2, 1, 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png', '斗罗大陆2', '随意出版社', '斗罗大陆2', 6.6, '2020-5-17', '太长了');

DROP TABLE IF EXISTS category;
CREATE TABLE category
(
    id int not null primary key,
    categoryName varchar(45) default '科普读物' not null,
    image varchar(45) null,
    motto varchar(45) null,
    heat int default 50 null
) DEFAULT CHARSET = gbk;

INSERT INTO library.category (id, categoryName, image, motto, heat) VALUES (1, '玄幻类', 'url的string', '玄幻类好', 50);
INSERT INTO library.category (id, categoryName, image, motto, heat) VALUES (2, '科普读物', 'url的string', '科普类牛', 50);