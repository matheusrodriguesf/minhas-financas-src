import { Button } from "@mui/material";

const ButtonCustom = ({ type, fullWidth, variant, sx, children }) => {
  return (
    <Button type={type} fullWidth={fullWidth} variant={variant} sx={sx}>
      {children}
    </Button>
  );
};

export default ButtonCustom;
