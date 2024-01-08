import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Button, Container, Paper, Table, TableHead, TableContainer, TableBody, TableRow, TableCell } from '@mui/material';
import axios from 'axios';

export default function RouteForm() {
    const paperStyle = {padding: '50px 20px', width : 600, margin:'20px auto'}
    const [source, setSource] = React.useState('')
    const [dest, setDest] = React.useState('')
    const [routes, setRoutes] = React.useState([])
    const handleClick = (e) => {
        e.preventDefault();
        const body = {source: source, dest: dest}
        axios.get("http://localhost:8080/api/v1/routeDetails/getSrcAndDest", {params: {source: source, dest: dest}}).then(
        (response) => {
        setRoutes(response.data);
        console.log(response.data);
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
      <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell>Bus Number</TableCell>
            <TableCell align="right">Bus Name</TableCell>
            <TableCell align="right">Distance</TableCell>
            <TableCell align="right">ETA</TableCell>
            <TableCell align="right">Available Number of Seats</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {routes.map((row) => (
            <TableRow
              key={row.id}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell component="th" scope="row">
                {row.bus.busNumber}
              </TableCell>
              <TableCell align="right">{row.bus.busName}</TableCell>
              <TableCell align="right">{row.distance}</TableCell>
              <TableCell align="right">{row._ETA}</TableCell>
              <TableCell align="right">{row.availableSeats.length}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
    </Container>
  );
}
