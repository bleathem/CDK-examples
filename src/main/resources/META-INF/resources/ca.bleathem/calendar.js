(function( $ ){
    $.fn.calendar = function(pluginOptions) {
        var settings = {
            'showOn' : 'both',
            'buttonImageOnly' : 'true'
        };
        if (pluginOptions) {
            $.extend(settings, pluginOptions);
        }

        this.datepicker(settings);
  };
})( jQuery );