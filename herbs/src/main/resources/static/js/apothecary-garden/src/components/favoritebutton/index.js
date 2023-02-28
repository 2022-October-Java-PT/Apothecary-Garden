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
                console.log(favHerbData);
                if (favHerbData.data === "") {
                    setButtonText('Not Favorite');
                } else {
                    setButtonText('Favorited');
                }
            } catch (error) {
                console.log(error);
            } 
        }
    }


    const fetchFavHerb = async () => {
        try {
            const favHerb = await axios.get(`http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`);
            return favHerb.data;
        } catch (error) {
            console.log(error);
            return null;
        }
    };

    const handleClick = async () => {
        console.log('clicked!');
        if (!isUserLoggedIn()) {
            alert('Please log in to add to bookmarks');
            return;
        }
        const favHerbData = {
            favorites: await fetchFavHerb()
        };
        if (buttonText === 'Not Favorite') {
            try {
            await axios.put(`http://localhost:8080/api/${loggedInUser}/favorites/${id}/edit-favorite-herb`, favHerbData);
            setButtonText('Favorited');
            alert('This herb has been added to your bookmarks');
            } catch (error) {
            console.log(error);
            }
        } else {
            try {
            await axios.delete(`http://localhost:8080/api/${loggedInUser}/favorites/${id}/delete-favorite-herbs`, { data: favHerbData });
            setButtonText('Not Favorite');
            alert('This herb has been removed from your bookmarks');
            } catch (error) {
            console.log(error);
            }
        }
    };


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


