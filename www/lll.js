/**
 * Created by antonioromano on 23/02/15.
 */


var logJavaPlugin = {
    logUsingJava: function(title) {
        //alert("inside plugin");

       
        cordova.exec(
            function(params){
                var s = "";
                for (p in params){
                    s += p  + ": " + params[p] + " --- ";
                }
                alert("SUCCESS: " + s);
            }, // success callback function
            function(params){
                alert("ERROR: " + params);
            }, // error callback function
            'Lll', // mapped to our native Java class called "CalendarPlugin"
            'noAction', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "title": title
            }]
        );

    }
}

module.exports = logJavaPlugin;