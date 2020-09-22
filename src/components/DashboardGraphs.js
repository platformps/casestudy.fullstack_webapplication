import React, {Component } from 'react';
import {
  LineChart, Area,AreaChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend, PieChart, Pie, Sector,ResponsiveContainer
} from 'recharts';
import '../Dashboard.css';
import '../App.css';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import { withRouter } from 'react-router-dom';
import authHeader from './auth-header';
import AuthService from "./auth.service";


const data01 = [
  { name: 'Group A', value: 400 }, { name: 'Group B', value: 300 },
  { name: 'Group C', value: 300 }, { name: 'Group D', value: 200 },
  { name: 'Group E', value: 278 }, { name: 'Group F', value: 189 },
];

const data02 = [
  { name: 'Group A', value: 2400 }, { name: 'Group B', value: 4567 },
  { name: 'Group C', value: 1398 }, { name: 'Group D', value: 9800 },
  { name: 'Group E', value: 3908 }, { name: 'Group F', value: 4800 },
];

 class Example extends Component {
  

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  constructor(props) {
    super();
    const {cookies} = props;
    this.state = {payroll: [],employees: [],sales: [],inventory: [],departments: [],csrfToken: cookies.get('XSRF-TOKEN')};
  }
  

   componentDidMount() {
    fetch('../api/payroll',{headers:  authHeader()})
      .then(response => response.json())
      .then(data => this.setState({payroll: data}));
      fetch('../api/employee',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({employees: data}))
      fetch('../api/sale',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({sales: data}))
      fetch('../api/item',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({inventory: data}))
      fetch('../api/department',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({departments: data, isLoading: false}))
     
  }

  calcTotalSalesDepartment(departmentName,sales){
    let total = 0.0;
    sales.forEach(sale =>{
      if(sale.department == departmentName)
        total+= sale.amount;
    })
    return total;
  }

   calcTotalSales(saleList){
    let total = 0.0;
      saleList.forEach(sale => {
        total+= sale.amount;
      });
      return total;
  }

  calcTotalPayRoll(payroll){
    let total = 0.0;
      payroll.forEach(payroll => {
        total+= payroll.amount;
      });
      return total;
  }

  calcTotalAssets(inventory){
    let total = 0.0;
    inventory.forEach(item =>{
      total+= item.quantity*item.price;
    })
    return total;
  }

  

  render() {
    const {payroll,employees,sales,inventory,departments} = this.state;
    return (
      <div className = "graphs"  >
       <div >
        <div className = "parent">
        <div className ="column chart" >
        <h5>Payroll</h5>
        <hr id="hr2" />
      <AreaChart
        width={1000}
        height={300}
        data={payroll}
        margin={{
          top: 5, right: 30, left: 0, bottom: 5,
        }}
      >
        <CartesianGrid strokeDasharray="3 3" />
        <XAxis dataKey= "payDate"/>
        <YAxis dataKey = "amount" />
        <Tooltip/>
        <Legend />
        <Area type="monotone" dataKey="amount" stroke="#8884d8" fill = "#8884d8" activeDot={{ r: 8 }} />
      </AreaChart>
      </div>
      </div>
      <br></br>
      <br></br>
      <div className = "parent">
      <div className = "dataContainer column">
      <h6 >Total Profits</h6>
        <hr id="hr2" />
      <h4 >${this.calcTotalSales(sales) - this.calcTotalPayRoll(payroll)}</h4>
        </div>
        <div className = "dataContainer column">
      <h6 >Total employees</h6>
        <hr id="hr2" />
      <h4  >{employees.length}</h4>
        </div>
        <div className = "dataContainer column">
      <h6 >Assets</h6>
        <hr id="hr2" />
      <h4  >${this.calcTotalAssets(inventory).toFixed(2)}</h4>
        </div>
        <div className = "dataContainer column">
        <h7>Departments</h7>
        <hr id="hr2" />
      <h4  >{this.calcTotalSales(sales)}</h4>
        </div>
      </div>
      <br></br>
      <br></br>
      <div className = "parent">
     <div className ="column chart">
     <h6>Department Sales</h6>
     <hr id="hr2" />
      <PieChart width={333} height={250}>
        <Pie dataKey= "budget" isAnimationActive={false} data={departments} cx={150} cy={125} outerRadius={80} fill="#5e72e4" label />
        <Tooltip />
      </PieChart>
      </div>
      <div className ="column chart">
      <h6>Employee Salalries(ID)</h6>
     <hr id="hr2" />
      <PieChart   width={333} height={250}>
        <Pie dataKey="salary" isAnimationActive={false} data={employees} cx={150} cy={125} outerRadius={80} fill="#e14eca" label />
        <Tooltip />
      </PieChart>
      </div>
      <div className = "column chart">
      <h6>Inventory</h6>
      <hr id="hr2" />
      <PieChart width={333} height={250}>
      <Pie dataKey="price" data={inventory} cx={150} cy={125} innerRadius={40} outerRadius={80} fill="#2dce89" />
      <Tooltip /> 
      </PieChart>
      
      </div>
    </div>
    
</div>
</div>
    );
  }
}
export default withCookies(Example)