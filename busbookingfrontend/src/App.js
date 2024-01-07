import axios from "axios";
import { useEffect, useState } from "react";
import RouteForm from "./components/RouteForm";

function App() {
  const [routes, setRoutes] = useState([]);
  /*
  useEffect(()=>{
    const bus = {
      busNumber : 3204,
      busName : "Chenna Travels",
      totalNumOfSeats : 32,
    }
    const date = new Date('1/31/2024 5:30:00 UTC')
    var array = []
    for(let i = 0; i < 32; i++)
    {
      const seat = {
        seatNumber : i,
        isReserved : false,
        userEmailId : ""
      }
      array.push(seat);
    }
    const routeDetails = {
      bus : bus,
      source : "Bangalore",
      destination : "Mumbai",
      distance : 500,
      _ETA : date.toISOString(),
      availableSeats : array,
    }
    console.log(routeDetails)
    
    axios.get("http://localhost:8080/api/v1/routeDetails").then(
    (response) => {
      setRoutes(response.data);
      console.log(response.data[0]);
    })
    axios.post("http://localhost:8080/api/v1/routeDetails", routeDetails).then(
      (response) => {
        console.log(response + " POsted")
      }
    )
  },[])
  */
  return (
    <div className="App">
      <RouteForm/>
    </div>
  );
}

export default App;
