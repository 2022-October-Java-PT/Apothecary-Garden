import axios from 'axios';
import style from './style.module.scss'
import { useState } from 'react';

function HerbsList() {
  const [herbs, setHerbs] = useState([]);
  const [noData, setNoData] = useState(false);

  const handleLetterClick = async (letter) => {
    try {
      const response = await axios.get(`http://localhost:8080/api/herbs/findByLetter/${letter}`);
      if (response.data.length === 0) {
        setNoData(true);
        
      } else {
        setNoData(false);
        
      }
      setHerbs(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <>
      <div>
        {Array.from(Array(26)).map((_, i) => (
          <button key={i} onClick={() => handleLetterClick(String.fromCharCode(65 + i))}>
            {String.fromCharCode(65 + i)}
          </button>
        ))}
      </div>
      <div>
        {noData && <p>No data available for this letter</p>}
        {herbs.map((herb) => (
           <a key={herb.id} href={`herbs/${herb.name}`}>
                <div className={style.herb_section}>
                    <h2>{herb.name}</h2>
                </div>
                </a>
        ))}
      </div>
      
    </>
  );
}

export default HerbsList;
