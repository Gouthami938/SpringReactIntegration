
import React, { useState ,useEffect} from 'react';
import './App.css';

function App() {
  const [items, setItems] = useState([]);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch("http://localhost:8080/book_api/book_list")
      .then(res => res.json())
      .then(
        (result) => {
          console.log('called get items')
          console.log(result)
          setItems(result);
        },
        // Note: it's important to handle errors here
        // instead of a catch() block so that we don't swallow
        // exceptions from actual bugs in components.
        (error) => {
          setError(error);
        }
      )
  }, [])
  return (
    <div className="App">
      <h1>Here's Book Info</h1>
       <ul>
        {items && items.map(item => (
          <div key={item.bookid}>
           <h3> {item.bookid},  {item.bookname},{item.authname},{item.price}</h3>  
       
          </div>
        ))}
      </ul>
    </div>
  );
}

export default App;