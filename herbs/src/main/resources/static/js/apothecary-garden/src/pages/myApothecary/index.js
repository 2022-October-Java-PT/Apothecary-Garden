import FavoritesList from '../../components/favorites_list/FavoritesList';
import React from 'react';
import { getUsername } from "../../components/common";
import style from './style.module.scss';

const MyApothecaryPage = () => {

    const loggedInUser = getUsername();

    function isUserLoggedIn() {
        console.log("GET USER NAME", loggedInUser);
        if (loggedInUser != null) {
            return true;
        } else {
            return false;
        }
    }
   
    if (isUserLoggedIn() === true) {
        //RETRIEVE THE USER'S FAVORITES FROM THE DATABASE
        return (
            <div className={style.fav_container}>
                <FavoritesList />
            </div>
        )
    } else {
        return (
            <div className={style.login_container}>
                <h2 className={style.title}>BOOKMARKED HERBS</h2>
                <h3 className={style.message}> You must be logged in to view your bookmarked herbs.</h3>
            </div>
        )
    };
}
export default MyApothecaryPage;