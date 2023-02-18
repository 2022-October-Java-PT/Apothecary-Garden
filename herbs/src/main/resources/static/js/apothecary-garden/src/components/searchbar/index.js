import React, {Component} from 'react';

import PropTypes from 'prop-types';
import style from './style.module.scss'

class SearchBox extends Component {
    constructor() {
        super();
        this.userInput = React.createRef();        
    }

    handleKeyUp = (event) => {
        event.preventDefault();
        this.userInput.current.value === ''
            ? this.props.suggestedHerbs()
            : this.props.suggestedHerbs(this.userInput.current.value);
    };

    render() {
        return (
            <div>
            <input
                className={style.searchBar}
                placeholder="Enter your Ailment"
                ref={this.userInput}
                onKeyUp={this.handleKeyUp}
                autoFocus
                required
            />
            </div>
        );
    }
}

SearchBox.propTypes = {
    suggestedImages: PropTypes.func
};

export default SearchBox;