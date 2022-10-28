import React from 'react'
import { Route, Routes } from "react-router-dom"
import Login from '../Components/Login'
import Home from "../Components/Home"

export default function MainRoutes(){
    return(
        <Routes>
            <Route path="/" element={<Login/>}/>
            <Route path="/home" element={<Home/>}/>
        </Routes>
    )
}