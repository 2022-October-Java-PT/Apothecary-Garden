import React from 'react';
import style from './style.module.scss';
import Axios from 'axios';
import SearchBox from '../../components/searchbar';
import Herb from './herb';

export default class IllnessSearch extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            illnessData: []
        };

        this.newSearch = this.newSearch.bind(this);
    }

    componentDidMount() {
        this.newSearch();
    }

    newSearch(search = 'burns') {
        let array = [];
        const url = `http://localhost:8080/api/herbs/illness/${search}`;
        Axios.get(url).then((response) => {
            let arrayOfHashes = response.data;
            arrayOfHashes.forEach((element) => {
                array.push({
                    name: element.data.name,
                    link: element.data.science,
                    description: element.data.description,
                    fact: element.data.fact,
                    picture: element.data.picture,
                    // sideEffects: element.data.sideEffects,
                });
            });
            this.setState({
                illnessData: array
            });
        });
    }
    
      render() {
        let illnessData = this.state.illnessData;
        illnessData = illnessData.map((hash,index) => {
            // let name = this.state.name;
            // let description = this.state.description;
            // let fact = this.state.fact;
            // // let sideEffects = this.state.sideEffects;
            // let science = this.state.science;
            // let picture = this.state.picture;
            return (
                <div>
                    <Herb 
                        name={hash.name}
                        science={hash.science}
                        description={hash.description}
                        id={index}
                        key={index}
                    />
                </div>
            );
        });
        
    
        return (
            <div id="top" className={style.Herbs}>
            <div className={style.topContainer}>
                <h1>Helpful Herbs</h1>
                <SearchBox suggestedImages={this.suggestedImages}/>
            </div>
            <section className={style.responses}>{illnessData}</section>
            <a className={style.anchor} href="#top" >Go back to Top</a>
        </div>
        );
      }

      suggestedImages = (input) => {
		this.newSearch(input);
	};
}
