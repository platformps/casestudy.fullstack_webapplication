function showPassword() {
  var pass = document.getElementById("inputPassword");
  if (pass.type === "password") {
    pass.type = "text";
  } else {
    pass.type = "password";
  }
}

function getNews(company) {
  var today = new Date();
  var dd = String(today.getDate()).padStart(2, '0');
  var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
  var yyyy = today.getFullYear();

  var dateTo = yyyy + '-' + mm + '-' + dd;
  var dateFrom = "";
  if (mm == 01) {
    dateFrom = (yyyy - 1) + '-' + '12' + '-' + dd;
  }
  else {
    dateFrom = yyyy + '-' + (mm - 1) + '-' + dd;
  }

  if (company == 'general') {
    apiCall = 'https://finnhub.io/api/v1/news?category=general&token=btek0bn48v6qag0a1k40';
  }
  else {
    apiCall = 'https://finnhub.io/api/v1/company-news?symbol=' + company + '&from=' + dateFrom + '&to=' + dateTo + '&token=btek0bn48v6qag0a1k40';
  }

  fetch(apiCall)
    .then(response => response.json())
    .then(data => {
      //   Object Keys and Values
      let keyData = Object.keys(data)
      let keyValues = Object.values(data)

      for (let i = 0; i < keyData.length; i++) {
        var title = keyValues[i].headline;
        var summary = keyValues[i].summary;
        var pic = keyValues[i].image;
        var timeStamp = keyValues[i].datetime;
        var newsUrl = keyValues[i].url;
        var date = timeConverter(timeStamp);

        var template = [
          '<div class="card">',
          '<div class="row no-gutters">',
          '<div class="col-md-4">',
          '<img src="' + pic + '" class="img-fluid" alt=""/>',
          '</div>',
          '<div class="col-md-8">',
          '<div class="card-body">',
          '<h5 class="card-title">' + title + '</h5>',
          '<p class="card-text">' + summary + '</p>',
          '<p class="card-footer bg-transparent"><a class="btn btn-sm btn-outline-info" target="_blank" href="' + newsUrl + '" role="button">Read More</a><small class="text-muted">' + date + '</small></p>',
          '</div>',
          '</div>',
          '</div>',
          '</div>'
        ].join("\n");

        $("#newsContainer").append(template);

        if (i == 20) { break };
      }
    })
}

function timeConverter(UNIX_timestamp) {
  var a = new Date(UNIX_timestamp * 1000);
  var months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
  var year = a.getFullYear();
  var month = months[a.getMonth()];
  var date = a.getDate();
  var hour = a.getHours();
  var period = 'AM';
  var min = a.getMinutes();
  if (min < 10) {
    min = '0' + min;
  }
  if (hour > 12) {
    hour = hour - 12;
    period = 'PM';
  }
  else if (hour == 12) {
    period = 'PM';
  }
  else if (hour == 0) {
    hour = 12;
  }
  var time = date + '-' + month + '-' + year + ' ' + hour + ':' + min + period;
  return time;
}