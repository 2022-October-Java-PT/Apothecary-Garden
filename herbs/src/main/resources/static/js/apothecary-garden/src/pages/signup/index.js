import React, {useState} from 'react';

import Axios from 'axios';
import {setUsernameSession} from '../../components/common';
import style from './style.module.scss';

const Signup = (props) => {
    
    const handleLogin = () => {
        
        const userData = {
            userName: username,
            userPassword: password
        };

        Axios.post('http://localhost:8080/api/user/new-user', userData).then((response) => {
            setUsernameSession(username);
            props.history.push('/portal');
        });

        Axios.post(`http://localhost:8080/api/${username}/add-user-favorites`, userData).then((response) => {
            
        });

        window.location.href='/portal';
    }

    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(username, password);
    }

    return (
        <div className={style.signupPage}>
            <section className={style.signupOne}>
                <h1 className={style.H1}>Placement</h1>
            </section>

            <section className={style.signupTwo}>
                <h2 className={style.signupH2}>Sign Up</h2>
                <form className={style.signupForm} onSubmit={handleSubmit}>
                    <input className={style.signupText} 
                        type='text'
                        placeholder='Username'
                        value={username}
                        onChange={(event) => setUsername(event.target.value)}
                        onFocus={(e) => e.target.placeholder = ""}
                        onBlur={(e) => e.target.placeholder = "Username"}
                    />
                    <input className={style.signupText} 
                        type='text'
                        placeholder='Password'
                        value={password}
                        onChange={(event) => setPassword(event.target.value)}
                        onFocus={(e) => e.target.placeholder = ""}
                        onBlur={(e) => e.target.placeholder = "Password"}
                    />
                    <button className={style.signupSubmit} type="submit" onClick={handleLogin}>Sign Up</button>
                </form>

                <div className={style.signupLine}>Or</div>
                <button className={style.signupFace} type="submit">Sign Up With Facebook</button>
                <button className={style.signupGoogle} type="submit">Sign Up With Google</button>
            </section>
        </div>
    )
} 

export default Signup;