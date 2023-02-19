import { useState } from 'react';
import axios from 'axios';
import style from './style.module.scss'

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
          <h2 className={style.displayedHerb} key={herb.id}>{herb.name}</h2>
        ))}
      </div>
    </>
  );
}

export default HerbsList;
