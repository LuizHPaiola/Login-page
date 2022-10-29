import React from 'react'
import { Link } from 'react-router-dom'

export default function Menu() {
    const logout = () => {
      sessionStorage.removeItem("valid-user");
      window.location = "/";
    };
  
    const user = sessionStorage.getItem("valid-user");
  
    return (
      <header>
        <Link to="/home">Home</Link> |  <Link to="/">Login</Link> | <span>[{user}]</span>
        <button
          style={{ display: user != null ? "inline" : "none" }}
          onClick={logout}
        >
          Logout
        </button>
      </header>
    );
  }