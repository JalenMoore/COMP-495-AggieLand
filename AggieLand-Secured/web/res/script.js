
var websocket = new WebSocket("ws://localhost:8080/aggieland/home");

websocket.onmessage = function(event) {
    onMessage(event);
};

websocket.onopen = function(event) {
    onOpen(event)
};

websocket.onerror = function(event) {
    onError(event)
};

function onOpen(event) {
    console.log("Connected to Endpoint!");
    console.log("Event: " + event);
}

function onMessage(event) {
    console.log("message Recieved");
    console.log(event.data);
    document.getElementById("log").textContent += event.data + "\n";
}

function onError(event) {
    console.log("ERROR");
}