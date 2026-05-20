async function checkHealth(){

    const response = await fetch('/health');

    const data = await response.json();

    document.getElementById('result').innerHTML =
        `Status: ${data.status}`;
}
