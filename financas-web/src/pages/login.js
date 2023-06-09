import React from 'react';
import CssBaseline from '@mui/material/CssBaseline';
import Link from '@mui/material/Link';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import InputTextField from '../components/input-text-field';
import ButtonCustom from '../components/button';
import { Avatar } from '@mui/material';

const defaultTheme = createTheme();

const Login = () => {
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
                    <Avatar sx={{ m: 1, bgcolor: 'secondary.main' }}>
                    </Avatar>
                    <Typography component="h1" variant="h5">
                        Fazer login
                    </Typography>
                    <Box component="form" noValidate onSubmit={handleSubmit} sx={{ mt: 3 }}>
                        <Grid container spacing={2}>
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
                            Entrar
                        </ButtonCustom>
                        <Grid container justifyContent="flex-end">
                            <Grid item>
                                <Link href="#" variant="body2">
                                    Esqueceu a senha?
                                </Link>
                            </Grid>
                        </Grid>
                    </Box>
                </Box>
            </Container>
        </ThemeProvider>
    );
};

export default Login;