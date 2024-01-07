import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Button, Container, Paper } from '@mui/material';
import axios from 'axios';

export default function RouteForm() {
    const paperStyle = {padding: '50px 20px', width : 600, margin:'20px auto'}
    const [source, setSource] = React.useState('')
    const [dest, setDest] = React.useState('')
    const [routes, setRoutes] = React.useState([])
    const handleClick = (e) => {
        e.preventDefault();
        const body = {source: source, dest: dest}
        axios.get("http://localhost:8080/api/v1/routeDetails", {params: {source: source, dest: dest}}).then(
        (response) => {
        setRoutes(response.data);
        //console.log(response.data[0]);
        })
    }
  return (
    <Container>
      <Paper elevation={3} style={paperStyle}>
        <h1 style={{color: 'blue', width: '100%', textAlign: 'center' }}><u>Search Buses</u></h1>
        <form style={{display: 'flex', flexDirection: 'column', alignItems: 'center'}}>
            <TextField id="outlined-basic" label="Source" variant="outlined" fullWidth style={{margin: '10px 0px'}} value={source} onChange={(e)=>{setSource(e.target.value)}}/>
            <TextField id="outlined-basic" label="Destination" variant="outlined" fullWidth style={{margin: '10px 0px'}} value={dest} onChange={(e)=>{setDest(e.target.value)}}/>
            <Button variant="contained" style={{margin:'40px 0px 0px 0px'}} onClick={handleClick}>SEARCH</Button>
        </form>
      </Paper>
      
    </Container>
  );
}
