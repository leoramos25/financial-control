CREATE TABLE transactions (
    id UUID DEFAULT gen_random_uuid(),
    description TEXT NOT NULL,
    type varchar(10) NOT NULL,
    amount NUMERIC(10, 2) NOT NULL
);

INSERT INTO transactions (description, type, amount) VALUES ('Mercado do mês', 'OUTCOME', 900.00);
INSERT INTO transactions (description, type, amount) VALUES ('Salario', 'INCOME', 3500.00);
INSERT INTO transactions (description, type, amount) VALUES ('Internet', 'OUTCOME', 120.00);
INSERT INTO transactions (description, type, amount) VALUES ('Parcela carro', 'OUTCOME', 1100.00);
INSERT INTO transactions (description, type, amount) VALUES ('Multa', 'OUTCOME', 300.00);