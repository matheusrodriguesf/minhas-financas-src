CREATE TABLE IF NOT EXISTS financas.tb_usuario(
    id_usuario SERIAL PRIMARY KEY,
    nome_usuario VARCHAR(150) NOT NULL,
    email_usuario VARCHAR(150) NOT NULL,
    senha_usuario VARCHAR(150) NOT NULL,
    st_usuario BOOLEAN DEFAULT TRUE,
    data_cadastro_usuario TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

COMMENT ON TABLE financas.TB_USUARIO IS 'Tabela de usuários';

COMMENT ON COLUMN financas.TB_USUARIO.nome_usuario IS 'Nome do usuário';

COMMENT ON COLUMN financas.TB_USUARIO.email_usuario IS 'E-mail do usuário';

COMMENT ON COLUMN financas.TB_USUARIO.senha_usuario IS 'Senha do usuário';

COMMENT ON COLUMN financas.TB_USUARIO.st_usuario IS 'Status do usuário';

COMMENT ON COLUMN financas.TB_USUARIO.data_cadastro_usuario IS 'Data de criação do usuário';

