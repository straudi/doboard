import React, {useEffect, useState} from 'react';
import axios from 'axios';
function BackDataTest(props){
    return <p>백엔드에서 가져온 데이터입니다 : {props.text} </p>
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
        <BackDataTest text={hello}></BackDataTest>
      </div>
  );
}

export default App;