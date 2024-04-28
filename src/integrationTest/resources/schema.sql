create table customer
(
    id    UUID primary key,
    cpf   varchar(14)  not null,
    name  varchar(255) not null,
    email varchar(100) not null
);

create table product
(
    id          UUID primary key,
    name        varchar(255) not null,
    category    varchar(10)  not null,
    price       float        not null,
    description varchar(500),
    image       varchar(500)
);

create table orders
(
    id              UUID primary key,
    customer_id     UUID,
    created         date         not null,
    amount          float        not null
);

create table orderitem
(
    id         UUID primary key,
    order_id   UUID,
    product_id UUID  not null,
    quantity   int   not null,
    price      float not null
);