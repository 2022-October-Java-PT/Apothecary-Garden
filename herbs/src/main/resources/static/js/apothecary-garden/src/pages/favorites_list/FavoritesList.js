import React, {useEffect, useState} from "react";

import axios from 'axios';
import { getUsername } from "../../components/common";
import style from './style.module.scss';

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
            <div className={style.favorites_title}>
                <h2>BOOKMARKED HERBS</h2>
            </div>
            <div className={style.favorites_list}>
                {loading ? <h3>Loading...</h3> : favorites.map((favorite) => (
                    <a key={favorite.id} href={`favorites/${favorite.name}`}>
                        <div className={style.favorites_list_item}>
                            <h2>{favorite.name}</h2>
                        </div>
                    </a>
                ))}
            </div>
        </div>  
    );
}

export default FavoritesList;