/**
 * controller.js
 * JavaScript Controller Facade
 */

$("#todos").on("click", function() {
  Controller.displayModal("todos");
});

$("#new_category").on('keypress', function(e) {
  if (e.keyCode == 13) Controller.addCategory(e.target.value);
});

setInterval(function() {
  var date = new Date();
  Controller.time(date.getMinutes(), date.getHours());
}, 100);
