import { NavLink } from 'react-router-dom';
import React from 'react';
import style from './style.module.scss';
import { getUsername, removeUsernameSession } from '../common';

const logout = () => {
    removeUsernameSession();
    window.location.href='/login';
}

let user = getUsername();

const Header = () => (
    <div className={style.header}>
        <h1>Apothecary's Garden</h1>
        <ul className={style.navList}>
            <NavLink to='/'>Home</NavLink>
            <NavLink to='/contact'>Contact</NavLink>
            <NavLink to='/illness_search'>Ailment</NavLink>
            <NavLink to='/storeHerbs'>Store Herbs</NavLink>
            <NavLink to='/searchHerbs'>Search Herbs</NavLink>
            
        </ul>
        <ul className={style.login}>
            {!user ? 
            <div>
            <NavLink to='/signup'>Sign Up</NavLink>
            <NavLink to='/login'>Login</NavLink>
            </div>
            :
            <div>
            <p className={style.display_username}>Hello {user}</p>
            <button className={style.logout} onClick={() => logout()}><p>Sign Out</p></button>
            </div>
            }
        </ul>
    </div>
);

export default Header;