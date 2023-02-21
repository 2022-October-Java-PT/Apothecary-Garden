import React, { useEffect, useState } from 'react';

import Axios from 'axios';
import Herb from '../../components/herb';
import style from './style.module.scss';
import { useParams } from 'react-router-dom';

// import { IoIosHeart, IoIosHeartEmpty } from 'react-icons'

export default function HerbPage() {

        const { name } = useParams();
        const [herb, setHerb] = useState(null);
        const [loading, setLoading] = useState(true);

        useEffect(() => {
            const fetchHerbData = async () => {
                const result = await Axios(`http://localhost:8080/api/herbs/HerbName/${name}`);
                setHerb(result.data);
            }
        
            if (herb) {
                setLoading(false);
            }

            const timer = setTimeout(() => {
                !herb && fetchHerbData();
            }, 1000);

            return () => clearTimeout(timer);
            // eslint-disable-next-line
        }, [herb])
    
        return (
            <div className={style.content}>
            
                {loading ? <h3>Loading...</h3> :
                    <>
                    <div key={herb.id}>
                        <Herb 
                            name={herb.name}
                            science={herb.science}
                            description={herb.description}
                            fact={herb.fact}
                            sideEffects={herb.sideEffects}
                            picture={herb.picture}
                            id={herb.id}
                        />
                        </div>
                        
                    <div className={style.favorites_button}>
                        <button onClick={() => this.props.add(herb.id)}>Add to Fav</button>
                        </div>
                    </>
                    
// CREATE BUTTON COMPONENT FOR FUNCTIONALITY                    
                        /* <div>
                        {favorites.includes(i) ? (
                            <IoIosHeart
                                onClick={() => addFav({ herbs, i })}
                                style={{ color: 'red' }}
                            />
                        ) : (
                                <IoIosHeartEmpty
                                onClick={() => addFav ({ herbs, i})}
                        style={{ color: 'red' }}
                        />
                        )}
                        </div> */
                }
            </div>
        );
    }