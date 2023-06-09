import React from 'react';
import CssBaseline from '@mui/material/CssBaseline';
import Link from '@mui/material/Link';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import InputTextField from '../../components/input-text-field';
import ButtonCustom from '../../components/button';

const defaultTheme = createTheme();

const SignUp = () => {
    const handleSubmit = (event) => {
        event.preventDefault();
    };

    return (
        <ThemeProvider theme={defaultTheme}>
            <Container component="main" maxWidth="xs">
                <CssBaseline />
                <Box
                    sx={{
                        marginTop: 8,
                        display: 'flex',
                        flexDirection: 'column',
                        alignItems: 'center',
                    }}
                >
                    <Typography component="h1" variant="h5">
                        Cadastrar
                    </Typography>
                    <Box component="form" noValidate onSubmit={handleSubmit} sx={{ mt: 3 }}>
                        <Grid container spacing={2}>
                            <Grid item xs={12} sm={12}>
                                <InputTextField
                                    autoComplete="given-name"
                                    name="nomeCompleto"
                                    required
                                    fullWidth
                                    id="nomeCompleto"
                                    label="Nome completo"
                                    autoFocus
                                />
                            </Grid>
                            <Grid item xs={12}>
                                <InputTextField
                                    autoComplete="email"
                                    name="email"
                                    required
                                    fullWidth
                                    id="email"
                                    label="Email"
                                    autoFocus
                                />
                            </Grid>
                            <Grid item xs={12}>
                                <InputTextField
                                    autoComplete="password"
                                    name="password"
                                    required
                                    fullWidth
                                    id="password"
                                    label="Senha"
                                    type="password"
                                    autoFocus
                                />
                            </Grid>
                        </Grid>
                        <ButtonCustom type="submit" fullWidth variant="contained" sx={{ mt: 3, mb: 2 }}>
                            Criar uma conta
                        </ButtonCustom>
                        <Grid container justifyContent="flex-end">
                            <Grid item>
                                <Link href="#" variant="body2">
                                    Já tem uma conta? Entrar
                                </Link>
                            </Grid>
                        </Grid>
                    </Box>
                </Box>
            </Container>
        </ThemeProvider>
    );
};

export default SignUp;