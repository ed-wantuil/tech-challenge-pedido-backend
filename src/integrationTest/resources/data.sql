insert into customer
values ('4d1335a5-3627-42f3-8637-4e52b6e852bf', '758.679.480-48', 'João Silva', 'joao@silva.com');
insert into customer
values ('d7988faa-d416-471f-b537-50a784b1162d', '443.564.910-17', 'Maria Silva', 'maria@silva.com');

insert into product
values ('c8634a8a-91df-4fe7-b3e9-d978c2b37384', 'Hamburger', 'SNACK', 10, 'Hamburger', 'base64');
insert into product
values ('d3c97509-3d47-46f0-852a-d04d5a3b12f3', 'Suco', 'DRINK', 5, 'Suco', 'base64');
insert into product
values ('3bfa8cc8-0a8d-43c1-9cda-94484c069cd9', 'Batata Frita', 'SIDE_DISH', 3, 'Batata Frita', 'base64');
insert into product
values ('1d568cfd-308e-46fd-a336-d3e055f55991', 'Sorvete', 'DESSERT', 5, 'Sorvete', 'base64');
insert into product
values ('6956d3d9-11fc-4bf6-9330-9e37f2d291ca', 'Paleta Mexicana', 'DESSERT', 5, 'Paleta Mexicana', 'base64');

insert into orders
values ('db21f88b-bb46-456e-88e9-8bb365dd492a', null, '2023-01-01', 15);
insert into orders
values ('9ee53a51-0d52-47a7-9d2d-8d7f17be8415', '4d1335a5-3627-42f3-8637-4e52b6e852bf', '2023-05-01', 20);
insert into orders
values ('715951ea-adc4-4d25-9c57-29d40959d06d', 'd7988faa-d416-471f-b537-50a784b1162d', '2023-06-01', 10);
insert into orders
values ('104e3330-e407-40c7-831d-4d36fc7a1df2', null, '2023-07-01', 8);

insert into orderitem
values ('f0774229-4680-4425-acb0-c258da57fa84', 'db21f88b-bb46-456e-88e9-8bb365dd492a',
        'c8634a8a-91df-4fe7-b3e9-d978c2b37384', 1, 10);
insert into orderitem
values ('9ce28762-39b4-4d23-9a81-86fd03d4ed06', 'db21f88b-bb46-456e-88e9-8bb365dd492a',
        'd3c97509-3d47-46f0-852a-d04d5a3b12f3', 1, 5);
insert into orderitem
values ('252298f6-0eea-4ed9-9f1e-02c2d7816154', '9ee53a51-0d52-47a7-9d2d-8d7f17be8415',
        'd3c97509-3d47-46f0-852a-d04d5a3b12f3', 1, 10);
insert into orderitem
values ('a1fd6b9c-0684-4892-a1ab-66b2f5c3dcff', '9ee53a51-0d52-47a7-9d2d-8d7f17be8415',
        '3bfa8cc8-0a8d-43c1-9cda-94484c069cd9', 1, 10);
insert into orderitem
values ('74d03c70-b261-4796-8633-021d1ee4c10a', '715951ea-adc4-4d25-9c57-29d40959d06d',
        'd3c97509-3d47-46f0-852a-d04d5a3b12f3', 1, 10);
insert into orderitem
values ('69d7f7bb-ff54-448f-855f-5cfa0b0c71ff', '104e3330-e407-40c7-831d-4d36fc7a1df2',
        '3bfa8cc8-0a8d-43c1-9cda-94484c069cd9', 2, 10);
