/**
 * chrome.js
 * JavaScript file for setting chrome data
 */

getLocation();

function getLocation() {
  if (navigator.geolocation) navigator.geolocation.getCurrentPosition(showPosition);
}

function showPosition(position) {
  $.getJSON("http://geocode.arcgis.com/arcgis/rest/services/World/GeocodeServer/reverseGeocode?location="+position.coords.longitude+"%2C+"+position.coords.latitude+"&distance=200&outSR=&f=pjson", function(data) {
    console.log("JavaScript: Set new location.");

    var location = data.address.City + ', ' + data.address.CountryCode;
    chrome.storage.sync.set({'location': location});
  });
}
