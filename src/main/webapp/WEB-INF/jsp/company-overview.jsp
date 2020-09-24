<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Company</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link href="css/style.css" rel="stylesheet">
    <script type="text/javascript" src="js/company.js"></script>
    <script type="text/javascript" src="js/utils.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js"></script>
</head>

<body id="company">
    <header>
        <!----------------- BEGIN NAV ----------------->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" style="font-weight: 700;" href="#">Stock Market Casestudy</a>
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                <div class="navbar-nav">
                    <a href="/user/{id}" class="nav-item nav-link">Profile</a>
                    <a href="/market-news" class="nav-item nav-link">Market News</a>
                </div>
                <form class="form-inline">
                    <div class="input-group">
                        <input id="companyInput" type="text" class="form-control" placeholder="Symbol (Ex. FB, AMZN)">
                        <div class="input-group-append">
                            <button type="button" onclick="changeCompanyData()"
                                class="btn btn-sm btn-primary">Search</button>
                        </div>
                    </div>
                </form>
                <div class="navbar-nav">
                    <a href="#" onclick="document.forms['logoutForm'].submit()" class="nav-item nav-link">Logout</a>
                </div>
            </div>
        </nav>
        <!----------------- END NAV ----------------->
    </header>

    <div id="container"></div>
    <div id="newsContainer"></div>

    <template id="template">
        <div class="container-fluid mt-3">
            <div class="row">
                <div class="col-lg-4">
                    <div id="logo" class="text-center">
                        <img src="https://storage.googleapis.com/iexcloud-hl37opg/api/logos/IBM.png"
                            class="img-thumbnail" id="company-logo" alt="">
                    </div>
                    <div class="text-center text-muted pb-3">
                        <small><b><span id="ticker">IBM</span></b></small>
                    </div>
                    <div>
                        <p><b>Name: </b><span id="companyName">International Business Machines Corporation</span></p>
                        <p><b>Asset Type: </b><span id="assetType">Stock</span></p>
                        <p><b>Exchange: </b><span id="exchange">NYSE</span></p>
                        <p><b>Currency: </b><span id="currency">USD</span></p>
                        <p><b>Sector: </b><span id="sector">Technology</span></p>
                        <p><b>Industry: </b><span id="industry">Information Technology Services</span></p>
                        <p><b>52 Week High: </b><span id="52weekHigh">158.75</span></p>
                        <p><b>52 Week Low: </b><span id="52weekLow">90.56</span></p>
                    </div>
                </div>

                <div class="col-lg-8">
                    <canvas id="myChart"></canvas>
                </div>
            </div>
            <hr>
        </div>

        <div class="container-fluid">
            <h3 class="text-center">Description</h3><br>
            <div class="row mx-4 mb-5"><span id="companyDescription">
                    International Business Machines Corporation operates as an integrated solutions and services company
                    worldwide. Its Cloud & Cognitive Software segment offers software for vertical and domain-specific
                    solutions in health, financial services, and Internet of Things (IoT), weather, and security
                    software and services application areas; and customer information control system and storage, and
                    analytics and integration software solutions to support client mission critical on-premise workloads
                    in banking, airline, and retail industries. It also offers middleware and data platform software,
                    including Red Hat, which enables the operation of clients'
                    hybrid multi-cloud environments; and Cloud Paks, WebSphere distributed, and analytics platform
                    software, such as DB2 distributed, information integration, and enterprise content management, as
                    well as IoT, Blockchain and AI/Watson platforms. The company's
                    Global Business Services segment offers business consulting services; system integration,
                    application management, maintenance, and support services for packaged software; finance,
                    procurement, talent and engagement, industry-specific business process outsourcing services; IT
                    infrastructure and platform services. Its Global Technology Services segment provides project,
                    managed, outsourcing, and cloud-delivered services for enterprise IT infrastructure environments;
                    and IT infrastructure support services. It's
                    Systems segment offers servers for businesses, cloud service providers, and scientific computing
                    organizations; data storage products and solutions; and z/OS, an enterprise operating system, as
                    well as Linux. Its Global Financing segment provides lease, installment payment, loan financing,
                    short-term working capital financing, and remanufacturing and remarketing services. It was formerly
                    known as Computing-Tabulating-Recording Co. and changed its name to International Business Machines
                    Corporation in 1924. It was founded in 1911 and is headquartered in Armonk, New York.
                </span>
            </div>
            <hr>

            <div class="row">
                <div id="general" class="col-md-4 px-5">
                    <h5 class="text-center">General Info</h5>
                    <hr>
                    <p><b>Address: </b><span id="address">One New Orchard Road, Armonk, NY, United States, 10504</span>
                    </p>
                    <p><b># of Full-time Employees: </b><span id="employees">352600</span></p>
                    <p><b>Fiscal Year End: </b><span id="fyEnd">December</span></p>
                    <p><b>Latest Quarter: </b><span id="quarter">2020-06-30</span></p>
                </div>

                <div id="finance" class="col-md-4 px-5">
                    <h5 class="text-center">Financials</h5>
                    <hr>
                    <p><b>Market Cap: </b><span id="marketCap">109656989696</span></p>
                    <p><b>Revenue TTM: </b><span id="revenue">75499003904</span></p>
                    <p><b>Gross Profit TTM: </b><span id="grossProfit">36489000000</span></p>
                    <p><b>Profit Margin: </b><span id="profitMargin">0.1043</span></p>
                    <p><b>PE Ratio: </b><span id="peRatio">14.1633</span></p>
                    <p><b>PEG Ratio: </b><span id="pegRatio">7.8951</span></p>
                    <p><b>Trailing PE: </b><span id="trailingPE">14.1633</span></p>
                    <p><b>Forward PE: </b><span id="forwardPE">10.1833</span></p>
                    <p><b>Analyst Target Price: </b><span id="analystTarget">135.19</span></p>
                </div>
                <div id="dividends" class="col-md-4 px-5">
                    <h5 class="text-center">Dividends</h5>
                    <hr>
                    <p><b>Dividend per Share: </b><span id="divPerShare">6.52</span></p>
                    <p><b>Dividend Yield: </b><span id="divYield">0.0525</span></p>
                    <p><b>Dividend Date: </b><span id="divDate">2020-09-10</span></p>
                    <p><b>Ex Dividend Date: </b><span id="exDivDate">2020-08-07</span></p>
                    <p><b>Forward Annual Dividend Rate: </b><span id="forwardDivRate">6.52</span></p>
                    <p><b>Forward Annual Dividend Yield: </b><span id="forwardDivYield">0.0525</span></p>
                    <p><b>Payout Ratio: </b><span id="payoutRatio">0.7358</span></p>
                </div>
            </div>
        </div>
        </div><br>
        <hr>
        <div class="container">
            <h3 class="text-center">Company News</h3><br>
        </div>
    </template>

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </c:if>


    <footer>
        <script>
            getCompanyData();
        </script>
    </footer>

</body>

</html>