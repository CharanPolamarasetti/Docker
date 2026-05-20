<!DOCTYPE html>
<html>
<head>

    <title>Production Java Web App</title>

    <link rel="stylesheet" href="styles.css">

</head>

<body>

    <div class="container">

        <h1>Production Java Web Application</h1>

        <p>
            Running Successfully on:
        </p>

        <ul>
            <li>Tomcat 9</li>
            <li>Java 17</li>
            <li>Maven 3.9.6</li>
            <li>Docker Multi-Stage Build</li>
        </ul>

        <button onclick="checkHealth()">
            Check Health
        </button>

        <p id="result"></p>

    </div>

    <script src="script.js"></script>

</body>
</html>
