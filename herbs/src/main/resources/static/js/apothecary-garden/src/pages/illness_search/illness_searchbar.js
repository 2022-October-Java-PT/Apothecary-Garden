import { useState } from 'react';
import axios from 'axios';
import style from './style.module.scss'

function IllnessList() {
  const [illnesses, setIllnesses] = useState([]);
  const [herbs, setHerbs] = useState([]);
  const [noData, setNoData] = useState(false);
  
  const handleLetterClick = async (letter) => {
    try {
      const response = await axios.get(`http://localhost:8080/api/illness/findByLetter/${letter}`);
      if (response.data.length === 0) {
        setNoData(true);
        
      } else {
        setNoData(false);
        
      }
      setIllnesses(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  const herbList = async (illnessName) => {
    try {
        const response = await axios.get(`http://localhost:8080/api/herbs/illness/${illnessName}`);
        setHerbs(response.data);
    }catch (error) {
        console.error(error);
    }
  };

  return (
    <div className={style.ailmentSearchPage}>
      <div className={style.letterFilter}>
        <h3 className={style.letterSearch_Header}>Select the starting letter of your ailment</h3>
        <section className={style.letterSearch}>
        {Array.from(Array(26)).map((_, i) => (
          <button className={style.letterChoice} key={i} onClick={() => handleLetterClick(String.fromCharCode(65 + i))}>
            {String.fromCharCode(65 + i)}
          </button>
        ))}
        </section>
      </div>
      <div className={style.displayIllness}>
        {noData && <p className={style.noneFound}>No data available for this letter</p>}
        {illnesses.map((illness) => (
          <button className={style.illnessChoice} onClick={() => herbList(illness.name)} key={illness.id}>{illness.name}</button>
        ))}
      </div>
      <div className={style.herbsList}>
        {herbs.map((herb) => (
            <a className={style.herbChoice} key={herb.id} href={`herbs/${herb.name}`}>
                <div className={style.herb_section}>
                    <h2>{herb.name}</h2>
                </div>
            </a>
        ))}
      </div>
    </div>
  );
}

export default IllnessList;
