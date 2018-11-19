import React from 'react';
import { withRouter } from 'react-router';
import Header from './Header.jsx';


class Root extends React.Component {
  render() {
    return (
      <Header/>
    );
  }
}

export default withRouter(Root);