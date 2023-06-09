import { TextField } from '@mui/material';
import React from 'react';

const InputTextField = ({ autoComplete, name, required, fullWidth, id, label, type, autoFocus }) => (
    <TextField
        autoComplete={autoComplete}
        name={name}
        required={required}
        fullWidth={fullWidth}
        id={id}
        label={label}
        type={type}
        autoFocus={autoFocus}
    />
);

export default InputTextField;