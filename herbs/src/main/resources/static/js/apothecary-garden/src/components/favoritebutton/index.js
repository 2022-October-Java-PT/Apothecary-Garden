import React, { useState } from 'react';

import PropTypes from 'prop-types';
import axios from 'axios';
import { getUsername } from '../common';
import style from './style.module.scss';

export default function FavoriteButton({ herbName, id }) {
    const [buttonText, setButtonText] = useState('Not Favorite');
    const loggedInUser = getUsername();

    function isUserLoggedIn() {
        console.log("GET USER NAME", loggedInUser);
        if (loggedInUser != null) {
            return true;
        } else {
            return false;
        }
    }     
    
    const setInitialButtonState = async () => {
        if (isUserLoggedIn() === true) {
            try {
                const favHerbData = await axios.get(`http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`);
                console.log(favHerbData.data);
                if (favHerbData !== null) {
                    setButtonText('Favorite');
                }
            } catch (error) {
                console.log(error);
            } 
        }
    }


    
    // async function fetchFavHerb() {
    //     const favHerb = await axios.get(`http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`);
    //     console.log(favHerb.data);
    //     return favHerb.data;
    // }

    
    
    const handleClick  = () => {
        console.log('clicked!');     
        if (isUserLoggedIn() === false) {
            alert('Please log in to add to bookmarks');
        } else {
            const fetchFavHerb = async () => {
                const favHerb = await axios.get(`http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`);
                console.log(favHerb.data);
            }
            const favHerbToAdd = fetchFavHerb();
            const favHerbData = {
                favorites: favHerbToAdd
            };
            
            if (buttonText === 'Not Favorite') {
                const addFavorite = async (favHerbData) => {
                    try {
                        const response = await axios.put(`http://localhost:8080/api/${loggedInUser}/favorites/${id}/edit-favorite-herb`, favHerbData)
                        console.log(response.data);
                    } catch (error) {
                        console.log(error);
                    }
                };
                setButtonText('Favorited');
                addFavorite(favHerbData);
                alert('This herb has been added to your bookmarks');
            } else {
                const deleteFavorite = async (favHerbData) => {
                    try {
                        const response = await axios.delete(`http://localhost:8080/api/${loggedInUser}/favorites/${id}/delete-favorite-herbs`, favHerbData);
                        console.log(response.data);
                    } catch (error) {
                        console.log(error);
                    }
                };
                deleteFavorite(favHerbData);
                setButtonText('Not Favorite');
                alert('This herb has been added to your bookmarks');
            }
        }
    }
    setInitialButtonState();
    
    //(Button will be heart icon or bookmark icon filled for favorite or empty for not favorite)
    return (
        <button className={style.fav_button} onClick={ handleClick }>
                    {buttonText}
        </button>
    );
}

FavoriteButton.propTypes = {
    herbName: PropTypes.string.isRequired,
    id: PropTypes.number.isRequired,
};


