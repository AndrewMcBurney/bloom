/**
 * storage.js
 * JavaScript file for getting chrome data
 */

var storage = {
  /**
   * Get string representation of last location
   */
  location: function get_location(callback) {
    console.log("JavaScript: Get location and return callback.");

    chrome.storage.sync.get('location', function(retVal) {
      callback(retVal.location || "");
    });
  },

  /**
   * Get JavaScript object representation of categoryList
   */
  categories: function get_categories(callback) {
    console.log("JavaScript: Get category list and return callback.");

    chrome.storage.sync.get('categoryList', function (retVal) {
      callback(retVal.categoryList || []);
    });
  }
};
