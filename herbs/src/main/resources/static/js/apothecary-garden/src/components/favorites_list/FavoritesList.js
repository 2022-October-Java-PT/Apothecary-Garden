import React, {useEffect, useState} from "react";

import PropTypes from 'prop-types';
import axios from 'axios';
import { getUsername } from "../../components/common";
import style from './FavoritesList.module.scss';

const FavoritesList = () => {
    
    const [favorites, setFavorites] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(()=>{
        const fetchFavoritesData = async () => {
            const loggedInUser = getUsername();
            const result = await axios(`http://localhost:8080/api/${loggedInUser}/favorites`);
            setFavorites(result.data);
        }

        if(favorites) {
            setLoading(false);
        }

        const timer = setTimeout(() => {
            !favorites && fetchFavoritesData();
        }, 1000);

        return () => clearTimeout(timer);

    }, [favorites]);

    return (
        <div className={style.container}>
            <h2 className={style.favorites_title}>BOOKMARKED HERBS</h2>
            <div className={style.favorites_list}>
                {loading ? <h3>Loading...</h3> : favorites.map((favorite) => (
                    <a className={style.herb_name} key={favorite.id} href={`herbs/${favorite.name}`}>
                        {favorite.name}
                    </a>
                ))}
            </div>
        </div>  
    );
}

FavoritesList.propTypes = {
    herbName: PropTypes.string.isRequired,
    id: PropTypes.number.isRequired,
   };

export default FavoritesList;