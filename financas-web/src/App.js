import { useState } from "react";
import { AppBar, Toolbar, Typography, IconButton, MenuItem, Menu } from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
import ButtonCustom from "./components/button";

function App() {
  const [anchorEl, setAnchorEl] = useState(null);
  const open = Boolean(anchorEl);

  const handleMenu = (event) => {
    setAnchorEl(event.currentTarget);
  };

  const handleClose = () => {
    setAnchorEl(null);
  };

  return (
    <AppBar position="static" color="default">
      <Toolbar>
        <IconButton edge="start" color="inherit" aria-label="menu" onClick={handleMenu}>
          <MenuIcon />
        </IconButton>
        <Menu
          id="menu-appbar"
          anchorEl={anchorEl}
          anchorOrigin={{ vertical: "top", horizontal: "right" }}
          keepMounted
          transformOrigin={{ vertical: "top", horizontal: "right" }}
          open={open}
          onClose={handleClose}
        >
          <MenuItem onClick={handleClose}>Home</MenuItem>
          <MenuItem onClick={handleClose}>Features</MenuItem>
          <MenuItem onClick={handleClose}>Pricing</MenuItem>
          <MenuItem onClick={handleClose}>About</MenuItem>
          <MenuItem onClick={handleClose}>
            <em>Dropdown</em>
          </MenuItem>
        </Menu>
        <Typography variant="h6" sx={{ flexGrow: 1 }}></Typography>
        <ButtonCustom variant="contained">
          Login
        </ButtonCustom>
      </Toolbar>
    </AppBar>
  );
}

export default App;