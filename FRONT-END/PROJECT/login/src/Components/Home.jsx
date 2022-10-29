import React from 'react'
import { useEffect } from 'react'

const user= sessionStorage.getItem("valid-user")

export default function Home(){
    
    useEffect(()=>{
        if(user==null){
            window.location="/";
        }
    }, []);
   
    return(
        <div>
            <h2>
                Hello user <span> {user} </span> 
            </h2>
        </div>
    )
}