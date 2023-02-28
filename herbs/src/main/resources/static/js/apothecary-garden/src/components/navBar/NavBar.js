import React, { useState } from "react";
import { getUsername, removeUsernameSession } from '../common';

import { NavLink } from 'react-router-dom';
import style from './style.module.scss';

const logout = () => {
    removeUsernameSession();
    window.location.href='/login';
}

let user = getUsername();function Navbar() {
  const [isOpen, setIsOpen] = useState(false);

  const toggleNav = () => setIsOpen(!isOpen);

  return (
    <nav className={style.navbar}>
      <div className={style.navbarLogo}>
        <a href="/">Apothecary's Garden</a>
      </div>
      <ul className={`${style.navbarNav} ${isOpen ? style.active : ""}`}>
        <li className={style.navItem}>
          <a href="/">Home</a>
        </li>
        <li className={style.navItem}>
            <a href="/illness_search">Search Ailment</a>
        </li>
        <li className={style.navItem}>
            <a href="/searchHerbs">Search Herbs</a>
        </li>
        <li className={style.navItem}>
            <a href="/storeHerbs">Store Herbs</a>
        </li>
        <li className={style.navItem}>
          <a href="/contact">Contact</a>
        </li>
        {!user ? 
            <div>
            <li className={style.navItem}>
            <NavLink to='/signup'>Sign Up</NavLink>
            </li>
            <li className={style.navItem}>
            <NavLink to='/login'>Login</NavLink>
            </li>
            </div>
            :
            <div>
            <p className={style.display_username}>Hello {user}</p>
            <button className={style.logout} onClick={() => logout()}><p>Sign Out</p></button>
            </div>
            }
      </ul>
      <div className={style.navbarToggle} onClick={toggleNav}>
        <span></span>
        <span></span>
        <span></span>
      </div>
    </nav>
  );
}

export default Navbar;



