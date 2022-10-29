import React from 'react'
import { useState } from 'react'

export default function Login(){

    const [user, setUser] = useState({
        login: "",
        password: "",
    });

    const handleChange = (e) =>{
        setUser({...user, [e.target.name]: e.target.value})
    }

    const login = async (e) =>{
        e.preventDefault();

        const requestOptions={
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(user),
        };

        const response = await fetch(
            "http://localhost:8080/LoginPage/rest/login",
            requestOptions
        );

        const data= await response.json();

        if(data.login){
            sessionStorage.setItem("valid-user", data.login);
            window.location = "/home";
        }else{
            window.location = "/";
        }
    };

    return(
        <div>
            <h2>USER LOGIN</h2>
            <div>
                <form onSubmit={login}>
                    <fieldset>
                        <legend>LOGIN</legend>
                        <div>
                            <label htmlFor="idLogin">User</label>
                            <input 
                                type="text"
                                name="login"
                                id="idLogin"
                                placeholder="Login"
                                value={user.login} 
                                onChange={handleChange}
                                />
                        </div>
                        <div>
                            <label htmlFor="idPassword">Password</label>
                                <input 
                                    type = "password"
                                    name = "password"
                                    id = "idPassword"
                                    placeholder="Password"
                                    onChange={handleChange}
                                    />
                            
                        </div>
                        <button>Login</button>
                    </fieldset>
                </form>
            </div>
        </div>
    )
}