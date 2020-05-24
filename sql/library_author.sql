create table author
(
    authorid  int auto_increment
        primary key,
    name      varchar(45)                                                                             not null,
    country   varchar(45)  default 'china'                                                            null,
    intro     varchar(255)                                                                            null,
    totalBook int          default 0                                                                  not null,
    image     varchar(255) default 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png' null
);

INSERT INTO library.author (authorid, name, country, intro, totalBook, image) VALUES (1, '天蚕土豆', 'china', '喜欢拖更，烂尾和瞎弄', 4, 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png');
INSERT INTO library.author (authorid, name, country, intro, totalBook, image) VALUES (2, '唐家三少', 'china', '功成名就，有钱了，可惜亡妻', 3, 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png');
INSERT INTO library.author (authorid, name, country, intro, totalBook, image) VALUES (3, '陈振宇', 'china？', '著名教授，旧日支配者，scp-87,恐怖男人', 2, 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png');
create table book
(
    bookid    int auto_increment
        primary key,
    author_id int                                                                                        null,
    image     varchar(255) default 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png' null,
    summary   varchar(500)                                                                               null,
    publisher varchar(45)                                                                                null,
    title     varchar(45)                                                                                null,
    rating    double                                                                                     null,
    pubdate   varchar(45)                                                                                null,
    catalog   varchar(6000)                                                                              null
);

INSERT INTO library.book (bookid, author_id, image, summary, publisher, title, rating, pubdate, catalog) VALUES (1, 3, 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png', '著名教授，师兄杀手，倾心巨作，可能没人能看懂', '南京大学出版社', '数据科学基础', 9.99, '2020-5-17', '没人知道');
INSERT INTO library.book (bookid, author_id, image, summary, publisher, title, rating, pubdate, catalog) VALUES (2, 2, 'https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png', '斗罗大陆，很强，可以让作者吃老本吃到死', '随便一个出版社', '斗罗大陆', 6, '2020-5-17', '太长了');