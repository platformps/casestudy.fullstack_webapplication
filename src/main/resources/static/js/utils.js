function validateEmail() {
    var email = document.getElementById('email');
    let regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if(!regex.test(email.value)) {
        alert('Email entered is NOT valid!');
    }
    return;
}

function showPassword() {
    var pass = document.getElementById("inputPassword");
    if (pass.type === "password") {
      pass.type = "text";
    } else {
      pass.type = "password";
    }
  }


// API Values
let apikey = "7IEE375T5KRNN35W";
let apiURL = "https://www.alphavantage.co/query?function=OVERVIEW&symbol="
let company = "amzn"
let appendID = document.getElementById("companyData")

// Make our API call using fetch
function getCompanyData () {
fetch(apiURL + company + "&apikey=" + apikey)
  .then(response => response.json())
  .then(data => {
    //   Object Keys and Values
    let keyData = Object.keys(data)
    let keyValues = Object.values(data)
    for (let i = 0; i < keyData.length; i++) {
            // Create and Append our elements to the company data id set in html file
            let createKey = document.createElement("div");
            let createValue = document.createElement("div");
            appendID.appendChild(createKey)
            createKey.innerHTML = keyData[i]
            appendID.appendChild(createValue)
            createValue.innerHTML = keyValues[i]
        }
  })
}

async function changeCompanyData() {
    deleteData().then(
      getCompanyData()
    )
}

async function deleteData() {
  appendID.innerHTML = "";
    let text = document.getElementById("companyInput").value
    company = text
    return company
}

function getNews() {
  fetch('https://finnhub.io/api/v1/news?category=general&token=btek0bn48v6qag0a1k40')
  .then(response => response.json())
  .then(data => {
    //   Object Keys and Values
    let keyData = Object.keys(data)
    let keyValues = Object.values(data)
    console.log(keyValues)

    for (let i = 0; i < keyData.length; i++) {
      var title = keyValues[i].headline;
      var summary = keyValues[i].summary;
      var pic = keyValues[i].image;
      var timeStamp = keyValues[i].datetime;
      var newsUrl = keyValues[i].url;
      var date = timeConverter(timeStamp);

      var template = [
        '<div class="card mb-3">',
          '<div class="row no-gutters">',
              '<div class="col-md-4">',
                  '<img src="'+ pic + '" width="100%" height="250px" alt=""/>',
              '</div>',
              '<div class="col-md-8">',
                  '<div class="card-body">',
                      '<h5 class="card-title">' + title + '</h5>',
                      '<p class="card-text">' + summary + '</p>',
                      '<div><a class="btn btn-sm btn-outline-info" target="_blank" href="'+ newsUrl +'" role="button">Read More</a></div>',
                      '<p class="card-footer bg-transparent"><small class="text-muted">' + date + '</small></p>',
                  '</div>',
              '</div>',
          '</div>',
      '</div>'
      ].join("\n");

      $("body").append(template);
    }
  })
}

function timeConverter(UNIX_timestamp){
  var a = new Date(UNIX_timestamp * 1000);
  var months = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
  var year = a.getFullYear();
  var month = months[a.getMonth()];
  var date = a.getDate();
  var hour = a.getHours();
  var period = 'AM';
  var min = a.getMinutes();
  if(min < 10) {
    min = '0' + min;
  }
  if(hour > 12) {
    hour = hour - 12;
    period = 'PM';
  }
  else if(hour == 12)
  {
    period = 'PM';
  }
  else if(hour == 0)
  {
    hour = 12;
  }
  var time = date + '-' + month + '-' + year + ' ' + hour + ':' + min + period;
  return time;
}