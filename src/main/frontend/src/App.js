import React, {useEffect, useState} from 'react';
import axios from 'axios';

function BackDataTest(props){
    return <p>백엔드에서 가져온 데이터입니다 : {props.text} </p>
}

function Header(props){
    return <header>{props.content}</header>
}
function Body(props){
    return <body>{props.content}</body>
}
function Footer(props){
    return <footer>{props.content}</footer>
}

function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/hello')
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);

  return (
      <div>
        <Header content='header'></Header>
        <Body content={<BackDataTest text={hello}></BackDataTest>}></Body>
        <Footer content='footer'></Footer>
      </div>
  );
}

export default App;