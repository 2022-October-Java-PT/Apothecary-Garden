import React, { useState } from 'react';

import PropTypes from 'prop-types';
import axios from 'axios';
import { getUsername } from '../common';
import style from './style.module.scss';

export default function FavoriteButton({ herbName, id }) {
    const [buttonText, setButtonText] = useState('Not Favorite');
    const loggedInUser = getUsername();

    function isUserLoggedIn() {
        // const userName = getUsername();
        console.log("GET USER NAME", loggedInUser);
        if (loggedInUser != null) {
            return true;
        } else {
            return false;
        }
    }     
    
    async function setInitialButtonState() {
        if (isUserLoggedIn() === true) {
            const favHerbData = await fetchFavHerb();
            if (favHerbData !== null) {
                setButtonText('Favorite');
            }
        }
    }
    
    async function fetchFavHerb() {
        const favHerb = await axios.get(`http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`);
        console.log(favHerb.data);
        return favHerb.data;
    }
    
    function handleClick() {
        console.log('clicked!');     
        if (isUserLoggedIn() === false) {
            alert('Please log in to add to bookmarks');
        } else {
            const favHerb = fetchFavHerb();
            const favHerbData = {
                favorites: favHerb
            };
            
            if (buttonText === 'Not Favorite') {
                const addFavorite = async (favHerbData) => {
                    try {
                        const response = await axios.put(`http://localhost:8080/api/${loggedInUser}/favorites/${id}/edit-favorite-herb`, favHerbData).then((response) => {
                            console.log(response);
                            console.log(response.data);
                    }, catch (error) {
                        console.log(error);
                    }
                    }
                };
                setButtonText('Favorited');
                addFavorite(favHerbData);
                return (
                    <div>
                        <h3>This herb has been added to your bookmarks</h3>
                    </div>
                );
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
                return (
                    <div>
                        <h3>This herb has been removed from your bookmarks</h3>
                    </div>
                );
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


