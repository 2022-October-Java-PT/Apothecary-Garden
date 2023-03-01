import React, {useEffect, useState} from 'react';
import {getUsername, setUsernameSession} from '../../components/common'

import Axios from 'axios';
import style from './style.module.scss';

const Login = (props) => {
    
    const [userName, setUsername] = useState('');
    const [password, setPassword] = useState('');
    

    const handleSubmit = (event) => {
        event.preventDefault();

        const fetchData = async () => {
            const result = await Axios(`http://localhost:8080/api/user/${userName}`);
            console.log(result.data);
            setUsernameSession(result.data.userName);
            props.history.push('/favorites');
        }

        fetchData();
    }

    console.log("GET USER NAME", getUsername());

    return (
        <div className={style.loginPage}>
            
            <section className={style.login_section}>
                <h2 className={style.login_header}>Login To Your Account</h2>
                <form className={style.loginForm} onSubmit={handleSubmit}>
                    <input className={style.loginText} 
                        type='text' 
                        placeholder='UserName'
                        value={userName}
                        onChange={(event) => setUsername(event.target.value)}
                        onFocus={(e) => e.target.placeholder = ""}
                        onBlur={(e) => e.target.placeholder = "Username"}
                    />
                    <input className={style.loginText}
                        type='text'
                        placeholder='Password'
                        value={password}
                        onChange={(event) => setPassword(event.target.value)}
                        onFocus={(e) => e.target.placeholder = ""}
                        onBlur={(e) => e.target.placeholder = "Password"}
                    />
                    <button className={style.loginSubmit} onClick={() => (window.location.href='/favorites')} type="submit">Login</button>
                </form>
{/* 
                <div className={style.loginLine}>Or</div>
                <button className={style.loginFace} type="submit">Login With Facebook</button>
                <button className={style.loginGoogle} type="submit">Login With Google</button> */}
            </section>

            <section className={style.loginOne}>
                <h1 className={style.loginH1}>Welcome Back {getUsername()} We're Glad You're Here.</h1>
            </section>

            
        </div>
    )
}

export default Login;