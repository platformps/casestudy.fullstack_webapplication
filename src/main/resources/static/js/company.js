// API Values
let company = "amzn"

// Make our API call using fetch
function getCompanyData() {
  const container = document.getElementById("container");
  const template = document.getElementById("template");

  const clone = template.content.cloneNode(true);
  container.appendChild(clone);

  //API call for logo
  fetch("https://cloud.iexapis.com/stable/stock/" + company + "/logo?token=pk_fcd35c5ba2944133af0f4967d619ece3")
    .then(response => response.json())
    .then(data => {
      //   Object Keys and Values
      let keyData = Object.keys(data)
      let keyValues = Object.values(data)
      for (let i = 0; i < keyData.length; i++) {
        // Create and Append our elements to the company data id set in html file
        document.getElementById("company-logo").src = keyValues[i];
      }
    })

  //API call for company info
  fetch("https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + company + "&apikey=7IEE375T5KRNN35W")
    .then(response => response.json())
    .then(data => {
      document.getElementById("ticker").innerHTML = data.Symbol;
      document.getElementById("companyName").innerHTML = data.Name;
      document.getElementById("assetType").innerHTML = data.AssetType;
      document.getElementById("exchange").innerHTML = data.Exchange;
      document.getElementById("currency").innerHTML = data.Currency;
      document.getElementById("sector").innerHTML = data.Sector;
      document.getElementById("industry").innerHTML = data.Industry;
      document.getElementById("52weekHigh").innerHTML = data['52WeekHigh'];
      document.getElementById("52weekLow").innerHTML = data['52WeekLow'];
      document.getElementById("companyDescription").innerHTML = data.Description;
      document.getElementById("address").innerHTML = data.Address;
      document.getElementById("employees").innerHTML = data.FullTimeEmployees;
      document.getElementById("fyEnd").innerHTML = data.FiscalYearEnd;
      document.getElementById("quarter").innerHTML = data.LatestQuarter;
      document.getElementById("marketCap").innerHTML = data.MarketCapitalization;
      document.getElementById("revenue").innerHTML = data.RevenuePerShareTTM;
      document.getElementById("grossProfit").innerHTML = data.GrossProfitTTM;
      document.getElementById("profitMargin").innerHTML = data.ProfitMargin;
      document.getElementById("peRatio").innerHTML = data.PERatio;
      document.getElementById("pegRatio").innerHTML = data.PEGRatio;
      document.getElementById("trailingPE").innerHTML = data.TrailingPE;
      document.getElementById("forwardPE").innerHTML = data.ForwardPE;
      document.getElementById("analystTarget").innerHTML = data.AnalystTargetPrice;
      document.getElementById("divPerShare").innerHTML = data.DividendPerShare;
      document.getElementById("divYield").innerHTML = data.DividendYield;
      document.getElementById("divDate").innerHTML = data.DividendDate;
      document.getElementById("exDivDate").innerHTML = data.ExDividendDate;
      document.getElementById("forwardDivRate").innerHTML = data.ForwardAnnualDividendRate;
      document.getElementById("forwardDivYield").innerHTML = data.ForwardAnnualDividendYield;
      document.getElementById("payoutRatio").innerHTML = data.PayoutRatio;

    })

  let labelArray = [];
  let dataArray = [];
  //API call for chart information
  fetch("https://cloud.iexapis.com/stable/stock/" + company + "/chart/5d?chartCloseOnly=true&token=pk_fcd35c5ba2944133af0f4967d619ece3")
    .then(response => response.json())
    .then(data => {
      console.log(data)
      for (i = 0; i < data.length; i++) {
        dataArray[i] = data[i].close;
      }
      for (i = 0; i < data.length; i++) {
        labelArray[i] = data[i].date;
      }
    }).then(
      setTimeout(() => { //needed to create the template before trying to draw the chart
        createChart(labelArray, dataArray);
      }, 300)
    )

  //API call for company specific news
  getNews(company);
}

async function changeCompanyData() {
  deleteData().then(
    getCompanyData()
  )
}

async function deleteData() {
  document.getElementById("container").innerHTML = "";
  document.getElementById("newsContainer").innerHTML = "";
  let text = document.getElementById("companyInput").value
  company = text
  return company
}

function createChart(labels, dataPoints) {
  console.log(labels)
  console.log(dataPoints)
  var ctx = document.getElementById('myChart');
  var myChart = new Chart(ctx, {
    type: 'line',
    data: {
      labels: labels,
      datasets: [{
        label: 'Historical Stock Price',
        data: dataPoints,
        fill: false,
        lineTension: 0,
        backgroundColor: 'rgba(0, 0, 0, 1)',
        borderColor: 'rgba(0, 0, 0, 1)'

      }]
    },
    options: {
      scales: {
        yAxes: [{
          ticks: {
            beginAtZero: false
          }
        }]
      }
    }
  });
}