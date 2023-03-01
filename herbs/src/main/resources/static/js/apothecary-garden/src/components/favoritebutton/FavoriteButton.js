import { BsBookmarkPlus, BsFillBookmarkDashFill } from 'react-icons/bs';
import React, { useState } from 'react';

import PropTypes from 'prop-types';
import axios from 'axios';
import { getUsername } from '../common';
import style from './FavoriteButton.module.scss';

export default function FavoriteButton({ herbName, id }) {
    // const [buttonText, setButtonText] = useState('Not Favorite');
    const loggedInUser = getUsername();
    const [isFavorited, setIsFavorited] = useState(false);

    function isUserLoggedIn() {
        console.log("GET USER NAME", loggedInUser);
        if (loggedInUser != null) {
            return true;
        } else {
            return false;
        }
    }     
    
    // const setInitialButtonState = async () => {
    //     if (isUserLoggedIn() === true) {
    //         try {
    //             const favHerbData = await axios.get(`http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`);
    //             console.log(favHerbData);
    //             if (favHerbData.data === "") {
    //                 setButtonText('Not Favorite');
    //             } else {
    //                 setButtonText('Favorited');
    //             }
    //         } catch (error) {
    //             console.log(error);
    //         }
    //     }
    // }
    
const setInitialButtonState = async () => {
   if (isUserLoggedIn() === true) {
     try {
       const favHerbData = await axios.get(
         `http://localhost:8080/api/${loggedInUser}/favorites/${herbName}`
       );
       console.log(favHerbData);
       if (favHerbData.data === '') {
         setIsFavorited(false);
       } else {
         setIsFavorited(true);
       }
     } catch (error) {
       console.log(error);
     }
   }
 };


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
        if (!isFavorited) {
     try {
       await axios.put(
         `http://localhost:8080/api/${loggedInUser}/favorites/${id}/edit-favorite-herb`,
         favHerbData
       );
       setIsFavorited(true);
       alert('This herb has been added to your bookmarks');
     } catch (error) {
       console.log(error);
     }
   } else {
     try {
       await axios.delete(
         `http://localhost:8080/api/${loggedInUser}/favorites/${id}/delete-favorite-herbs`,
         { data: favHerbData }
       );
       setIsFavorited(false);
       alert('This herb has been removed from your bookmarks');
     } catch (error) {
       console.log(error);
     }
   }
 };

//     setInitialButtonState();
    
//     //(Button will be heart icon or bookmark icon filled for favorite or empty for not favorite)
//     return (
//         <button className={style.fav_button} onClick={ handleClick }>
//                     {buttonText}
//         </button>
//     );
// }

// FavoriteButton.propTypes = {
//     herbName: PropTypes.string.isRequired,
//     id: PropTypes.number.isRequired,
// };
    
     setInitialButtonState();


 const buttonTitle = isFavorited ? 'Remove from Bookmarks' : 'Add to Bookmarks';
 const buttonIcon = isFavorited ? <BsFillBookmarkDashFill className={style.BsFillBookmarkDashFill} /> : <BsBookmarkPlus className={style.BsBookmarkPlus} />;
 // const buttonClass = isFavorited ? style.fav_button_favorited : style.fav_button;


 return (
 <button className={style.fav_button} onClick={handleClick} title={buttonTitle}>
     {buttonIcon}
   </button>
 );
}


FavoriteButton.propTypes = {
 herbName: PropTypes.string.isRequired,
 id: PropTypes.number.isRequired,
};



